/**
 * 
 */
package ca.csf.dfc.poo.revision.oeuvre;

import java.security.InvalidParameterException;

/**
 * @author cbesse
 */
public class Film extends Oeuvre
{
    /**
     * Pénalité de 3$ pour un jour de retad pour un film
     */
    private static final double PENALITE = 3d;

    /**
     * Le nom du réalisateur du film
     */
    private String m_Realisateur;

    /**
     * Constructeur
     * 
     * @param p_Titre
     */
    public Film(String p_Titre, String p_Realisateur)
    {
        super(p_Titre, PENALITE);
        setRealisateur(p_Realisateur);

    }

    /**
     * Pour modifier le réalisateur d'un film
     * 
     * @param p_realisateur
     */
    private void setRealisateur(String p_realisateur)
    {
        if (p_realisateur == null || p_realisateur.isEmpty())
            throw new InvalidParameterException("Le nom du réalisateur ne peut être ni null ni vide.");

        m_Realisateur = p_realisateur;

    }

    /**
     * Redéfinition.
     * 
     * @see ca.csf.dfc.poo.revision.Oeuvre#contient(java.lang.String)
     */
    @Override
    public boolean contient(String p_Mot)
    {
        return super.contient(p_Mot) || m_Realisateur.contains(p_Mot);
    }

    /**
     * Redéfinition.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Film : " + super.toString() + "[Réalisateur = " + this.m_Realisateur + "]";
    }
}
