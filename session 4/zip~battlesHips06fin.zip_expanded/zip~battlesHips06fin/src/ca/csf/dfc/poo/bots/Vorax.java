/**
 *
 */
package ca.csf.dfc.poo.bots;

import java.util.TreeMap;

import ca.csf.dfc.poo.battleship.Couleur;
import ca.csf.dfc.poo.battleship.Ocean;
import ca.csf.dfc.poo.battleship.Ship;
import ca.csf.dfc.poo.battleship.Warfare;
import ca.csf.dfc.poo.battleship.tools.Direction;
import ca.csf.dfc.poo.battleship.tools.Position;

/**
 * @author C. Besse
 */
public class Vorax extends Weirdo
{

    /**
     * Constructeur
     *
     * @param p_c
     */
    public Vorax(Couleur p_c)
    {
        super(p_c);
    }

    /**
     * Redéfinition.
     *
     * @see ca.csf.dfc.poo.bots.IStrategy#chooseMove(ca.csf.dfc.poo.battleship.Ship, java.util.HashMap)
     */
    @Override
    public Direction chooseMove(Ship p_b, Ocean p_vision)
    {
        // representation de moi dans ma vision (qui est une copie de l'Océan réel).
        Ship me = p_vision.getShip(p_b.getPositions().iterator().next());

        if (me == null)
            System.out.println("Got a problem ! " + p_b);

        int max = p_vision.ennemyCount(p_b.m_c);

        TreeMap<Integer, Direction> t = new TreeMap<>();
        // On prends le déplacement qui maximise le nombre de cases énnemies visibles
        for (Direction d : Direction.values())
            // On tente le déplacement
            if (p_vision.move(me, d))
            {
                t.put(p_vision.ennemyCount(p_b.m_c), d);
                // On annule le dépalcement pour tester le prochain
                p_vision.move(me, d.inverse());
            }

        // On prends le plus grand s'il existe
        if (!t.isEmpty() && max < t.lastKey())
            return t.get(t.lastKey());
        // Empty set : explore
        Direction lastD = p_b.getDir();
        Direction[] choix = new Direction[] { lastD.droite(), lastD, lastD, lastD, lastD, lastD.gauche() };
        return choix[Warfare.R.nextInt(choix.length)];
    }

    /**
     * Redéfinition.
     *
     * @see ca.csf.dfc.poo.bots.IStrategy#chooseShoot(ca.csf.dfc.poo.battleship.Ship, java.util.HashMap)
     */
    @Override
    public Position chooseShoot(Ship p_b, Ocean p_vision)
    {
        TreeMap<Integer, Position> t = new TreeMap<>();

        // Pour toutes les positions accessibles
        for (Position p : p_b.inRange())
        {
            int r = 0;
            // Si je tire en AoE on compte le nombre de touche
            for (Position pp : p_b.nextBomb(p))
            {
                Ship os = p_vision.getShip(pp);
                if (os != null && !os.m_c.equals(p_b.m_c) && !os.isDestroyed(pp))
                    r++;
            }
            // et on store
            t.put(r, p);
        }

        // Si j'ai quelqu'un sur qui tirer
        if (!t.isEmpty())
            // On prends le plus haut !
            return t.lastEntry().getValue();

        return null;
    }

}
