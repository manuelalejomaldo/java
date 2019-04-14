package volume;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JFrameSpinnerVolume extends VolumeView implements ActionListener{
	private JFrame frame = null;
	private JPanel contentPane = null;
	private JSpinner spinner = null;
	private SpinnerNumberModel spinnerModel = null;
	private JButton button = null;
	
	public JFrameSpinnerVolume(VolumeController controller) {
		this(controller, 0);
	}
	
	public JFrameSpinnerVolume(VolumeController controller, int volume){
		super(controller); 
		
		buildFrame(volume);
	}
	
	private void buildFrame(int volume) {
		frame = new JFrame();
		
		contentPane = new JPanel();
		
		spinnerModel = new SpinnerNumberModel(volume, 0, 100, 1);
		
		spinner = new JSpinner(spinnerModel);
		contentPane.add(spinner);
		
		button = new JButton("Mettre à jour");
		button.addActionListener(this);
		contentPane.add(button);
		
		frame.setContentPane(contentPane);
		frame.setTitle("JFrameSpinnerVolume");
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
		spinnerModel.setValue(event.getNewVolume());
	}

	public void actionPerformed(ActionEvent arg0) {
		getController().notifyVolumeChanged(spinnerModel.getNumber().intValue());
	}
}