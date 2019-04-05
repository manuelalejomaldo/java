/**
 * 
 */
package ca.csf.dfc.poo.graph;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import ca.csf.dfc.poo.battleship.Ocean;
import ca.csf.dfc.poo.battleship.Ship;
import ca.csf.dfc.poo.battleship.Warfare;
import ca.csf.dfc.poo.battleship.tools.Position;
import ca.csf.dfc.poo.battleship.tools.PropertyObservable;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;

/**
 * @author admin/elmer versio06
 *
 */
public class Grille implements PropertyChangeListener {
	private  int m_taille;
	/**
	 * Pour modifier le taille.
	 * @param p_taille Nouvelle valeur
	 */
	

 private Ocean m_ocean;
	private int m_col;
	private int m_row;
	private GridPane root = new GridPane();
	private ScrollPane sp_root;
	private Case m_case=new Case(null);
	// final int m_row;

	/*public Grille(int p_hauteur) {
		super();
		this.m_col = p_hauteur;
		this.m_row = p_hauteur * 2;
		this.m_taille = p_hauteur;
		this.notifyObservers(this);
		//this.setPrefSize(800,400 );
		//this.setPadding(new Insets(10,10,10,10));
	   // this.root.setStyle("-fx-background-color:transparent; -fx-background-radius: 10;");

	    this.root.setStyle("-fx-background-color: rgba(0, 100, 100, 0.5); -fx-background-radius: 10;");
		

		for (int col = 0; col < m_taille * 2; col++) {
			for (int row = 0; row < m_taille; row++) {
				m_case = new Case(null);
				root.add(this.m_case, col, row);
				
				
				
			}
		}
		//borad.getChildren().add(root);
		//this.getChildren().add(root);
	}*/

	
	

	/*for (int col = 0; col < m_taille * 2; col++) {
		for (int row = 0; row < m_taille; row++) {
			m_case = new Case(null);
			root.add(this.m_case, col, row);
			
			
			
		}
	*/
	
	  /*public void addObserver(PropertyChangeListener p_board)
	    {
	        this.m_ocean.addObserver(p_board);
	    }*/
	
	

	public Grille( )
	{
		

		/*this.root.getChildren().clear();
	    this.root.setStyle("-fx-background-color: rgba(0, 100, 100, 0.5); -fx-background-radius: 10;");
	   // this.m_ocean.add;
		for(int col = 0; col<this.m_col; col++)
		{
			
			for(int row=0; row<this.m_row;row++)
			{
				this.m_case=new Case(null);
				Ship y=this.m_ocean.getShip(new Position(col, row));
				String ys = "";
				if(y!=null)
				{
					ys = y.getImage();
					if (y.isDestroyed(new Position(col, row)))
					{
						 ys = "/" + ys + "";
					}
					this.m_case = new Case(ys);
						
		                
				}
				
				root.add(this.m_case, col, row);

			}
		}
		
		this.sp_root=new ScrollPane(root);*/
	}
	
	public void chargerGrille()
	{

		this.root.getChildren().clear();
	    this.root.setStyle("-fx-background-color: rgba(0, 100, 100, 0.5); -fx-background-radius: 10;");
	   // this.m_ocean.add;
		for(int col = 0; col<this.m_col; col++)
		{
			
			for(int row=0; row<this.m_row;row++)
			{
				this.m_case=new Case(null);
				Ship y=this.m_ocean.getShip(new Position(col, row));
				String ys = "";
				if(y!=null)
				{
					ys = y.getImage();
					if (y.isDestroyed(new Position(col, row)))
					{
						 ys = "/" + ys + "";
					}
					this.m_case = new Case(ys);
						
		                
				}
				
				root.add(this.m_case, col, row);

			}
		}
		
		this.sp_root=new ScrollPane(root);
	}
	/**
	 * Retourne le taille.
	 * @return le taille
	 */
	public int getTaille() {
		return this.m_taille;
	}


	/**
	 * Retourne le root.
	 * @return le root
	 */
	public ScrollPane getRoot() {
		
		
		return this.sp_root;
	}

	protected void setTaille(int p_taille) {
		this.m_taille = p_taille;
	}

	@Override
	public void propertyChange(PropertyChangeEvent p_evt) {
		this.m_ocean=(Ocean) p_evt.getSource();
		this.m_taille=this.m_ocean.getHeight();
		this.m_col=this.m_ocean.getHeight();
		this.m_row=this.m_ocean.getWidth();
		System.out.println(this.m_ocean.H);
		System.out.println(this.m_ocean.toString());


		System.out.println("Yay ! j'ai réussi ! ");
		
		
			
		
		
		
		
	}
	
}
