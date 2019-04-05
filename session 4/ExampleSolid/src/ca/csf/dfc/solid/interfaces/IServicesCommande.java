/**
 * 
 */
package ca.csf.dfc.solid.interfaces;

/**
 * @author ManueLMaldonado
 *
 */
public interface IServicesCommande {	

	
	
	//valider la commande avant de l'executer
	public boolean ValiderCommande(ICommande p_Commande);
	
	//executer la commande
	public void PasserCommande(ICommande p_Commande) ;
		
}
