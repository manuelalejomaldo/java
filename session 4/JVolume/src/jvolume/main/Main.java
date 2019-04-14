/**
 * 
 */
package jvolume.main;

import jvolume.controleur.VolumeController;
import jvolume.modele.VolumeModel;

/**
 * @author ManueLMaldonado
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VolumeModel model = new VolumeModel(50);
		VolumeController controller = new VolumeController(model);
		controller.displayViews();

	}

}
