/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class VoitureElectrique implements Voiture2 {

private TypeVehicule m_typevehicule;
	
	
	public VoitureElectrique(TypeVehicule p_typevehicule)  {
		this.m_typevehicule = p_typevehicule;
	}
	
	@Override	
	public void ajouterEnergie()  {
				
		System.out.println("Vehicule type :" + m_typevehicule +" branché correctement à la borne electrique");
	}
	
}
