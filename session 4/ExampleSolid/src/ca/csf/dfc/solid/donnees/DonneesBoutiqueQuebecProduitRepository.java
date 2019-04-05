/**
 * 
 */
package ca.csf.dfc.solid.donnees;

import java.util.ArrayList;
import java.util.List;

import ca.csf.dfc.solid.classes.Article;
import ca.csf.dfc.solid.classes.Fournisseur;

import ca.csf.dfc.solid.interfaces.IProduitRepository;

/**
 * @author ManueLMaldonado
 *
 */
public class DonneesBoutiqueQuebecProduitRepository implements IProduitRepository {

	private List<Article> m_produits;
	//private ProduitRepository m_BoutiqueQuebecProduitRepository;
	
	
		
	

	
	/**
	 * @param p_Article
	 */
	
	public void addProduit(Article p_Article)
	{
		this.m_produits.add(p_Article);
	}
	
	
	/* (non-Javadoc)
	 * @see ca.csf.dfc.solid.interfaces.IProduitRepository#getProduits()
	 */
	@Override
	public List<Article> getProduits() {
		
		return this.m_produits;
	}
	

	@Override
	public Boolean estProduit(Article p_Article) {
		
		return this.m_produits.contains(p_Article);
	}

	
	public DonneesBoutiqueQuebecProduitRepository() {
		
		
		//creer Fournisseurs
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		Fournisseur f2 = new Fournisseur(2, "Costco", "addres Quebec Costco ");
		Fournisseur f3 = new Fournisseur(3, "BestBuy", "addres Quebec BestBuy ");	
						
		//creer article
						
		Article a1 = new Article(1,"sourri SPX1","sourris sans fil",5.75,1,f1);
		Article a2 = new Article(2,"Ordinateur de bureau HP 700-329","sans fil",1005.75,1,f1);
		Article a3 = new Article(3,"HP Beats Special Edition 23-n010 All-in-One D","sans fil",555.75,1,f1);
		Article a4 = new Article(4,"Clavier X1","sans fil",35.75,1,f1);
		a4.addFournisseur(f2);
		a4.addFournisseur(f3);
		
		this.m_produits = new ArrayList<Article>();
		
		
		this.m_produits.add(a1);
		this.m_produits.add(a2);
		this.m_produits.add(a3);
		this.m_produits.add(a4);
		
		
		
	}

	
	
}
