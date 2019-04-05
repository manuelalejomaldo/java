/**
 * 
 */
package conceptiosysteme;

/**
 * @author ManueLMaldonado
 *
 */
public class Niveau {
	
	
	private Integer m_Niveau;
	
	private CouleurNiveau m_couleur;
	
	/**
	 * @param m_Niveau
	 */
	public Niveau(Integer m_Niveau) {
		this.m_Niveau = m_Niveau;
		
		switch(m_Niveau) {
		  case 1:
		    // code block
			  this.m_couleur = CouleurNiveau.blanc;
		    break;
		  case 2:
		    // code block
			  this.m_couleur = CouleurNiveau.bleu;
		    break;
		  case 3:
			  this.m_couleur = CouleurNiveau.marron;
			break;
		  case 4:
			  this.m_couleur = CouleurNiveau.mauve;
			break;
		  case 5:
			  this.m_couleur = CouleurNiveau.rouge;
			    break;
		  case 6:
			  this.m_couleur = CouleurNiveau.vert;
			    break;
		  default:
		    // code block
			  break;
		}
	}

	/**
	 * @return the m_Niveau
	 */
	public Integer getM_Niveau() {
		return m_Niveau;
	}

	/**
	 * @return the m_couleur
	 */
	public CouleurNiveau getM_couleur() {
		return m_couleur;
	}

	
	
	

}
