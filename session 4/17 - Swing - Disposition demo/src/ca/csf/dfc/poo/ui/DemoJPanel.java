/**
 * 
 */
package ca.csf.dfc.poo.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.filechooser.FileFilter;

/**
 * @author nrichard
 */
public class DemoJPanel extends JFrame
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private JTextArea txt_Saisie = new JTextArea("Tapez votre texte ici ...");

    private JButton btn_Ajouter = new JButton("Ajouter");
    private JButton btn_Modifier = new JButton("Modifier");
    private JButton btn_Supprimer = new JButton("Supprimer");
    private JButton btn_Quitter = new JButton("Quitter");

    private JLabel lbl_StatusBar = new JLabel("Zone de notification ...");

    private JMenuItem itm_Ouvrir = new JMenuItem("Ouvrir");
    private JMenuItem itm_Enregistrer = new JMenuItem("Enregistrer");
    private JMenuItem itm_Quitter = new JMenuItem("Quitter");

    public DemoJPanel()
    {
        super("Démo JPanel");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        URL u = getClass().getClassLoader().getResource("img/burn.png");
        Image icon = Toolkit.getDefaultToolkit().getImage(u);
        this.setIconImage(icon);

        Border border = BorderFactory.createCompoundBorder(
        			BorderFactory.createRaisedBevelBorder(),
        			BorderFactory.createLoweredBevelBorder());

        //pour le label inferior
        lbl_StatusBar.setBorder(border);
        lbl_StatusBar.setHorizontalAlignment(JLabel.CENTER);

        // Dans le constructeur ...
        JPanel panneauDroit = new JPanel();
        panneauDroit.setLayout(new GridLayout(4, 1));
        panneauDroit.add(btn_Ajouter);
        panneauDroit.add(btn_Modifier);
        panneauDroit.add(btn_Supprimer);
        panneauDroit.add(btn_Quitter);

        JScrollPane panneauCentre = new JScrollPane(this.txt_Saisie);

        this.setLayout(new BorderLayout());
        this.add(panneauCentre, BorderLayout.CENTER);
        this.add(panneauDroit, BorderLayout.EAST);
        this.add(lbl_StatusBar, BorderLayout.SOUTH);

        this.initialiserMenuSimple();
        // this.initialiserMenuComplexe();

        this.setSize(500, 250);
        this.setLocationRelativeTo(null);

        // Événements
        this.btn_Quitter.addActionListener(new GestQuitter());
    }

    /**
     * Démonstration d'une initialisation de menu simple.
     */
    private void initialiserMenuSimple()
    {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFichier = new JMenu("Fichier");
        menuFichier.add(this.itm_Ouvrir);
        menuFichier.add(this.itm_Enregistrer);
        menuFichier.addSeparator();
        menuFichier.add(this.itm_Quitter);
        menuBar.add(menuFichier);

        JMenu menuÉdition = new JMenu("Édition");
        menuÉdition.add(new JMenuItem("Copier"));
        menuÉdition.add(new JMenuItem("Couper"));
        menuÉdition.add(new JMenuItem("Coller"));

        menuBar.add(menuÉdition);

        this.setJMenuBar(menuBar);

        // Événements :
        this.itm_Ouvrir.addActionListener(new GestOuvrir());
        this.itm_Quitter.addActionListener(new GestQuitter());
    }

    /**
     * Démonstration de configuration de menu
     */
    private void initialiserMenuComplexe()
    {
        JMenuBar menuBar;
        JMenu menu;
        JMenu submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        // Create the menu bar.
        menuBar = new JMenuBar();

        // Build the first menu.
        menu = new JMenu("A Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
        menuBar.add(menu);

        // a group of JMenuItems
        menuItem = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
        menu.add(menuItem);

        menuItem = new JMenuItem("Both text and icon", new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_B);
        menu.add(menuItem);

        menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_D);
        menu.add(menuItem);

        // a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Another one");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        // a group of check box menu items
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Another one");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        menu.add(cbMenuItem);

        // a submenu
        menu.addSeparator();
        submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("An item in the submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(menuItem);

        menuItem = new JMenuItem("Another item");
        submenu.add(menuItem);
        menu.add(submenu);

        // Build second menu in the menu bar.
        menu = new JMenu("Another Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription("This menu does nothing");
        menuBar.add(menu);

        this.setJMenuBar(menuBar);

    }

    /**
     * Gestionnaire pour quitter l'application.
     * 
     * @author nrichard
     */
    private class GestQuitter implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent p_e)
        {
            System.exit(0);
        }
    }

    /**
     * Gestionnaire pour quitter l'application.
     * 
     * @author nrichard
     */
    private class GestOuvrir implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent p_e)
        {
            JFileChooser chooser = new JFileChooser("."); // Pour démarrer dans le répertoire courant
            chooser.setFileFilter(new FiltreFichiersTextes());

            int résultat = chooser.showOpenDialog(DemoJPanel.this);

            String msg = null;
            if (résultat == JFileChooser.APPROVE_OPTION)
            {
                msg = "L'usager a choisi : " + chooser.getSelectedFile();
            }
            else
            {
                msg = "L'usager n'a pas choisi de fichier";
            }
            DemoJPanel.this.lbl_StatusBar.setText(msg);
        }
    }

    /**
     * Démonstration d'un FileFilter, pour filtrer les fichiers textes. La classe internet est "static" parce qu'on n'a
     * pas besoin d'avoir accès à DémoJPanel.this , ce qui est le contraire des gestionnaires d'événements, qui ont
     * habituellement besoin d'avoir accès aux données membres de la fenêtre.
     */
    private static class FiltreFichiersTextes extends FileFilter
    {

        /**
         * Indique si un fichier doit être accepté par le filtre.
         * 
         * @see javax.swing.filechooser.FileFilter#accept(java.io.File)
         * @return true si c'est un répertoire ou si l'extension est "txt"
         */
        @Override
        public boolean accept(File p_Fichier)
        {
            boolean accept = false;
            if (p_Fichier.isDirectory())
            {
                accept = true;
            }
            else
            {
                String ext = extraireExtension(p_Fichier);
                if ((ext != null) && ext.equalsIgnoreCase("txt")) { return true; }
            }
            return accept;
        }

        /**
         * Description qui apparaîtra à l'écran.
         * 
         * @see javax.swing.filechooser.FileFilter#getDescription()
         */
        @Override
        public String getDescription()
        {
            return "Fichier texte (.txt)";
        }

        /**
         * Fonction utilitaire pour extraire l'extension.
         * 
         * @param p_Fichier
         *            Le fichier.
         * @return null ou l'extension
         */
        private static String extraireExtension(File p_Fichier)
        {
            String nomFichier = p_Fichier.getName();
            int indice = nomFichier.lastIndexOf('.');

            String extension = null;
            if (indice > 0 && indice < nomFichier.length() - 1)
            {
                extension = nomFichier.substring(indice + 1).toLowerCase();
            }
            return extension;
        }
    }
}
