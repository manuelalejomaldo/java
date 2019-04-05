package ca.csf.dfc.poo;

/**
 * Classe pour le main().
 * 
 * @author nrichard
 */
public class Main
{

    /**
     * Le main du programme.
     */
    public static void main(String[] args)
    {
        Personne p1 = new Personne();
        Personne p2 = new Personne("Bob");
        Personne p3 = new Personne(32);

        Personne p4 = new Personne("Bill", 47);

        p4.setNom("bob");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        /*
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.println("Entrez l'âge :"); int âge = scanner.nextInt();
         * 
         * if (âge < Personne.ÂGE_MIN) { System.err.println("Erreur !"); }
         */

        Durée d = new Durée(-99);

        // Durée d2 = new Durée(243, 17, 7);
    }

}
