/**
 * 
 */
package ca.csf.dfc.exerciceramasse01.vehicule.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ca.csf.dfc.exerciceramasse01.vehicule.Camion;
import ca.csf.dfc.exerciceramasse01.vehicule.IllegalAttacherRemorqueException;
import ca.csf.dfc.exerciceramasse01.vehicule.IllegalDetacherRemorqueException;

/**
 * @author li23x3
 *
 */
class CamionTest {
	/**
	 * Test method for
	 * {@link ca.csf.dfc.exerciceramasse01.vehicule.Camion#getTypeVehicule()}.
	 */
	@Test
	void testGetTypeVehicule() {
		Camion c = new Camion("", "");
		assertEquals("Camion", c.getTypeVehicule());
	}

	/**
	 * Test method for
	 * {@link ca.csf.dfc.exerciceramasse01.vehicule.Camion#peutAttacherRemorque()}.
	 */
	@Test
	void testPeutAttacherRemorqueNonPresente() {
		Camion c = new Camion("", "");
		assertTrue(c.peutAttacherRemorque());
	}

	/**
	 * Test method for
	 * {@link ca.csf.dfc.exerciceramasse01.vehicule.Camion#peutAttacherRemorque()}.
	 */
	@Test
	void testPeutAttacherRemorquePresente() {
		Camion c = new Camion("", "");
		try {
			c.attacherRemorque();
		} catch (IllegalAttacherRemorqueException e) {
			fail(e.getMessage());
		}
		assertFalse(c.peutAttacherRemorque());
	}

	/**
	 * Test method for
	 * {@link ca.csf.dfc.exerciceramasse01.vehicule.Camion#peutDetacherRemorque()}.
	 */
	@Test
	void testPeutDetacherRemorquePresente() {
		Camion c = new Camion("", "");
		try {
			c.attacherRemorque();
		} catch (IllegalAttacherRemorqueException e) {
			fail(e.getMessage());
		}
		assertTrue(c.peutDetacherRemorque());
	}

	/**
	 * Test method for
	 * {@link ca.csf.dfc.exerciceramasse01.vehicule.Camion#peutDetacherRemorque()}.
	 */
	@Test
	void testPeutDetacherRemorqueNonPresente() {
		Camion c = new Camion("", "");

		assertFalse(c.peutDetacherRemorque());
	}

	/**
	 * Test method for
	 * {@link ca.csf.dfc.exerciceramasse01.vehicule.Camion#attacherRemorque()}.
	 */
	@Test
	void testAttacherRemorqueNonPresente() {
		Camion c = new Camion("", "");

		try {
			c.attacherRemorque();
		} catch (IllegalAttacherRemorqueException e) {
			// TODO Auto-generated catch block
			fail("attacherRemorque");
		}

		assertTrue(c.getPresenceRemorque());
	}

	/**
	 * Test method for
	 * {@link ca.csf.dfc.exerciceramasse01.vehicule.Camion#attacherRemorque()}.
	 */
	@Test
	void testAttacherRemorquePresente() {
		Camion c = new Camion("", "");

		try {
			c.attacherRemorque();
		} catch (IllegalAttacherRemorqueException e) {
			// TODO Auto-generated catch block
			fail("attacherRemorque");
		}

		assertThrows(IllegalAttacherRemorqueException.class, () -> c.attacherRemorque());
	}

	/**
	 * Test method for
	 * {@link ca.csf.dfc.exerciceramasse01.vehicule.Camion#detacherRemorque()}.
	 */
	@Test
	void testDetacherRemorqueNonPresente() {
		Camion c = new Camion("", "");

		assertThrows(IllegalDetacherRemorqueException.class, () -> c.detacherRemorque());
	}

	/**
	 * Test method for
	 * {@link ca.csf.dfc.exerciceramasse01.vehicule.Camion#detacherRemorque()}.
	 */
	@Test
	void testDetacherRemorquePresente() {
		Camion c = new Camion("", "");

		try {
			c.attacherRemorque();
			c.detacherRemorque();
		} catch (IllegalAttacherRemorqueException e) {
			fail("attacherRemorque");
		} catch (IllegalDetacherRemorqueException e) {
			fail("detacherRemorque");
		}

		assertFalse(c.getPresenceRemorque());
	}
}
