/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class TiroirArgentCOM implements TiroirArgent{

private TypeTiroir m_typetiroir;
	
	public TiroirArgentCOM() {
		this.m_typetiroir = TypeTiroir.COM;
	}
	
	public void DistribuerArgent() {
		System.out.println("ATM2 distribue l'argent correctement, type de tiroir : " + m_typetiroir);
	}
}
