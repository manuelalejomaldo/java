/**
 * 
 */
package ca.csf.dfc.reservation;

import java.time.LocalDate;

/**
 * @author ManueLMaldonado
 *
 */
public interface IReservation {	
	
	public int getIdentifiantRessource();
	public LocalDate getDate() ;
}
