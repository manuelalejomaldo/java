/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class CompteCourant implements Compte{
	
	public static final Double SOLDE_DEFAULT = 0.0;
	
	private int m_CompteId;
	private Double m_Solde;
		
	

	/**
	 * @param compteId
	 * @param solde
	 */
	public CompteCourant(int m_compteId, Double p_montant) {
		this.m_CompteId = m_compteId;
		this.m_Solde = p_montant;
	}
	
	
	/**
	 * @return the m_CompteId
	 */
	@Override
	public int getCompteId() {
		return m_CompteId;
	}
	
	/**
	 * @return the solde
	 */
	@Override
	public Double getSolde() {
		return this.m_Solde;
	}
	
	
	/**
	 * @param solde the solde to set
	 */
	@Override
	public void deposer(Double p_montant) {
		this.m_Solde += p_montant;
	}
	
	/**
	 * @param p_solde
	 */
	@Override
	public void retirer(Double p_montant) {
		this.m_Solde -= p_montant;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [CompteId=" + m_CompteId + ", Solde=" + m_Solde + "]";
	}
	
}
