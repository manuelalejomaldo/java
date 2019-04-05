package ca.csf.dfc.poo;

import java.util.Date;


public class Lettre extends Message<String> {

	/**
	 * Contructeur d'initialisation
	 * @param p_date
	 * @param p_persOrigine
	 * @param p_persDestinataire
	 * @param p_priorite
	 * @param p_contenu
	 */
	public Lettre(Date p_date, Personne p_persOrigine, Personne p_persDestinataire, Priorite p_priorite,
			String p_contenu) {
		super(p_date, p_persOrigine, p_persDestinataire, p_priorite, p_contenu);
		
	}

	/**
	 * Pour nous permettre d'afficher la lettre
	 *  (non-Javadoc)
	 * @see ca.csf.dfc.poo.Message#toString()
	 */
	
	@Override
	public String toString() {
		return "[ Lettre ]"  + super.toString() ;
	}

	
	
	

}
