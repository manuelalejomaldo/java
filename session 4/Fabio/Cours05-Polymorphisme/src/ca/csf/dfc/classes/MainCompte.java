package ca.csf.dfc.classes;

public class MainCompte {

	public static void main(String[] args) {
		
		//Compte c = new Compte(); //il donne erreur. C'est bien! c'est une public abstact class
		
		CompteCheque c = new CompteCheque();
		CompteMargeDeCredit m = new CompteMargeDeCredit();
		CompteInteret i = new CompteInteret();
		
		System.out.println(c.toString());
		System.out.println(m.toString());
		System.out.println(i.toString());
		
//		System.out.println(c.getSolde());
//		System.out.println(m.getSolde());
//		System.out.println(i.getSolde());
		
		c.deposer(20f);
		m.deposer(10f);
		i.deposer(30f);
		
		System.out.println();
		System.out.println("Déposer");
//		System.out.println(c.getSolde());
//		System.out.println(m.getSolde());
//		System.out.println(i.getSolde());
		
		c.retirer(20f);
		
		m.retirer(10f);
		m.retirer(1f);
		m.retirer(1f);
		m.retirer(1f);
		m.retirer(1f);
		m.retirer(1f);
		m.retirer(1f);
		m.retirer(1f);
		m.retirer(1f);
		m.retirer(1f);
		m.retirer(1f);
		m.retirer(1f);
		
		i.retirer(30f);
		
		System.out.println();
		System.out.println("Retirer");
//		System.out.println(c.getSolde());
//		System.out.println(m.getSolde());
//		System.out.println(i.getSolde());
		
		System.out.println();
		System.out.println(c.toString());
		System.out.println(m.toString());
		System.out.println(i.toString());

	}

}
