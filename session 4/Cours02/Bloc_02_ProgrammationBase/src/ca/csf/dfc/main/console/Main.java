package ca.csf.dfc.main.console;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * */
		System.out.println("Exercise 1: Faites un programme qui demande "
				+ "10 nombres réels à l’utilisateur et qui en "
				+ "affiche la moyenne.");
		
		double[] tabReel = new double[10];	
		double moyenne = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		for( int i = 0; i < 10; ++i ) 
		{
			System.out.println("Ecrire le : " + (i + 1) + " nombre reel:");
			tabReel[i] = scanner.nextDouble();
			moyenne += tabReel[i];
		}	
		
		
		System.out.println("la moyenne de nombres reel est: " + (moyenne/10));

	}

}
