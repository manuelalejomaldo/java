package ca.csf.dfc.reservation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DonneesTestReservationRepository implements ReservationRepository {
	private List<Ressource> m_ressources;
	private List<Reservation> m_reservations;

	@Override
	public List<Ressource> trouverRessourcesParType(String p_type) {
		return this.m_ressources.stream().filter(r -> r.estDuType(p_type)).collect(Collectors.toList());
	}

	@Override
	public List<Ressource> trouverRessourcesDisponibleParTypeEtDate(String p_type, LocalDate p_date) {
		if (p_date == null) {
			throw new IllegalArgumentException("p_date ne peut être null");
		}

		Stream<Ressource> stream = this.m_ressources.stream();

		if (p_type != null && p_type.compareTo("") != 0) {
			stream = stream.filter(r -> r.estDuType(p_type));
		}

		return stream.filter(r -> !this.estRessourceReserve(r.getIdentifiant(), p_date)).collect(Collectors.toList());
	}

	@Override
	public boolean estRessourceReserve(int p_identifiantRessource, LocalDate p_date) {
		if (p_date == null) {
			throw new IllegalArgumentException("p_date ne peut être null");
		}
		
		if (obtenirRessource(p_identifiantRessource) == null) {
			throw new IllegalArgumentException("La ressource doit exister");
		}
		
		return this.m_reservations.stream().filter(
				rsv -> rsv.getIdentifiantRessource() == p_identifiantRessource && rsv.getDate().compareTo(p_date) == 0)
				.count() != 0;
	}

	@Override
	public void reserverRessource(int p_identifiantRessource, LocalDate p_date) {
		if (p_date == null) {
			throw new IllegalArgumentException("p_date ne peut être null");
		}
		
		if (obtenirRessource(p_identifiantRessource) == null) {
			throw new IllegalArgumentException("La ressource doit exister");
		}
		
		if (estRessourceReserve(p_identifiantRessource, p_date)) {
			throw new IllegalArgumentException("La ressource est déjà réservée");
		}

		this.m_reservations.add(new Reservation(p_identifiantRessource, p_date));

	}

	private Ressource obtenirRessource(int p_identifiantRessource) {
		Optional<Ressource> resultat = m_ressources.stream().filter(m -> m.getIdentifiant() == p_identifiantRessource)
				.collect(Collectors.reducing((a, b) -> null));

		if (resultat.isPresent()) {
			return resultat.get();
		}

		return null;
	}

	@Override
	public List<ResultatRessourceStatut> obtenirStatutRessoucesPourLe(LocalDate p_date) {
		if (p_date == null) {
			throw new IllegalArgumentException("p_date ne peut être null");
		}
		
		return this.m_ressources.stream()
				.map(r -> new ResultatRessourceStatut(r, !this.estRessourceReserve(r.getIdentifiant(), p_date), p_date))
				.collect(Collectors.toList());
	}

	public DonneesTestReservationRepository() {
		this.m_reservations = new ArrayList<Reservation>();
		this.m_ressources = new ArrayList<Ressource>();

		this.m_ressources.add(new Laboratoire(1, "P-308"));
		this.m_ressources.add(new Laboratoire(2, "P-309"));
		this.m_ressources.add(new Laboratoire(3, "P-409"));
		this.m_ressources.add(new Laboratoire(4, "P-418"));

		this.m_ressources.add(new Projecteur(10));
		this.m_ressources.add(new Projecteur(11));
		this.m_ressources.add(new Projecteur(12));

		this.m_ressources.add(new OrdinateurPortable(20, "Linux"));
		this.m_ressources.add(new OrdinateurPortable(21, "MacOS"));

		this.m_ressources.add(new SalleDeReunion(30, "1", 18));
	}
}
