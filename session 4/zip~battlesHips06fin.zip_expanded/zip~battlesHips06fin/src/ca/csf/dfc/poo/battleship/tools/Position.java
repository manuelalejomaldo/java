/**
 * package Environnement
 */
package ca.csf.dfc.poo.battleship.tools;

/**
 * Classe représentant une position dans l'environnement.
 *
 * @author Camille Besse
 */
public class Position
{
    /**
     * Position en X
     */
    final public int X;

    /**
     * ¸ Position en Y
     */
    final public int Y;

    /**
     * Constructeur d'initialisation. Initialise un objet Position avec sa position en X et en Y
     *
     * @param p_X
     *            position en X
     * @param p_Y
     *            position en Y
     */
    public Position(int p_X, int p_Y)
    {
        this.X = p_X;
        this.Y = p_Y;
    }

    /**
     * Constructeur par copie. Initialise un objet Position avec la position en X et en Y
     *
     * @param p_p
     *            position
     */
    public Position(Position p_p)
    {
        this.X = p_p.X;
        this.Y = p_p.Y;
    }

    /**
     * Retourne l'ensemble des positions autour de la position courante.
     *
     * @return
     */
    public PosSet casesAutour()
    {
        PosSet s = new PosSet();

        for (Direction d : Direction.values())
            s.add(this.relativePos(d));

        return s;
    }

    /**
     * Calcule la distance entre la TorePosition courante et celle passée en paramètre.
     *
     * @param p_o
     *            TorePosition donc on cherche à calculer la distance.
     * @param p_d
     *            Mesure de Distance choisie.
     * @return La valeur de la mesure de la distance.
     */
    public double distance(Position p_o, Distance p_d)
    {
        return p_d.val(this, p_o);
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Position other = (Position) obj;
        if (this.X != other.X)
            return false;
        if (this.Y != other.Y)
            return false;
        return true;
    }

    /**
     * Calcule les positions dans un certain range selon une certaine mesure.
     *
     * @param p_r
     *            le range
     * @param p_d
     *            la mesure
     * @return un ensemble de positions
     */
    public PosSet getInRange(int p_r, Distance p_d)
    {
        PosSet s = new PosSet();

        for (int x = 0; x <= p_r; x++)
        {
            int y = 0;
            Position p = new Position(this.X + x, this.Y + y);

            while (p_d.inside(this, p, p_r))
            {
                s.add(p);
                s.add(new Position(this.X - x, this.Y + y));
                s.add(new Position(this.X + x, this.Y - y));
                s.add(new Position(this.X - x, this.Y - y));
                p = new Position(this.X + x, this.Y + ++y);
            }
        }
        return s;
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.X;
        result = prime * result + this.Y;
        return result;
    }

    /**
     * Retourne une nouvelle position relative selon la direction passée en paramètre.
     *
     * @param p_Direction
     *            une direction donnée
     * @return newPos une nouvelle position
     */
    public Position relativePos(Direction p_Direction)
    {
        return new Position(this.X + p_Direction.dx, this.Y + p_Direction.dy);
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "[" + this.X + "," + this.Y + "]";
    }
}
