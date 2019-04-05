package ca.csf.dfc.classes;
import ca.cdf.dfc.classes.Personne;

public class Employe extends Personne{
	
	/**
	 * 
	 */
	private String m_numAssSocial;
	
	/**
	 * 
	 */
	private double m_Salaire;	
	
	/**
	 * @param m_numAssSocial
	 * @param m_Salaire
	 */
	public Employe(String p_nom, int p_age, String p_numAssSocial, double p_Salaire) {	
		super.setAge(p_age);
		this.setNom(p_nom);
		this.setNumAssSocial(p_numAssSocial);
		this.setSalaire(p_Salaire);		
	}
	
	@Override
	public void setNom(String p_nom) {
		if(p_nom == null || p_nom.isEmpty()) {
			throw new IllegalArgumentException("Le nom ne peut être vide");
		}
		super.setNom(p_nom);
	}
	
	/**
	 * @return the m_numAssSocial
	 */
	public String getNumAssSocial() {
		return m_numAssSocial;
	}
	
	/**
	 * @param m_numAssSocial the m_numAssSocial to set
	 */
	public void setNumAssSocial(String m_numAssSocial) {
		this.m_numAssSocial = m_numAssSocial;
	}
	
	/**
	 * @return the m_Salaire
	 */
	public double getSalaire() {
		return m_Salaire;
	}
	
	/**
	 * @param m_Salaire the m_Salaire to set
	 */
	public void setSalaire(double m_Salaire) {
		this.m_Salaire = m_Salaire;
	}
	
	@Override
	public String toString() {
	return "Je suis l'employe " + this.getNom()
	+ " et je gagne " + this.getSalaire() + " $";
	}
}
