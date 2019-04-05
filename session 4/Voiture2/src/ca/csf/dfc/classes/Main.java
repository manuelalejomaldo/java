package ca.csf.dfc.classes;
import ca.csf.dfc.classes.Automobiliste;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		TypeVehicule tvElect = TypeVehicule.Electrique;
		
		Voiture2 vEssense = new VoitureEssence(tvElect);
		Voiture2 vEssense2 = new VoitureEssence(TypeVehicule.Essence);
		Voiture2 v3 = new VoitureElectrique(TypeVehicule.Electrique);
		Voiture2 v4 = new VoitureVapeur(TypeVehicule.Electrique);
		Automobiliste a =new Automobiliste(vEssense);
		Automobiliste a2 =new Automobiliste(vEssense2);
		Automobiliste a3 =new Automobiliste(v3);
		Automobiliste a4 =new Automobiliste(v4);
		a.Remplir();
		a2.Remplir();
		a3.Remplir();
		a4.Remplir();
	}

}
