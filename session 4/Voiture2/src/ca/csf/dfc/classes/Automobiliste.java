/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class Automobiliste {
	
	private Voiture2 m_voiture2;
	
	public Automobiliste(Voiture2 p_voiture2)  {
		m_voiture2 = p_voiture2;
	}
	
	public void Remplir()  {
		m_voiture2.ajouterEnergie();
	}
}
