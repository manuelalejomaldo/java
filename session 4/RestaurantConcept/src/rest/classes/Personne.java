/**
 * 
 */
package rest.classes;

import java.util.ArrayList;

/**
 * @author ManueLMaldonado
 *
 */
public class Personne {
	
	private String m_NomPersonne;
	private String m_PrenomPersonne;
	private ArrayList<Adresse> m_Adresses;
	private ArrayList<Compte> m_comptes;
	private String m_Tel;
	
	/**
	 * @param m_NomPersonne
	 * @param m_PrenomPersonne
	 * @param m_Adresses
	 * @param m_Tel
	 */
	public Personne(String p_NomPersonne, String p_PrenomPersonne,  Adresse p_Adresse,String p_Tel, Compte p_compte) {
		this.m_NomPersonne = p_NomPersonne;
		this.m_PrenomPersonne = p_PrenomPersonne;
		this.m_Adresses = new ArrayList<Adresse>();
		this.addAdresse(p_Adresse);
		this.m_Tel = p_Tel;
		this.m_comptes = new ArrayList<Compte>();
		
	}
	/**
	 * @return the m_Adresses
	 */
	public ArrayList<Adresse> getAdresses() {
		return m_Adresses;
	}
	/**
	 * @param m_Adresses the m_Adresses to set
	 */
	public void addCompte(Compte p_compte) {
		this.m_comptes.add(p_compte) ;
	}
	/**
	 * @return the m_m_comptes
	 */
	public ArrayList<Compte> getCompte() {
		return m_comptes;
	}
	/**
	 * @param m_Adresses the m_Adresses to set
	 */
	public void addAdresse(Adresse p_Adresses) {
		this.m_Adresses.add(p_Adresses) ;
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
	/**
	 * @return the m_NomPersonne
	 */
	public String getM_NomPersonne() {
		return m_NomPersonne;
	}
	/**
	 * @param m_NomPersonne the m_NomPersonne to set
	 */
	public void setM_NomPersonne(String m_NomPersonne) {
		this.m_NomPersonne = m_NomPersonne;
	}
	/**
	 * @return the m_PrenomPersonne
	 */
	public String getM_PrenomPersonne() {
		return m_PrenomPersonne;
	}
	/**
	 * @param m_PrenomPersonne the m_PrenomPersonne to set
	 */
	public void setM_PrenomPersonne(String m_PrenomPersonne) {
		this.m_PrenomPersonne = m_PrenomPersonne;
	}
	

}
