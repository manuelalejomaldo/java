package volume;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JFrameListVolume extends VolumeView {
	private JFrame frame = null;
	private JPanel contentPane = null;
	private JList listVolume = null;
	private JScrollPane scrollVolume = null;
	private DefaultListModel jListModel = null;
	
	public JFrameListVolume(VolumeController controller) {
		this(controller, 0);
	}
	
	public JFrameListVolume(VolumeController controller, int volume){
		super(controller); 
		
		buildFrame(volume);
	}
	
	private void buildFrame(int volume) {
		frame = new JFrame();
		
		contentPane = new JPanel();
		
		jListModel = new DefaultListModel();
		jListModel.addElement(volume);
		
		listVolume = new JList(jListModel);
		
		scrollVolume = new JScrollPane(listVolume);
		contentPane.add(scrollVolume);
		
		frame.setContentPane(contentPane);
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
		jListModel.addElement(event.getNewVolume());
	}
}