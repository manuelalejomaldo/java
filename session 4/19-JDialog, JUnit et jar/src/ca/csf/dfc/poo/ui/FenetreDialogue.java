/**
 *
 */
package ca.csf.dfc.poo.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author nrichard
 */
public class FenetreDialogue extends JDialog
{
    private static final long serialVersionUID = 1L;

    private JTextArea txt_Saisie = new JTextArea();

    private String m_Texte = null;

    public FenetreDialogue(JFrame p_Parent)
    {
        super(p_Parent, "Petit dialogue ...", true);

        // Composants graphiques
        this.add(new JLabel("Entrez du texte : "), BorderLayout.NORTH);
        this.add(this.txt_Saisie, BorderLayout.CENTER);

        JPanel pannSud = new JPanel(new FlowLayout());
        JButton btn_OK = new JButton("OK");
        JButton btn_Cancel = new JButton("Cancel");
        pannSud.add(btn_OK);
        pannSud.add(btn_Cancel);
        this.add(pannSud, BorderLayout.SOUTH);

        this.setSize(200, 250);
        this.setLocationRelativeTo(p_Parent);

        // Événements
        btn_Cancel.addActionListener(new GestCancel());
        btn_OK.addActionListener(new GestOk());
    }

    /**
     * Retourne le texte saisie par l'utilisateur, ou "null".
     *
     * @return Texte saisi ou null.
     */
    public String getTexte()
    {
        return this.m_Texte;
    }

    /**
     * Gestionnaire pour le bouton Cancel
     *
     * @author nrichard
     */
    public class GestCancel implements ActionListener
    {

        /**
         * Redéfinition.
         *
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
         */
        @Override
        public void actionPerformed(ActionEvent p_e)
        {
            FenetreDialogue.this.m_Texte = null;

            FenetreDialogue.this.setVisible(false);

        }
    }

    /**
     * Gestionnaire pour le bouton OK.
     *
     * @author nrichard
     */
    public class GestOk implements ActionListener
    {

        /**
         * Redéfinition.
         *
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
         */
        @Override
        public void actionPerformed(ActionEvent p_e)
        {
            FenetreDialogue.this.m_Texte = FenetreDialogue.this.txt_Saisie.getText();

            FenetreDialogue.this.setVisible(false);

        }
    }
}
