/**
 * 
 */
package swingexrecices;

import javax.swing.JFrame;
import javax.swing.JOptionPane;





/**
 * @author ManueLMaldonado
 *
 */
public class mainSwingExercices {

	/* creation pop-up, herraminetas de cuadros de dialogo
	 * utiles para capturar datos */ 
    private static void demopopupSimple()
    {
    	//example basic1
    	JOptionPane.showMessageDialog(null, "Bonjour à tous");
    }
    
    private static void demopopupMontrerNb()
    {
    	// ingresar un numero y mostrar su contenido despues
		String ax1 = JOptionPane.showInputDialog("Ingrese un numero: ");
		JOptionPane.showMessageDialog(null, "El numero ingresado es: "+ax1);	
    }
    
    private static void demopopupSiNo()
    {	
		// tres opciones si, no et cancel
		int ax = JOptionPane.showConfirmDialog(null, "Estas en java?");
        if(ax == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null, "Has seleccionado SI.");
        else if(ax == JOptionPane.NO_OPTION)
            JOptionPane.showMessageDialog(null, "Has seleccionado NO.");
    }
    
    private static void demopopupParse()
    {        
        String ax2 = JOptionPane.showInputDialog(null,"Convierte un numero a "
        		+ "diferentes tipos de variable");
        int a = Integer.parseInt(ax2);//se convierte el dato a entero
        Float b = Float.parseFloat(ax2);//se convierte el dato a flotante
        Double c = Double.parseDouble(ax2);// se convierte el dato a double
        Long d = Long.parseLong(ax2);//se convierte el dato a long
             
        JOptionPane.showMessageDialog(null, 
        		"El numero es en Integer: "+ a 
        		+"\n en Float: " + b
        		+"\n en Double: " + c
        		+"\n en Long: " + d
        		,"Mensaje barra",JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void demopopupMenu()
    {   	
    	//jouer avec showOptionsdialog
        String[] opciones = {"Contento", "Triste", "Melancolico" };
        
        int opcion = JOptionPane.showOptionDialog(
                               null                             //componente
                             , "Como te siente hoy?"            // Mensaje
                             , "Opciones Personalizada"         // Titulo en la barra del cuadro
                             , JOptionPane.DEFAULT_OPTION       // Tipo de opciones
                             , JOptionPane.INFORMATION_MESSAGE  // Tipo de mensaje (icono)
                             , null                             // Icono (ninguno)
                             , opciones                         // Opciones personalizadas
                             , null                             // Opcion por defecto
                           );
        
        JOptionPane.showMessageDialog(null, 
        					"Ha escogido "+opciones[opcion],
        					"Respuesta",JOptionPane.DEFAULT_OPTION);

    }
	
    private static void demoJframe() {
    	/*
		 * prueba Jframe*/
		JFrame fenetre = new JFrame();
		//Définit un titre pour notre fenêtre
		fenetre.setTitle("Ma première fenêtre Java");
		//Définit sa taille : 400 pixels de large et 100 pixels de haut
		fenetre.setSize(400, 100);
		//Nous demandons maintenant à notre objet de se positionner au		centre
		fenetre.setLocationRelativeTo(null);
		//Termine le processus lorsqu'on clique sur la croix rouge
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Et enfin, la rendre visible
		fenetre.setVisible(true);
    } 
    
    private static void demoFenetre1() {
    	/*example avec la clase fenetre*/
		
		// Instanciation
    	Fenetre2 fenetre = new Fenetre2();

        // Pour montrer que la methode setVisible() n'est
        // pas bloquante.
        System.out.println("Avant le setVisible(true)");
        fenetre.setVisible(true);
        System.out.println("Apres le setVisible(true)");
    }
    
    private static void demoFenetre2() {
    	
    	Fenetre2 fen2 = new Fenetre2();
    	fen2.setVisible(true);
    }
	
    private static void calculator() {
    	
    	FenetreCalculator fenCalc = new FenetreCalculator();
    	fenCalc.setVisible(true);
    }
    
    private static void FenetreJCheckBoxEtJRadioButton() {
    	FenetreCheckBoxEtRadioButton f = new FenetreCheckBoxEtRadioButton();
    	f.setVisible(true);
    }
    
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//demopopupSimple();
		//demopopupMontrerNb();
		//demopopupSiNo();
		//demopopupParse();
		//demopopupMenu();
		//demoJframe();
		//demoFenetre1();
		//demoFenetre2();		
		//calculator();
		//FenetreJCheckBoxEtJRadioButton();
		
		
		
		
	}

}
