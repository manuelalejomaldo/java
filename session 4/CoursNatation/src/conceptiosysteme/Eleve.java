/**
 * 
 */
package conceptiosysteme;

/**
 * @author ManueLMaldonado
 *
 */
public class Eleve {
	
	private String m_Nom;
	
	private Adult m_Adult;

	private Eleve m_Contacte;

	/**
	 * @param m_Nom
	 * @param m_Adult
	 */
	public Eleve(String m_Nom, Adult m_Adult) {
		this.m_Nom = m_Nom;
		this.m_Adult = m_Adult;
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
	 * @return the m_Adult
	 */
	public Adult getM_Adult() {
		return m_Adult;
	}

	/**
	 * @param m_Adult the m_Adult to set
	 */
	public void setM_Adult(Adult m_Adult) {
		this.m_Adult = m_Adult;
	}
	
	public String getTel() {
		return this.m_Adult.getM_Tel();
	}
	
	public String getAdultResponsable() {
		return this.m_Adult.getM_Tel();
	}
	
	/**
	 * @return the m_Contacte
	 */
	public Eleve getM_Contacte() {
		return m_Contacte;
	}
	public void Contacte(Eleve p_eleve) {
		
		this.m_Contacte = p_eleve;
	}
}
