/**
 * 
 */
package ca.csf.dfc.poo.graph;

import ca.csf.dfc.poo.battleship.tools.PropertyObservable;
import ca.csf.dfc.poo.event.ActionValidationHauteur;
import ca.csf.dfc.poo.event.GestCharger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author eliqu
 *
 */
public class FenetrePrincipal extends Application {
	private Stage m_stage;

	private BorderPane m_Principale = new BorderPane();

	private Menu menu_Edition = new Menu("Edition");

	private MenuItem menuItem_Creer = new MenuItem("Créer");
	private MenuItem menuItem_Sauvegarder = new MenuItem("Sauvegarder");
	private MenuItem menuItem_Charger = new MenuItem("Charger");

	private Menu menu_Jeu = new Menu("Jeu");
	private MenuItem menuItem_Jouer = new MenuItem("Jouer");
	private MenuItem menuItem_Pause = new MenuItem("Pause");
	private MenuItem menuItem_Arret = new MenuItem("Arreter");

	private Menu menu_aPropos = new Menu("À Propos");
	private MenuItem menuItem_APropos = new MenuItem("À Propos");

	private Menu menu_Score = new Menu("Score");
	private MenuItem menuItem_EnregistrerScore = new MenuItem("Enregistrer Score");

	/**
	 * 
	 */
	private MenuBar menuBar = new MenuBar(this.menu_Edition, this.menu_Jeu, this.menu_Score, this.menu_aPropos);
	/**
	 * Bouton charger
	 */
	private Button btn_Charger = new Button("Charger");
	/**
	 * 
	 */
	private final Tooltip texte_information = new Tooltip(
			"Bonjour! Pour créer l'environnement vous devrez commencer " + " par choisir la hauteur et la confirmer,"
					+ "par la suite choisisez une équipe et ses bateaux avec leur direction, merci");

	/**
	 * Bouton Confirmer hauteur de la grille et pour afficher options
	 */
	// private Button btn_ConfirmerHauteur = new Button("Confirmer");

	/**
	 * 
	 */

	private Button btn_Sauvegarder = new Button("Sauvegarder");

	

	

	private Button btn_Annuler = new Button("Annuler");

	private PaneCreationEnvi paneCreationEnvi = new PaneCreationEnvi(this);

 private PaneRight panJeu=new PaneRight(this);
	

	
	private void confMenuItem() {

		this.menu_Edition.getItems().addAll(this.menuItem_Charger, this.menuItem_Creer, this.menuItem_Sauvegarder);
		this.menu_Jeu.getItems().addAll(this.menuItem_Jouer, this.menuItem_Pause, this.menuItem_Arret);
		this.menu_Score.getItems().addAll(this.menuItem_EnregistrerScore);
		this.menu_aPropos.getItems().addAll(this.menuItem_APropos);
	}

	private void configSizeButon() {

		this.btn_Charger.setMaxWidth(90);
		this.btn_Sauvegarder.setMaxWidth(90);

	}

	private void gestEvent() {

		this.btn_Charger.setOnAction(new GestCharger(this));
		this.menuItem_Charger.setOnAction(new GestCharger(this));
	}

	@Override
	public void init() throws Exception {
		super.init();
		
		confMenuItem();
	

		configSizeButon();
		gestEvent();
	}

	@Override
	public void start(Stage p_primaryStage) throws Exception {
		this.m_stage = p_primaryStage;

		Pane p = new Pane();
		/**
		 * On regroupe dans le vb1 le btn charger, et une grid qui contient le textfield
		 * et btn confirmation
		 */
		// layout 1
		VBox vb1 = new VBox(3);
		vb1.setPadding(new Insets(20, 4, 4, 4));
		vb1.setAlignment(Pos.CENTER_LEFT);
		vb1.setBorder(getBorder());
		Label lbl_chargementEnv = new Label("Chargement de l'environnement");
		lbl_chargementEnv
				.setStyle("-fx-background-color: white; \n" + "-fx-translate-y: -27; \n" + "-fx-translate-x: 10;");
		vb1.getChildren().addAll(lbl_chargementEnv, this.btn_Charger);

		VBox vb_Left = new VBox(13);
		vb_Left.setPadding(new Insets(8, 8, 8, 8));
		// vb_Left.setPrefWidth(240);
		vb_Left.setMaxHeight(300);
		vb_Left.getChildren().addAll(vb1, this.paneCreationEnvi);

		this.m_Principale.setLeft(vb_Left);

		this.m_Principale.setTop(menuBar);
		this.m_Principale.setRight(this.panJeu);
		/**
		 * On va construitre la structure de droite
		 */

		Scene scene = new Scene(this.m_Principale, 1300, 700);
		p_primaryStage.setScene(scene);
		p_primaryStage.setTitle("Battleship");

		p_primaryStage.show();

	}

	/**
	 * Retourne le stage.
	 * 
	 * @return le stage
	 */
	public Stage getStage() {
		return this.m_stage;
	}

	/**
	 * Retourne le paneCreationEnvi.
	 * @return le paneCreationEnvi
	 */
	public PaneCreationEnvi getPaneCreationEnvi() {
		return this.paneCreationEnvi;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	public static Border getBorder() {
		return new Border(
				new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

	}

	/**
	 * Retourne le principale.
	 * 
	 * @return le principale
	 */
	public BorderPane getPrincipale() {
		return this.m_Principale;
	}

}
