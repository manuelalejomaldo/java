/**
 * 
 */
package ca.csf.dfc.solid.interfaces;

import java.util.List;

import ca.csf.dfc.solid.classes.Fournisseur;

/**
 * @author ManueLMaldonado
 *
 */
public interface IFournisseurRepository {
	
	public List<Fournisseur> getFournisseurs();
	public Boolean estFournisseur(Fournisseur p_Fournisseur);	
	
}
