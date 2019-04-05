/**
 * 
 */
package ca.csf.dfc.solid.interfaces;

import java.util.List;

import ca.csf.dfc.solid.classes.Article;

/**
 * @author ManueLMaldonado
 *
 */
public interface IProduitRepository {
	
	public List<Article> getProduits();
	public Boolean estProduit(Article p_Article);	
	
}
