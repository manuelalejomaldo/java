/**
 * 
 */
package conceptiosysteme;

/**
 * @author ManueLMaldonado
 *
 */
public class Adult {

	private String m_Nom; 
	private String m_Tel;
	
	
	
	
	/**
	 * @param m_Nom
	 * @param m_Tel
	 */
	public Adult(String m_Nom, String m_Tel) {
		this.m_Nom = m_Nom;
		this.m_Tel = m_Tel;
	}
	/**
	 * @return the m_Nom
	 */
	public String getM_Nom() {
		return m_Nom;
	}
	/**
	 * @param m_Nom the m_Nom to set
	 */
	public void setM_Nom(String m_Nom) {
		this.m_Nom = m_Nom;
	}
	/**
	 * @return the m_Tel
	 */
	public String getM_Tel() {
		return m_Tel;
	}
	/**
	 * @param m_Tel the m_Tel to set
	 */
	public void setM_Tel(String m_Tel) {
		this.m_Tel = m_Tel;
	}
	
	
	
}
