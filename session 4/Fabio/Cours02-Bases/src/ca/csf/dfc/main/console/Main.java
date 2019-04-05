package ca.csf.dfc.main.console;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choix = -1;
		
		do {
			System.out.println("Menu option :");
			System.out.println("------------------------------------------");
			System.out.println("1 - Moyenne");
            System.out.println("2 - Comparaison de chaines");
			System.out.println("3 - Génération de phrases");
            System.out.println("4 - Transformation de numéros de téléphone");
            System.out.println("5 - Inversion de phrases");
            System.out.println("6 - Monsieur et madame");
            System.out.println("7 - Quitter");
			System.out.println("------------------------------------------");
			System.out.print("Votre choix : ");
			Scanner scanner = new Scanner(System.in);
			
			do 
			{
				if (scanner.hasNextInt()) 
				{
					choix = scanner.nextInt();
					if (choix < 1 || choix > 7) 
					{
						System.err.println("Valeur invalid");
					}
				}else 
				{
					System.err.println("Erreur");
				}
				
			} while (choix < 1 || choix > 7);
			
			switch (choix) 
			{
				case 1:
					calculerMoyenne();
					break;
				case 2:
					comparerDesChaines();
					break;
				
				case 3:
                    generationDePhrases();
                    break;
                case 4:
                    transformationDeTelephones();
                    break;

                case 5:
                    inversionDePhrases();
                    break;

                case 6:
                    monsieurMadame();
                    break;

                case 7:
                    // Pour quitter
                    break;

                default:
                    System.err.println("Cas manquant dans le switch");
					break;
			}
			
			System.out.println();
			
		} while (choix != 7);
	}
	
	//QUESTION 01
	private static void calculerMoyenne() 
	{
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print("Entrez un nombre(double avec ,) : ");
			Scanner scanner = new Scanner(System.in);
			int nb = scanner.nextInt();
			
			liste.add(nb);
		}
		
		System.out.println("Liste = " + liste);
		
		int total = 0;
		for (int k: liste) 
			total = total + k;
				
		System.out.println("Le total est : " + total);
		System.out.println("La moyenne est : " + total / liste.size());
		
	}
	
	//QUESTION 02
	private static void comparerDesChaines() 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez une premi�re chaine :");
		String premiere = scanner.nextLine();
		
		System.out.println("Entrez une deuxi�me chaine :");
		String deuxieme = scanner.nextLine();
		
		//sempre usar depois de todas as leituras
		scanner.close();
		
		if (premiere.compareTo(deuxieme) < 0) 
		{
			System.out.println("Résultat : La premiére est plus petite que la seconde");
		}
		else if(premiere.compareTo(deuxieme) > 0) 
		{
			System.out.println("R�sultat : La deuxi�me est plus petite que la premi�re");
		}
		else 
		{
			System.out.println("R�sultat : Les deux sont �gales.");
		}
	}
	
	//QUESTION 03
	private static void generationDePhrases() 
	{
		String[] articles = { "le", "la", "les", "un", "quelques", "tous" };
		String[] noms = { "chat", "chien", "ouris", "table" };
		String[] verbes = { "volait", "chantait", "giguait", "dormait" };
		String[] prepositions = { "vers", "dans", "sur" };
		
		System.out.println(genererUnPhrase(articles, noms, verbes, prepositions));
		System.out.println();
	}
	
	private static String genererUnPhrase(String[] articles, String[] noms, String[] verbes, String[] prepositions)
    {
        String premierMot = choisirMot(articles);
        premierMot = mettreMajusculeAuDebut(premierMot);

        StringBuilder resultat = new StringBuilder();
        
        resultat.append(premierMot);
        resultat.append(" ");
        resultat.append(choisirMot(noms));
        resultat.append(" ");
        resultat.append(choisirMot(verbes));
        resultat.append(" ");
        resultat.append(choisirMot(prepositions));
        resultat.append(" ");
        resultat.append(choisirMot(articles));
        resultat.append(" ");
        resultat.append(choisirMot(noms));
        resultat.append(".");

        return resultat.toString();
    }
	
	public static String mettreMajusculeAuDebut(String p_Mot)
    {
        return Character.toUpperCase(p_Mot.charAt(0)) + p_Mot.substring(1, p_Mot.length());
    }
	
	private static String choisirMot(String[] p_Mots)
    {
        Random rand = new Random();
        return p_Mots[rand.nextInt(p_Mots.length)];
    }
	
	//QUESTION 04
	private static void transformationDeTelephones()
    {
        String numeroOriginal = "(418) 555-5555";

        String nouveauNum = formaterLeNumeroDeTelephone(numeroOriginal);

        System.out.println("Ancien numero : " + numeroOriginal);
        System.out.println("Apr�s transformation : " + nouveauNum);

    }
    
    private static String formaterLeNumeroDeTelephone(String p_numeroOriginal)
    {
        //Assertion.precondition(estNumeroDeTelephoneValide(p_numeroOriginal), "Le format du num�ro de t�l�phone est incorrect");
    	
        String nouveauNumero = p_numeroOriginal.substring(1);
        
        nouveauNumero = nouveauNumero.replaceAll("\\) ","-");//remplace ") " pour "-"
        
        return nouveauNumero;
    }
    
    private static boolean estNumeroDeTelephoneValide(String p_numeroTelephone) 
    {
        Pattern p = Pattern.compile("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}");
        Matcher m = p.matcher(p_numeroTelephone);
        return m.matches();
    }
	
	//QUESTION 05
