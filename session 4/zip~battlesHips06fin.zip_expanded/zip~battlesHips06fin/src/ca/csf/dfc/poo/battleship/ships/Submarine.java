/**
 *
 */
package ca.csf.dfc.poo.battleship.ships;

import ca.csf.dfc.poo.battleship.Couleur;
import ca.csf.dfc.poo.battleship.Ocean;
import ca.csf.dfc.poo.battleship.Ship;
import ca.csf.dfc.poo.battleship.tools.Direction;
import ca.csf.dfc.poo.battleship.tools.Position;

/**
 * @author C. Besse
 */
public class Submarine extends Ship
{

    private static final int SIZE = 2;
    private static final int RANGE = 12;

    /**
     * Constructeur
     *
     * @param p_ocean
     * @param p_joueur
     * @param p_pos
     */
    public Submarine(Ocean p_ocean, Couleur p_joueur, Position p_pos, Direction p_dir)
    {
        super(p_ocean, p_joueur, p_pos, p_dir, SIZE, 0, RANGE);
    }

}
