package ca.csf.dfc.console;
import java.util.*;
//import java.io.*;
//import ca.csf.dfc.*;
import ca.csf.dfc.classes.PileGenerique;
import ca.csf.dfc.classes.PileInteger;



/**
 * @author ManueLMaldonado
 *
 */
public class Main {

	public static <TypeElement> void afficher(ArrayList<TypeElement> p_collection) {
		
		for ( TypeElement unElement : p_collection) {
			System.out.print(unElement + " ");
		}
	}
	
	public static <TypeElement > void afficher2(List<TypeElement> p_collection) {
		
		for ( TypeElement unElement : p_collection) {
			System.out.print(unElement + " ");
		}
	}
	
	public static <TypeElement extends Collection<TypeElement>> void afficher3(Collection<TypeElement> p_collection) {
		
		for ( TypeElement unElement : p_collection) {
			System.out.print(unElement + " ");
		}
	}
	
	public static <TypeElement> ArrayList<TypeElement> inverser(ArrayList<TypeElement> p_collection) {
		
		ArrayList<TypeElement> result = new ArrayList<TypeElement>();
		for(int i=p_collection.size()-1; i>=0; i--)
		    result.add(p_collection.get(i));
		return result;		
	}
	
	public static <TypeElement> ArrayList<TypeElement> inverser2(ArrayList<TypeElement> p_collection) {
		
		ArrayList<TypeElement> result = new ArrayList<TypeElement>();
		for(int i=p_collection.size()-1; i>=0; i--)
		    result.add(p_collection.get(i));
		return result;		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. Faites une fonction générique statique pour afficher tous les 
		éléments d’un ArrayList, indépendamment du type des éléments qu’il contient.
		*/		
		
		ArrayList<Integer> entiers = new ArrayList<Integer>();
				
		entiers.add(1);
		entiers.add(2);
		entiers.add(3);
		entiers.add(4);
		
		afficher(entiers);
		
		ArrayList<Double> reels = new ArrayList<Double>();
		
		reels.add(.1);
		reels.add(2.2);
		reels.add(3.3);
		reels.add(4.4);
		
		afficher(reels);
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
		
		afficher(cars);
		
		/*
		 * Faites une fonction générique statique pour inverser un ArrayList, i.e. inverser l’ordre des éléments
		 * */
		System.out.println(inverser(entiers));
		System.out.println(inverser(reels));
		System.out.println(inverser(cars));
		
		/*
		 * question 3
		 * */
		
		
		List<Double> reels2 = new LinkedList<Double>();
		List<Double> reels3 = new ArrayList<Double>();
		reels2.add(.1);
		reels2.add(2.2);
		reels2.add(3.3);
		reels2.add(4.4);
	
		afficher2(reels2);
		afficher2(reels3);
		
		//Personne personne = new Personne("Bob",35);
		
		/*
		 * PILE
		 * */
		
		System.out.println("\nexercice PILE Integer: \n");
		
		PileInteger pile1 = new PileInteger(10);

		System.out.println(pile1);
		
		pile1.Empiler(1);
		pile1.Empiler(2);
		pile1.Empiler(3);
		pile1.Empiler(4);
		pile1.Empiler(5);
		pile1.Empiler(6);
		pile1.Empiler(7);
		pile1.Empiler(8);
		pile1.Empiler(9);
		pile1.Empiler(10);
		
		System.out.println(pile1);
		
		System.out.println(pile1.Depiler());
		System.out.println(pile1.Depiler());
		System.out.println(pile1.Depiler());
		System.out.println(pile1.Depiler());
		System.out.println(pile1.Depiler());
		System.out.println(pile1.Depiler());
		System.out.println(pile1.Depiler());
		System.out.println(pile1.Depiler());
		System.out.println(pile1.Depiler());
		System.out.println(pile1.Depiler());
		
		System.out.println(pile1);
		
System.out.println("\nexercice PILE Generique: \n");
		
		PileGenerique<Integer> pile2 = new PileGenerique<Integer>(10);

		System.out.println(pile2.toString());
		
		pile2.Empiler(1);
		pile2.Empiler(2);
		pile2.Empiler(3);
		pile2.Empiler(4);
		pile2.Empiler(5);
		pile2.Empiler(6);
		pile2.Empiler(7);
		pile2.Empiler(8);
		pile2.Empiler(9);
		pile2.Empiler(10);
		
		System.out.println(pile2);
		
		System.out.println(pile2.Depiler());
		System.out.println(pile2.Depiler());
		System.out.println(pile2.Depiler());
		System.out.println(pile2.Depiler());
		System.out.println(pile2.Depiler());
		System.out.println(pile2.Depiler());
		System.out.println(pile2.Depiler());
		System.out.println(pile2.Depiler());
		System.out.println(pile2.Depiler());
		System.out.println(pile2.Depiler());
		
		System.out.println(pile2);
		
	}

}
