/**
 *
 */
package ca.csf.dfc.poo.ui;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 * @author nrichard
 */
public class DemoJRadioButton extends JFrame {

	private static final long serialVersionUID = 1L;

	private JRadioButton rdo_PasFaim = new JRadioButton("Pas faim");
	private JRadioButton rdo_UnPeuFaim = new JRadioButton("Un peu faim");
	private JRadioButton rdo_TresFaim = new JRadioButton("Tres faim");

	private JRadioButton rdo_PasFatigue = new JRadioButton("Pas fatigue(e)");
	private JRadioButton rdo_UnPeuFatigue = new JRadioButton("Un peu fatigue(e)");
	private JRadioButton rdo_TresFatigue = new JRadioButton("Tres fatigue(e)");

	private ButtonGroup grp_Faim = new ButtonGroup();
	private ButtonGroup grp_Fatigue = new ButtonGroup();

	private JLabel lbl_ResultatFaim = new JLabel();
	private JLabel lbl_ResultatFatigue = new JLabel();

	/**
	 * Constructeur
	 */
	public DemoJRadioButton() {
		super("Demo JRadioButton");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(new FlowLayout());
		this.add(this.rdo_PasFaim);
		this.add(this.rdo_UnPeuFaim);
		this.add(this.rdo_TresFaim);
		this.add(this.rdo_PasFatigue);
		this.add(this.rdo_UnPeuFatigue);
		this.add(this.rdo_TresFatigue);
		this.add(this.lbl_ResultatFaim);
		this.add(this.lbl_ResultatFatigue);
		this.setSize(375, 150);
		this.setLocationRelativeTo(null);

		this.grp_Faim.add(this.rdo_PasFaim);
		this.grp_Faim.add(this.rdo_UnPeuFaim);
		this.grp_Faim.add(this.rdo_TresFaim);

		this.grp_Fatigue.add(this.rdo_PasFatigue);
		this.grp_Fatigue.add(this.rdo_UnPeuFatigue);
		this.grp_Fatigue.add(this.rdo_TresFatigue);

		// Ã‰venements :
this.rdo_PasFaim.addItemListener(
		new GestRadioButton("Mange pareille !", 
				            this.lbl_ResultatFaim));
this.rdo_UnPeuFaim.addItemListener(
		new GestRadioButton("V'la  un p'tit quelque chose.", 
				            this.lbl_ResultatFaim));
this.rdo_TresFaim.addItemListener(
		new GestRadioButton("V'la  un gros steak !", 
				            this.lbl_ResultatFaim));

		this.rdo_PasFatigue.addItemListener(
					new GestRadioButton(
									"Dors pareille !", 
									this.lbl_ResultatFatigue));
		
		this.rdo_UnPeuFatigue.addItemListener(
					new GestRadioButton(
								"Va faire un p'tit somme.", 
								this.lbl_ResultatFatigue));
		
		this.rdo_TresFatigue.addItemListener(
					new GestRadioButton(
								"Va te coucher !", 
								this.lbl_ResultatFatigue));

	}

	/**
	 * Gestionnaire des cliques sur les JCheckBox
	 */
	private class GestRadioButton implements ItemListener {

		private String m_Texte;
		private JLabel m_Destination;

		/**
		 * Constructeur
		 *
		 * @param p_Texte       Texte Ã  afficher.
		 * @param p_Destination OÃ¹ l'afficher.
		 */
		public GestRadioButton(String p_Texte, JLabel p_Destination) {
			this.m_Texte = p_Texte;
			this.m_Destination = p_Destination;
		}

		/**
		 * Reefinition.
		 *
		 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
		 */
		@Override
		public void itemStateChanged(ItemEvent p_event) {
			this.m_Destination.setText(this.m_Texte);
		}
	}
}
