/**
 * 
 */
package tp_dessin.controlleur;



import tp_dessin.model.IModele;



/**
 * @author ManueLMaldonado
 *
 */
public class Controleur {
	

	
	/**
	 * 
	 */
	private IModele m_Model;
	

	/**
	 * @param p_Modele
	 */
	public Controleur( IModele p_Modele) {
		this.m_Model = p_Modele;
	}

	/**
	 * @param p_Largeur
	 * @param p_Hauteur
	 */
	public void FichierNouveau() {	
		
		this.m_Model.setDimensionEspaceTravailDefault();
		this.m_Model.setColorFondEspaceTravailDefault();
				
	}
	
	public IModele getModele() {
		return this.m_Model;
	}
	
	
		

	
	
}
