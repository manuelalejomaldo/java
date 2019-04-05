
/**
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author nrichard
 */
public class Main {

	static class Personne {
		private String m_Nom;

		/**
		 * @param p_Nom
		 */
		public Personne(String p_Nom) {
			this.m_Nom = p_Nom;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Personne [m_Nom=" + this.m_Nom + "]";
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 testsDeBase();
//		  
//		 demoVariables();
//		  
//		 demoTableau();
//		  
//		 demoConsole();
//
//		Exercices.menu();
	}

	public static void demoVariables() {
		int nb = Integer.MAX_VALUE;

		double nb2 = nb; // Affectation directe

		nb = (int) nb2; // Cast

		String nombre = Integer.toString(nb);
		// ou bien :
		nombre = String.valueOf(nb);

		System.out.println(nb);

		double tab[] = { -2, 4, 2.1 };
		java.util.Arrays.sort(tab);

		ArrayList<Integer> liste = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			liste.add(i);
		}

		System.out.println(liste);

		StringTokenizer segmenteur = new StringTokenizer("Un gros text important.");

		while (segmenteur.hasMoreTokens()) {
			String morceau = segmenteur.nextToken();

			System.out.println(morceau);
		}
	}

	public static void testsDeBase() {
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);

		String a = "allo";
		String b = "allo";
		if (a == b) {
			System.out.println("Surprenant");
		}

		if (a.equals(b)) {
			System.out.println("Rassurant");
		}

		Personne p1 = new Personne("Bill");
		Personne p2 = new Personne("Bob");

		if (p1 == p2) {
			System.out.println("Jamais !");
		} else {
			System.out.println("Oups 1");
		}

		if (p1.equals(p2)) {
			System.out.println("Pas supposé");
		} else {
			System.out.println("yeah");
		}

		if (p1.equals(p1)) {
			System.out.println("Devrait");
		} else {
			System.out.println("Oups 3");
		}

		if (p1 == p1) {
			System.out.println("Devrait itou");
		} else {
			System.out.println("Oups 4");
		}
	}

	public static void demoTableau() {

		int a = 0; // Initialisation à la déclaration
		double b;
		boolean test;

		if (a > 0) {
			b = 12.3; // Initialisation conditionnelle
		} else {
			b = -3;
		}

		test = true; // Initialisation tardive

		System.out.println(a);
		System.out.println(b);
		System.out.println(test);

		String str = "ici"; // Initialisation à la déclaration.
		String str2 = null;

		if (str.length() > 13) {
			str2 = "Yeah"; // Initialisation tardive
		} else {
			str2 = "bof";
		}

		System.out.println(str);
		System.out.println(str2);

		int[] tabDEntiers = new int[10]; // Tableau contenant des zéros
		String[] tabDeStrings = new String[5]; // Tableau contenant des null

		for (int i = 0; i < tabDEntiers.length; i++) {
			tabDEntiers[i] = i * i;
		}

		for (int nombre : tabDEntiers) {
			System.out.println(nombre);
		}

	}

	public static void demoConsole() {
		System.out.print("Entrez votre nom :");

		Scanner scanner = new Scanner(System.in);

		String nom = scanner.nextLine();

		if (nom.isEmpty()) {
			System.out.println("Oups, pas de nom !");

		} else {
			System.out.println("Bienvenu en Java " + nom + " !");
		}

		System.out.println("Entrez votre âge : ");

		if (scanner.hasNextInt()) {
			int age = scanner.nextInt();

			System.out.println("Votre âge : " + age);
		} else {
			System.out.println("Erreur !");
		}
	}
}
