/**
 *
 */
package ca.csf.dfc.poo.bots;

import ca.csf.dfc.poo.battleship.Ocean;
import ca.csf.dfc.poo.battleship.Ship;
import ca.csf.dfc.poo.battleship.tools.Direction;
import ca.csf.dfc.poo.battleship.tools.Position;

/**
 * Représente l'interface nécessaire pour pouvoir diriger un bateau. <br>
 * L'océan n'étant pas modifiables par qqun exterieur au package, celles ci sont protégées.
 *
 * @author C. Besse
 */
public interface IStrategy
{
    /**
     * Détermine l'action à faire en fonction de l'objectif courant et de la vision courante du bateau
     *
     * @param p_b
     *            Le bateau
     * @param p_vision
     *            Vision courante du bateau
     * @return Une action
     */
    public Direction chooseMove(Ship p_b, Ocean p_vision);

    /**
     * Détermine l'action à faire en fonction de l'objectif courant et de la vision courante du bateau
     *
     * @param p_b
     *            Le bateau
     * @param p_vision
     *            Vision courante du bateau
     * @return Une action
     */
    public Position chooseShoot(Ship p_b, Ocean p_vision);

}
