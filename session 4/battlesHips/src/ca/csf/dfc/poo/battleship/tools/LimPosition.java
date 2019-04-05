/**
 *
 */
package ca.csf.dfc.poo.battleship.tools;

import java.util.ArrayList;

/**
 * @author C. Besse
 */
public class LimPosition extends Position
{

    /**
     * Hauteur de la carte
     */
    public final int mh;
    /**
     * Largeur de la carte
     */
    public final int ml;

    /**
     * Constructeur
     *
     * @param p_X
     * @param p_Y
     */
    public LimPosition(int p_X, int p_Y, int p_mH, int p_mL)
    {
        super(p_X, p_Y);

        this.mh = p_mH;
        this.ml = p_mL;

        if (!LimPosition.inLimits(p_X, p_Y, p_mH, p_mL))
            throw new IllegalStateException("La position ne peut être créée en dehors des limites !");

    }

    /**
     * Constructeur
     *
     * @param p_X
     * @param p_Y
     */
    public LimPosition(LimPosition p_p)
    {
        super(p_p.X, p_p.Y);
        this.mh = p_p.mh;
        this.ml = p_p.ml;
    }

    /**
     * Constructeur
     *
     * @param p_X
     * @param p_Y
     */
    public LimPosition(Position p_p, int p_mH, int p_mL)
    {
        super(p_p);
        this.mh = p_mH;
        this.ml = p_mL;
        if (!LimPosition.inLimits(p_p.X, p_p.Y, p_mH, p_mL))
            throw new IllegalArgumentException("La position ne peut être créée en dehors des limites !");
    }

    /**
     * Retourne l'ensemble des positions autour de la position courante dans le cadre des limites
     *
     * @return
     */
    @Override
    public PosSet casesAutour()
    {
        PosSet s = new PosSet();

        for (Position p : super.casesAutour())
            if (LimPosition.inLimits(p.X, p.Y, this.mh, this.ml))
                s.add(new LimPosition(p, this.mh, this.ml));
        return s;
    }

    /**
     * Calcule les position dans le range d'une certaine distance en dedans des limites
     *
     * @param p_r
     * @return
     */
    @Override
    public PosSet getInRange(int p_r, Distance p_d)
    {
        PosSet s = new PosSet();

        for (Position p : super.getInRange(p_r, p_d))
            if (LimPosition.inLimits(p.X, p.Y, this.mh, this.ml))
                s.add(new LimPosition(p.X, p.Y, this.mh, this.ml));
        return s;
    }

    /**
     * Fonction de verification d'interiorité de limites
     *
     * @return vrai si en dedans des limites
     */
    public boolean inLimits()
    {
        return (this.X >= 0 && this.X < this.mh && this.Y >= 0 && this.Y < this.ml);
    }

    /**
     * Redéfinition.
     *
     * @see ca.csf.dfc.poo.crazyships.Position#relativePos(ca.csf.dfc.poo.env.utils.Direction)
     */
    @Override
    public Position relativePos(Direction p_Direction)
    {
        Position p = super.relativePos(p_Direction);

        if (!LimPosition.inLimits(p.X, p.Y, this.mh, this.ml))
            throw new OutsideRelativePos(this);

        return new LimPosition(p.X, p.Y, this.mh, this.ml);
    }

    /**
     * Retourne un chemin de positions relatives selon la direction passée en paramètre et le nombre de cases
     * effectuées.
     *
     * @param p_Direction
     *            La direction dans laquelle on va
     * @param p_speed
     *            La vitesse à laquelle on y va.
     * @return La liste de toutes les positions relatives
     */
    public ArrayList<LimPosition> relativePos(Direction p_Direction, int p_speed)
    {
        int steps = p_speed;
        ArrayList<LimPosition> ap = new ArrayList<>();
        Position p = this;

        // Cas vitesse nulle
        if (p_speed < 1)
            return ap;

        do
        {
            Position newP = p.relativePos(p_Direction);
            if (!LimPosition.inLimits(p.X, p.Y, this.mh, this.ml))
                throw new OutsideRelativePos((LimPosition) p);
            p = newP;

            ap.add(new LimPosition(p.X, p.Y, this.mh, this.ml));
            steps--;
        }
        while (steps > 0);

        return ap;
    }

    /**
     * Fonction de verification d'interiorité de limites
     *
     * @param p_x
     *            Une ligne
     * @param p_y
     *            Une colonne
     * @param p_mH
     *            max Ligne
     * @param p_mL
     *            max Colonne
     * @return vrai si en dedans des limites
     */
    public static boolean inLimits(int p_x, int p_y, int p_mH, int p_mL)
    {
        return (p_x >= 0 && p_x < p_mH && p_y >= 0 && p_y < p_mL);
    }

    /**
     * Fonction de verification d'interiorité de limites
     *
     * @param p
     *            une position
     * @param p_mH
     *            max Ligne
     * @param p_mL
     *            max Colonne
     * @return vrai si en dedans des limites
     */
    public static boolean inLimits(Position p, int p_mH, int p_mL)
    {
        return inLimits(p.X, p.Y, p_mH, p_mL);
    }

}
