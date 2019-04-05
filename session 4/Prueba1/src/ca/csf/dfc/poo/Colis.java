package ca.csf.dfc.poo;

import java.util.Date;

public class Colis extends Message<Object> {

	/**
	 * Le constructeur d'initialisation
	 * @param p_date
	 * @param p_persOrigine
	 * @param p_persDestinataire
	 * @param p_priorite
	 * @param p_contenu
	 */
	
	public Colis(Date p_date, Personne p_persOrigine, Personne p_persDestinataire, Priorite p_priorite,
			Object p_contenu) {
		super(p_date, p_persOrigine, p_persDestinataire, p_priorite, p_contenu);
		
	}

	/**
	 * Pour nous permettre d'afficher le Colis
	 *  (non-Javadoc)
	 * @see ca.csf.dfc.poo.Message#toString()
	 */
	
	@Override
	public String toString() {
		return "[ Colis ]"  + super.toString() ;
	}

}
