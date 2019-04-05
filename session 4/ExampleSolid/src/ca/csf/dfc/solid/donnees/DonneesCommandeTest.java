/**
 * 
 */
package ca.csf.dfc.solid.donnees;

import java.util.ArrayList;
import java.util.List;

import ca.csf.dfc.solid.classes.Article;

import ca.csf.dfc.solid.classes.Fournisseur;
import ca.csf.dfc.solid.classes.PanierObject;
import ca.csf.dfc.solid.interfaces.ICommande;

/**
 * @author ManueLMaldonado
 *
 */
public final class DonneesCommandeTest implements ICommande{

	/**
	 * List
	 */
	private List<PanierObject> m_PanierObject;
	
	
	/**
	 * 
	 */
	public DonneesCommandeTest() {
	
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

				
		//Creer Commande
				
		this.m_PanierObject = new ArrayList<PanierObject>();
				
		this.m_PanierObject.add(new PanierObject(a1, 1));
		this.m_PanierObject.add(new PanierObject(a2, 1));
		this.m_PanierObject.add(new PanierObject(a3, 1));
		
	}
	
	
	public List<PanierObject> getCommande() {
		return this.m_PanierObject;
	}
	
	
	/* (non-Javadoc)
	 * @see ca.csf.dfc.solid.ICommande#addCommande(ca.csf.dfc.solid.PanierObject)
	 */
	
	public void addPanierObject(PanierObject p_PanierObject) {
		
		this.m_PanierObject.add(p_PanierObject);
	}
	
	
	/* (non-Javadoc)
	 * @see ca.csf.dfc.solid.ICommande#ArticleDansCommande(ca.csf.dfc.solid.Article)
	 */
	public PanierObject PanierObjectDansCommande(Article p_Arcticle)
	{
		PanierObject tmp = null;
		
		for(PanierObject p: this.m_PanierObject)
		{
			if( p.getArticleCommander() == p_Arcticle)
				tmp = p;
		}
		
		return tmp;
	}
	
	/* (non-Javadoc)
	 * @see ca.csf.dfc.solid.ICommande#ArticleDansCommande(ca.csf.dfc.solid.Article)
	 */
	public Article ArticleDansCommande(Article p_Arcticle)
	{		
		return this.PanierObjectDansCommande(p_Arcticle).getArticleCommander();
	}
	
	
	/* (non-Javadoc)
	 * @see ca.csf.dfc.solid.ICommande#estArticleDansCommande(ca.csf.dfc.solid.Article)
	 */
	public Boolean estArticleDansCommande(Article p_Arcticle)
	{
		return (this.PanierObjectDansCommande(p_Arcticle) != null);
	}
	
	
	/*
	public void RemoveArticle(PanierObject p_PanierObject)
	{
		this.m_PanierObject.remove(p_PanierObject);
	}
	
	
	
	public void RemoveArticle(Article p_Arcticle)
	{
		this.m_PanierObject.remove(this.ArticleDansCommande(p_Arcticle));
	}
	
	
	
	
	public void RemoveQuantiteArticle(PanierObject p_PanierObject, int p_quantite)
	{
		p_PanierObject.setQuantiteCommande(p_quantite);
	}
	
	
	
	
	public void RemoveQuantiteArticle(Article p_Arcticle, int p_quantite)
	{
		this.ArticleDansCommande(p_Arcticle).setQuantiteCommande(p_quantite);
	}*/
	
	


	
	/*
	//creer Fournisseurs
			Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
			Fournisseur f2 = new Fournisseur(2, "Costco", "addres Quebec Costco ");
			Fournisseur f3 = new Fournisseur(3, "BestBuy", "addres Quebec BestBuy ");
			
			
			//Additionner fournisseur au Fournisseurs Quebec
			
			FournisseurQuebecRepository FQRepo = new FournisseurQuebecRepository();
			
			FQRepo.addFournisseurQuebecRepository(f1);
			FQRepo.addFournisseurQuebecRepository(f2);
			FQRepo.addFournisseurQuebecRepository(f3);
			
			System.out.println();
			for(Fournisseur f: FQRepo.getFournisseurs())		
				System.out.println(f.toString());
			
			//creer article
			
			Article a1 = new Article(1,"sourri SPX1",1,f1);
			Article a2 = new Article(2,"Ordinateur de bureau HP 700-329",1,f1);
			Article a3 = new Article(3,"HP Beats Special Edition 23-n010 All-in-One D",1,f1);
			Article a4 = new Article(4,"Clavier X1",1,f1);
			a4.addFournisseur(f2);
			a4.addFournisseur(f3);
			
			
			
			
			//Additonner Article au repository DonneeQuebec
			
			DonneesProduitQuebecRepository Donnees_QC_Repo = new DonneesProduitQuebecRepository();
			
			Donnees_QC_Repo.addProduit(a1);
			Donnees_QC_Repo.addProduit(a2);
			Donnees_QC_Repo.addProduit(a3);
			Donnees_QC_Repo.addProduit(a4);
			
			System.out.println();
			for(Article a: Donnees_QC_Repo.getProduits())		
				System.out.println(a.toString());
			
			//creer PanierObjet
			
			PanierObject objPannier1 =new PanierObject(a1, 1);
			PanierObject objPannier2 =new PanierObject(a2, 1);
			PanierObject objPannier3 =new PanierObject(a3, 1);
			
			//Creer Commande
			
			ICommande commande1 = new Commande();
			
			commande1.addCommande(objPannier1);
			commande1.addCommande(objPannier2);
			commande1.addCommande(objPannier3);
			

			//faire la commande avec une service
			
			IServicesCommande servicecommande1 = new ServicesCommande(Donnees_QC_Repo);
			
			if(servicecommande1.ValiderCommande(commande1))
			{
				System.out.println();
				System.out.println("est possible de faire la commande ok");
			}*/


	
}
