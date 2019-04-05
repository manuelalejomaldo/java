package ca.csf.dfc.reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository {
	List<Ressource> trouverRessourcesParType(String p_type);
	
	boolean estRessourceReserve(int p_identifiantRessource, LocalDate p_date);
}
