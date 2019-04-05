/**
 * 
 */
package swingexrecices;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author ManueLMaldonado
 *
 */
public class Fenetre3 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Fenetre3() {
		this.setTitle("Ma deuxi�me fen�tre Java");
		//this.setSize(1920, 1080);
		this.pack();//se auajusta al contenido de la fenetre
		this.setLocationRelativeTo(null);
		
		//Instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		//D�finition de sa couleur de fond		
		pan.setBackground(Color.ORANGE);
		//On pr�vient notre JFrame que notre JPanel sera son content pane
		this.setContentPane(pan);
		this.setVisible(true);
	}

}
