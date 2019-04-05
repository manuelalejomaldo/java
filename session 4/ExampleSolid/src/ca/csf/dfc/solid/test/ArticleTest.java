/**
 * 
 */
package ca.csf.dfc.solid.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ca.csf.dfc.solid.classes.Article;
import ca.csf.dfc.solid.classes.Fournisseur;

/**
 * @author ManueLMaldonado
 *
 */
class ArticleTest {

	/**
	 * Les Cas nominaux, pour verifier que la méthode fait le 
	 * job en fonctionnement normal 
	 */
	
	/**
	 * Test method for {@link ca.csf.dfc.solid.classes.Article#Article(int, java.lang.String, int, int)}.
	 */
	@Test
	final void testArticle_ConstructorInitialisation_creeObjetArticle() {
		
		//Arranger
		
		//creer Fournisseurs
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		
		
		//creer article
		
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,12,f1);
		List<Fournisseur> FournisseurList = new ArrayList<Fournisseur>();
		FournisseurList.add(f1);
		
		//Agir et Auditer
		assertEquals(1, a1.getIdArticle());
		assertEquals("sourri SPX1" , a1.getNomArticle());
		assertEquals(12 , a1.getQuantiteStoke());
		assertEquals(FournisseurList , a1.getFournisseursArticle());
		
	}

	/**
	 * Test method for {@link ca.csf.dfc.solid.classes.Article#setQuantiteStock(int)}.
	 */
	@Test
	final void testSetQuantiteStock_ChangerQuantiteStok() {
		//Arranger
		
		
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");				
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,12,f1);
		a1.setQuantiteStock(5);
		
		//Agir et Auditer
		
		assertEquals(5 , a1.getQuantiteStoke());
	}

	/**
	 * Test method for {@link ca.csf.dfc.solid.classes.Article#addFournisseur(int)}.
	 */
	@Test
	final void testAddFournisseur() {
		
		//Arranger
				
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		Fournisseur f2 = new Fournisseur(2, "Costco", "addres Quebec Costco ");
		Fournisseur f3 = new Fournisseur(3, "BestBuy", "addres Quebec BestBuy ");
				
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,12,f1);		
		a1.addFournisseur(f2);
		a1.addFournisseur(f3);
		
		List<Fournisseur> FournisseurList = new ArrayList<Fournisseur>();
		FournisseurList.add(f1);
		FournisseurList.add(f2);
		FournisseurList.add(f3);
		
		//Agir et Auditer
		assertEquals(FournisseurList , a1.getFournisseursArticle());		
	}
	
	/**
	 * Test method for {@link ca.csf.dfc.solid.classes.Article#addFournisseur(int)}.
	 */
	@Test
	final void testSetPrixArticle() {
		
		//Arranger
				
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,12,f1);		
		Double prix = 8.25;
		a1.setPrixArticle(prix);
		
		
		//Agir et Auditer
		assertEquals(prix , a1.getPrixArticle());		
	}
	
	
	/**
	 * Les Cas d'erreurs, vérifier que la méthode gère bien les erreurs 
	 */
	@Test
    public void TestArticle_InitialIdNegative_MontrerThrowExceptionWithMessage() {
		
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		
		Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new Article(-1,"sourri SPX1","sourris sans fil",5.75,12,f1));
        assertEquals("Le parametre Id ne doit pas être negative ou zero", throwable.getMessage());
    }
	
	@Test
    public void TestArticle_InitialIdZero_MontrerThrowExceptionWithMessage() {
		
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		
		Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new Article(0,"sourri SPX1","sourris sans fil",5.75,12,f1));
        assertEquals("Le parametre Id ne doit pas être negative ou zero", throwable.getMessage());
    }
	
	@Test
    public void TestArticle_InitialNomVide_MontrerThrowExceptionWithMessage() {
        
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		
		Throwable throwable = assertThrows(IllegalArgumentException.class,
        		 () -> new Article(1,"","sourris sans fil",5.75,12,f1));
        assertEquals("Le parametre Nom ne doit pas être null ou vide", throwable.getMessage());
    }
	
	@Test
    public void TestArticle_InitialDescriptionVide_MontrerThrowExceptionWithMessage() {
        
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		
		Throwable throwable = assertThrows(IllegalArgumentException.class,
        		 () -> new Article(1,"sourri SPX1","",5.75,12,f1));
        assertEquals("Le parametre Description Article ne doit pas être null ou vide", throwable.getMessage());
    }
	
	@Test
    public void TestArticle_InitialPrixArticlenegative_MontrerThrowExceptionWithMessage() {
		
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		
		Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new  Article(1,"sourri SPX1","sourris sans fil",-5.75,0,f1));
        assertEquals("Le prix doit être zero ou positive", throwable.getMessage());
    }
	
	@Test
    public void TestArticle_InitialQuantiteZero_MontrerThrowExceptionWithMessage() {
		
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		
		Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new  Article(1,"sourri SPX1","sourris sans fil",5.75,0,f1));
        assertEquals("La quantite doit être minmun 1", throwable.getMessage());
    }
	
	@Test
    public void TestArticle_InitialFournisseurNull_MontrerThrowExceptionWithMessage() {
				
		Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> new Article(1,"sourri SPX1","sourris sans fil",5.75,1,null));
        assertEquals("Le parametre Fournisseur ne doit pas être null", throwable.getMessage());
    }
	
	
	
}
