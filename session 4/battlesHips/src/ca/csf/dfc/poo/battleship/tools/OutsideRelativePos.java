/**
 *
 */
package ca.csf.dfc.poo.battleship.tools;

/**
 * Classe d'exception pour les boules de neige détruites par les murs exterieurs.
 *
 * @author C. Besse
 */
public class OutsideRelativePos extends RuntimeException
{
    /**
    *
    */
    private static final long serialVersionUID = 483123487226136423L;

    public final LimPosition lastValid;

    /**
     * Constructeur
     *
     * @param p_arg0
     */
    public OutsideRelativePos()
    {
        super("La position ne peut être créée en dehors des limites !");
        this.lastValid = null;
    }

    /**
     * Constructeur
     *
     * @param p_lastValid
     *            Dernière position valide avant d'être entré dans le mur.
     */
    public OutsideRelativePos(LimPosition p_lastValid)
    {
        super("La position ne peut être créée en dehors des limites !");
        this.lastValid = p_lastValid;
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
