/**
 * 
 */
package Java2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

/**
 * @author ManueLMaldonado
 *
 */
public class ShapeExample extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Ellipse2D.Double circle =
							new Ellipse2D.Double(10, 10, 350, 350);
	private Rectangle2D.Double square =
							new Rectangle2D.Double(10, 10, 350, 350);
	private Line2D.Double line = 
							new Line2D.Double(250D,250D,150D,150D);
	

	public void paintComponent(Graphics g) {
	  clear(g);
	  Graphics2D g2d = (Graphics2D)g;
	  g2d.fill(circle);
	  //g2d.fill(square);
	  //g2d.fill(line);
	  //g2d.draw(circle);
	  g2d.draw(square);
	  //g2d.draw(line);//*/
	}
	
	// super.paintComponent clears off screen pixmap,
	// since we're using double buffering by default.
	protected void clear(Graphics g) {
	  super.paintComponent(g);
	}	

	protected Ellipse2D.Double getCircle() {
	  return(circle);
	}

	
} 
