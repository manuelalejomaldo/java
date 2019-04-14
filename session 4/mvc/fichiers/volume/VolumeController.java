package volume;

public class VolumeController {
	public VolumeView fieldView = null;
	public VolumeView spinnerView = null;
	public VolumeView listView = null;
	public VolumeView listView2 = null;
	
	private VolumeModel model = null;
	
	public VolumeController (VolumeModel model){
		this.model = model;
		
		fieldView = new JFrameFieldVolume(this, model.getVolume());
		spinnerView = new JFrameSpinnerVolume(this, model.getVolume());
		listView = new FrameListVolume(this, model.getVolume());
		listView2 = new JFrameListVolume(this, model.getVolume());
		
		addListenersToModel();
	}

	private void addListenersToModel() {
		model.addVolumeListener(fieldView);
		model.addVolumeListener(spinnerView);
		model.addVolumeListener(listView);
		model.addVolumeListener(listView2);
	}
	
	public void displayViews(){
		fieldView.display();
		spinnerView.display();
		listView.display();
		listView2.display();
	}
	
	public void closeViews(){
		fieldView.close();
		spinnerView.close();
		listView.close();
		listView2.close();
	}
	
	public void notifyVolumeChanged(int volume){
		model.setVolume(volume);
	}
}