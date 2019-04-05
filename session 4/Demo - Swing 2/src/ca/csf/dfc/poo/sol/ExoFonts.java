/**
 *
 */
package ca.csf.dfc.poo.sol;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * @author C. Besse
 */
public class ExoFonts extends JFrame
{
    private JLabel lblAffichage = new JLabel("");
    private JTextField txtSaisie = new JTextField(10);

    private JRadioButton rdoRouge = new JRadioButton("Rouge");
    private JRadioButton rdoVert = new JRadioButton("Vert");
    private JRadioButton rdoBleu = new JRadioButton("Bleu");

    private JCheckBox chbItalic = new JCheckBox("Italic");
    private JCheckBox chbBold = new JCheckBox("Bold");

    private JButton btnGo = new JButton("Go");

    public ExoFonts()
    {
        super("Exercice Fonts");
        this.setLayout(new FlowLayout());

        this.add(this.txtSaisie);
        this.add(this.btnGo);
        this.add(this.rdoBleu);
        this.add(this.rdoRouge);
        this.add(this.rdoVert);
        this.add(this.chbItalic);
        this.add(this.chbBold);
        this.add(this.lblAffichage);

        this.txtSaisie.setText("Saisir du Texte");

        ButtonGroup bg = new ButtonGroup();
        bg.add(this.rdoBleu);
        bg.add(this.rdoRouge);
        bg.add(this.rdoVert);

        FontListener f = new FontListener();

        this.txtSaisie.addActionListener(f);
        this.txtSaisie.addKeyListener(f);
        this.btnGo.addActionListener(f);
        this.rdoBleu.addActionListener(f);
        this.rdoRouge.addActionListener(f);
        this.rdoVert.addActionListener(f);
        this.chbItalic.addActionListener(f);
        this.chbBold.addActionListener(f);

        this.setSize(195, 180);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void updateLabel()
    {
        Color c = Color.BLACK;
        if (ExoFonts.this.rdoBleu.isSelected())
            c = Color.BLUE;
        if (ExoFonts.this.rdoRouge.isSelected())
            c = Color.RED;
        if (ExoFonts.this.rdoVert.isSelected())
            c = Color.GREEN;

        ExoFonts.this.lblAffichage.setForeground(c);

        int type = Font.PLAIN;
        if (ExoFonts.this.chbItalic.isSelected())
            type += Font.ITALIC;
        if (ExoFonts.this.chbBold.isSelected())
            type += Font.BOLD;

        Font f = ExoFonts.this.lblAffichage.getFont();

        ExoFonts.this.lblAffichage.setFont(new Font(f.getName(), type, f.getSize()));

        ExoFonts.this.lblAffichage.setText(ExoFonts.this.txtSaisie.getText());
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        new ExoFonts().setVisible(true);
    }

    private class FontListener extends KeyAdapter implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent p_e)
        {
            ExoFonts.this.updateLabel();
        }

        /**
         * Redéfinition.
         *
         * @see java.awt.event.KeyAdapter#keyReleased(java.awt.event.KeyEvent)
         */
        @Override
        public void keyReleased(KeyEvent p_e)
        {
            ExoFonts.this.updateLabel();
        }

    }

}
