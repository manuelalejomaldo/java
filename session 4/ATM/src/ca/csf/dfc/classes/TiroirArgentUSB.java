/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class TiroirArgentUSB implements TiroirArgent{
	
	private TypeTiroir m_typetiroir;
	
	public TiroirArgentUSB() {
		this.m_typetiroir = TypeTiroir.USB;
	}
	
	public void DistribuerArgent() {
		System.out.println("ATM2 distribue l'argent correctement, type de tiroir : " + m_typetiroir);
	}
}
