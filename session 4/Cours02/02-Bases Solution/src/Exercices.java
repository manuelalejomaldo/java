import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe regoupant les exercices.
 * 
 * @author nrichard, pfleon
 */
public class Exercices
{

    /**
     * Menu.
     */
    public static void menu()
    {
        int choix = -1;

        do
        {
            System.out.println("Menu :");
            System.out.println("1 - Moyenne");
            System.out.println("2 - Comparaison de chaines");
            System.out.println("3 - Génération de phrases");
            System.out.println("4 - Transformation de numéros de téléphone");
            System.out.println("5 - Inversion de phrases");
            System.out.println("6 - Monsieur et madame");
            System.out.println("7 - Quitter");
            System.out.println("Votre choix :");
            Scanner scanner = new Scanner(System.in);
            do
            {
                if (scanner.hasNextInt())
                {
                    choix = scanner.nextInt();
                    if (choix < 1 || choix > 7)
                    {
                        System.err.println("Valeur erronée");
                    }
                }
                else
                {
                    System.err.println("Erreur");
                }
            }
            while (choix < 1 || choix > 7);

            switch (choix)
            {
                case 1:
                    System.out.println("Pas de solution :-)");
                    break;

                case 2:
                    comparaisonDeChaines();
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
            }

            System.out.println();
        }
        while (choix != 7);

    }

    /**
     * Comparaison de chaînes de caractères.
     */
    private static void comparaisonDeChaines()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une première chaine :");
        String premiere = scanner.nextLine();

        System.out.println("Entrez une deuxième chaine :");
        String deuxieme = scanner.nextLine();

        if (premiere.compareTo(deuxieme) < 0)
        {
            System.out.println("La premiere est plus petite que la seconde");

        }
        else if (premiere.compareTo(deuxieme) > 0)
        {
            System.out.println("La deuxieme est plus petite que la premiere");

        }
        else
        {
            System.out.println("Les deux sont égales.");
        }
    }

    /**
     * Exercice sur la generation de chaînes.
     */
    private static void generationDePhrases()
    {
        String[] articles = { "le", "la", "les", "un", "quelques", "tous les" };
        String[] noms = { "chat", "chien", "souris", "table" };
        String[] verbes = { "volait", "chantait", "giguait", "volait" };
        String[] prepositions = { "vers", "dans", "sur" };

        System.out.println(genererUnPhrase(articles, noms, verbes, prepositions));

        System.out.println();
    }

    /**
     * Exercice sur la generation de chaînes.
     */
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
    
    /**
     * @param p_Mot
     * @return
     */
    public static String mettreMajusculeAuDebut(String p_Mot)
    {
        return Character.toUpperCase(p_Mot.charAt(0)) + p_Mot.substring(1, p_Mot.length());
    }

    /**
     * Methode choisissant un mot au hasard dans un tableau.
     * 
     * @param p_Mots
     *            Tableau de mots.
     * @return Un mot choisi au hasard.
     */
    private static String choisirMot(String[] p_Mots)
    {
        Random rand = new Random();
        return p_Mots[rand.nextInt(p_Mots.length)];
    }

    /**
     * Exercice sur la tranformation de numeros de telephone.
     */
    private static void transformationDeTelephones()
    {
        String numeroOriginal = "(418) 555-5555";

        String nouveauNum = formaterLeNumeroDeTelephone(numeroOriginal);

        System.out.println("Ancien numero : " + numeroOriginal);
        System.out.println("Apres transformation : " + nouveauNum);

    }
    
    private static String formaterLeNumeroDeTelephone(String p_numeroOriginal)
    {
        Assertion.precondition(estNumeroDeTelephoneValide(p_numeroOriginal), "Le format du numéro de téléphone est incorrect");
    	
        String nouveauNumero = p_numeroOriginal.substring(1);
        nouveauNumero = nouveauNumero.replaceAll("\\) ", "-");

        return nouveauNumero;
    }
    
    private static boolean estNumeroDeTelephoneValide(String p_numeroTelephone) 
    {
        Pattern p = Pattern.compile("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}");
        Matcher m = p.matcher(p_numeroTelephone);
        return m.matches();
    }

    /**
     * Exercice sur l'inversion de chaînes.
     */
    private static void inversionDePhrases()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une phrase se terminant par un point");

        String phraseOrig = scanner.nextLine();

        System.out.println(inverserUnPhrase(phraseOrig));

    }

    private static String inverserUnPhrase(String p_unePhrase)
    {
    	Assertion.precondition(estPhraseValide(p_unePhrase), "La phrase ne doit pas être vide");

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
    	return p_unePhrase != null
    		&&	p_unePhrase.length() > 1
    		&& Character.isUpperCase(p_unePhrase.charAt(0))
    	    && p_unePhrase.charAt(p_unePhrase.length() - 1) == '.';
    }
    
    /**
     * Pour l'insersion de M. ou Mme
     */
    private static void monsieurMadame()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une phrase se terminant par un point");

        String phrase = scanner.nextLine();

        String resultat = ajouterMDevantNom(phrase);

        System.out.println(resultat);
    }
    
    private static String ajouterMDevantNom(String p_unePhrase) {
    	Assertion.precondition(estPhraseValide(p_unePhrase), "La phrase ne doit pas être vide");
        String[] mots = p_unePhrase.split("[ .]");

        // Verification d'une phrase vide :
        if (mots.length == 0) { throw new IllegalArgumentException("La phrase ne doit pas Ãªtre vide"); }

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

}
