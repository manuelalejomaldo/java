/**
 * 
 */
package ca.csf.dfc.solid.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class Fournisseur {
	
	/**
	 * 
	 */
	private int m_IdFournisseur;
	/**
	 * 
	 */
	private String m_NomFournisseur;
	/**
	 * 
	 */
	private String m_ContactFournisseur;
	
	/**
	 * 
	 */
	public static final int MINIMUM_ID = 1;
	
	/**
	 * @param m_IdFournisseur
	 * @param m_NomFournisseur
	 * @param m_ContactFournisseur
	 */
	public Fournisseur( int p_IdFournisseur, 
						String p_NomFournisseur, 
						String p_ContactFournisseur) 
	{
		
		if(p_IdFournisseur < MINIMUM_ID ) {
			throw new IllegalArgumentException(
					"Le parametre Id ne doit pas être negative ou zero");     
		}
		this.m_IdFournisseur = p_IdFournisseur;
		
		if(p_NomFournisseur.isEmpty()) { 
			throw new IllegalArgumentException(
					"Le parametre Nom ne doit pas être null ou vide");
		}
		this.m_NomFournisseur = p_NomFournisseur;
		
		if(p_ContactFournisseur.isEmpty()) { 
			throw new IllegalArgumentException(
					"Le parametre Contact ne doit pas être null ou vide");
		}
		this.m_ContactFournisseur = p_ContactFournisseur;
	}
	/**
	 * @return the m_IdFournisseur
	 */
	public int getIdFournisseur() {
		return m_IdFournisseur;
	}
	/**
	 * @return the m_NomFournisseur
	 */
	public String getNomFournisseur() {
		return m_NomFournisseur;
	}
	/**
	 * @return the m_ContactFournisseur
	 */
	public String getContactFournisseur() {
		return m_ContactFournisseur;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fournisseur [m_IdFournisseur=" + m_IdFournisseur + ", m_NomFournisseur=" + m_NomFournisseur
				+ ", m_ContactFournisseur=" + m_ContactFournisseur + "]";
	}
	
}
