/**
 *
 */
package ca.csf.dfc.poo.sol;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

/**
 * @author C. Besse
 */
public class ExoLists extends JFrame
{

    private DefaultListModel<String> mdlG = new DefaultListModel<>();
    private DefaultListModel<String> mdlD = new DefaultListModel<>();

    private JList<String> lstG = new JList<>(this.mdlG);
    private JList<String> lstD = new JList<>(this.mdlD);

    private JButton btnGtD = new JButton(">>");
    private JButton btnDtG = new JButton("<<");

    public ExoLists()
    {
        super("Exercice Lists");
        this.setLayout(new FlowLayout());

        Dimension d = new Dimension(100, 200);

        this.lstG.setPreferredSize(d);
        this.lstD.setPreferredSize(d);

        this.add(this.lstG);
        this.add(this.btnGtD);
        this.add(this.btnDtG);
        this.add(this.lstD);

        MoveListListener l = new MoveListListener();

        this.btnGtD.addActionListener(l);
        this.btnDtG.addActionListener(l);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Hardcode
        this.mdlG.addElement("Patate");
        this.mdlG.addElement("Tomate");
        this.mdlG.addElement("Citrouille");
        this.mdlG.addElement("Salade");
        this.mdlG.addElement("Pomme");
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        new ExoLists().setVisible(true);
    }

    private class MoveListListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent p_e)
        {
            if (p_e.getSource().equals(ExoLists.this.btnGtD))
                for (String s : ExoLists.this.lstG.getSelectedValuesList())
                {
                    ExoLists.this.mdlG.removeElement(s);
                    ExoLists.this.mdlD.addElement(s);
                }
            else
                for (String s : ExoLists.this.lstD.getSelectedValuesList())
                {
                    ExoLists.this.mdlD.removeElement(s);
                    ExoLists.this.mdlG.addElement(s);
                }

        }

    }

}
