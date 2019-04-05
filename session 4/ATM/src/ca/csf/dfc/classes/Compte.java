/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public interface Compte {
	public int getCompteId();
	public Double getSolde();
	public void deposer(Double p_montant);
	public void retirer(Double p_montant);
	
}
