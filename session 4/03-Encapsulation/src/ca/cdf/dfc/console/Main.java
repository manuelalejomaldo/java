/**
 * 
 */
package ca.cdf.dfc.console;

import java.util.Scanner;

import ca.cdf.dfc.classes.Personne;

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
		
		
		
		System.out.println("Donnez l'âge: ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age < Personne.AGE_MIN) {
			System.err.println("Oups !");
		}
		
	}

}
