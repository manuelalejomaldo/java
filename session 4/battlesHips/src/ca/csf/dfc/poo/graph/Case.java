/**
 * 
 */
package ca.csf.dfc.poo.graph;




import ca.csf.dfc.poo.event.ActionCase;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;



/**
 * @author F.0
 *
 */
public class Case extends Label{
	
	String m_text;
	

	public Case(String p_text) {
		super();
		this.m_text = p_text;
		this.setText(p_text);
		this.setAlignment(Pos.CENTER);
		this.setBorder(FenetrePrincipal.getBorder());
		
		this.setPrefSize(20, 20);
		this.setStyle("-fx-background-color: transparent;");
	
		this.addEventHandler(MouseEvent.MOUSE_CLICKED, new ActionCase(this));
	}
	
	
}
