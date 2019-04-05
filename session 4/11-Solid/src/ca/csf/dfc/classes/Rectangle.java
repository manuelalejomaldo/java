/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class Rectangle implements Aire{
	
	
	/**
	 * 
	 */
	public final static int DEFAULT_HAUTEUR = 0;
	
	
	/**
	 * 
	 */
	public final static int DEFAULT_LARGEUR = 0;
	
	/**
	 * 
	 */
	private int m_Hauteur;
	
	/**
	 * 
	 */
	private int m_Largeur;

	
	
	public Rectangle() {
		
		this.setHauteur(DEFAULT_HAUTEUR);
		this.setLargeur(DEFAULT_LARGEUR);
	}
	
	/**
	 * @param m_Hauteur
	 * @param m_Largeur
	 */
	public Rectangle(int m_Hauteur, int m_Largeur) {
		
		this.setHauteur(m_Hauteur);
		this.setLargeur(m_Largeur);
	}

	/**
	 * @return the m_Hauteur
	 */
	public int getHauteur() {
		return m_Hauteur;
	}

	/**
	 * @param m_Hauteur the m_Hauteur to set
	 */
	public void setHauteur(int m_Hauteur) {
		this.m_Hauteur = m_Hauteur;
	}

	/**
	 * @return the m_Largeur
	 */
	public int getLargeur() {
		return m_Largeur;
	}

	/**
	 * @param m_Largeur the m_Largeur to set
	 */
	public void setLargeur(int m_Largeur) {
		this.m_Largeur = m_Largeur;
	}

	@Override
	public int getAire() {
		// TODO Auto-generated method stub
		return this.getHauteur() * this.getLargeur();
	}
	
	

}
