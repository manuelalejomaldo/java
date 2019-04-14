/**
 * 
 */
package Java2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * @author ManueLMaldonado
 *
 */
public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame jf = new JFrame("Demo");
	    Container cp = jf.getContentPane();
	    MyCanvas tl = new MyCanvas();
	    cp.add(tl);
	    jf.setSize(1200, 800);
	    jf.setVisible(true);

	}
}	
	class MyCanvas extends JComponent {
		  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void paint(Graphics g) {
			/*Graphics2D g1 = (Graphics2D) g;	
			g1.draw(new Line2D.Double(0,0,350,350));
			Graphics2D g2 = (Graphics2D) g;	
			g2.draw(new Rectangle2D.Double(360,0,350,350));
			Graphics2D g3 = (Graphics2D) g;	
			g3.draw(new Ellipse2D.Double(720,0,350,350));//*/
		
			ArrayList<Shape> listShape = new ArrayList<Shape>(); 
			
			listShape.add( new Line2D.Double(0,0,350,350));
			listShape.add( new Rectangle2D.Double(360,0,350,350));
			listShape.add( new Ellipse2D.Double(720,0,350,350));
			
			listShape.add( new Line2D.Double(0,360,360,720));
			listShape.add( new Rectangle2D.Double(360,360,350,350));
			listShape.add( new Ellipse2D.Double(720,360,350,350));
			
			Graphics2D g0 = (Graphics2D) g;
			g0.setPaint(Color.blue);
			g0.setStroke(new BasicStroke(5)); // pixel wide pen
			g0.draw(listShape.get(0));
			
			Graphics2D g1 = (Graphics2D) g;	
			g1.setPaint(Color.CYAN);
			g1.setStroke(new BasicStroke(10)); // pixel wide pen
			g1.draw(listShape.get(1));
			
			Graphics2D g2 = (Graphics2D) g;
			g2.setPaint(Color.GRAY);
			g2.setStroke(new BasicStroke(15)); // pixel wide pen
			g2.draw(listShape.get(2));
			
			Graphics2D g3 = (Graphics2D) g;	
			g0.setPaint(Color.GREEN);
			g0.setStroke(new BasicStroke(20)); // pixel wide pen
			g3.draw(listShape.get(3));
			
			Graphics2D g4 = (Graphics2D) g;
			g0.setPaint(Color.MAGENTA);
			g0.setStroke(new BasicStroke(25)); // pixel wide pen
			g4.fill(listShape.get(4));
			
			Graphics2D g5 = (Graphics2D) g;	
			g0.setPaint(Color.ORANGE);
			g0.setStroke(new BasicStroke(30)); // pixel wide pen
			g5.fill(listShape.get(5));
			
			/*for(int i = 0; i < listShape.size(); i++) {
				Graphics2D gi = (Graphics2D) g;
				
			}//*/
			
			//g2.fill() = solid
			//g2.drag() = line
			/*Shape shape = new Rectangle2D.Float(100, 50, 80, 80);
			
			Rectangle2D.Float square = new Rectangle2D.Float(100, 50, 80, 80);
			square.
			
		    Graphics2D g2 = (Graphics2D) g;		    
		    //g2.fill(shape);
		    g2.draw(shape);//*/
			
			
		}

	}
