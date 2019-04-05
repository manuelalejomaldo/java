/**
 * 
 */
package ca.csf.dfc.reservation;

/**
 * @author ManueLMaldonado
 *
 */
public class SalleDeReunion extends Ressource{

	private int m_etage;
	private int m_NbParticipants;
	
	public SalleDeReunion(int p_identifiant, int p_etage,int p_NbParticipants) {
		super(p_identifiant);
		this.m_etage =p_etage;
		this.m_NbParticipants = p_NbParticipants;
	}

	/**
	 * @return the m_etage
	 */
	public int getEtage() {
		return m_etage;
	}

	/**
	 * @return the m_NbParticipants
	 */
	public int getNbParticipants() {
		return m_NbParticipants;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ressource Type Salle De Reunion ubique à l'etage Numero =" + m_etage 
				+ ", Capacite maxime du participanyts=" + m_NbParticipants + "Id :" +this.getIdentifiant();
	}
	
	
	
}
