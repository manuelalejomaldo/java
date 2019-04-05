/**
 *
 */
package ca.csf.dfc.poo.battleship.ships;

import ca.csf.dfc.poo.battleship.Couleur;
import ca.csf.dfc.poo.battleship.Ocean;
import ca.csf.dfc.poo.battleship.Ship;
import ca.csf.dfc.poo.battleship.tools.Direction;
import ca.csf.dfc.poo.battleship.tools.PosSet;
import ca.csf.dfc.poo.battleship.tools.Position;

/**
 * @author C. Besse
 */
public class Patrol extends Ship
{
    private static final int SIZE = 3;
    private static final int MINRANGE = 2;
    private static final int MAXRANGE = 6;

    /**
     * Constructeur
     *
     * @param p_ocean
     * @param p_joueur
     * @param p_pos
     */
    public Patrol(Ocean p_ocean, Couleur p_joueur, Position p_pos, Direction p_dir)
    {
        super(p_ocean, p_joueur, p_pos, p_dir, SIZE, MINRANGE, MAXRANGE);
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

        if (this.m_o.isShip(p_p) && this.m_o.shipColor(p_p) != this.getCouleur())
        {
            b.add(p_p);
            b.add(p_p.relativePos(this.m_o.shipDir(p_p)));
            b.add(p_p.relativePos(this.m_o.shipDir(p_p).inverse()));
        }

        return b;
    }

}
