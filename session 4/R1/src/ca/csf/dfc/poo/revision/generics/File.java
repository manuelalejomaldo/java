/**
 *
 */
package ca.csf.dfc.poo.revision.generics;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * File Générique
 *
 * @author C. Besse
 */
public class File<T> implements Iterable<T>
{

    /*
     * Choix le plus efficace pour ajout/retrait debut/fin.
     */
    private final LinkedList<T> m_l = new LinkedList<T>();

    /**
     * Pour retirer le prochain élément de la file.
     */
    public void défiler()
    {
        if (this.estVide())
            throw new IllegalStateException("File Vide");
        this.m_l.removeFirst();
    }

    /**
     * Pour ajouter un élément dans la file.
     *
     * @param p_e
     *            élément à ajouter dans la file.
     */
    public void enfiler(T p_e)
    {
        this.m_l.addLast(p_e);
    }

    /**
     * Retourne un booléen pour déterminer si la file est présentement vide.
     *
     * @return un booléen pour déterminer si la file est présentement vide.
     */
    public boolean estVide()
    {
        return this.m_l.isEmpty();
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Iterable#iterator()
     */
    @Override
    public Iterator<T> iterator()
    {
        return this.m_l.iterator();
    }

    /**
     * @return une référence vers l’élément situé au début de la file.
     */
    public T prochain()
    {
        return this.m_l.getFirst();
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "" + this.m_l;
    }

}
