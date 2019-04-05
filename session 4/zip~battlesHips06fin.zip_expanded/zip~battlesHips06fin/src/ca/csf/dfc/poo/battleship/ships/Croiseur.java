/**
 *
 */
package ca.csf.dfc.poo.battleship.ships;

import ca.csf.dfc.poo.battleship.Couleur;
import ca.csf.dfc.poo.battleship.Ocean;
import ca.csf.dfc.poo.battleship.tools.Direction;
import ca.csf.dfc.poo.battleship.tools.Position;

/**
 * @author C. Besse
 */
public class Croiseur extends Destroyer
{
    private static final int SIZE = 5;
    private static final int MINRANGE = 5;
    private static final int MAXRANGE = 12;
    private static final int BOMBRANGE = 4;

    /**
     * Constructeur
     *
     * @param p_ocean
     * @param p_joueur
     * @param p_pos
     */
    public Croiseur(Ocean p_ocean, Couleur p_joueur, Position p_pos, Direction p_dir)
    {
        super(p_ocean, p_joueur, p_pos, p_dir, SIZE, MINRANGE, MAXRANGE, BOMBRANGE);
    }

}
