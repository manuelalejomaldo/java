package ca.csf.dfc.reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository {
	List<Ressource> trouverRessourcesParType(String p_type);
	List<Ressource> trouverRessourcesDisponibleParTypeEtDate(String p_type, LocalDate p_date);
	
	List<ResultatRessourceStatut> obtenirStatutRessoucesPourLe(LocalDate p_date);
	
	boolean estRessourceReserve(int p_identifiantRessource, LocalDate p_date);
	
	void reserverRessource(int p_identifiantRessource, LocalDate p_date);
	
}
