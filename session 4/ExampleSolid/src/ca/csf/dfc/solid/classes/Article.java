/**
 * 
 */
package ca.csf.dfc.solid.classes;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ManueLMaldonado
 *
 */
public class Article {
	
	/**
	 * 
	 */
	private int m_IdArticle;
	
	/**
	 * 
	 */
	private String m_NomArticle;
	
	/**
	 * 
	 */
	private String m_DescriptionArticle;
	
	/**
	 * 
	 */
	private Double m_PrixArticle;
	
	/**
	 * 
	 */
	private int m_quantiteStock;
	
	/**
	 * 
	 */
	private List<Fournisseur> m_FournisseurList;
	
	/**
	 * 
	 */
	public static final int MINIMUM_QUANTITE = 1;
	
	/**
	 * 
	 */
	public static final int MINIMUM_ID = 1;
	
	/**
	 * @param p_IdArticle
	 * @param p_NomArticle
	 * @param p_quantiteStoke
	 * @param p_Fournisseur
	 */
	public Article(	int p_IdArticle, 
					String p_NomArticle,
					String p_DescriptionArticle,
					Double p_PrixArticle,
					int p_quantiteStoke,
					Fournisseur p_Fournisseur) 
	{
		
		if(p_IdArticle < MINIMUM_ID ) { 
			throw new IllegalArgumentException(
					"Le parametre Id ne doit pas être negative ou zero");        
		}
		this.m_IdArticle = p_IdArticle;
		
		
		if(p_NomArticle.isEmpty()) { 
			throw new IllegalArgumentException(
					"Le parametre Nom ne doit pas être null ou vide");
		}
		this.m_NomArticle = p_NomArticle;
		
		
		if(p_DescriptionArticle.isEmpty()) { 
			throw new IllegalArgumentException(
					"Le parametre Description Article ne doit pas être null ou vide");
		}
		this.m_DescriptionArticle = p_DescriptionArticle;
		
		
		this.setPrixArticle(p_PrixArticle);
		
		
		if (p_quantiteStoke < MINIMUM_QUANTITE) {
			throw new IllegalStateException("La quantite doit être minmun 1");
		}
		this.m_quantiteStock = p_quantiteStoke;
		
		
		if(p_Fournisseur == null ) { 
			throw new IllegalArgumentException(
					"Le parametre Fournisseur ne doit pas être null");        
		}
		this.m_FournisseurList = new ArrayList<Fournisseur>();
		this.m_FournisseurList.add(p_Fournisseur);
		
	}
	
	
	/**
	 * @return the m_PrixArticle
	 */
	public Double getPrixArticle() {
		return m_PrixArticle;
	}


	/**
	 * @param m_PrixArticle the m_PrixArticle to set
	 */
	public void setPrixArticle(Double p_PrixArticle) {
		if (p_PrixArticle < 0.0) {
			throw new IllegalStateException("Le prix doit être zero ou positive");
		}
		this.m_PrixArticle = p_PrixArticle;
	}


	/**
	 * @return the m_DescriptionArticle
	 */
	public String getDescriptionArticle() {
		return m_DescriptionArticle;
	}


	/**
	 * @return
	 */
	public String getNomArticle() 
	{
		return this.m_NomArticle;
	}
	
	
	/**
	 * @return
	 */
	public int getIdArticle() 
	{
		return this.m_IdArticle;
	}
	
	
	/**
	 * @return
	 */
	public int getQuantiteStoke()
	{
		return this.m_quantiteStock;
	}
	
	/**
	 * @return
	 */
	public List<Fournisseur> getFournisseursArticle()
	{
		return this.m_FournisseurList;
	}
	
	/**
	 * @param p_quantite
	 */
	public void setQuantiteStock(int p_quantite)
	{
		if(p_quantite <= MINIMUM_QUANTITE - 1)
			throw new IllegalStateException("La quantite doit être zero ou positive");
		
		this.m_quantiteStock = p_quantite;
	}
	
	
	/**
	 * @param p_Fournisseur
	 */
	public void addFournisseur(Fournisseur p_Fournisseur) 
	{
		this.m_FournisseurList.add(p_Fournisseur);
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Article [ Id =" + m_IdArticle + ", Nom=" + m_NomArticle + 
				", Quantite en Stock=" + m_quantiteStock + 
				", List deFournisseurs ="  );
		
		for(Fournisseur s: m_FournisseurList) {
			sb.append( s.getNomFournisseur() +", ");
		}
		
		sb.append( " ]");
		
		
		
		return sb.toString();
	}
	
	
	
}	

