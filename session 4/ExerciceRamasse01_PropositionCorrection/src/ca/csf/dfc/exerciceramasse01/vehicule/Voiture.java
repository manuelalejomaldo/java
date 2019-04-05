/**
 * 
 */
package ca.csf.dfc.exerciceramasse01.vehicule;

/**
 * @author li23x3
 *
 */
public class Voiture extends Vehicule {
	public Voiture(String p_Marque, String p_Modele) {
		super(p_Marque, p_Modele, 100);
	}

	/* 
	 * @see ca.csf.dfc.exerciceramasse01.vehicule.Vehicule#getTypeVehicule()
	 */
	@Override
	public String getTypeVehicule() {
		return "Voiture";
	}

}
