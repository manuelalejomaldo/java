/**
 * 
 */
package ca.csf.dfc.poo.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import ca.csf.dfc.poo.Personne;
import ca.csf.dfc.poo.EtatCivil;

/**
 * @author nrichard
 */
public class DemoJTable extends JFrame
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultTableModel m_Modele = new DefaultTableModel();
    private JTable m_Table = new JTable(m_Modele);
    private JButton btn_Presenter = new JButton("Se presenter");

    /**
     * Constructeur
     */
    public DemoJTable()
    {
        super("Demo JTable");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.m_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        this.add(new JScrollPane(m_Table), BorderLayout.CENTER);
        this.add(btn_Presenter, BorderLayout.NORTH);

        this.setSize(500, 300);
        this.setLocationRelativeTo(null);

        chargerModele();

        btn_Presenter.addActionListener(new GestPresenter());
    }

    /**
     * 
     */
    private void chargerModele()
    {
        // Obtenu a  partir d'un fichier ou d'une BD ...
        Personne[] tab = { new Personne("Therese", 33, EtatCivil.SEPARE), new Personne("Bob", 45, EtatCivil.MARIE),
                new Personne("Bobby", 12, EtatCivil.CELIBATAIRE), new Personne("Agnes", 49, EtatCivil.VEUF),
                new Personne("Charlotte", 33, EtatCivil.CONJOINT_DE_FAIT),
                new Personne("Therese", 33, EtatCivil.SEPARE), new Personne("Bob", 45, EtatCivil.MARIE),
                new Personne("Bobby", 12, EtatCivil.CELIBATAIRE), new Personne("Agnes", 49, EtatCivil.VEUF),
                new Personne("Charlotte", 33, EtatCivil.CONJOINT_DE_FAIT),
                new Personne("Therese", 33, EtatCivil.SEPARE), new Personne("Bob", 45, EtatCivil.MARIE),
                new Personne("Bobby", 12, EtatCivil.CELIBATAIRE), new Personne("Agnes", 49, EtatCivil.VEUF),
                new Personne("Charlotte", 33, EtatCivil.CONJOINT_DE_FAIT),
                new Personne("Therese", 33, EtatCivil.SEPARE), new Personne("Bob", 45, EtatCivil.MARIE),
                new Personne("Bobby", 12, EtatCivil.CELIBATAIRE), new Personne("Agnes", 49, EtatCivil.VEUF),
                new Personne("Charlotte", 33, EtatCivil.CONJOINT_DE_FAIT), };

        // Dans chargerModele() :
        this.m_Modele.addColumn("Nom");
        this.m_Modele.addColumn("Age");
        this.m_Modele.addColumn("Etat civil");

        for (Personne p : tab)
        {
            Object[] ligne = new Object[3];
            ligne[0] = p.getNom();
            ligne[1] = p.getAge();
            ligne[2] = p.getEtat();
            this.m_Modele.addRow(ligne);
        }

    }

    private class GestPresenter implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent p_e)
        {
            int indiceLigne = m_Table.getSelectedRow();

            if (indiceLigne >= 0)
            {

                String nom = (String) m_Modele.getValueAt(indiceLigne, 0);
                //int age = 0;
                Integer age = (Integer) m_Modele.getValueAt(indiceLigne, 1);
                try { Integer.parseInt(m_Modele.getValueAt(indiceLigne, 1).toString()); } catch (Exception ex) { ; }
                //EtatCivil etat = EtatCivil.CELIBATAIRE;
                EtatCivil etat = (EtatCivil)m_Modele.getValueAt(indiceLigne, 2);
                try { etat = (EtatCivil)m_Modele.getValueAt(indiceLigne, 2); } catch (Exception ex) { ; }

                Personne p = new Personne(nom, age, etat);
                JOptionPane.showMessageDialog(DemoJTable.this, p.sePresenter());
            }

        }

    }

}
