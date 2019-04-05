/**
 * 
 */
package ca.csf.dfc.main.console;

import ca.csf.dfc.classes.DureeDesTemps;

/**
 * @author Fabio Fonseca
 *
 */
public class MainDureeDesTemps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DureeDesTemps d1 = new DureeDesTemps();
		
		d1.setHeures(243);
		d1.setMinutes(7);
		d1.setSecondes(3);
		
		System.out.println(d1.toString());
		
		DureeDesTemps d2 = new DureeDesTemps();
		d2.setHeures(0);
		d2.setMinutes(33);
		d2.setSecondes(18);
		
		System.out.println(d2.toString());
		
		DureeDesTemps d3 = new DureeDesTemps();
		d3.setHeures(1);
		d3.setMinutes(16);
		d3.setSecondes(35);
		
		/**
		 * Prof. 
		 * Je n'ai pas réussir faire l'ajouter les dates. Presque 2 heures à chercher sans succéss. J'ai passé au prochain exercice.
		 */
		AjouterHeure(d2, d3);
	}

	

}
