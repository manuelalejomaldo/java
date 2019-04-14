/**
 * 
 */
package jvolumen.vue;

/**
 * @author ManueLMaldonado
 *
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
 
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.DefaultFormatter;

import jvolume.controleur.VolumeController;
import jvolume.controleur.VolumeView;
import jvolume.modele.VolumeChangedEvent;
 
public class JFrameFieldVolume extends VolumeView implements ActionListener{
	private JFrame frame = null;
	private JPanel contentPane = null;
	private JFormattedTextField field = null;
	private JButton button = null;
	private NumberFormat format = null;
 
	public JFrameFieldVolume(VolumeController controller) {
		this(controller, 0);
	}
 
	public JFrameFieldVolume(VolumeController controller, int volume){
		super(controller); 
 
		buildFrame(volume);
	}
 
	private void buildFrame(int volume) {
		frame = new JFrame();
 
		contentPane = new JPanel();
 
		format = NumberFormat.getNumberInstance();
		format.setParseIntegerOnly(true);
		format.setGroupingUsed(false);		
		format.setMaximumFractionDigits(0);
		format.setMaximumIntegerDigits(3);
 
		field = new JFormattedTextField(format);
		field.setValue(volume);
		((DefaultFormatter)field.getFormatter()).setAllowsInvalid(false);
		contentPane.add(field);
 
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
		field.setValue(event.getNewVolume());
	}
 
	public void actionPerformed(ActionEvent arg0) {
		getController().notifyVolumeChanged(Integer.parseInt(field.getValue().toString()));
	}
}
