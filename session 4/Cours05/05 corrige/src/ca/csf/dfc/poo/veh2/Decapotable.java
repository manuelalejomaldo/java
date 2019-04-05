package ca.csf.dfc.poo.veh2;

/**
 * Cette classe decrit un decapotable et herite de la classe Voiture
 * 
 * @author Naima & Camille
 */
public class Decapotable extends Voiture
{

    /**
     * Valeur constante donnant l'etat du toit du decapotable ouvert ou ferme.
     */
    private static boolean TOIT_FERME = true;

    /**
     * Valeur constante de vitesse max d'une décapotable par défaut
     */
    private static int VITESSE_MAX = 120;
    /**
     * Donnee membre indiquant l'etat du toit du decapotable.
     */
    private boolean m_etatToit;

    /**
     * Constructeur qui initialise un decapotable avec le nom du proprietaire, no de plaque, vitesse et p_Toit.
     * 
     * @param p_Nom
     *            , p_noPlaq, p_Vitesse :nouvelles valeurs.
     */
    public Decapotable(String p_Nom, String p_Plaque)
    {
        super(p_Nom, p_Plaque, Decapotable.VITESSE_MAX);

        this.setEtatToit(TOIT_FERME);
    }

    /**
     * Constructeur qui initialise un decapotable avec le nom du proprietaire, no de plaque, vitesse et p_Toit.
     * 
     * @param p_Nom
     *            , p_noPlaq, p_VitesseMax, :nouvelles valeurs.
     */
    public Decapotable(String p_Nom, String p_Plaque, int p_VitesseMax)
    {
        super(p_Nom, p_Plaque, p_VitesseMax);

        this.setEtatToit(TOIT_FERME);
    }

    /**
     * Retourne la valeur de l'etat du toit ouvert ou ferme
     * 
     * @return the m_etatToit
     */
    public boolean getEtatToit()
    {
        return m_etatToit;
    }

    /**
     * Modifie l'etat du toit du decapotable
     * 
     * @param p_toit
     *            the m_etatToit Nouvelle valeur.
     */
    private void setEtatToit(boolean p_toit)
    {
        m_etatToit = p_toit;
    }

    /**
     * Methode qui permet d'ouvrir le toit
     */
    public void ouvrirToit()
    {
        if (this.getVitesse() <= 10)
        {
            if (this.getEtatToit() == TOIT_FERME)
            {
                this.setEtatToit(!TOIT_FERME);
            }
            else
            {
                throw new IllegalStateException("Le toit est dejà ouvert!");
            }
        }
        else
        {
            throw new IllegalStateException("Operation non permise: vitesse>10km/h!");
        }

    }

    /**
     * Methode qui permet de fermer le toit
     */
    public void fermerToit()
    {
        if (this.getVitesse() <= 10)
        {
            if (this.getEtatToit() == !TOIT_FERME)
            {
                this.setEtatToit(TOIT_FERME);
            }
            else
            {
                throw new IllegalStateException("Le toit est dejà ferme!");
            }
        }
        else
        {

            throw new IllegalStateException("Operation non permise: vitesse>10km/h!");
        }

    }

    /**
     * Methode qui permet l'affichage d'un objet de type Decapotable.
     */
    @Override
    public String toString()
    {

        String etatToit;

        if (this.getEtatToit() == TOIT_FERME)
        {
            etatToit = "Toit ferme.";
        }
        else
        {
            etatToit = "Toit ouvert.";
        }
        return super.toString() + " , " + etatToit + " , " + "Vitesse max: " + Decapotable.VITESSE_MAX;
    }

}
