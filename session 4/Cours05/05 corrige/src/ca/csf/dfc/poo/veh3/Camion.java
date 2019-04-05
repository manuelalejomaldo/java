package ca.csf.dfc.poo.veh3;

/**
 * Cette classe decrit un camion et herite de la classe Voiture
 *
 * @author Naima & Camille.
 */
public class Camion extends Voiture
{

    /**
     * Valeur constante de l'attache-remorque signifiant pas de remorque.
     */
    private static boolean ATTACHE_REM_VIDE = true;

    /**
     * Valeur constante de vitesse max d'un Camion
     */
    private static int VITESSE_MAX = 80;

    /**
     * Donnee membre indiquant l'existence d'une attache-remorque.
     */
    private boolean m_attacheRemorq;

    /**
     * Constructeur par defaut
     */
    public Camion()
    {
        this.setAttacheRemorq(ATTACHE_REM_VIDE);
    }

    /**
     * Constructeur qui initialise un camion avec le nom du proprietaire, no de plaque, vitesse et attache-remorque
     *
     * @param p_Nom
     *            , p_noPlaq, p_Vitesse, p_attacheRem: nouvelles valeurs.
     */
    public Camion(String p_Nom, String p_noPlaq)
    {
        super(p_Nom, p_noPlaq);
        this.setAttacheRemorq(ATTACHE_REM_VIDE);

    }

    /**
     * Methode qui definit l'attachement d'une remorque
     */
    public boolean attacher()
    {
        this.setAttacheRemorq(!ATTACHE_REM_VIDE);
        return (this.getAttachRemorq());
    }

    /**
     * Methode qui definit le detachement d'une remorque
     */
    public boolean detacher()
    {
        this.setAttacheRemorq(ATTACHE_REM_VIDE);
        return (this.getAttachRemorq());
    }

    /**
     * @return le attacheRemorq.
     */
    private boolean getAttachRemorq()
    {
        return this.m_attacheRemorq;
    }

    /**
     * Redéfinition.
     *
     * @see ca.csf.dfc.poo.veh3.Voiture#getVitesseMax()
     */
    @Override
    public int getVitesseMax()
    {
        return Camion.VITESSE_MAX;
    }

    /**
     * Pour modifier le attacheRemorq.
     *
     * @param p_attacheRemorq
     *            : Nouvelle valeur
     */
    protected void setAttacheRemorq(boolean p_attacheRemorq)
    {
        this.m_attacheRemorq = p_attacheRemorq;
    }

    /**
     * Methode qui permet l'affichage d'un objet de type camion.
     */
    @Override
    public String toString()
    {

        String remorqAttachee;

        if (this.getAttachRemorq() == ATTACHE_REM_VIDE)
            remorqAttachee = "Aucune remorque attachee.";
        else
            remorqAttachee = "Une remorque attachee.";
        return super.toString() + " , " + remorqAttachee + " , " + "Vitesse max: " + Camion.VITESSE_MAX;
    }

}
