/**
 * 
 */
package ca.csf.dfc.poo.graph;

import ca.csf.dfc.poo.event.ActionValidationHauteur;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * @author admin
 *
 */
public class PaneCreationEnvi extends Pane {

	/**
	 * Bouton Confirmer hauteur de la grille et pour afficher options
	 */
	private Button btn_ConfirmerHauteur = new Button("Confirmer");
	private TextField txt_hauteur = new TextField();
	private VBox m_vboxAffichageControleur = new VBox();
	/**
	 * group pour l'equipe
	 */
	private ObservableList<String> model_equipe = FXCollections.observableArrayList("Equipe 1 ", "Equipe 2 ",
			"Equipe 3 ", "Equipe 4 ");
	private ComboBox<String> cbox_equipe = new ComboBox<>(model_equipe);
	/**
	 * group pour les bateaux
	 */
	private ObservableList<String> model_bateau = FXCollections.observableArrayList("Aviso", "AirCraft", "Corvette",
			"Croiseur", "Destroyer", "Fregate", "Patrol", "Shipyard", "Submarine");
	private ComboBox cbbo_Bateaux = new ComboBox(model_bateau);

	private ObservableList<String> model_direction = FXCollections.observableArrayList("Est", "Nord", "Ouest", "Sud");
	private ComboBox<String> cbox_direction = new ComboBox<>(model_direction);
	private Button btn_Sauvegarder = new Button("Sauvegarder");
	FenetrePrincipal parent;

	public PaneCreationEnvi(FenetrePrincipal p_parent) {
		super();
		this.parent = p_parent;
		// this.btn_ConfirmerHauteur.setEffect(shadow);
		this.btn_ConfirmerHauteur.setMaxWidth(20);
		this.btn_ConfirmerHauteur.setMaxHeight(20);
		Image valider = new Image(getClass().getResourceAsStream("Valider.png"));
		ImageView iv = new ImageView(valider);
		iv.setFitHeight(18);
		iv.setFitWidth(18);
		this.btn_ConfirmerHauteur = new Button("", iv);
		this.cbbo_Bateaux.setMaxWidth(96);
		this.cbox_direction.setMaxWidth(96);
		this.cbox_equipe.setMaxWidth(96);

		this.btn_ConfirmerHauteur.setOnAction(new ActionValidationHauteur(this.parent));
		this.m_vboxAffichageControleur.setVisible(false);
		this.txt_hauteur.setMaxWidth(40);
		this.txt_hauteur.setMaxHeight(20);
		VBox vbcreation_env = new VBox(10);
		vbcreation_env.setBorder(FenetrePrincipal.getBorder());
		vbcreation_env.setPadding(new Insets(20, 4, 4, 4));

		/**
		 * Label pour la création de l'environnement
		 */
		Label lbl_creationEnv = new Label("Création de l'environnement");

		lbl_creationEnv
				.setStyle("-fx-background-color: white; \n" + "-fx-translate-y: -28; \n" + "-fx-translate-x: 15;");

		lbl_creationEnv.setTooltip(new Tooltip("Bonjour! Pour créer l'environnement vous devrez commencer "
				+ " par choisir la hauteur et la confirmer,"
				+ "par la suite choisisez une équipe et ses bateaux avec leur direction, merci"));

		HBox hb_hauteur = new HBox(new Label("Hauteur de la grille :"), txt_hauteur, this.btn_ConfirmerHauteur);
		hb_hauteur.setSpacing(5);

		GridPane gp_controleur = new GridPane();
		gp_controleur.add(new Label("Equipe :"), 0, 0);
		gp_controleur.add(this.cbox_equipe, 1, 0);
		gp_controleur.add(new Label("Bateau :"), 0, 2);
		gp_controleur.add(this.cbbo_Bateaux, 1, 2);
		gp_controleur.add(new Label("Direction :"), 0, 3);
		gp_controleur.add(this.cbox_direction, 1, 3);
		gp_controleur.add(new Label("Cliquez sur une case de la grille."), 0, 4);

		gp_controleur.setHgap(5);
		gp_controleur.setVgap(5);

		this.m_vboxAffichageControleur.setSpacing(10);
		this.m_vboxAffichageControleur.getChildren().addAll(new Label("Choississez :"), gp_controleur);
		vbcreation_env.getChildren().addAll(lbl_creationEnv, hb_hauteur, this.m_vboxAffichageControleur);
		Label lbl_saveEnv = new Label("Sauvgarder l'environnement");

		lbl_saveEnv.setStyle("-fx-background-color: white; \n" + "-fx-translate-y: -28; \n" + "-fx-translate-x: 15;");

		VBox save_env = new VBox(10);
		save_env.setBorder(FenetrePrincipal.getBorder());
		save_env.setPadding(new Insets(20, 4, 4, 4));
		save_env.getChildren().addAll(lbl_saveEnv, this.btn_Sauvegarder);
		VBox root = new VBox(10, vbcreation_env, save_env);
		this.getChildren().add(root);
	}

	/**
	 * Retourne le btn_ConfirmerHauteur.
	 * 
	 * @return le btn_ConfirmerHauteur
	 */
	public Button getBtn_ConfirmerHauteur() {
		return this.btn_ConfirmerHauteur;
	}

	/**
	 * Retourne le txt_hauteur.
	 * 
	 * @return le txt_hauteur
	 */
	public TextField getTxt_hauteur() {
		return this.txt_hauteur;
	}

	/**
	 * Retourne le vboxAffichageControleur.
	 * 
	 * @return le vboxAffichageControleur
	 */
	public VBox getVboxAffichageControleur() {
		return this.m_vboxAffichageControleur;
	}

	/**
	 * Retourne le model_equipe.
	 * 
	 * @return le model_equipe
	 */
	public ObservableList<String> getModel_equipe() {
		return this.model_equipe;
	}

	/**
	 * Retourne le cbox_equipe.
	 * 
	 * @return le cbox_equipe
	 */
	public ComboBox<String> getCbox_equipe() {
		return this.cbox_equipe;
	}

	/**
	 * Retourne le model_bateau.
	 * 
	 * @return le model_bateau
	 */
	public ObservableList<String> getModel_bateau() {
		return this.model_bateau;
	}

	/**
	 * Retourne le cbbo_Bateaux.
	 * 
	 * @return le cbbo_Bateaux
	 */
	public ComboBox getCbbo_Bateaux() {
		return this.cbbo_Bateaux;
	}

	/**
	 * Retourne le model_direction.
	 * 
	 * @return le model_direction
	 */
	public ObservableList<String> getModel_direction() {
		return this.model_direction;
	}

	/**
	 * Retourne le cbox_direction.
	 * 
	 * @return le cbox_direction
	 */
	public ComboBox<String> getCbox_direction() {
		return this.cbox_direction;
	}

	/**
	 * Retourne le btn_Sauvegarder.
	 * 
	 * @return le btn_Sauvegarder
	 */
	public Button getBtn_Sauvegarder() {
		return this.btn_Sauvegarder;
	}

}
