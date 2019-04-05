package ca.csf.dfc.console;
import ca.csf.dfc.classes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainVoyageur tv1 = new	TrainVoyageur();
		System.out.println(tv1.toString() + "\n");
		TrainVoyageur tv2 = new	TrainVoyageur(1,1);
		System.out.println(tv2.toString() + "\n");
		
		TrainMerchandises tm1 = new TrainMerchandises();
		System.out.println(tm1.toString() + "\n");
		TrainMerchandises tm2 = new TrainMerchandises(2,22);
		System.out.println(tm2.toString() + "\n");
		
		TrainGrandeVitesse tgv1 = new TrainGrandeVitesse();
		System.out.println(tgv1.toString() + "\n");
		TrainGrandeVitesse tgv2 = new TrainGrandeVitesse(3,3);
		System.out.println(tgv2.toString() + "\n");
		
		//Définition d'un tableau de vehicules ferroviares
		//VehiculeFerroviaire[] tab = new VehiculeFerroviaire[10];
		
		System.out.println("\n Remplir 10 trains : (1) pour grandeVitesse, (2) pour Merchandises, autre Voyageur \n");
		//choissir le type de train 
		/*for(VehiculeFerroviaire v : tab){
			System.out.println("\n Slectionez le type du train:");
			
		
		}//*/
		
		//notre tableau !
		/*for(VehiculeFerroviaire v : tab){
				System.out.println(v.toString() + "\n");
				
				
				
		}//*/
	}
}
