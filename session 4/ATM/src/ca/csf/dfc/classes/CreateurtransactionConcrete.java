/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class CreateurtransactionConcrete implements CreateurTransaction{

	@Override
	public Transaction Creertransaction(CompteCourant p_compte, Double p_montant) {
		// TODO Auto-generated method stub
		return new TransactionBanqueXYZDepositer(p_compte, p_montant);
	}

}
