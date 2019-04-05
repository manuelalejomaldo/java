package ca.csf.dfc.main.console;

public class MainConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Bienvenu dans le monde Java !");
		
//		Personne p = new Personne();
//		
//		p.setNom("Bob");
//		p.SetAge(38);
//				
//		System.out.println("Voici une personne : " + p.getNom() + ", " + p.getAge() + " ans.");
		
		Utilisateur u = new Utilisateur();
		
		u.setPrenom("Fabio");
		u.setNom("Fonseca");
		u.SetAge(42);
		u.SetEstActif(true);
		
		Telephone t = new Telephone();
		t.setModele("iPhone X");
		t.setNumero("418-999-1234");
		//u.setTelephone(t);
		
		System.out.println(u.toString());
		
	}

}
