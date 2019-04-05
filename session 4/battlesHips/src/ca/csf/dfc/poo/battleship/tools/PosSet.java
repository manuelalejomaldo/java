package ca.csf.dfc.poo.battleship.tools;

import java.util.Collection;
import java.util.HashSet;

public class PosSet extends HashSet<Position>
{
    /**
     *
     */
    private static final long serialVersionUID = 1780034146932878036L;

    /**
     * Constructeur
     */
    public PosSet()
    {
        super();
    }

    /**
     * Constructeur
     *
     * @param p_c
     */
    public PosSet(Collection<? extends Position> p_c)
    {
        super(p_c);
    }

    /**
     * Constructeur
     *
     * @param p_initialCapacity
     */
    public PosSet(int p_initialCapacity)
    {
        super(p_initialCapacity);
    }

    /**
     * Constructeur
     *
     * @param p_initialCapacity
     * @param p_loadFactor
     */
    public PosSet(int p_initialCapacity, float p_loadFactor)
    {
        super(p_initialCapacity, p_loadFactor);
    }

}
