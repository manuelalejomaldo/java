package ca.csf.dfc.main.console;

import ca.csf.dfc.classes.Personne;

public class MainPersonne {

	public static void main(String[] args) {
		
		Personne p0 = new Personne();
		Personne p1 = new Personne("Fabio", 42);
		Personne p2 = new Personne("Gabriel");
		Personne p3 = new Personne("Karla", 44);
		Personne p4 = new Personne(12);
		
		System.out.println(p0.toString());
		
		System.out.println(p1.toString());
		
		p2.setAge(13);
		System.out.println(p2.toString());
		
		System.out.println(p3.toString());
		
		p4.setNom("Bruno");
		System.out.println(p4.toString());
		

	}

}
