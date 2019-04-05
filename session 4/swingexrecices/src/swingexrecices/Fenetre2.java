/**
 * 
 */
package swingexrecices;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 * @author ManueLMaldonado
 *
 */
public class Fenetre2 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JLabel lbl_Question = new JLabel();
	JTextField txt_Nom = new JTextField(10);
	JButton btn_Ok = new JButton("OK");

	public Fenetre2(){
		
		
		super("Demo fenetre");//construye una ventana basada en la super, incluye titulo
		
		// Ajout a la fenetre
		Container c = this.getContentPane();//variable c pour ref a container
		c.setLayout(new FlowLayout());//Il se contente de centrer les composants dans le conteneur l
		c.setBackground(Color.ORANGE);
		c.add(this.lbl_Question);
		c.add(this.txt_Nom);
		c.add(this.btn_Ok);
		
		this.btn_Ok.addActionListener(new GestActionsBtnOk());
		
		// Ajustement de la taille
		this.pack();
		// Centree au milieu de l'ecran
		this.setLocationRelativeTo(null);
		// Pour fermer l'application si on clique sur le X
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Initialiser les composants :
		lbl_Question.setText("Bonjour. Entrez votre nom :");
	}
	
	private class GestActionsBtnOk implements ActionListener
    {

        /**
         * Appelee lorsqu'on clique sur le bouton.
         */
        @Override
        public void actionPerformed(ActionEvent p_event)
        {
            String nom = Fenetre2.this.txt_Nom.getText();
            JOptionPane.showMessageDialog(Fenetre2.this, "Salutations a " + nom);
        }// met
    }// class
}
