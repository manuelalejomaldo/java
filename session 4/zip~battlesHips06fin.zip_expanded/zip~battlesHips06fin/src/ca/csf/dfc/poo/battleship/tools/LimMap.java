/**
 *
 */
package ca.csf.dfc.poo.battleship.tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Représente une carte emmurée de l'environnement version utilisant une HashMap.
 *
 * @author C. Besse
 * @param <E>
 *            Élément de ma carte rectangulaire
 */
public class LimMap<E> extends HashMap<LimPosition, E> implements Iterable<E>
{

    /**
     *
     */
    private static final long serialVersionUID = -4792942095752227047L;

    /**
     * La hauteur max
     */
    public final int H;

    /**
     * La largeur max
     */
    public final int L;

    /**
     * Constructeur
     *
     * @param p_h
     *            La hauteur de la map
     * @param p_l
     *            La largeur de la map
     */
    public LimMap(int p_h, int p_l)
    {
        this.H = p_h;
        this.L = p_l;
    }

    /**
     * Retourne l'ensemble des éléments à la position autour de la position courante accessible (hors limite et occupées
     * ne sont pas considérées)
     *
     * @return un ensemble de positions accessibles autour de la position considérée
     */
    public HashSet<E> casesAutour(LimPosition p_p)
    {
        HashSet<E> s = new HashSet<>();

        for (Position p : p_p.casesAutour())
            if (!this.containsKey(p))
                s.add(this.get(p));

        return s;
    }

    /**
     * Renvoie la carte sous forme de tableau d'entier d'accessibilité (0 pour non accessible)
     *
     * @return un tableau 2D de la map
     */
    public int[][] getMaze()
    {
        int[][] maze = new int[this.H][this.L];
        for (int x = 0; x < this.H; x++)
            for (int y = 0; y < this.L; y++)
            {
                LimPosition p = new LimPosition(x, y, this.H, this.L);
                if (!this.containsKey(p))
                    maze[x][y] = 0;
                else
                    maze[x][y] = 1;

            }
        return maze;
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Iterable#iterator()
     */
    @Override
    public Iterator<E> iterator()
    {
        return this.values().iterator();
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("    ");
        // Centaines
        for (int i = 0; i < this.L; i++)
            if (i < 100)
                s.append(" ");
            else
                s.append("" + i / 100);
        // Dizaines
        s.append("\n    ");
        for (int i = 0; i < this.L; i++)
            if (i < 10)
                s.append(" ");
            else if (i < 100)
                s.append("" + i / 10);
            else
                s.append("" + (i % 100) / 10);

        // Unités
        s.append("\n    ");
        for (int i = 0; i < this.L; i++)
            s.append("" + i % 10);

        s.append("\n   \u250C");
        for (int i = 0; i < this.L; i++)
            s.append("\u2500");
        s.append("\u2510\n");

        for (int x = 0; x < this.H; x++)
        {
            if (x < 10)
                s.append("  " + x);
            else if (x < 100)
                s.append(" " + x);
            else
                s.append("" + x);

            s.append("\u2502");
            for (int y = 0; y < this.L; y++)
                if (this.get(new LimPosition(x, y, this.H, this.L)) != null)
                    s.append(this.get(new LimPosition(x, y, this.H, this.L)));
                else
                    s.append("X");
            s.append("\u2502\n");
        }
        s.append("   \u2514");
        for (int i = 0; i < this.L; i++)
            s.append("\u2500");
        s.append("\u2518\n");

        return s.toString();
    }

}
