/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class VoitureVapeur implements Voiture2{

	private TypeVehicule m_typevehicule;
	
	public VoitureVapeur(TypeVehicule p_typevehicule)  {
		this.m_typevehicule = p_typevehicule;
	}
	
	@Override	
	public void ajouterEnergie()  {				
		System.out.println("Vehicule type :" + m_typevehicule +" ajoute d'eau et charbon correctement");
	}

}
