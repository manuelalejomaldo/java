/**
 * 
 */
package ca.csf.dfc.poo.event;



import ca.csf.dfc.poo.graph.Grille;
import ca.csf.dfc.poo.graph.PaneCreationEnvi;
import ca.csf.dfc.poo.graph.FenetrePrincipal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.scene.control.Alert.AlertType;

/**
 * @author admin
 *
 */
public class ActionValidationHauteur implements  EventHandler<ActionEvent>  {
	
	FenetrePrincipal parent;
	

	public ActionValidationHauteur(FenetrePrincipal p_parent) {
		super();
		this.parent = p_parent;
		
	}

	@Override
	public void handle(ActionEvent p_event) {
		
		String text=this.parent.getPaneCreationEnvi().getTxt_hauteur().getText();
	  if(isValid(text))
	  {
		  int hauteur=Integer.parseInt(text);
		  Grille grille=new Grille(null) ;
		  grille.
		  VBox vb_grille=new VBox();
/*
		  BackgroundImage bg= new BackgroundImage(new Image(getClass().getResourceAsStream("lightmap-world.jpg")),
			        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
			          BackgroundSize.DEFAULT);
		  vb_grille.setBackground(new Background(bg));*/
		  vb_grille.getChildren().add(grille.getRoot());
			this.parent.getPaneCreationEnvi().getVboxAffichageControleur().setVisible(true);
		
		  this.parent.getPrincipale().setCenter(vb_grille );
		
			

 
	  }
		
		
	}

	/**
	 * methode pour valider si le nombre un entier ou un string
	 * @param s
	 * @return
	 */
	public boolean isValid(String s){
		try{
		int  h = new Integer (s);
		return true;
		}
		catch(NumberFormatException n){
			Alert a = new Alert(AlertType.WARNING, "Entrer un nombre entier!!!", ButtonType.CLOSE);
			a.showAndWait();
			
			return false;
		}
	}	


}
