/**
 * 
 */
package swingexrecices;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author ManueLMaldonado
 *
 */
public class Panneau extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
		//Vous verrez cette phrase chaque fois que la méthode sera invoquée
		/*System.out.println("Je suis exécutée !");
		g.fillOval(20, 20, 75, 75);*/
		
		/*int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		
		g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);*/
		
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
		
		
		
	}
	
	public void paintComponent2(Graphics g){
		//x1, y1, width, height
		g.drawRect(10, 10, 50, 60);
		g.fillRect(65, 65, 30, 40);
	}
}
