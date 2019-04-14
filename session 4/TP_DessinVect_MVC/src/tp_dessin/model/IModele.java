/**
 * 
 */
package tp_dessin.model;

import java.awt.Color;

/**
 * @author ManueLMaldonado
 *
 */
public interface IModele {
	
	/**
	 * Pour modifier les dimension de l'arrière plan.
	 * 
	 * @param p_Largeur la nouvelle largeur.
	 * @param p_Hauteur la nouvelle hauteur.
	 */
	
	//pour l'espace Travail
	
	void EspaceTravailDefault();
	
	void setColorFondEspaceTravailDefault();
	Color getColorFondEspaceTravailDefault();
	
	Color getColorFondEspaceTravail();
	void setColorFondEspaceTravail(Color p_colorFondEspaceTravail) ;
	
	void setDimensionEspaceTravailDefault();	
	void setDimensionEspaceTravail(double p_Largeur, double p_Hauteur);	
	void setLargeurEspacetravail(int p_Largeur);
	
	double getLargeurEspaceTravail();
	double getHauteurEspaceTravail();

	

}
