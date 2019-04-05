/**
 * 
 */
package ca.csf.dfc.poo.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author nrichard
 */
public class FenetrePrincipale extends JFrame
{
    private static final long serialVersionUID = 1L;

    private JLabel lbl_Message = new JLabel();

    public FenetrePrincipale()
    {
        super("Demo de JDialog");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Composants graphiques
        JButton btn_Ouvrir = new JButton("Ouvrir");
        this.add(btn_Ouvrir, BorderLayout.EAST);
        this.add(this.lbl_Message, BorderLayout.CENTER);
        this.setSize(250, 100);
        this.setLocationRelativeTo(null);

        // Gestionnaires d'evenements
        btn_Ouvrir.addActionListener(new GestOuvrir());
    }

    /**
     * @author nrichard
     */
    public class GestOuvrir implements ActionListener
    {

        /**
         * Redefinition.
         * 
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
         */
        @Override
        public void actionPerformed(ActionEvent p_e)
        {
            FenetreDialogue dlg_Fenetre = new FenetreDialogue(FenetrePrincipale.this);

            System.out.println("Avant l'affichage");
            dlg_Fenetre.setVisible(true);
            System.out.println("Apres l'affichage");

            String texte = dlg_Fenetre.getTexte();

            if (texte != null)
            {
                lbl_Message.setText(texte);
            }

        }
    }
}
