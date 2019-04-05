package ca.csf.dfc.poo.event;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.HashMap;

import ca.csf.dfc.poo.battleship.Ship;
import ca.csf.dfc.poo.graph.Case;
import ca.csf.dfc.poo.graph.FenetrePrincipal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

/*
 * @author F.0
 */

public class ActionCase implements EventHandler<MouseEvent> {
	
	private Label m_case;
	private HashMap listeData = new HashMap<String, ArrayList>();
	ArrayList<Ship> listBateau=new ArrayList<>();
	private FenetrePrincipal m_FenetrePrincipal=new FenetrePrincipal();
	private String m_equipe;
	private String m_bateau;
	private String m_direction;
	private int x;
	private int y;
	
	
	
	

	public ActionCase(Label p_case) {
		super();
		this.m_case = p_case;
		//this.m_FenetrePrincipal=p_parent;
		
	}













	@Override
	public void handle(MouseEvent p_arg0) {
		
		if(validData())
		{
			
			this.x=(int) p_arg0.getX();
			this.y=(int) p_arg0.getY();
			//Case place=(Case) p_arg0.getSource();
			this.m_case.setText("AV");
		
			
		}else
		{
			Alert a = new Alert(AlertType.WARNING, "Entrer le nom equipe bateau et direction!!!", ButtonType.CLOSE);
			a.showAndWait();
		}
		// TODO Auto-generated method stub
		/*this.m_case.setText("54");
		//public void writeCommaSeperatedLine(BufferedWriter writer, String... values) {
		    for (int i = 0; i < values.length; i++) {
		        writer.write(values[i]);
		        if (i-1 != values.length) writer.write(",");
		    }
		}*/
		
	}

	
	private boolean validData()
	{
		
		String eq=this.m_FenetrePrincipal.getPaneCreationEnvi().getCbox_equipe().getSelectionModel().getSelectedItem();
		String bat=(String) this.m_FenetrePrincipal.getPaneCreationEnvi().getCbbo_Bateaux().getSelectionModel().getSelectedItem();
		String dir=this.m_FenetrePrincipal.getPaneCreationEnvi().getCbox_direction().getSelectionModel().getSelectedItem();
		if(!eq.isEmpty()&& !bat.isEmpty()&&!dir.isEmpty())
		{
			this.m_equipe=eq;
			this.m_bateau=bat;
			this.m_direction=dir;
			return true;
		}
		return false;
		
		
		
	}
	
	private void reset()
	{
		this.m_FenetrePrincipal.getPaneCreationEnvi().getCbox_equipe().getSelectionModel().clearSelection();
		this.m_FenetrePrincipal.getPaneCreationEnvi().getCbbo_Bateaux().getSelectionModel().clearSelection();

		this.m_FenetrePrincipal.getPaneCreationEnvi().getCbox_direction().getSelectionModel().clearSelection();
	}
}
