package ca.csf.dfc.reservation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class DonneesTestReservationRepository implements ReservationRepository {
	/**
	 * Liste des ressources
	 */
	private List<IRessource> m_ressources;
	
	/**
	 * Liste des réservations
	 */
	private List<IReservation> m_reservations;

	@Override
	public List<IRessource> trouverRessourcesParType(String p_type) {
		return this.m_ressources.stream().filter(r -> r.estDuType(p_type)).collect(Collectors.toList());
	}
	
	
	@Override
	public List<IRessource> trouverRessourceDisponibleParTypeEtDate(String p_type,LocalDate p_date) {
		
		List<IRessource> tmp = this.trouverRessourcesParType(p_type);
		List<IRessource> resultad = tmp;
		
		for(IRessource ressource: tmp ) {
			if(this.estRessourceReserve(ressource.getIdentifiant() , p_date)) {
				resultad.remove(ressource);
			}
		}
		
		return resultad;
	}
	
	@Override
	public boolean estRessourceReserve(int p_identifiantRessource, LocalDate p_date) {
		return this.m_reservations.stream().filter(
				rsv -> rsv.getIdentifiantRessource() == p_identifiantRessource && rsv.getDate().compareTo(p_date) == 0)
				.count() != 0;
	}
	
	
	
	
	public DonneesTestReservationRepository() {
		this.m_reservations = new ArrayList<IReservation>();
		
		this.m_ressources = Arrays.asList(new Laboratoire(1, "P-308"), new Laboratoire(2, "P-309"),
				new Laboratoire(3, "P-409"), new Laboratoire(4, "P-418"),

				new Projecteur(10), new Projecteur(11), new Projecteur(12));
	}
	@Override
	public String afficherRessourceDisponibleLe(LocalDate p_date) {
		
		/*string builder que adiciona los relutados del filtro de ressourse avec el dato disponivle*/
		
		return null;
	}


	@Override
	public boolean Reserver(int p_identifiantRessource, LocalDate p_date) {
		this.m_reservations.add(new Reservation(p_identifiantRessource, p_date));
		return true;
	}
	
}
