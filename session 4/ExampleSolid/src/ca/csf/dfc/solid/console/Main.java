package ca.csf.dfc.solid.console;


import java.util.Scanner;

import ca.csf.dfc.solid.classes.Article;

import ca.csf.dfc.solid.donnees.DonneesBoutiqueQuebecProduitRepository;
import ca.csf.dfc.solid.donnees.DonneesCommandeTest;
import ca.csf.dfc.solid.interfaces.ICommande;
import ca.csf.dfc.solid.interfaces.IProduitRepository;
import ca.csf.dfc.solid.classes.PanierObject;


public class Main {

	private static Scanner entree;

	public static void main(String[] args) {
		
		
		//repo
		IProduitRepository BoutiqueQuebecRepo = new DonneesBoutiqueQuebecProduitRepository();
		ICommande commande = new DonneesCommandeTest();
		entree = new Scanner(System.in);
		int saisie,saisie2;
		
		do {
			do {
				System.out.println();
				System.out.println("-----------------------------------------------------------");
				System.out.println("-                            MENU                         -");
				System.out.println("- 1) Ajouter/modifier des produits de mon entreprise      -");
				System.out.println("- 2) Ajouter des articles dans un panier et le visualiser -");
				System.out.println("- 3) Afficher une facture                                 -");
				System.out.println("- 0) Finir                                                -");
				System.out.println(" - Saisie option :");			
				saisie = entree.nextInt();
				
			} while (saisie < 0 || saisie > 3);
			
			switch (saisie) {
			case 1:
				do {
	
					do {
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("-          MENU Ajouter/modifier des produits             -");
						System.out.println("- 1) Lister                                               -");
						System.out.println("- 2) Ajouter                                              -");
						System.out.println("- 3) Modifier                                             -");
						System.out.println("- 0) Retourner menu                                       -");
						System.out.println(" - Saisie option :");			
						saisie2 = entree.nextInt();
						
					} while (saisie2 < 0 || saisie2 > 3);
					
					switch (saisie2) {
					case 1:
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("-                    MENU Lister des produits             -");
						
						//obtenir les donnes				 
						for(Article a: BoutiqueQuebecRepo.getProduits()){
							System.out.println(a.toString());
						}
						
						break;
					case 2:
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("-                    MENU Ajouter des produits             -");
						
			
						break;
					case 3:
						
						break;
					default:
						break;
					}
					
				} while (saisie2 != 0);
				
				break;
			case 2:
				do {
					
					do {
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("-     MENU Ajouter/modifier des produits  au Panier       -");
						System.out.println("- 1) Lister Panier                                        -");
						System.out.println("- 2) Ajouter  Article au Panier                           -");
						System.out.println("- 3) Modifier  Article au Panier                          -");
						System.out.println("- 0) Retourner menu                                       -");
						System.out.println(" - Saisie option :");			
						saisie2 = entree.nextInt();
						
					} while (saisie2 < 0 || saisie2 > 3);
					
					switch (saisie2) {
					case 1:
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("-              MENU Lister Panier des produits            -");
						
						//obtenir les donnes				 
						for(PanierObject p: commande.getCommande()){
							System.out.println(p.toString());
						}
						
						break;
					case 2:
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("-           MENU Ajouter des produits  au Panier          -");
						
						
						break;
					case 3:
						
						break;
					default:
						break;
					}
					
				} while (saisie2 != 0);
				break;
			case 3:
				
				break;
			default:
				break;
			}
		} while (saisie != 0);
	}

}
