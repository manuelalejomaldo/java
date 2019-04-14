package volume;

import java.util.EventListener;

public interface VolumeListener extends EventListener {
	public void volumeChanged(VolumeChangedEvent event);
}
