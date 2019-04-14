/**
 * 
 */
package jvolume.modele;

import java.util.EventObject;

/**
 * @author ManueLMaldonado
 *
 */
public class VolumeChangedEvent extends EventObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int newVolume;
	 
	public VolumeChangedEvent(Object source, int newVolume){
		super(source);
 
		this.newVolume = newVolume;
	}
 
	public int getNewVolume(){
		return newVolume;
	}
}
