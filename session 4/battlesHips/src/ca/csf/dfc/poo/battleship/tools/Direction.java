package ca.csf.dfc.poo.battleship.tools;

/**
 * Classe représentant une énumération de directions.
 * <ul>
 * <li>Nord</li>
 * <li>Sud</li>
 * <li>Est</li>
 * <li>Ouest</li>
 * </ul>
 *
 * @author Camille Besse
 */
public enum Direction
{
    /**
     * définitions de l'énumération. type de directions.
     */
    N(-1, 0), S(1, 0), E(0, 1), W(0, -1);

    public final int dx;
    public final int dy;

    private Direction(int p_dx, int p_dy)
    {
        this.dx = p_dx;
        this.dy = p_dy;
        // Merci Oli & Simon.
    }

    /**
     * Renvoie la direction relative à droite à p_dir d'un huitième de tour
     *
     * @param p_dir
     * @return
     */
    public Direction droite()
    {
        switch (this)
        {
            case N:
                return E;
            case S:
                return W;
            case W:
                return N;
            case E:
                return S;
            default:
                return null;
        }
    }

    /**
     * Renvoie la direction relative à gauche à p_dir d'un huitième de tour
     *
     * @param p_dir
     * @return
     */
    public Direction gauche()
    {
        switch (this)
        {
            case N:
                return W;
            case S:
                return E;
            case W:
                return S;
            case E:
                return N;
            default:
                return null;
        }
    }

    /**
     * Renvoie la direction inverse à p_dir
     *
     * @param p_dir
     * @return
     */
    public Direction inverse()
    {
        switch (this)
        {
            case N:
                return S;
            case S:
                return N;
            case W:
                return E;
            case E:
                return W;
            default:
                return null;
        }
    }

}
