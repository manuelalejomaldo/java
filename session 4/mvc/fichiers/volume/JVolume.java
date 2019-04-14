package volume;

public class JVolume {
	public static void main(String[] args) {
		VolumeModel model = new VolumeModel(50);
		VolumeController controller = new VolumeController(model);
		controller.displayViews();
	}
}