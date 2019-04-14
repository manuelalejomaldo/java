/**
 * 
 */
package tp_dessin.main;

import javax.swing.SwingUtilities;

import tp_dessin.controlleur.Controleur;
import tp_dessin.model.Modele;
import tp_dessin.view.Vue;




/**
 * @author ManueLMaldonado
 *
 */
public class TP_DessinVect_MVC_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					createAndShowGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void createAndShowGUI() throws Exception {
		
		// Cration Modele
		Modele modele = new Modele();
        
        // Creation controlateur, avec modele
		Controleur control = new Controleur (modele);
		
		//Creation de la view , avec modele et controlateur
		new Vue( control);
	}

}
