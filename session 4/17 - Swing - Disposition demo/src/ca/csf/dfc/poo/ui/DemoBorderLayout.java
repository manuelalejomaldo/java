/**
 *
 */
package ca.csf.dfc.poo.ui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author nrichard
 */
public class DemoBorderLayout extends JFrame
{
    private static final long serialVersionUID = 1L;

    private JButton btn_Action1 = new JButton("Nord");
    private JButton btn_Action2 = new JButton("Ouest");
    private JButton btn_Action3 = new JButton("Centre");
    private JButton btn_Action4 = new JButton("Est");
    private JButton btn_Action5 = new JButton("Sud");

    public DemoBorderLayout()
    {
        super("Démo BorderLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout(7, 7));
        this.add(btn_Action1, BorderLayout.NORTH);
        this.add(btn_Action2, BorderLayout.WEST);
        this.add(this.btn_Action3, BorderLayout.CENTER);
        this.add(this.btn_Action4, BorderLayout.EAST);
        this.add(this.btn_Action5, BorderLayout.SOUTH);

        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
    }

}
