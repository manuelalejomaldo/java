package volume;

import javax.swing.event.EventListenerList;

public class VolumeModel {
	private int volume;
	
	private EventListenerList listeners;
	
	public VolumeModel(){
		this(0);
	}
	
	public VolumeModel(int volume){
		super();
		
		this.volume = volume;
		
		listeners = new EventListenerList();
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
		
		fireVolumeChanged();
	}
	
	public void addVolumeListener(VolumeListener listener){
		listeners.add(VolumeListener.class, listener);
	}
	
	public void removeVolumeListener(VolumeListener l){
		 listeners.remove(VolumeListener.class, l);
	}
	
	public void fireVolumeChanged(){
		VolumeListener[] listenerList = (VolumeListener[])listeners.getListeners(VolumeListener.class);
		
		for(VolumeListener listener : listenerList){
			listener.volumeChanged(new VolumeChangedEvent(this, getVolume()));
		}
	}
}