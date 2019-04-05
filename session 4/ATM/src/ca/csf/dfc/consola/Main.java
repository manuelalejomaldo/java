/**
 * 
 */
package ca.csf.dfc.consola;
import ca.csf.dfc.classes.ATM;
import ca.csf.dfc.classes.CompteCourant;
import ca.csf.dfc.classes.CreateurTransaction;
import ca.csf.dfc.classes.CreateurtransactionConcrete;
import ca.csf.dfc.classes.TiroirArgent;
import ca.csf.dfc.classes.TiroirArgentUSB;
import ca.csf.dfc.classes.TypeTiroir;

/**
 * @author ManueLMaldonado
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompteCourant compte = new CompteCourant(1,10.0);
		CreateurTransaction transaction = new CreateurtransactionConcrete();
		
		TiroirArgent tiroirargent = new TiroirArgentUSB();
		
		ATM atm = new ATM(transaction, tiroirargent);
		
		atm.Depositer(compte, 25.75);
		System.out.println(compte);
		
		
		System.out.println("");
	}

}
