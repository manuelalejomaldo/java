package ca.csf.dfc.main.console;

public class MainConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne p = new Personne();
		
		p.setNom("Bob");
		p.setAge(45);
		
		System.out.println(
				"Voici une personne : " + p.getNom() + " �ge: " + p.getAge());
		
		/**Utilisateur u = new Utilisateur();
		
		u.setNom("Toto");
		u.setPr�nom("Bob");
		u.setAge(36);
		u.setEstActif(true);
		
		System.out.println(u.toString());
		
		Utilisateur u2 = new Utilisateur();
		System.out.println(u2.toString());**/

	}

}
