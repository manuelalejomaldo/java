/**
 * 
 */
package ca.csf.dfc.reservation;

/**
 * @author ManueLMaldonado
 *
 */
public class OrdinateurPortable extends RessourceMaterielle{

	private String m_sysExploitation;
	
	public OrdinateurPortable(int p_identifiant, String p_sysExploitation) {
		super(p_identifiant);
		this.m_sysExploitation = p_sysExploitation;
	}

	/**
	 * @return the m_sysExploitation
	 */
	public String getSysExploitation() {
		return m_sysExploitation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ressource Ordinateur Portable avec systeme d'Exploitation= " 
				+ m_sysExploitation + ", identifient ;" + this.getIdentifiant();
	}
	
	

}
