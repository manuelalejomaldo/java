/**
 * 
 */
package ca.csf.dfc.solid.classes;

import ca.csf.dfc.solid.interfaces.ICommande;
import ca.csf.dfc.solid.interfaces.IProduitRepository;
import ca.csf.dfc.solid.interfaces.IServicesCommande;

/**
 * @author ManueLMaldonado
 *
 */
public class ServicesCommande implements IServicesCommande{
		
	private IProduitRepository m_ProduitRepository;
	
	public ServicesCommande(IProduitRepository p_ProduitRepository) {
		this.m_ProduitRepository = p_ProduitRepository;
	}
	
	//valider la commande avant de l'executer
	public boolean ValiderCommande(ICommande p_Commande) 
	{
		Boolean tmp = true;
		
		for(PanierObject o: p_Commande.getCommande())
		{
			int tmp_IdArticle = o.getIdArticleCommander();
			
			if( !(this.m_ProduitRepository.estProduit(tmp_IdArticle)) 
				|| (this.m_ProduitRepository.getQuantiteStock(tmp_IdArticle) < o.getQuantiteCommander()))
				tmp = false;
		}
		
		return tmp;
	}
	
	//executer la commande
	public void PasserCommande(ICommande p_Commande) {
		
	}

	

}
