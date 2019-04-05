package ca.csf.dfc.console;


import ca.csf.dfc.classes.*;
import ca.csf.dfc.classes.Chien; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*CompteGeneral c = new CompteGeneral(10);
		
		c.deposer(1000.00);		
		System.out.println(c.toString());
		
		c.retirer(500.55);
		System.out.println(c.toString());
		
		Debit d = new Debit(25);
		d.deposer(1000);
		System.out.println(d.toString());
		
		d.retirer(50.55);
		System.out.println(d.toString());

		Credit cr = new Credit(250);
		System.out.println(cr.toString());
		
		cr.retirer(250);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());

		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
		
		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
		
		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
		
		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
		
		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
		
		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());

		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());//*/
		
		/*Ville v = new Ville();
		Ville v1 = new Ville("Marseille", 123456, "France");
		Ville v2 = new Ville("Rio", 321654, "Brésil");
		
		System.out.println(
				"\n v = "+v.getNom()+" ville de"
				+v.getNombreHabitants() + 
				" habitants se situant en	"+v.getNomPays());
		
		System.out.println(" v1 = "+v1.getNom()+" ville de"
				+v1.getNombreHabitants()+ " habitants se situant en	"
				+v1.getNomPays());
		
		System.out.println(" v2 = "+v2.getNom()+" ville de"
				+v2.getNombreHabitants()+ " habitants se situant en	"
				+v2.getNomPays()+"\n\n");
		
		//Nous allons interchanger les Villes v1 et v2
		//tout ça par l'intermédiaire d'un autre objet Ville.
		
		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;
		
		System.out.println(" v1 = "+v1.getNom()+" ville de"
				+v1.getNombreHabitants()+ " habitants se situant en"
				+v1.getNomPays());
		
		System.out.println(" v2 = "+v2.getNom()+" ville de"
				+v2.getNombreHabitants()+ " habitants se situant en"
				+v2.getNomPays()+"\n\n");
		
		//Nous allons maintenant interchanger leurs noms
		//cette fois par le biais de leurs mutateurs.
		
		v1.setNom("Hong Kong");
		v2.setNom("Djibouti");
		
		System.out.println(" v1 = "+v1.getNom()+" ville de"
				+v1.getNombreHabitants()+ " habitants se situant en"
				+v1.getNomPays());
		
		System.out.println(" v2 = "+v2.getNom()+" ville de"
				+v2.getNombreHabitants()+ " habitants se situant en"+v2.getNomPays()+"\n\n");
	
		Ville V = new Ville("Lyon", 654, "France");
		Ville V2 = new Ville("Lille", 123, "France");
		V.comparer(V2);
		
		System.out.println("\n\n"+v1.decrisToi());
		System.out.println(v.decrisToi());
		System.out.println(v2.decrisToi()+"\n\n");
		System.out.println(v1.comparer(v2));//*/
		
		
		/*Ville v = new Ville();
		
		System.out.println("Le nombre d'instances de la classe Ville est : "
				+ Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "
				+ Ville.getNombreInstancesBis());
		
		Ville v1 = new Ville("Marseille", 1236, "France");
		
		System.out.println("Le nombre d'instances de la classe Ville est : "
				+ Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "
				+ Ville.getNombreInstancesBis());
		
		Ville v2 = new Ville("Rio", 321654, "Brésil");
		
		System.out.println("Le nombre d'instances de la classe Ville est : "
				+ Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "
				+ Ville.getNombreInstancesBis());//*/
		
		/*Capitale cap = new Capitale("Paris", 654987, "France", "la tour	Eiffel");
				System.out.println("\n"+cap.decrisToi());
				
		//Définition d'un tableau de villes null
		Ville[] tableau = new Ville[6];
				
		//Définition d'un tableau de noms de villes et un autre de nombresd'habitants
		String[] tab = {"Marseille", "lille", "caen", "lyon", "paris",	"nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		
		//Les trois premiers éléments du tableau seront des villes,
		//et le reste, des capitales
		for(int i = 0; i < 6; i++){
			
			if (i <3){
			Ville V = new Ville(tab[i], tab2[i], "france");
			tableau[i] = V;
			} 
			else{
			Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
			tableau[i] = C;
			}
		}
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Ville v11 : tableau){
			System.out.println(v11.decrisToi()+"\n");
		}
		
		
		//Définition d'un tableau de villes null
		//Ville[] tableau = new Ville[6];
		
		//Définition d'un tableau de noms de Villes et un autre de nombres	d'habitants
		//String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		//int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		
		//Les trois premiers éléments du tableau seront des Villes
		//et le reste des capitales
		/*for(int i = 0; i < 6; i++){
			if (i <3){
				//Ville V = new Ville(tab[i], tab2[i], "france");
				tableau[i] = V;
			} 
			else{
				Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
				tableau[i] = C;
			}
		} 
		
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Object obj : tableau){
			System.out.println(obj.toString()+"\n");
		}
		
		Loup l = new Loup("Gris bleuté", 20);
			
		l.boire();
		l.manger();
		//l.deplacement();
		//l.crier();
		
		System.out.println(l.toString());
		
		//Les méthodes d'un chien
		Chien c = new Chien("Gris bleuté", 20);
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		System.out.println(c.toString());
		System.out.println("--------------------------------------------");
		//Les méthodes de l'interface
		c.faireCalin();
		c.faireLeBeau();
		c.faireLechouille();
		System.out.println("--------------------------------------------");
		//Utilisons le polymorphisme de notre interface
		Rintintin r = new Chien();
		r.faireLeBeau();
		r.faireCalin();
		r.faireLechouille();
		
		//*/
		
		
	}

}
