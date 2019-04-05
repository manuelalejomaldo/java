package ca.csf.dfc.reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository {
	
	List<IRessource> trouverRessourcesParType(String p_type);
	List<IRessource> trouverRessourceDisponibleParTypeEtDate(String p_type,LocalDate p_date);
	
	String afficherRessourceDisponibleLe(LocalDate p_date);
	
	boolean estRessourceReserve(int p_identifiantRessource, LocalDate p_date);
	
	boolean Reserver(int p_identifiantRessource, LocalDate p_date);
}
