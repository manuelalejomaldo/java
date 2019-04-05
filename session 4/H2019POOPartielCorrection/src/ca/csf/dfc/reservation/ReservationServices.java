package ca.csf.dfc.reservation;

import java.time.LocalDate;
import java.util.List;

public class ReservationServices {
	private ReservationRepository m_reservationRepository;
	
	public ReservationServices(ReservationRepository p_reservationRepository) {
		this.m_reservationRepository = p_reservationRepository;
	}
	
	public void reserverRessource(Ressource p_ressource, LocalDate p_date) {
		this.m_reservationRepository.reserverRessource(p_ressource.getIdentifiant(), p_date);
	}
	
	public void afficherRessoucesDisponibles(LocalDate p_date) {
		List<Ressource> lstRessourcesDisponibles = this.obtenirRessourcesDisponibles(p_date);
		
		System.out.println(lstRessourcesDisponibles);
	}
	
	public List<Ressource> obtenirRessourcesDisponibles(LocalDate p_date) {
		return this.m_reservationRepository.trouverRessourcesDisponibleParTypeEtDate(null, p_date);
	}
}
