package ca.csf.dfc.poo;

import java.util.Date;

import javax.swing.ImageIcon;

public class CartePostale extends Message<ImageIcon> {
	
	/**
	 * Contructeur d'initialisation
	 * @param p_date
	 * @param p_persOrigine
	 * @param p_persDestinataire
	 * @param p_priorite
	 * @param p_contenu
	 */
	public CartePostale(Date p_date, IPersonne p_persOrigine, IPersonne p_persDestinataire, Priorite p_priorite,
			ImageIcon p_contenu) {
		super(p_date, p_persOrigine, p_persDestinataire, p_priorite, p_contenu);
		
	}
	
	/**
	 * Pour nous permettre d'afficher la carte postale
	 *  (non-Javadoc)
	 * @see ca.csf.dfc.poo.Message#toString()
	 */
	
	@Override
	public String toString() {
		return "[ CartePostale ]"  + super.toString() ;
	}

	

}
