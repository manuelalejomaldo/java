package ca.csf.dfc.poo;
import java.util.ArrayList;

public class Personne {
	
	/**
	 * L'Identificateur d'une personne
	 */
	private static long m_idgen=0;
	/**
	 * L'Identificateur d'une personne
	 */
	private long m_id;	
	/**
	 * le nom de la personne
	 */
	private final String m_nom;
	/**
	 * le prénom de la personne
	 */
	private final String m_prenom;
	/**
	 * l'adresse de la personne
	 */
	private String m_adresse;
	/**
	 * Contructeur d'initialisation	
	 */
	public Personne( String p_nom, String p_prenom, String p_adresse) {
		this.m_id = ++this.m_idgen;
		this.m_nom = p_nom;
		this.m_prenom = p_prenom;
		this.setAdresse(p_adresse);
	}
	
	/**
	 * Retourne le id.
	 * @return le id
	 */
	public long getId() {
		return this.m_id;
	}
	/**
	 * Pour modifier le id.
	 * @param p_id Nouvelle valeur
	 */
	public void setId(long p_id) {
		this.m_id = p_id;
	}
	/**
	 * Retourne le adresse.
	 * @return le adresse
	 */
	public String getAdresse() {
		return this.m_adresse;
	}
	/**
	 * Pour modifier le adresse.
	 * @param p_adresse Nouvelle valeur
	 */
	public void setAdresse(String p_adresse) {
		if(m_adresse==null) 
		{
			throw new IllegalArgumentException("L'adresse ne peut être vide");
		}
		this.m_adresse = p_adresse;
	}
	
	/**
	 * Retourne le nom.
	 * @return le nom
	 */
	public String getNom() {
		return this.m_nom;
	}
	/**
	 * Retourne le prenom.
	 * @return le prenom
	 */
	public String getPrenom() {
		return this.m_prenom;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "M./Mme.[" + this.m_prenom +"] [" + this.m_nom + "] [" + this.m_id + "]";
	}
		
	

}
