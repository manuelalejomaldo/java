package ca.csf.dfc.exerciceramasse01.console;

import java.util.List;
import java.util.Scanner;

import ca.csf.dfc.exerciceramasse01.vehicule.*;

public class ExerciceRamasse01Console {
	private static final int NB_VEHICULES_TRAITEMENT = 10;

	public static void main(String[] args) {
		Vehicule vehicules[] = new Vehicule[NB_VEHICULES_TRAITEMENT];
		Scanner entree = new Scanner(System.in);

		for (int i = 0; i < NB_VEHICULES_TRAITEMENT; ++i) {
			int saisie;

			do {
				System.out.println("Saisie du vehicule #" + i + " (1: Voiture, 2: Camion, 3: Decapotable");
				saisie = entree.nextInt();
			} while (saisie < 1 || saisie > 3);

			switch (saisie) {
			case 1:
				vehicules[i] = new Voiture("Marque_" + i, "Modele_" + i);
				break;
			case 2:
				vehicules[i] = new Camion("Marque_" + i, "Modele_" + i);
				break;
			case 3:
				vehicules[i] = new Decapotable("Marque_" + i, "Modele_" + i);
				break;
			}
		}

		int saisie = 0;
		do {
			for (int i = 0; i < NB_VEHICULES_TRAITEMENT; ++i) {
				System.out.println("#" + (i + 1) + " - " + vehicules[i]);
			}

			do {
				System.out.println("# du véhicule: ");
				saisie = entree.nextInt();
			} while (saisie < 0 || saisie > NB_VEHICULES_TRAITEMENT);

			if (saisie > 0) {
				Vehicule vehicule = vehicules[saisie - 1];
				List<String> actionsPossibles = vehicule.getActionsPossibles();

				do {
					for (int i = 0; i < actionsPossibles.size(); ++i) {
						System.out.println("(" + (i + 1) + ") - " + actionsPossibles.get(i));
					}
					System.out.println("Saisir un numéro d'action SVP (0: quitter): ");
					saisie = entree.nextInt();
				} while (saisie < 0 || saisie > actionsPossibles.size());

				if (saisie != 0) {
					try {
						vehicule.executerAction(actionsPossibles.get(saisie - 1));
					} catch (IllegalVehiculeActionException e) {
						System.err.println("Erreur: " + e.getClass().getSimpleName());
					}
				}
			}
		} while (saisie != 0);

		entree.close();
	}
}
