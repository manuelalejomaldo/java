package ca.csf.dfc.main.console;

import ca.csf.dfc.classes.Personne;
import ca.csf.dfc.classes.PersonneMineur;

public class MainPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne();
		p1.setM_Nom("Fabio");
		p1.setM_Age(15);
		
		Personne p2 = new Personne();
		p2.setM_Nom("Karla");
		p2.setM_Age(20);
		
		PersonneMineur m1 = new PersonneMineur();
		m1.setM_Nom("Gabriel");
		m1.setM_Age(15);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(m1.toString());
		
		PersonneMineur m2 = new PersonneMineur();
		m2.setM_Nom("Bruno");
		m2.setM_Age(20);
		
		System.out.println(m2.toString());
		
		

	}

}
