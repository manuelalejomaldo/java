/**
 * 
 */
package ca.csf.dfc.poo.ui;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author nrichard
 */
public class DemoJCheckBox extends JFrame
{

    /*
     * Bizarrerie de java. À faire pour eviter un warning ...
     */
    private static final long serialVersionUID = 1L;

    private JCheckBox chk_Oui = new JCheckBox("Oui");
    private JCheckBox chk_Non = new JCheckBox("Non");
    private JLabel lbl_Resultat = new JLabel();

    /**
     * Constructeur
     */
public DemoJCheckBox()
{
    super("Demo JCheckBox");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLayout(new FlowLayout());
    this.add(chk_Oui);
    this.add(chk_Non);
    this.add(lbl_Resultat);
    this.setSize(100, 100);
    this.setLocationRelativeTo(null);

    GestCheckBox gestionnaire = new GestCheckBox();
    this.chk_Oui.addItemListener(gestionnaire);
    this.chk_Non.addItemListener(gestionnaire);

    this.chk_Non.setSelected(true);
}

    /**
     * Gestionnaire des cliques sur les JCheckBox
     */
private class GestCheckBox implements ItemListener
{

    /**
     * Redefinition.
     * 
     * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
     */
    @Override
    public void itemStateChanged(ItemEvent p_event)
    {

        String texte = "";
        if (DemoJCheckBox.this.chk_Oui.isSelected())
        {
            texte = "Oui";

        }
        if (DemoJCheckBox.this.chk_Non.isSelected())
        {
            if (!texte.isEmpty())
            {
                texte += " et ";
            }
            texte += "Non";
        }
        DemoJCheckBox.this.lbl_Resultat.setText(texte);

        // Pour jouer avec la source :
        if (p_event.getSource().equals(chk_Oui))
        {
            System.out.println("Clique sur le \"Oui\"");
        }
        else
        {
            System.out.println("Clique sur le \"Non\"");
        }
    }
}
}
