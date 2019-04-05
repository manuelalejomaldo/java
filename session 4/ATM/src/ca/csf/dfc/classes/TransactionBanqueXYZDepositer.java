/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class TransactionBanqueXYZDepositer implements Transaction{
	
	private Compte m_compte;
	private Double m_montant;
		
	
	public TransactionBanqueXYZDepositer (Compte p_compte, Double p_montant) {
		
		this.m_compte = p_compte;
		this.m_montant = p_montant;
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/*@Override
	public String toString() {
		return "Transaction sur la CompteId=" + m_compte.getCompteId() + ", Solde Debut: " 
				+ m_soldeDebut +", montant de la transaction =" + m_montant 
				+ ", Solde Final ="	+ m_compte.getSolde()+", EstValide=" + EstValide() 
				+ ", ValiderTransaction =" + ValiderTransaction();
	}*/

	@Override
	public Boolean EstValide() {
		//verifica si el montand est correct, si le cuenta est correct
		
		//if ((this.m_montant <= 0) || (this.m_montant != null)) 
			
		
		return ((this.m_montant > 0) && (this.m_montant != null) && (this.m_compte != null));
	}

	@Override
	public Boolean ValiderTransaction() {
		//executer transaction et verifier que les resultad sont corrects 
		double soldeDebut = this.m_compte.getSolde();
		this.m_compte.deposer(this.m_montant);
		return (soldeDebut + this.m_montant == this.m_compte.getSolde());
	}

	@Override
	public void Annuler() {
		// Annuler la transaction  
		
	}
	
	
	
}
