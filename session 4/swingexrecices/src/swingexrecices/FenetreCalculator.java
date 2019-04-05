/**
 * 
 */
package swingexrecices;

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
public class FenetreCalculator extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel lbl_Nb1 = new JLabel();	
	JTextField txt_Nb1 = new JTextField(3);
	JTextField txt_Nb2 = new JTextField(3);
	JButton btn_Addition = new JButton("Addition");
	
	public FenetreCalculator(){
		
		super("Calculator");
		lbl_Nb1.setText("Bonjour. Entrez deux Nombres :");
		Container c = this.getContentPane();
		
		c.setLayout(new FlowLayout());
        c.add(this.lbl_Nb1);    
        c.add(this.txt_Nb1);
        c.add(this.txt_Nb2);
        c.add(this.btn_Addition);
		this.btn_Addition.addActionListener(new GestActionsBtnAddition());
		
		// Ajustement de la taille
        this.pack();
        // Centree au milieu de l'ecran
        this.setLocationRelativeTo(null);
        // Pour fermer l'application si on clique sur le X
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}
	
	private class GestActionsBtnAddition implements ActionListener
    {
		@Override
        public void actionPerformed(ActionEvent p_event)
        {
            String nb1 = FenetreCalculator.this.txt_Nb1.getText();
            String nb2 = FenetreCalculator.this.txt_Nb2.getText();
            JOptionPane.showMessageDialog(FenetreCalculator.this, 
            		"L'additions est: " + (nb1 + nb2));//*/
            
        }
    }

}
