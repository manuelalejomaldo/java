/**
 * 
 */
package conceptiosysteme;

import java.util.ArrayList;

/**
 * @author ManueLMaldonado
 *
 */
public class Sauvateur {
	
	private String m_Nom;
	
	private ArrayList<Cours> m_Cours;

	/**
	 * @param m_Nom
	 */
	public Sauvateur(String m_Nom) {
		this.m_Nom = m_Nom;
		this.m_Cours = new ArrayList<Cours>();
	}
	
	
	
	/**
	 * @return the m_Nom
	 */
	public String getM_Nom() {
		return m_Nom;
	}



	public void addCours(Cours p_cours) {
		this.m_Cours.add(p_cours);
	}
	

}
