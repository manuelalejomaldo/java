/**
 *
 */
package ca.csf.dfc.poo.battleship;

import javafx.scene.paint.Color;

/**
 * Repsente les 4 couleurs possibles de joueur
 *
 * @author Camille Besse
 */
public enum Couleur
{

    ROUGE, BLEU, VERT, JAUNE;

    /**
     * Transforme la Couleur en Color.
     *
     * @param p_c
     *            la couleur à transformer.
     * @return la Color correspondante à la Couleur.
     */
    public Color toColor()
    {
        return toColor(this);
    }

    @Override
    public String toString()
    {
        return super.toString().substring(0, 1).toLowerCase();
    }

    /**
     * Transforme la Couleur en Color.
     *
     * @param p_c
     *            la couleur à transformer.
     * @return la Color correspondante à la Couleur.
     */
    public static Color toColor(Couleur p_c)
    {
        switch (p_c)
        {
            case ROUGE:
                return Color.RED;
            case BLEU:
                return Color.BLUE;
            case VERT:
                return Color.GREEN;
            case JAUNE:
                return Color.YELLOW;
            default:
                throw new RuntimeException("Couleur Invalide !");
        }
    }
}
