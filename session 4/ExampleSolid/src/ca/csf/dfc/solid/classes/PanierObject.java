/**
 * 
 */
package ca.csf.dfc.solid.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class PanierObject {
	
	/**
	 * 
	 */
	private Article m_Article;
	/**
	 * 
	 */
	private int m_QuantiteCommander;
	
	/**
	 * 
	 */
	public static final int DEFAULT_QUANTITE = 0;
	
	/**
	 * @param p_IdArticle
	 */
	public PanierObject(Article p_Article)
	{
		this(p_Article,DEFAULT_QUANTITE);
	}
	
	/**
	 * @param p_Article
	 * @param p_quantite
	 */
	public PanierObject(Article p_Article, int p_quantite)
	{
		
			
		this.m_Article = p_Article;
		
		if(p_quantite < DEFAULT_QUANTITE)
			throw new IllegalStateException("La quantite doit être minmun 1");
		this.m_QuantiteCommander = p_quantite;
	}

	/**
	 * @return the m_IdArticle
	 */
	public Article getArticleCommander() {
		return m_Article;
	}

	/**
	 * @return the m_Quantite
	 */
	public int getQuantiteCommander() {
		return m_QuantiteCommander;
	}

	public void setQuantiteCommande(int p_quantite)
	{
		if(p_quantite <= DEFAULT_QUANTITE )
			throw new IllegalStateException("La quantite de la commande doit être zero ou positive");
		
		if(p_quantite > m_Article.getQuantiteStoke())
			throw new IllegalStateException("La quantite de la commande doit être inferior");
		
		this.m_QuantiteCommander = p_quantite;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PanierObject [m_IdArticle=" + m_Article.getNomArticle() + ", m_Quantite=" + m_QuantiteCommander + "]";
	}
	
	
	
}
