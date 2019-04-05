/**
 * 
 */
package ca.csf.dfc.console;
import ca.cdf.dfc.classes.Personne;
import ca.csf.dfc.classes.Employe;

/**
 * @author ManueLMaldonado
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne p = new Personne("Bill", 53);
		Employe empl = new Employe("Toto", 37, "123-456-789", 50000);
		System.out.println(p.toString());
		System.out.println(empl.toString());
		//empl.setNom("");
	}

}
