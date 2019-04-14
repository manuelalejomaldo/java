/**
 * 
 */
package Java2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @author ManueLMaldonado
 *
 */
public class GradientPaintExample extends ShapeExample{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	// Red at (0,0), yellow at (175,175), changes gradually between.

	private GradientPaint gradient =
	 new GradientPaint(0, 0, Color.red, 175, 175, Color.yellow, true); 
	
	// true means to repeat pattern
	public void paintComponent(Graphics g) {

		clear(g);
		Graphics2D g2d = (Graphics2D)g;
		drawGradientCircle(g2d);
	}
	
	
	protected void drawGradientCircle(Graphics2D g2d) {
		
		//g2d.setPaint(gradient);
		g2d.fill(getCircle());
	
		//g2d.setPaint(Color.black);
		g2d.setPaint(Color.blue);
		g2d.setStroke(new BasicStroke(18)); // 8-pixel wide pen
		g2d.draw(getCircle());

	}

}
