/**
 * 
 */
package ca.csf.dfc.poo.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * jamaie kdlekj asd eque
 * 
 * @author nrichard
 */
public class DemoGridBagLayout extends JFrame
{

    private static final long serialVersionUID = 1L;

    private JButton btn_Action1 = new JButton("Action 1");
    private JButton btn_Action2 = new JButton("Action 2");
    private JButton btn_Action3 = new JButton("Action 3");
    private JButton btn_Action4 = new JButton("Action 4");
    private JButton btn_Action5 = new JButton("Action 5");

    public DemoGridBagLayout()
    {
        super("Démo GridBagLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0; // Numéro de la ligne
        c.gridy = 0; // Numéro de la colonne
        this.add(btn_Action1, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        this.add(btn_Action2, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        this.add(btn_Action3, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40; // make this component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        this.add(btn_Action4, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0; // reset to default
        c.weighty = 1.0; // request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; // bottom of space
        c.insets = new Insets(10, 0, 0, 0); // top padding
        c.gridx = 1; // aligned with button 2
        c.gridwidth = 2; // 2 columns wide
        c.gridy = 2; // third row
        this.add(btn_Action5, c);

        this.pack();
        this.setLocationRelativeTo(null);
    }
}
