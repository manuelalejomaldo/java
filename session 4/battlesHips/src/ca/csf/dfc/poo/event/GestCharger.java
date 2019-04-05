/**
 * 
 */
package ca.csf.dfc.poo.event;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Occurs;

import ca.csf.dfc.poo.battleship.Couleur;
import ca.csf.dfc.poo.battleship.Ocean;
import ca.csf.dfc.poo.battleship.Warfare;
import ca.csf.dfc.poo.bots.IStrategy;
import ca.csf.dfc.poo.bots.Vorax;
import ca.csf.dfc.poo.graph.FenetrePrincipal;
import ca.csf.dfc.poo.graph.Grille;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

/**
 * @author admin
 *
 */
public class GestCharger implements EventHandler<ActionEvent> {
	FenetrePrincipal parent;

	public GestCharger(FenetrePrincipal p_parent) {

		this.parent = p_parent;
	}

	@Override
	public void handle(ActionEvent p_event) {
		FileChooser chooser = new FileChooser();
		chooser.setInitialDirectory(new File("."));// Pour démarrer dans le répertoire courant
		ExtensionFilter e = new ExtensionFilter("Xml Files", "*.xml");
		chooser.getExtensionFilters().add(e);
		chooser.setSelectedExtensionFilter(e);

		File resultat = chooser.showOpenDialog(this.parent.getStage());
		if (resultat != null) {
			String path = resultat.getAbsolutePath();
			try {
				Warfare simulateur = new Warfare(path);
				Grille g = new Grille();
				simulateur.addObserver(g);
				g.chargerGrille();
				HashMap<Couleur, IStrategy> a = new HashMap<>();

				a.put(Couleur.BLEU, new Vorax(Couleur.BLEU));
				a.put(Couleur.JAUNE, new Vorax(Couleur.JAUNE));
				a.put(Couleur.ROUGE, new Vorax(Couleur.ROUGE));
				a.put(Couleur.VERT, new Vorax(Couleur.VERT));
				simulateur.setBehaviors(a);
				try {
					simulateur.oneStep();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				this.parent.getPrincipale().setCenter(g.getRoot());

			} catch (XMLStreamException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SAXException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ParserConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else {
			System.out.println("---check2----");
		}

	}

}
