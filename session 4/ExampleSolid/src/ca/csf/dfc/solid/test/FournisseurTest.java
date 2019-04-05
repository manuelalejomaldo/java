package ca.csf.dfc.solid.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ca.csf.dfc.solid.classes.Fournisseur;

/**
 * @author ManueLMaldonado
 *
 */
class FournisseurTest {

	/**
	 * Les Cas nominaux, pour verifier que la méthode fait le 
	 * job en fonctionnement normal 
	 */
	@Test
	final void test_ConstructorInitialisationFournisseur_CreeObjetFournisseur() {
		
		//Arranger
		int Id = 1;
		String Nom = "StockPC";
		String Contact = "addres Quebec StockPC ";
		
		Fournisseur f1 = new Fournisseur(Id, Nom, Contact);
		//Agir et Auditer
		assertEquals(Id , f1.getIdFournisseur());
		assertEquals(Nom , f1.getNomFournisseur());
		assertEquals(Contact , f1.getContactFournisseur());
	
	}
	
	 
	
	/**
	 * Les Cas d'erreurs, vérifier que la méthode gère bien les erreurs 
	 */
	@Test
    public void TestFournisseur_InitialIdNegative_MontrerThrowExceptionWithMessage() {
        Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new Fournisseur(-1, "StockPC", "addres Quebec StockPC "));
        assertEquals("Le parametre Id ne doit pas être negative ou zero", throwable.getMessage());
    }
	
	@Test
    public void TestFournisseur_InitialIdZero_MontrerThrowExceptionWithMessage() {
        Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new Fournisseur(0, "StockPC", "addres Quebec StockPC "));
        assertEquals("Le parametre Id ne doit pas être negative ou zero", throwable.getMessage());
    }

	/*@Test
    public void TestFournisseur_InitialNomNull_MontrerThrowExceptionWithMessage() {
        Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new Fournisseur(1, null, "addres Quebec StockPC "));
        assertEquals("Le parametre Nom ne doit pas être null ou vide", throwable.getMessage());
    }*/
	
	@Test
    public void TestFournisseur_InitialNomVide_MontrerThrowExceptionWithMessage() {
        Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new Fournisseur(1, "", "addres Quebec StockPC "));
        assertEquals("Le parametre Nom ne doit pas être null ou vide", throwable.getMessage());
    }
	
	@Test
    public void TestFournisseur_InitialContactVide_MontrerThrowExceptionWithMessage() {
        Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new Fournisseur(1, "StockPC", ""));
        assertEquals("Le parametre Contact ne doit pas être null ou vide", throwable.getMessage());
    }
	
	/**
	 * Les Cas aux limites / tordus / peu communs, verifier que la méthode est robuste
	 */
	
}
