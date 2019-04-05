/**
 * 
 */
package ca.csf.dfc.poo.ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author nrichard
 */
public class DemoGridLayout extends JFrame
{

    private static final long serialVersionUID = 1L;

    private JButton btn_Action1 = new JButton("Action 1");
    private JButton btn_Action2 = new JButton("Action 2");
    private JButton btn_Action3 = new JButton("Action 3");
    private JButton btn_Action4 = new JButton("Action 4");
    private JButton btn_Action5 = new JButton("Action 5");
    private JButton btn_Action6 = new JButton("Action 6");

    public DemoGridLayout()
    {
        super("Démo GridLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(4, 2));
        this.add(btn_Action1);
        this.add(btn_Action2);
        this.add(btn_Action3);
        this.add(btn_Action4);
        this.add(btn_Action5);
        this.add(btn_Action6);
        this.add(new JButton("toto"));
//        this.add(new JButton("toto"));
//        this.add(new JButton("toto"));

        this.setSize(300, 250);
        this.setLocationRelativeTo(null);
    }
}
