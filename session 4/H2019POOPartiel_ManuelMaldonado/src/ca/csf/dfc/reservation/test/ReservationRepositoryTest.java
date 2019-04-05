/**
 * 
 */
package ca.csf.dfc.reservation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ca.csf.dfc.reservation.DonneesTestReservationRepository;
import ca.csf.dfc.reservation.ReservationRepository;

/**
 * @author ManueLMaldonado
 *
 */
class ReservationRepositoryTest {

	/**
	 * Test method for {@link ca.csf.dfc.reservation.ReservationRepository#trouverRessourceDisponibleParTypeEtDate(java.lang.String, java.time.LocalDate)}.
	 */
	@Test
	final void testTrouverRessourceDisponibleParTypeEtDate() {
		ReservationRepository m_reservationrepository = new DonneesTestReservationRepository();
		
		if(m_reservationrepository.trouverRessourceDisponibleParTypeEtDate(p_type, p_date))
			
	}

	/**
	 * Test method for {@link ca.csf.dfc.reservation.ReservationRepository#estRessourceReserve(int, java.time.LocalDate)}.
	 */
	@Test
	final void testEstRessourceReserve() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link ca.csf.dfc.reservation.ReservationRepository#Reserver(int, java.time.LocalDate)}.
	 */
	@Test
	final void testReserver() {
		fail("Not yet implemented"); // TODO
	}

}
