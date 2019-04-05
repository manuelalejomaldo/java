/**
 *
 */
package ca.csf.dfc.poo.battleship.tools;

/**
 * Classe d'exception pour gérer les fins de partie
 *
 * @author C. Besse
 */
public class FinDePartie extends RuntimeException
{

    /**
     * Constructeur
     *
     * @param p_arg0
     */
    public FinDePartie(String p_arg0)
    {
        super(p_arg0);
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return this.getMessage();
    }

}
