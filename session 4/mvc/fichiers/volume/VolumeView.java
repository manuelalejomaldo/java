package volume;

public abstract class VolumeView implements VolumeListener{
	private VolumeController controller = null;
	
	public VolumeView(VolumeController controller){
		super();
		
		this.controller = controller;
	}
	
	public final VolumeController getController(){
		return controller;
	}
	
	public abstract void display();
	public abstract void close();
}