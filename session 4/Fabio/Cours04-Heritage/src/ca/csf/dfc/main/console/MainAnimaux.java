package ca.csf.dfc.main.console;

import java.util.Random;
import java.util.Scanner;

import ca.csf.dfc.classes.Animal;
import ca.csf.dfc.classes.AnimalMammifere;
import ca.csf.dfc.classes.AnimalPoisson;

public class MainAnimaux {

	public static void main(String[] args) {
		
		AnimalMammifere m1 = new AnimalMammifere();
		m1.setIdAnimaux(11111);
		
		AnimalMammifere m2 = new AnimalMammifere();
		m2.setIdAnimaux(22222);
		
		AnimalPoisson p1 = new AnimalPoisson();
		p1.setIdAnimaux(33333);
		
		AnimalPoisson p2 = new AnimalPoisson();
		p2.setIdAnimaux(44444);
		
		AnimalMammifere m3 = new AnimalMammifere();
		m3.setIdAnimaux(55555);
		
		AnimalPoisson p3 = new AnimalPoisson();
		p3.setIdAnimaux(666666);
		
		Animal animaux[] = {m1, m2, m3, p1, p2, p3};
		
//		System.out.println(m1.toString());
//		System.out.println(m2.toString());
//		System.out.println(p1.toString());
//		System.out.println(p1.toString());
		
//		m1.deplacer();
//		m1.respirer();
//		
//		System.out.println();
//		
//		p1.deplacer();
//		p1.respirer();
		
		while(true) {
			System.out.println("Quel comportement vous veut demander aux animaux ?");
			System.out.println("1. Pour voir les animaux se déplacer");
			System.out.println("2. Pour voir les animaux respirer");
			
			System.out.println();
			System.out.print("Votre choix : ");
			Scanner scanner = new Scanner(System.in);
			
			int comportament = scanner.nextInt();
			
			System.out.println();
			
			if (comportament == 1) {
				System.out.println("Déplacer !");
				
				for (int i = 0; i < animaux.length; i++) {
					
					Random ran = new Random();
					animaux[ran.nextInt(animaux.length)].deplacer();
				}
				
			} else {
				System.out.println("Respirer !");
				
				for (int i = 0; i < animaux.length; i++) {
					
					Random ran = new Random();
					animaux[ran.nextInt(animaux.length)].deplacer();
				}
			}
			
			System.out.println();
		}
	}
}
