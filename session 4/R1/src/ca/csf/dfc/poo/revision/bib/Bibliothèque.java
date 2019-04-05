/**
 *
 */
package ca.csf.dfc.poo.revision.bib;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import javax.management.openmbean.KeyAlreadyExistsException;

import ca.csf.dfc.poo.revision.oeuvre.Oeuvre;

/**
 * @author cbesse
 */
public class Bibliothèque extends HashMap<Long, Oeuvre>
{
    /**
     * Constructeur
     */
    public Bibliothèque()
    {}

    /**
     * Permet d'ajouter une Oeuvre à la bibliothèque
     *
     * @param p_Oeuvre
     */
    public void ajouter(Oeuvre p_Oeuvre)
    {
        if (this.containsKey(p_Oeuvre.getId()))
            throw new KeyAlreadyExistsException("LA Clé existe déjà !");
        else
            this.put(p_Oeuvre.getId(), p_Oeuvre);
    }

    /**
     * Récupère l'Oeuvre de la bibliothèque
     *
     * @param p_Id
     * @return null si l'oeuvre n'est pas dans la bibliothèque
     */
    Oeuvre getOeuvre(long p_Id)
    {
        return this.get(p_Id);
    }

    /**
     * Retourne la liste des oeuvres contenant le mot p_Mot.
     *
     * @param p_Mot
     * @return une liste vide si le mot n'est contenu dans aucune oeuvre
     */
    Collection<Oeuvre> rechercher(String p_Mot)
    {
        HashSet<Oeuvre> liste = new HashSet<Oeuvre>();

        for (Oeuvre o : this.values())
            if (o.contient(p_Mot))
                liste.add(o);

        return liste;
    }

    /**
     * Supprime l'oeuvre de la bibliothèque
     *
     * @param p_Id
     * @return
     */
    boolean supprimer(long p_Id)
    {
        return this.remove(p_Id) != null;
    }
}
