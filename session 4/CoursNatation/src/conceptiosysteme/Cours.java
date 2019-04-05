/**
 * 
 */
package conceptiosysteme;


import java.util.ArrayList;

/**
 * @author ManueLMaldonado
 *
 */
public class Cours {
	
	private String m_NomCours;
	private ArrayList<Eleve> m_eleves;
	private Niveau m_Niveau;
	
	
	/**
	 * @param m_NomCours
	 */
	public Cours(String m_NomCours,Integer p_Niveau) {
		this.m_NomCours = m_NomCours;
		this.m_eleves = new ArrayList<Eleve>();
		this.m_Niveau = new Niveau(p_Niveau);
	}
	
	
	/**
	 * @return the m_NomCours
	 */
	public String getM_NomCours() {
		return m_NomCours;
	}


	public void addEleve(Eleve p_eleve) {
		
		this.m_eleves.add(p_eleve);
	}
	
	public CouleurNiveau getNiveau() {
		return this.m_Niveau.getM_couleur();
	}

}
