/**
 *
 */
package ca.csf.dfc.poo.revision.oeuvre;

import java.security.InvalidParameterException;

/**
 * Représente une oeuvre (abstraite) de la bibliothèque. Elle a un titre et un numéro d'identification.
 *
 * @author cbesse
 */
public abstract class Oeuvre
{
    /**
     * Le Titre d'une Oeuvre
     */
    private String m_Titre;

    /**
     * Penalité de retard sur une oeuvre
     */
    private final double m_penalite;

    /**
     * L'Identificateur d'oeuvre
     */
    private static long m_Id_gen = 0;

    /**
     * l'identificateur de l'oeuvre
     */
    private long m_Id;

    /**
     * Constructeur
     *
     * @param p_Titre
     * @param p_penalite
     */
    protected Oeuvre(String p_Titre, double p_penalite)
    {
        this.setTitre(p_Titre);

        this.m_Id = ++m_Id_gen;
        this.m_penalite = p_penalite;
    }

    /**
     * Calcul la pénalité de retard d'une oeuvre en focntion du nombre de jours de retard
     *
     * @param p_NbJours
     * @return La pénalité occasionnée par le nombre de jours de retard
     */
    public double calculerRetard(int p_NbJours)
    {
        if (p_NbJours < 0)
            throw new InvalidParameterException("Le nombre de jours de retard ne peut être négatif.");

        return p_NbJours * this.m_penalite;

    }

    /**
     * Vérifie si une oeuvre contient le mot dans
     *
     * @param p_Mot
     * @return
     */
    public boolean contient(String p_Mot)
    {
        return this.getTitre().contains(p_Mot);
    }

    @SuppressWarnings("unused")
    @Override
    public boolean equals(Object p_obj)
    {
        Oeuvre o = null;
        if (p_obj instanceof Oeuvre)
            o = (Oeuvre) p_obj;
        else
            return false;

        if (o != null)
            return this.m_Id == o.m_Id;
        return false;
    }

    /**
     * Renvoie l'Id de l'oeuvre
     *
     * @return L'Id de l'oeuvre
     */
    public long getId()
    {
        return this.m_Id;
    }

    /**
     * Renvoie le Titre de l'Oeuvre
     *
     * @return Le Titre de l'Oeuvre
     */
    public String getTitre()
    {
        return this.m_Titre;
    }

    /**
     * Permet la modification du Titre de l'Oeuvre
     *
     * @param p_Titre
     *            LE nouveau titre de l'oeuvre
     */
    protected void setTitre(String p_Titre)
    {
        if (p_Titre == null || p_Titre.isEmpty())
            throw new InvalidParameterException();

        this.m_Titre = p_Titre;
    }

    @Override
    public String toString()
    {
        return "[Titre = " + this.m_Titre + "]";
    }

}
