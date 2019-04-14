/**
 * 
 */
package jvolumen.vue;

import java.awt.Frame;
import java.awt.List;

/**
 * @author ManueLMaldonado
 *
 */


import jvolume.controleur.VolumeController;
import jvolume.controleur.VolumeView;
import jvolume.modele.VolumeChangedEvent;
 
public class FrameListVolume extends VolumeView {
	
	private Frame frame = null;
	private List listVolume = null;
 
	public FrameListVolume(VolumeController controller) {
		this(controller, 0);
	}
 
	public FrameListVolume(VolumeController controller, int volume){
		super(controller); 
 
		buildFrame(volume);
	}
 
	private void buildFrame(int volume) {
		frame = new Frame();
 
		listVolume = new List();
		listVolume.add(Integer.toString(volume));
		frame.add(listVolume);
 
		frame.setTitle("JFrameListVolume");
		frame.pack();
	}
 
	@Override
	public void close() {
		frame.dispose();
	}
 
	@Override
	public void display() {
		frame.setVisible(true);
	}
 
	public void volumeChanged(VolumeChangedEvent event) {
		listVolume.add(Integer.toString(event.getNewVolume()));
	}
}