/**
 * 
 */
package swingexrecices;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



/**
 * @author ManueLMaldonado

 *
 */
public class FenetreCheckBoxEtRadioButton extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JLabel lbl_TextResultat = new JLabel();	
	
	private JTextField txt_Text = new JTextField(21);
	private JButton btn_Go = new JButton("Go");
	
	private JRadioButton rdo_Bleu = new JRadioButton("Bleu");
	private JRadioButton rdo_Rouge = new JRadioButton("Rouge");
	private JRadioButton rdo_Vert = new JRadioButton("Vert");
	private ButtonGroup grp_Couleur = new ButtonGroup();
	
	 FenetreCheckBoxEtRadioButton(){
		
		super("Exercice Fenetre JCheckBox et JRadioButton");
		
		// Pour fermer l'application si on clique sur le X
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Container c1 = this.getContentPane();
		c1.setLayout(new FlowLayout());
	
		//c1.setVerticalGroup();
		//section 1
			
		
        c1.add(this.txt_Text);
        c1.add(this.btn_Go);
		this.btn_Go.addActionListener(new GestActionsBtnGo());
		
		//Section 2
		
		
		//section 4???? como organizar 
		Container c4 = this.getContentPane();
		c4.setLayout(new FlowLayout());
		c4.add(this.lbl_TextResultat);
		
		// Ajustement de la taille
		this.setSize(450, 500);
		// Centree au milieu de l'ecran
		this.setLocationRelativeTo(null);
		
		
	}

	 private class GestActionsBtnGo implements ActionListener
	    {
			@Override
	        public void actionPerformed(ActionEvent p_event)
	        {
				FenetreCheckBoxEtRadioButton.this.lbl_TextResultat.setText(
						FenetreCheckBoxEtRadioButton.this.txt_Text.getText());    
	        }
	    }
}
