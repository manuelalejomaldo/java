/**
 * 
 */
package tp_dessin.view;

import java.awt.Color;
import java.awt.Dimension;


import javax.swing.JPanel;

/**
 * @author ManueLMaldonado
 *
 */
public class AreaTravail extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AreaTravail() {
		//pour implementer dragable
		this.setDoubleBuffered(false);
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(200, 100));
		this.repaint();
		
	}

}
