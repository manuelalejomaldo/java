/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class TiroirArgentSerie implements TiroirArgent{
	
	
private TypeTiroir m_typetiroir;
	
	public TiroirArgentSerie() {
		this.m_typetiroir = TypeTiroir.SERIE;
	}
	
	public void DistribuerArgent() {
		System.out.println("ATM2 distribue l'argent correctement, type de tiroir : " + m_typetiroir);
	}
	
}
