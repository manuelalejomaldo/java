/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public interface Transaction {
	public Boolean EstValide();
	public Boolean ValiderTransaction();
	public void Annuler();
}
