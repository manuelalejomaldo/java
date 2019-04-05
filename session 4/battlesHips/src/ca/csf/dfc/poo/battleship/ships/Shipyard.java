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
 * Factory of ships
 *
 * @author C. Besse
 */
public class Shipyard
{

    /**
     * Renvoie un Ship de type selon le XML
     *
     * @param p_o
     *            L'océan où se situe le bateau
     * @param p_type
     *            Le type de Ship parmi les types autorisés
     * @param p_c
     *            La couleur du bateau souhaité
     * @param p_ori
     *            La position d'origine
     * @return Un bateau de la couleur souhaitée de type spécifié ou null si le type n'existe pas.
     * @see Submarine
     * @see Destroyer
     * @see Patrol
     * @see Aircraft
     * @see Aviso
     * @see Corvette
     * @see Croiseur
     * @see Fregate
     * @see Ship
     */
    public static Ship gimmeAShip(Ocean p_o, String p_type, Couleur p_c, Position p_ori, Direction p_dir)
    {
        // Ship s = null;

        // try
        // {
        // @SuppressWarnings({ "unchecked" })
        // Class<Ship> c = (Class<Ship>) Class.forName(p_type);
        // Constructor<Ship> constructor = c.getDeclaredConstructor(p_o.getClass(), p_c.getClass(), p_ori.getClass(),
        // p_dir.getClass());
        // s = constructor.newInstance(p_o, p_c, p_ori, p_dir);
        // }
        // catch (Exception e)
        // {
        // System.err.println("Mauvais type :" + p_type);
        // // No problem or else it's null.
        // }

        // return s;

        // instead of :
        switch (ShipXML.valueOf(p_type.toUpperCase()))
        {
            case SOUSMARIN:
                return new Submarine(p_o, p_c, p_ori, p_dir);
            case AVISO:
                return new Aviso(p_o, p_c, p_ori, p_dir);
            case CORVETTE:
                return new Corvette(p_o, p_c, p_ori, p_dir);
            case CROISEUR:
                return new Croiseur(p_o, p_c, p_ori, p_dir);
            case DESTROYER:
                return new Destroyer(p_o, p_c, p_ori, p_dir);
            case FREGATE:
                return new Fregate(p_o, p_c, p_ori, p_dir);
            case PATROUILLEUR:
                return new Patrol(p_o, p_c, p_ori, p_dir);
            case PORTEAVION:
                return new Aircraft(p_o, p_c, p_ori, p_dir);
            default:
                return null;
        }

    }

    private enum ShipXML
    {
        SOUSMARIN, AVISO, CORVETTE, PATROUILLEUR, FREGATE, DESTROYER, CROISEUR, PORTEAVION;
    }

}
