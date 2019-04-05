/**
 * 
 */
package ca.csf.dfc.solid.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ca.csf.dfc.solid.classes.Article;
import ca.csf.dfc.solid.classes.Fournisseur;
import ca.csf.dfc.solid.classes.PanierObject;

/**
 * @author ManueLMaldonado
 *
 */
class PanierObjectTest {

	/**
	 * Les Cas nominaux, pour verifier que la méthode fait le 
	 * job en fonctionnement normal 
	 */
	
	/**
	 * Test method for {@link ca.csf.dfc.solid.classes.PanierObject#PanierObject(ca.csf.dfc.solid.classes.Article)}.
	 */
	@Test
	final void testPanierObjectArticle_ConstructorInitialisation_CreerObjetPanier() {
		
		//Arranger
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,12,f1);	
		PanierObject objPannier1 =new PanierObject(a1, 1);		
		PanierObject objPannier2 =new PanierObject(a1);
		
		//Agir et Auditer
		assertEquals(a1, objPannier1.getArticleCommander());
		assertEquals(1 , objPannier1.getQuantiteCommander());
		
		assertEquals(a1, objPannier2.getArticleCommander());
		assertEquals(0 , objPannier2.getQuantiteCommander());
	}	

	/**
	 * Test method for {@link ca.csf.dfc.solid.classes.PanierObject#setQuantiteCommande(int)}.
	 */
	@Test
	final void testSetQuantiteCommande() {
		
		//Arranger
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,5,f1);	
		PanierObject objPannier1 =new PanierObject(a1, 1);		
		
		objPannier1.setQuantiteCommande(5);
						
		//Agir et Auditer
		
		assertEquals(5 , objPannier1.getQuantiteCommander());
		
	}
	
	/**
	 * Les Cas d'erreurs, vérifier que la méthode gère bien les erreurs 
	 */
	/**
	 * 
	 */
	@Test
    public void TestPanierObject_InitialQuantiteZero_MontrerThrowExceptionWithMessage() {
		
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,5,f1);	
		
		Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new  PanierObject(a1, 0));
        assertEquals("La quantite doit être minmun 1", throwable.getMessage());
    }
	
	/**
	 * 
	 */
	@Test
    public void TestPanierObject_InitialQuantiteNegative_MontrerThrowExceptionWithMessage() {
		
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,5,f1);	
			
		
		Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new  PanierObject(a1, -2));
        assertEquals("La quantite doit être minmun 1", throwable.getMessage());
    }
	
	@Test
    public void TestPanierObject_setQuantiteCommande_MontrerThrowExceptionWithMessage() {
		
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,5,f1);	
		PanierObject objPannier1 =new PanierObject(a1, 1);
		
		Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> objPannier1.setQuantiteCommande(-5));
        assertEquals("La quantite de la commande doit être zero ou positive", throwable.getMessage());
    }
	
	@Test
    public void TestPanierObject_setQuantiteCommandeMenor_MontrerThrowExceptionWithMessage() {
		
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,5,f1);	
		PanierObject objPannier1 =new PanierObject(a1, 1);
		
		Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> objPannier1.setQuantiteCommande(15));
        assertEquals("La quantite de la commande doit être inferior", throwable.getMessage());
    }

}