//	private static void inversionDePhrases()
//	{
//		//premi�re fa�on
//		String phrase = "Le chien a mang� la pantoufle.";
//		
//		String[] nouvellePhrase = phrase.split(" ");
//		
//		for (int i = nouvellePhrase.length - 1; i >= 0; i--) {
//			System.out.print(nouvellePhrase[i] + " ");
//		}
//		
//		System.out.println();
//		
//		//deuxi�me fa�on
//		StringTokenizer str = new StringTokenizer("Le chien a mang� la pantoufle.", " ");
//		String resultat = "";
//		while(str.hasMoreElements()) {
//		    resultat = ((String)  str.nextElement()) + " " + resultat;
//		}
//		System.out.println(resultat);
//		
//		System.out.println();
//	}
    
    private static void inversionDePhrases()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une phrase se terminant par un point :");

        String phraseOrig = scanner.nextLine();

        System.out.println(inverserUnPhrase(phraseOrig));

    }
    
    private static String inverserUnPhrase(String p_unePhrase)
    {
    	Assertion.precondition(estPhraseValide(p_unePhrase), "La phrase ne doit pas �tre vide");

        String[] tabMots = p_unePhrase.split("[ .]");

        // Enlever la majuscule
        tabMots[0] = tabMots[0].toLowerCase();

        // Mettre une majuscule au dernier mot
        tabMots[tabMots.length - 1] = mettreMajusculeAuDebut(tabMots[tabMots.length - 1]);

        StringBuilder strBuilder = new StringBuilder();

        for (int i = tabMots.length - 1; i >= 0; i--)
        {
            strBuilder.append(tabMots[i]);

            if (i > 0)
            {
                strBuilder.append(" ");

            }
            else
            {
                strBuilder.append(".");
            }
        }

        return strBuilder.toString();
    }
    
    private static boolean estPhraseValide(String p_unePhrase) {
    	return  p_unePhrase != null
    		&&	p_unePhrase.length() > 1
    		&& Character.isUpperCase(p_unePhrase.charAt(0))
    	    && p_unePhrase.charAt(p_unePhrase.length() - 1) == '.';
    }
	
	//QUESTION 06
	private static void monsieurMadame()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une phrase se terminant par un point");

        String phrase = scanner.nextLine();

        String resultat = ajouterMDevantNom(phrase);

        System.out.println(resultat);
    }
    
    private static String ajouterMDevantNom(String p_unePhrase) {
    	Assertion.precondition(estPhraseValide(p_unePhrase), "La phrase ne doit pas �tre vide");
        String[] mots = p_unePhrase.split("[ .]");

        // Verification d'une phrase vide :
        if (mots.length == 0) { throw new IllegalArgumentException("La phrase ne doit pas être vide"); }

        StringBuilder strBuilder = new StringBuilder();

        // On met directement le premier mot.
        strBuilder.append(mots[0]);

        for (int i = 1; i < mots.length; i++)
        {
        	strBuilder.append(" ");
        	
            if (Character.isUpperCase(mots[i].charAt(0)))
            {
                strBuilder.append("M. ");
            }

            strBuilder.append(mots[i]);
        }

        // Finalement, on met le point.
        strBuilder.append(".");
        
        return strBuilder.toString();
    }
	
    //QUESTION 07
	
}
