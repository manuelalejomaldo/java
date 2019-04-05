/**
 * 
 */
package ca.csf.dfc.poo.ui;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * @author nrichard
 */
public class DemoJList extends JFrame
{
    private static final long serialVersionUID = 1L;

    ButtonGroup grp_Selection = new ButtonGroup();
    JRadioButton rdo_Single = new JRadioButton("Single");
    JRadioButton rdo_Interval = new JRadioButton("Interval");
    JRadioButton rdo_Multiple = new JRadioButton("Multiple");

    /**
     * Modele de donnees pour la liste.
     */
    private DefaultListModel<String> m_Modele = new DefaultListModel<String>();
    private JList<String> lst_Noms = new JList<String>(m_Modele);

    private JLabel lbl_Resultat = new JLabel();

    /**
     * Constructeur
     */
    public DemoJList()
    {
        super("Demo DemoJList");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rdo_Single.setSelected(true);
        this.lst_Noms.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        this.setLayout(new FlowLayout());
        this.add(rdo_Single);
        this.add(rdo_Interval);
        this.add(rdo_Multiple);
        this.add(lst_Noms);
        this.add(lbl_Resultat);
        this.setSize(300, 250);
        this.setLocationRelativeTo(null);

        grp_Selection.add(rdo_Single);
        grp_Selection.add(rdo_Interval);
        grp_Selection.add(rdo_Multiple);

        GestModeSelection gestionModeSelection = new GestModeSelection();
        rdo_Single.addItemListener(gestionModeSelection);
        rdo_Interval.addItemListener(gestionModeSelection);
        rdo_Multiple.addItemListener(gestionModeSelection);

        this.lst_Noms.addListSelectionListener(new GestChoixListe());

        this.chargerNoms();
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
        this.m_Modele.addElement("Jean-Paul");
        this.m_Modele.addElement("Moi");
        this.m_Modele.addElement("Toi");
    }

    /**
     * Gestionnaire de selection du JComboBox
     */
	private class GestChoixListe implements ListSelectionListener {
		/**
		 * Redefinition.
		 * 
		 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
		 */
		@Override
		public void valueChanged(ListSelectionEvent p_e) {
			String texte = String.join(" ", DemoJList.this.lst_Noms.getSelectedValuesList());

			DemoJList.this.lbl_Resultat.setText(texte);
		}
	}

    /**
     * Gestionnaire de selection des radio buttons
     */
    private class GestModeSelection implements ItemListener
    {

        /**
         * Redefinition.
         * 
         * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
         */
        @Override
        public void itemStateChanged(ItemEvent p_Event)
        {
            int modeDeSelection = ListSelectionModel.SINGLE_SELECTION;

            if (p_Event.getSource().equals(rdo_Interval))
            {
                modeDeSelection = ListSelectionModel.SINGLE_INTERVAL_SELECTION;

            }
            else if (p_Event.getSource().equals(rdo_Multiple))
            {
                modeDeSelection = ListSelectionModel.MULTIPLE_INTERVAL_SELECTION;
            }

            lst_Noms.setSelectionMode(modeDeSelection);
            lst_Noms.clearSelection();
        }
    }
}
