/**
 * 
 */
package rest.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class Compte {
	
	private String m_NomUsage;
	private String m_ModeDePasse;
	
	
	
	
	/**
	 * @param m_NomUsage
	 * @param m_ModeDePasse
	 */
	public Compte(String p_NomUsage, String p_ModeDePasse) {
		
		this.setNomUsage(p_NomUsage); 
		this.setModeDePasse(p_ModeDePasse);
	}
	/**
	 * @return the m_NomUsage
	 */
	public String getNomUsage() {
		return m_NomUsage;
	}
	/**
	 * @param m_NomUsage the m_NomUsage to set
	 */
	public void setNomUsage(String m_NomUsage) {
		this.m_NomUsage = m_NomUsage;
	}
	/**
	 * @return the m_ModeDePasse
	 */
	public String getModeDePasse() {
		return m_ModeDePasse;
	}
	/**
	 * @param m_ModeDePasse the m_ModeDePasse to set
	 */
	public void setModeDePasse(String m_ModeDePasse) {
		this.m_ModeDePasse = m_ModeDePasse;
	}

}
