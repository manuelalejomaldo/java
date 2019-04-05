/**
 *
 */
package ca.csf.dfc.poo.bots;

import ca.csf.dfc.poo.battleship.Couleur;
import ca.csf.dfc.poo.battleship.Ocean;
import ca.csf.dfc.poo.battleship.Ship;
import ca.csf.dfc.poo.battleship.Warfare;
import ca.csf.dfc.poo.battleship.tools.Direction;
import ca.csf.dfc.poo.battleship.tools.PosSet;
import ca.csf.dfc.poo.battleship.tools.Position;

/**
 * @author C. Besse
 */
public class Weirdo implements IStrategy
{

    public Weirdo(Couleur p_c)
    {}

    /**
     * Redéfinition.
     *
     * @see ca.csf.dfc.poo.bots.IStrategy#chooseMove(ca.csf.dfc.poo.battleship.Ship, java.util.HashMap)
     */
    @Override
    public Direction chooseMove(Ship p_b, Ocean p_vision)
    {
        return Direction.values()[Warfare.R.nextInt(Direction.values().length)];
    }

    /**
     * Redéfinition.
     *
     * @see ca.csf.dfc.poo.bots.IStrategy#chooseShoot(ca.csf.dfc.poo.battleship.Ship, java.util.HashMap)
     */
    @Override
    public Position chooseShoot(Ship p_b, Ocean p_vision)
    {
        PosSet v = p_b.inRange();
        Position[] vision = v.toArray(new Position[v.size()]);
        return vision[Warfare.R.nextInt(vision.length)];
    }

}
