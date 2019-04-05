/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class ATM {
	
	private CreateurTransaction m_createurtransaction;
	private TiroirArgent m_tiroirargent;//ok
	
	public ATM(CreateurTransaction p_createurtransaction, 
				TiroirArgent p_tiroirargent) {
		
		this.m_createurtransaction = p_createurtransaction;
		this.m_tiroirargent = p_tiroirargent;
	}
	
	
	public void Retirer(CompteCourant p_compte2, Double p_montant) {
		
		Transaction transaction = m_createurtransaction.Creertransaction(p_compte2,p_montant); 
		
		if(transaction.EstValide()) {
			
			if(!(transaction.ValiderTransaction())) {
				m_tiroirargent.DistribuerArgent();
			}
			else {
				transaction.Annuler();
			}
				
		}
		
	}
	
	public void Depositer(CompteCourant p_compte2, Double p_montant) {
		
		Transaction transaction = m_createurtransaction.Creertransaction(p_compte2,p_montant); 
		
		if(transaction.EstValide()) {
			
			if(!(transaction.ValiderTransaction())) {
				m_tiroirargent.DistribuerArgent();
			}
			else {
				transaction.Annuler();
			}
				
		}
		
	}
	
}

