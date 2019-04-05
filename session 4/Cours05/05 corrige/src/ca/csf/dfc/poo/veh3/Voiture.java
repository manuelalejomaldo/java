package ca.csf.dfc.poo.veh3;

/**
 * Classe representant une voiture
 * 
 * @author Naima & Camille
 */
public class Voiture implements Comparable<Voiture>
{

    /**
     * Valeur minimale de la vitesse.
     */

    public final static int VITESSE_MIN = 0;

    /**
     * Valeur initiale du no de plaque.
     */
    public final static String NO_PLAQUE = "xxxxxx";

    /**
     * Valeur initiale du nom du proprietaire.
     */
    public final static String NOM_PAR_DEFAUT = "";

    /**
     * Valeur maximale de la vitesse de la voiture.
     */
    public final static int VITESSE_MAX = 100;

    /**
     * Donnee membre indiquant le numero de plaque de la voiture.
     */
    private String m_noPlaque;

    /**
     * Donnee membre indiquant le nom du proprietaire de la voiture.
     */
    private String m_nomProprietaire;

    /**
     * Donnee membre indiquant la vitesse de la voiture.
     */
    private int m_vitesse;

    /**
     * Constructeur par defaut.
     */
    public Voiture()
    {
        this.m_noPlaque = NO_PLAQUE;
        this.m_nomProprietaire = NOM_PAR_DEFAUT;
        this.m_vitesse = VITESSE_MIN;
    }

    /**
     * Constructeur qui initialise une Voiture avec le nom du proprietaire, no de plaque et vitesse
     * 
     * @param p_Nom
     *            , p_noPlaque, p_Vitesse
     */
    public Voiture(String p_Nom, String p_noPlaque)
    {
        this.setNomProprietaire(p_Nom);
        this.setNoPlaque(p_noPlaque);
    }

    /**
     * Retourne le numero de plaque
     */
    public String getNoPlaque()
    {
        return m_noPlaque;
    }

    /**
     * Pour modifier le numero de plaque.
     * 
     * @param p_noPlaque
     *            la nouvelle valeur.
     */
    public void setNoPlaque(String p_noPlaque)
    {
        if (p_noPlaque == null) { throw new IllegalArgumentException("Le no de plaque est nul!"); }
        m_noPlaque = p_noPlaque;
    }

    /**
     * Retourne le nom du proprietaire
     * 
     * @return the m_nomProprietaire
     */
    public String getNomProprietaire()
    {
        return m_nomProprietaire;
    }

    /**
     * Modifie le nom du proprietaire
     * 
     * @param p_proprietaire
     *            la nouvelle valeur.
     */
    public void setNomProprietaire(String p_proprietaire)
    {
        if (p_proprietaire == null) { throw new IllegalArgumentException("Le nom est nul!"); }
        this.m_nomProprietaire = p_proprietaire;
    }

    /**
     * Retourne la vitesse;
     * 
     * @return the m_vitesse
     */
    public int getVitesse()
    {
        return m_vitesse;
    }

    /**
     * Methode qui definit l'acceleration de Voiture L'acceleration se fait par tranches de 10km/h jusqu'à un maximum de
     * 100km/h.
     */
    public void accelerer()
    {

        if (this.m_vitesse + 10 < this.getVitesseMax())
        {
            this.m_vitesse += 10;
        }
        else
        {
            throw new IllegalStateException("La vitesse ne peut pas exceder " + this.getVitesseMax() + "km/h!");
        }

    }

    /**
     * Renvoie la vitesse max possible du vehicule
     * 
     * @return La vitesse max
     */
    public int getVitesseMax()
    {
        return Voiture.VITESSE_MAX;
    }

    /**
     * Methode qui definit le ralentissement de Voiture Le ralentissement se fait par tranches de 10 jusqu'à atteindre
     * 0.
     */
    public void ralentir()
    {

        if (this.m_vitesse - 10 > VITESSE_MIN)
        {
            this.m_vitesse -= 10;
        }
        else
        {
            throw new IllegalStateException("La vitesse ne peut pas être  reduite davantage!");
        }
    }

    /**
     * Methode qui permet l'affichage des donnees membres.
     */
    public String toString()
    {
        return ("Nom: " + this.m_nomProprietaire + " , " + "No plaque: " + this.m_noPlaque + " , " + "Vitesse: " + this.m_vitesse);
    }

    /**
     * Methode qui compare les vitesses de deux voitures.
     */
    @Override
    public int compareTo(Voiture p_AutreVoitu)
    {

        return new Integer(this.m_vitesse).compareTo(p_AutreVoitu.m_vitesse);

    }

    /**
     * Methode qui compare si deux objets sont egaux.
     */
    @Override
    public boolean equals(Object p_obj)
    {

        boolean est_Egal = false;
        if (p_obj instanceof Voiture)
        {
            Voiture voitu = (Voiture) p_obj;
            est_Egal = this.getNoPlaque().equals(voitu.getNoPlaque())
                    && this.getNomProprietaire().equals(voitu.getNomProprietaire());

        }
        return est_Egal;
    }

}
