/**
 * 
 */
package swingexrecices;

import javax.swing.JFrame;

/**
 * @author ManueLMaldonado
 *
 */
public class Fenetre1 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Fenetre1(){		
		
		this.setTitle("Ma première fenêtre Java"); //titulo de barra
		this.setSize(400, 300);//ajusta el tamano
		this.setLocationRelativeTo(null);//se ubica en el centro
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//importante pour fermer la fenetre toltalmente
		this.setVisible(true);//se habilita para mostrarla
		
		this.setResizable(false);//impedir que se cambien el taille
		this.setAlwaysOnTop(true);//mantener siempre al frente
		//this.setUndecorated(true);//quitar decoraciôn
	}

}
