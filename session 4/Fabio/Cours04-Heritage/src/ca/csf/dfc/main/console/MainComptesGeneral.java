/**
 * 
 */
package ca.csf.dfc.main.console;

import ca.csf.dfc.classes.CompteInteret;
import ca.csf.dfc.classes.CompteMargeDeCredit;
import ca.csf.dfc.classes.ComptesGeneral;

/**
 * @author Fabio Fonseca
 *
 */
public class MainComptesGeneral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//CompteGeneral
		ComptesGeneral cg = new ComptesGeneral();
		
		System.out.println("Comptes General");
		System.out.println(cg.toString());
		
		System.out.println("Depôt : " + cg.deposer(10.00) + " $");
				
		System.out.println(cg.toString());
		
		System.out.println("Retrait : 5.00 $");
		
		cg.retirer(5.0);
		
		System.out.println(cg.toString());
		
		System.out.println();
		
		//CompteInteret
		CompteInteret ci = new CompteInteret();
		
		System.out.println("Comptes Intérêt");
		System.out.println(ci.toString());
		
		System.out.println("Depôt : " + ci.deposer(20.00) + " $");
				
		System.out.println(ci.toString());
		
		System.out.println("Retrait : 5.00 $");
		
		ci.retirer(5.0);
		
		System.out.println(ci.toString());
		
		System.out.println();
		
		//CompteDeCredit
		CompteMargeDeCredit cc = new CompteMargeDeCredit();
		
		System.out.println("Comptes de crédit");
		System.out.println(cc.toString());
		
		System.out.println("Depôt : " + cc.deposer(20.00) + " $");
				
		System.out.println(cc.toString());
		
		System.out.println("Retrait : 5.00 $");
		
		cc.retirer(5.0);
		cc.retirer(5.0);
		cc.retirer(5.0);
		
		cc.retirer(5.0);
		cc.retirer(5.0);
		cc.retirer(5.0);
		cc.retirer(5.0);
		cc.retirer(5.0);
		cc.retirer(5.0);
		cc.retirer(5.0);
		cc.retirer(5.0);
		cc.retirer(5.0);
		cc.deposer(50);
		cc.retirer(5.0);
				
		System.out.println(cc.toString());
		
		System.out.println();
		
		
		
		
	}

}
