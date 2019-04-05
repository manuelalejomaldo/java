import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;

public class SwingWindowBuilder {

	private JFrame Exercice1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingWindowBuilder window = new SwingWindowBuilder();
					window.Exercice1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Exercice1 = new JFrame();
		Exercice1.setTitle("Exercice1");
		Exercice1.setBounds(100, 100, 450, 300);
		Exercice1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Exercice1.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
