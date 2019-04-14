/**
 * 
 */
package jvolume.controleur;

import jvolume.modele.VolumeModel;
import jvolumen.vue.FrameListVolume;
import jvolumen.vue.JFrameFieldVolume;

import jvolumen.vue.JFrameSpinnerVolume;

/**
 * @author ManueLMaldonado
 *
 */
public class VolumeController {
	
	public VolumeView fieldView = null;
	public JFrameSpinnerVolume spinnerView = null;
	public VolumeView listView = null;
 
	private VolumeModel model = null;
 
	public VolumeController (VolumeModel model){
		this.model = model;
		 
		//fieldView = new JFrameFieldVolume(this, model.getVolume());
		spinnerView = new JFrameSpinnerVolume(this, model.getVolume());
		listView = new FrameListVolume(this, model.getVolume());
	 
		
 
		addListenersToModel();
	}
 
	private void addListenersToModel() {
		//model.addVolumeListener(fieldView);
		model.addVolumeListener(spinnerView);
		model.addVolumeListener(listView);
	}
 
	public void displayViews(){
		//fieldView.display();
		spinnerView.display();
		listView.display();
	}
 
	public void closeViews(){
		//fieldView.close();
		spinnerView.close();
		listView.close();
	}
 
	public void notifyVolumeChanged(int volume){
		model.setVolume(volume);
	}
}
