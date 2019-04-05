/**
 * 
 */
package ca.csf.dfc.a2018pooexamen01.Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ca.csf.dfc.a2018pooexamen01.mediatheque.CompactDisk;

/**
 * @author ManueLMaldonado
 *
 */
class CompactDiskTest {

	/**
	 * Test method for {@link ca.csf.dfc.a2018pooexamen01.mediatheque.CompactDisk#CompactDisk(int, java.lang.String)}.
	 */
	@Test
	final void testCompactDisk() {
		
		CompactDisk compactDisk = new CompactDisk(21, "Angels Fall First");
		
		if (compactDisk.getIdentifiant() != 21)
            throw new IllegalArgumentException(" Erreur Constructor d'initialisation");
	}

	/**
	 * Test method for {@link ca.csf.dfc.a2018pooexamen01.mediatheque.Numerique#EstEmprunte()}.
	 */
	@Test
	final void testEstEmprunte() {
		
		CompactDisk compactDisk = new CompactDisk(21, "Angels Fall First");
		
		if (compactDisk.EstEmprunte() != false)
            throw new IllegalArgumentException(" Erreur methode EstEmprunter 01");
		
		compactDisk.Emprunter();
		
		if (compactDisk.EstEmprunte() != true)
            throw new IllegalArgumentException(" Erreur methode EstEmprunter 02");
		
		compactDisk.Rendre();
		
		if (compactDisk.EstEmprunte() != false)
            throw new IllegalArgumentException(" Erreur methode EstEmprunter 03");
	}

	/**
	 * Test method for {@link ca.csf.dfc.a2018pooexamen01.mediatheque.Numerique#Emprunter()}.
	 */
	@Test
	final void testEmprunter() {
		
		CompactDisk compactDisk = new CompactDisk(21, "Angels Fall First");
		
		if (compactDisk.EstEmprunte() != false)
            throw new IllegalArgumentException(" Erreur methode Emprunter 01");
		
		compactDisk.Emprunter();
		
		if (compactDisk.EstEmprunte() != true)
            throw new IllegalArgumentException(" Erreur methode Emprunter 02");		
	
	}

	/**
	 * Test method for {@link ca.csf.dfc.a2018pooexamen01.mediatheque.Numerique#Rendre()}.
	 */
	@Test
	final void testRendre() {
		
		CompactDisk compactDisk = new CompactDisk(21, "Angels Fall First");
		
		if (compactDisk.EstEmprunte() != false)
            throw new IllegalArgumentException(" Erreur methode Rendre 01");
		
		compactDisk.Emprunter();
		
		if (compactDisk.EstEmprunte() != true)
            throw new IllegalArgumentException(" Erreur methode Rendre 02");
		
		compactDisk.Rendre();
		
		if (compactDisk.EstEmprunte() != false)
            throw new IllegalArgumentException(" Erreur methode Rendre 03");
	}

	/**
	 * Test method for {@link ca.csf.dfc.a2018pooexamen01.mediatheque.Numerique#toString()}.
	 */
	@Test
	final void testToString() {
		
	}

}
