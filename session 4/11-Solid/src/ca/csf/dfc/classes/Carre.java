/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class Carre extends Rectangle{

	public final static int DEFAULT_DIMENTION = 0;
	
	/**
	 * 
	 */
	private int m_Dimention;

	/**
	 * 
	 */
	public Carre() {
		super.setHauteur(DEFAULT_DIMENTION);
		super.setLargeur(DEFAULT_DIMENTION);
		//this.m_Dimention = m_Dimention;
		
	}
	
	/**
	 * @param m_Hauteur
	 * @param m_Largeur
	 * @param m_Dimention
	 */
	public Carre(int m_Dimention) {
		super.setHauteur(m_Dimention);
		super.setLargeur(m_Dimention);
		//this.m_Dimention = m_Dimention;
		
	}
	
	/**
	 * @return the m_Dimention
	 */
	public int getDimention() {
		return m_Dimention;
	}

	/**
	 * @param m_Dimention the m_Dimention to set
	 */
	public void setDimention(int m_Dimention) {
		this.m_Dimention = m_Dimention;
		super.setHauteur(m_Dimention);
		super.setLargeur(m_Dimention);
	}
	
	@Override
	public void setHauteur(int m_Hauteur) {
		super.setHauteur(m_Hauteur);
		this.m_Dimention = m_Hauteur;
	}
	
	@Override
	public void setLargeur(int m_Largeur) {
		super.setLargeur(m_Largeur);
		this.m_Dimention = m_Largeur;
	}
	
}
