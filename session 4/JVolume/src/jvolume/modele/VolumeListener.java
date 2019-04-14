/**
 * 
 */
package jvolume.modele;

import java.util.EventListener;
/**
 * @author ManueLMaldonado
 *
 */
public interface VolumeListener extends EventListener{
	public void volumeChanged(VolumeChangedEvent event);
}
