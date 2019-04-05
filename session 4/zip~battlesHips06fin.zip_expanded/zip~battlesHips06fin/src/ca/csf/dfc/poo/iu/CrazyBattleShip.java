/**
 *
 */
package ca.csf.dfc.poo.iu;

import java.util.HashMap;

import ca.csf.dfc.poo.battleship.Couleur;
import ca.csf.dfc.poo.battleship.Warfare;
import ca.csf.dfc.poo.battleship.tools.FinDePartie;
import ca.csf.dfc.poo.bots.IStrategy;
import ca.csf.dfc.poo.bots.Vorax;

/**
 * @author C. Besse
 */
public class CrazyBattleShip
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        HashMap<Couleur, IStrategy> a = new HashMap<>();
        // a.put(Couleur.BLEU, new Weirdo(Couleur.BLEU));
        // a.put(Couleur.JAUNE, new Weirdo(Couleur.JAUNE));
        // a.put(Couleur.ROUGE, new Weirdo(Couleur.ROUGE));
        // a.put(Couleur.VERT, new Weirdo(Couleur.VERT));
        a.put(Couleur.BLEU, new Vorax(Couleur.BLEU));
        a.put(Couleur.JAUNE, new Vorax(Couleur.JAUNE));
        a.put(Couleur.ROUGE, new Vorax(Couleur.ROUGE));
        a.put(Couleur.VERT, new Vorax(Couleur.VERT));

        Warfare e = null;

        try
        {
            // e = new Warfare("src/res/BattleShip1.xml");
            e = new Warfare("src/res/BattleShip2.xml");
            // e = new Warfare("src/res/BattleShip3.xml");
            // e = new Warfare("src/res/BattleShip4.xml");
            e.setBehaviors(a);
            while (e.getTours() < 1000)
            {
                e.oneStep();
                Thread.sleep(1000);
                System.out.println(e);
            }

        }
        catch (FinDePartie ex)
        {
            System.out.println(e + ": " + ex);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }

}
