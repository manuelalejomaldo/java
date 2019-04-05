package ca.csf.dfc.poo;

import java.util.Date;

public class XpressAR extends Message<String> {

	/**
	 * Le constructeur d'initialisation
	 * @param p_date
	 * @param p_persOrigine
	 * @param p_persDestinataire
	 * @param p_priorite
	 * @param p_contenu
	 */
	

	public XpressAR(Date p_date, IPersonne p_persOrigine, IPersonne p_persDestinataire, Priorite p_priorite,
			String p_contenu) {
		super(p_date, p_persOrigine, p_persDestinataire, p_priorite.VeryHigh, p_contenu);
		
	}

	/**
	 * Pour nous permettre d'afficher le messsage XpressAR
	 *  (non-Javadoc)
	 * @see ca.csf.dfc.poo.Message#toString()
	 */
	
	@Override
	public String toString() {
		return "[ XpressAR ]"  + super.toString() ;
	}

}
