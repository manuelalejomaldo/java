/**
 * 
 */
package ca.csf.dfc.poo.graph;

import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * @author admin
 *
 */
public class PaneRight extends Pane {
	private ToggleButton btn_Jouer = new ToggleButton("Jouer");
	private ToggleButton btn_Pause = new ToggleButton("Pause");
	private ToggleButton btn_Arreter = new ToggleButton("Arreter");
	private Slider slider_vitesse = new Slider();
	
	private FenetrePrincipal m_parent;
	
	public PaneRight(FenetrePrincipal p_arg) {
		this.m_parent=p_arg;
		configTogleGroup();
		configSlider();
		
		HBox hb=new HBox(5);
		hb.getChildren().addAll(btn_Jouer,btn_Pause,btn_Arreter);
		VBox vb=new VBox(5);
		vb.getChildren().addAll(hb,slider_vitesse);
		this.getChildren().add(vb);
		vb.setPadding(new Insets(60,10,10,10));
		
	}
	
	
	private void configSlider() {
		slider_vitesse.setMin(0);
		slider_vitesse.setMax(100);
		slider_vitesse.setValue(40);
		slider_vitesse.setShowTickLabels(true);
		slider_vitesse.setShowTickMarks(true);
		slider_vitesse.setMajorTickUnit(50);
		slider_vitesse.setMinorTickCount(5);
		slider_vitesse.setBlockIncrement(10);
	}
	
private void configTogleGroup() {
		ToggleGroup group=new ToggleGroup();

		this.btn_Jouer.setToggleGroup(group);
		this.btn_Pause.setToggleGroup(group);
		this.btn_Pause.setToggleGroup(group);

	}

}
