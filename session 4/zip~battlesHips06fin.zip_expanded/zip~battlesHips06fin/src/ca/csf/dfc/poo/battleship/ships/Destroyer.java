/**
 *
 */
package ca.csf.dfc.poo.battleship.ships;

import ca.csf.dfc.poo.battleship.Couleur;
import ca.csf.dfc.poo.battleship.Ocean;
import ca.csf.dfc.poo.battleship.Ship;
import ca.csf.dfc.poo.battleship.tools.Direction;
import ca.csf.dfc.poo.battleship.tools.Distance;
import ca.csf.dfc.poo.battleship.tools.PosSet;
import ca.csf.dfc.poo.battleship.tools.Position;

/**
 * @author C. Besse
 */
public class Destroyer extends Ship
{
    private static final int SIZE = 5;
    private static final int MINRANGE = 4;
    private static final int MAXRANGE = 10;
    private final int BOMBRANGE;

    /**
     * Constructeur
     *
     * @param p_ocean
     * @param p_joueur
     * @param p_pos
     */
    public Destroyer(Ocean p_ocean, Couleur p_joueur, Position p_pos, Direction p_dir)
    {
        super(p_ocean, p_joueur, p_pos, p_dir, SIZE, MINRANGE, MAXRANGE);
        this.BOMBRANGE = 3;
    }

    /**
     * Constructeur pour les sous sous classes
     *
     * @param p_ocean
     * @param p_joueur
     * @param p_pos
     * @param p_dir
     * @param p_size
     * @param p_min
     * @param p_max
     * @param p_brange
     */
    protected Destroyer(Ocean p_ocean, Couleur p_joueur, Position p_pos, Direction p_dir, int p_size, int p_min,
            int p_max, int p_brange)
    {
        super(p_ocean, p_joueur, p_pos, p_dir, p_size, p_min, p_max);
        this.BOMBRANGE = p_brange;
    }

    /**
     * Redéfinition.
     *
     * @see ca.csf.dfc.poo.battleship.Ship#nextBomb(ca.csf.dfc.poo.battleship.tools.Position)
     */
    @Override
    public PosSet nextBomb(Position p_p)
    {
        PosSet b = super.nextBomb(p_p);

        for (Position p : p_p.getInRange(this.BOMBRANGE, Distance.EUCLIDEAN))
            if (this.m_o.isShip(p_p) && this.m_o.shipColor(p_p) != this.getCouleur())
                b.add(p);

        return b;
    }
}
