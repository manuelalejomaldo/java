/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class VoitureEssence implements Voiture2 {

	private TypeVehicule m_typevehicule;
	
	
	public VoitureEssence(TypeVehicule p_typevehicule)  {
		this.m_typevehicule = p_typevehicule;
	}
	
	
	@Override
	public void ajouterEnergie()  {		
		System.out.println("Vehicule type :" + m_typevehicule +" rempli d'essence correctement");
	}

}
