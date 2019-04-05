package ca.csf.dfc.poo.battleship.tools;

/**
 * Énumération des mesures de distance possible : MANHATTAN, CHEBYSHEV, EUCLIDEAN
 *
 * @author C. Besse
 */
public enum Distance
{
    MANHATTAN, CHEBYSHEV, EUCLIDEAN;

    /**
     * ¸ Dit si oui ou non, deux positions sont à une certain range selon un mesure donnée.
     *
     * @param p_p1
     *            Position 1
     * @param p_p2
     *            Position 2
     * @param p_d
     *            La mesure choisie
     * @param p_r
     *            la distance
     * @return vrai si p1 est à moins que p_r de p2 selon la mesure choisie
     */
    public boolean inside(Position p_p1, Position p_p2, int p_r)
    {
        return this.val(p_p1, p_p2) <= p_r;
    }

    /**
     * Calcule la valeur de la distance entre deux positions données
     *
     * @param p_p1
     *            Position 1
     * @param p_p2
     *            Position 2
     * @return La valeur de la distance entre p_p1 et p_p2
     */
    public double val(Position p_p1, Position p_p2)
    {
        int dx = Math.abs(p_p1.X - p_p2.X);
        int dy = Math.abs(p_p1.Y - p_p2.Y);
        switch (this)
        {
            case MANHATTAN:
                return dx + dy;
            case CHEBYSHEV:
                return Math.max(dx, dy);
            default:
                return Math.hypot(dx, dy);
        }
    }
}
