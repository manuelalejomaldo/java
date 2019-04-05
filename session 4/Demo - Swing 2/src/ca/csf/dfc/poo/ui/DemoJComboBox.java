/**
 *
 */
package ca.csf.dfc.poo.ui;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author nrichard
 */
public class DemoJComboBox extends JFrame
{
    private static final long serialVersionUID = 1L;

    /**
     * Modele de donnees pour le combo box.
     */
 private DefaultComboBoxModel<String> m_Modele = new DefaultComboBoxModel<String>();
    private JComboBox<String> cmb_Noms = new JComboBox<String>(this.m_Modele);

    private JLabel lbl_Resultat = new JLabel();

    /**
     * Constructeur
     */
    public DemoJComboBox()
    {
        super("Demo JComboBox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());
        this.add(this.cmb_Noms);
        this.add(this.lbl_Resultat);
        this.setSize(130, 100);
        this.setLocationRelativeTo(null);

        this.chargerNoms();

        this.cmb_Noms.addItemListener(new GestChoixCmb());
    }

    /**
     * Simulation de lecture dans un fichier.
     */
    private void chargerNoms()
    {
        this.m_Modele.addElement("Bob");
        this.m_Modele.addElement("Nick");
        this.m_Modele.addElement("Ginette");
        this.m_Modele.addElement("Therese");
    }

    /**
     * Gestionnaire de selection du JComboBox
     */
    private class GestChoixCmb implements ItemListener
    {

        /**
         * Redefinition.
         *
         * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
         */
        @Override
        public void itemStateChanged(ItemEvent p_event)
        {
            DemoJComboBox.this.lbl_Resultat.setText(
            		DemoJComboBox.this.m_Modele.getSelectedItem().toString());
        }
    }
}
