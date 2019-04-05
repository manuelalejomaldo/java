package ca.csf.dfc.poo.revision.oeuvre;

import java.security.InvalidParameterException;

/**
 * Représente un Livre dans la bibliothèque
 *
 * @author cbesse
 */
public class Livre extends Oeuvre
{
    /**
     * Pénalité de 0.5$ pour un jour de retad pour un livre
     */
    private static final double PENALITE = 0.5;

    /**
     * Le nombre de pages du Livre
     */
    private int m_NbPages;

    /**
     * Constructeur par initialisation
     *
     * @param p_Titre
     * @param p_NbPages
     */
    public Livre(String p_Titre, int p_NbPages)
    {
        super(p_Titre, PENALITE);

        this.setNbPages(p_NbPages);
    }

    /**
     * Vérifie si une oeuvre contient le mot dans
     *
     * @param p_Mot
     * @return
     */
    @Override
    public boolean contient(String p_Mot)
    {
        try
        {
            long n = Long.parseLong(p_Mot);
            return super.contient(p_Mot) || n == this.m_NbPages;
        }
        catch (NumberFormatException e)
        {
            return super.contient(p_Mot);
        }
    }

    /**
     * Renvoie le nombre de pages
     *
     * @return
     */
    public int getNbPages()
    {
        return this.m_NbPages;
    }

    /**
     * Modifie le nombre pages d'un livre
     *
     * @param p_nbPages
     */
    private void setNbPages(int p_nbPages)
    {
        if (p_nbPages < 0)
            throw new InvalidParameterException("Le nombre de page doit être positif.");

        this.m_NbPages = p_nbPages;
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Livre : " + super.toString() + "[Nb Pages = " + this.m_NbPages + "]";
    }

}
