/**
 * 
 */
package ca.csf.dfc.poo;

/**
 * @author nrichard
 */
public class Durée
{

    public final static int VALEUR_MIN = 0;

    public final static int VALEUR_MAX = 59;

    private final static int SECONDES_PAR_MINUTE = 60;

    private final static int SECONDES_PAR_HEURE = SECONDES_PAR_MINUTE * SECONDES_PAR_MINUTE;

    private int m_nbSecondes;

    private int m_nbMinutes;

    private int m_nbHeures;

    /**
     * Constructeur par défaut, crée une durée nulle.
     */
    public Durée()
    {
        this(VALEUR_MIN, VALEUR_MIN, VALEUR_MIN);

        System.out.println("Fin du const par défaut");
    }

    public Durée(int p_nbSecondes)
    {
        if(p_nbSecondes < VALEUR_MIN) {
        	
        }
    	
    	this(p_nbSecondes / SECONDES_PAR_MINUTE, p_nbSecondes % SECONDES_PAR_MINUTE);

        System.out.println("Fin du const avec secondes");
    }

    public Durée(int p_nbMinutes, int p_nbSecondes)
    {
        this((p_nbMinutes / SECONDES_PAR_MINUTE), p_nbMinutes % SECONDES_PAR_MINUTE, p_nbSecondes);

        System.out.println("Fin du const avec minutes et secondes");
    }

    /**
     * Constructeur d'initialisation.
     * 
     * @param p_nbHeures
     *            Nombre d'heures.
     * @param p_nbMinutes
     *            Nombre de minutes.
     * @param p_nbSecondes
     *            Nombre de secondes.
     */
    public Durée(int p_nbHeures, int p_nbMinutes, int p_nbSecondes)
    {
        this.setNbHeures(p_nbHeures);
        this.setNbMinutes(p_nbMinutes);
        this.setNbSecondes(p_nbSecondes);

        System.out.println("Fin du const d'init");
    }

    /**
     * Retourne le nbSecondes.
     * 
     * @return le nbSecondes
     */
    public int getNbSecondes()
    {
        return this.m_nbSecondes;
    }

    /**
     * Pour modifier le nbSecondes.
     * 
     * @param p_nbSecondes
     *            Nouvelle valeur.
     */
    public void setNbSecondes(int p_nbSecondes)
    {

        if (p_nbSecondes < VALEUR_MIN || p_nbSecondes > VALEUR_MAX) { throw new IllegalArgumentException(
                "Nb secondes invalide " + p_nbSecondes); }

        this.m_nbSecondes = p_nbSecondes;
    }

    /**
     * Retourne le nbMinutes.
     * 
     * @return le nbMinutes
     */
    public int getNbMinutes()
    {
        return this.m_nbMinutes;
    }

    /**
     * Pour modifier le nbMinutes.
     * 
     * @param p_nbMinutes
     *            Nouvelle valeur.
     */
    public void setNbMinutes(int p_nbMinutes)
    {
        if (p_nbMinutes < VALEUR_MIN || p_nbMinutes > VALEUR_MAX) { throw new IllegalArgumentException(
                "Nb minutes invalide " + p_nbMinutes); }

        this.m_nbMinutes = p_nbMinutes;
    }

    /**
     * Retourne le nbHeures.
     * 
     * @return le nbHeures
     */
    public int getNbHeures()
    {
        return this.m_nbHeures;
    }

    /**
     * Pour modifier le nbHeures.
     * 
     * @param p_nbHeures
     *            Nouvelle valeur.
     */
    public void setNbHeures(int p_nbHeures)
    {
        if (p_nbHeures < VALEUR_MIN) { throw new IllegalArgumentException("Nb heures invalide " + p_nbHeures); }
        this.m_nbHeures = p_nbHeures;
    }

    /**
     * Redéfinition.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Durée [m_nbSecondes=" + this.m_nbSecondes + ", m_nbMinutes=" + this.m_nbMinutes + ", m_nbHeures="
                + this.m_nbHeures + "]";
    }

    /**
     * Retourne le nombre de secondes équivalentes à la durée.
     */
    private int secondesTotales()
    {
        return this.getNbHeures() * SECONDES_PAR_HEURE + this.getNbMinutes() * SECONDES_PAR_MINUTE
                + this.getNbSecondes();
    }

    /**
     * Retourne la durée correspondant à la somme de l'objet courant avec p_valeur
     * 
     * @param p_valeur
     *            Durée à additionner à l'objet courant.
     * @return La somme des durées.
     */
    public Durée addition(Durée p_valeur)
    {
        if (p_valeur == null) { throw new NullPointerException("Valeur nulle dans l'addition"); }

        return new Durée(this.secondesTotales() + p_valeur.secondesTotales());
    }

    public static Durée addition(Durée p_valeur, Durée p_valeur2)
    {
        if (p_valeur == null) { throw new NullPointerException("Valeur nulle dans l'addition"); }

        return new Durée(p_valeur2.secondesTotales() + p_valeur.secondesTotales());
    }

}
