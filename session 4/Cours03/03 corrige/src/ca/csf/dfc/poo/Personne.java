package ca.csf.dfc.poo;

/**
 * Classe représentant une personne, avec son nom et son âge.
 * 
 * @author nrichard
 */
public class Personne
{

    /**
     * Âge minimal d'une personne.
     */
    public final static int ÂGE_MIN = 0;

    /**
     * Le nom de la personne.
     */
    private String m_Nom = "";

    /**
     * L'Âge de la personne.
     */
    private int m_Âge = 0;

    /**
     * Constructeur par défaut. Met un nom vide et l'âge à zéro.
     */
    public Personne()
    {
        this("", 0);
    }

    /**
     * Initialise une Personne avec le nom donné et l'âge à zéro.
     * 
     * @param p_Nom
     *            Nom de la personne
     */
    public Personne(String p_Nom)
    {
        this(p_Nom, 0);
    }

    /**
     * Initialise une Personne avec l'âge donné et un nom vide.
     * 
     * @param p_Âge
     *            Âge de la personne
     */
    public Personne(int p_Âge)
    {
        this("", p_Âge);
    }

    /**
     * Constructeur d'initialisation.
     * 
     * @param p_Nom
     *            Nom de la personne
     * @param p_Âge
     *            Âge de la personne
     */
    public Personne(String p_Nom, int p_Âge)
    {
        this.setNom(p_Nom);
        this.setÂge(p_Âge);
    }

    /**
     * Retourne le nom.
     * 
     * @return le nom
     */
    public String getNom()
    {
        return this.m_Nom;
    }

    /**
     * Pour modifier le nom.
     * 
     * @param p_Nom
     *            Nouvelle valeur.
     */
    public void setNom(String p_Nom)
    {
        if (p_Nom == null) { throw new IllegalArgumentException("Nom nul !"); }
        this.m_Nom = p_Nom;
    }

    /**
     * Retourne l'âge.
     * 
     * @return l'âge
     */
    public int getÂge()
    {
        return this.m_Âge;
    }

    /**
     * Pour modifier l'âge.
     * 
     * @param p_Âge
     *            Nouvelle valeur.
     * @throws IllegalArgumentException
     *             Si p_Âge < ÂGE_MIN.
     */
    public void setÂge(int p_Âge)
    {
        if (p_Âge < ÂGE_MIN) { throw new IllegalArgumentException("L'âge " + p_Âge + " doit être >= " + ÂGE_MIN); }
        this.m_Âge = p_Âge;
    }

    /**
     * Redéfinition.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Personne [m_Nom=" + this.m_Nom + ", m_Âge=" + this.m_Âge + "]";
    }

}
