/**
 *
 */
package ca.csf.dfc.poo.battleship;

import java.lang.reflect.Constructor;
import java.util.Arrays;

import ca.csf.dfc.poo.battleship.tools.Direction;
import ca.csf.dfc.poo.battleship.tools.Distance;
import ca.csf.dfc.poo.battleship.tools.PosSet;
import ca.csf.dfc.poo.battleship.tools.Position;
import ca.csf.dfc.poo.bots.IStrategy;

/**
 * Représente un bateau. Si le bateau a été touché une fois, celui-ci prends l'eau. Il lui reste alors
 * <code>FINAL_COUNTDOWN</code> tours avant de couler complètement.
 *
 * @author Camille Besse
 */
public abstract class Ship implements Comparable<Ship>
{

    private static final int FINAL_COUNTDOWN = 50;
    private static final int VIEW_MORE = 5;

    /**
     * La Couleur du bateau
     */
    public final Couleur m_c;

    /**
     * Le plateau de jeu
     */
    protected final Ocean m_o;

    /**
     * Les positions du bateau sur le plateau
     */
    private Position[] m_p;

    /**
     * Les positions touchées du bateau
     */
    private boolean[] m_destroyed;

    /**
     * La direction du bateau sur le plateau
     */
    private Direction m_d;

    /**
     * La portée min
     */
    public final int m_minRange;
    /**
     * La portée max
     */
    public final int m_maxRange;

    /**
     * Dès que le bateau est touché, le countDown est initialisé à <code>FINAL_COUNTDOWN</code> avant le coulage
     * complet.
     */
    private int m_countDown;

    /**
     * The decider
     */
    private IStrategy m_boss;

    /**
     * Constructeur de Ship générique
     *
     * @param p_joueur
     */
    protected Ship(Ocean p_ocean, Couleur p_joueur, Position p_pos, Direction p_dir, int p_size, int p_min, int p_max)
    {
        if (p_ocean == null)
            throw new IllegalArgumentException("Ocean null");

        if (p_size <= 0)
            throw new IllegalArgumentException("taille nulle ou négative");

        this.m_c = p_joueur;
        this.m_minRange = p_min;
        this.m_maxRange = p_max;

        this.m_o = p_ocean;

        this.m_d = p_dir;

        this.m_p = new Position[p_size];
        this.m_p[0] = p_pos;
        for (int i = 1; i < p_size; i++)
            this.m_p[i] = this.m_p[i - 1].relativePos(this.m_d);

        this.m_destroyed = new boolean[p_size];

        this.m_countDown = FINAL_COUNTDOWN + 1;
    }

    
    


	/**
     * Redéfinition.
     *
     * @see java.lang.Object#clone()
     */
    @Override
    protected Ship clone()
    {
        Ship s = null;

        try
        {
            @SuppressWarnings({ "unchecked" })
            Class<Ship> c = (Class<Ship>) this.getClass();
            Constructor<Ship> constructor = c.getDeclaredConstructor(this.m_o.getClass(), this.m_c.getClass(),
                    this.m_p[0].getClass(), this.m_d.getClass());
            s = constructor.newInstance(this.m_o, this.m_c, this.m_p[0], this.m_d);
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException(
                    "IMPOSSIBLE ! Mauvais type de clone :" + this.getClass().getSimpleName());
            // No problem or else it's null.
        }
        return s;
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Ship p_p)
    {
        int i = 0, j = 0;
        for (Boolean b : this.m_destroyed)
            if (b)
                i++;
        for (Boolean b : p_p.m_destroyed)
            if (b)
                j++;

        return (i - j) + (this.m_countDown - p_p.m_countDown);
    }

    /**
     * Définit où le bateau souhaite aller. Sauf si il est bloqué ou mort.
     *
     * @return la direction choisie par le bateau dans laquelle aller. Si la direction est la même que l'originale alors
     *         il souhaite avancer, sinon il souhaite changer de direction.
     */
    public final Direction decideNextMove()
    {
        if (this.m_countDown <= FINAL_COUNTDOWN)
            this.m_countDown--;

        if (this.isAlive())
        {
            Direction move = this.nextMove();
            return move;
        }
        return null;
    }

    /**
     * Définit où le bateau souhaite tirer. Sauf si il est bloqué ou mort.
     *
     * @return la position choisie par le bateau pour tirer parmi ses positions accessibles
     */
    public final Position decideNextShoot()
    {
        if (this.isAlive())
        {
            Position shoot = this.nextShoot();
            return shoot;
        }
        return null;
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
        Ship other = (Ship) obj;
        if (this.m_c != other.m_c)
            return false;
        if (this.m_d != other.m_d)
            return false;
        if (!Arrays.equals(this.m_p, other.m_p))
            return false;
        return true;
    }

    /**
     * Retourne la couleur du bateau
     *
     * @return la couleur
     */
    public final Couleur getCouleur()
    {
        return this.m_c;
    }

    /**
     * Retourne le d.
     *
     * @return le d
     */
    public Direction getDir()
    {
        return this.m_d;
    }

    /**
     * Pour l'affichage du bateau en Console
     *
     * @return le caractère utf-8 de la pièce si elle est non détruite
     */
    public String getImage()
    {
        String i = this.getClass().getSimpleName().substring(0, 1);
        return i;
    }

    // * Retourne les positions non détruites du bateau
    /**
     * Retourne les positions
     *
     * @return la p
     */
    public final PosSet getPositions()
    {
        PosSet hs = new PosSet(Arrays.asList(this.m_p));

        // for (int i = 0; i < this.m_p.length; i++)
        // if (!this.m_destroyed[i])
        // hs.add(this.m_p[i]);

        return hs;
    }

    /**
     * Pour affichage seulement.
     *
     * @return La position de la Proue.
     */
    public Position getProue()
    {
        return this.m_p[this.m_p.length - 1];
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
        result = prime * result + ((this.m_c == null) ? 0 : this.m_c.hashCode());
        result = prime * result + ((this.m_d == null) ? 0 : this.m_d.hashCode());
        result = prime * result + Arrays.hashCode(this.m_p);
        return result;
    }

    /**
     * Définit comment le bateau peut tirer
     *
     * @return l'ensemble des positions futures de tir possibles selon sa position courante
     */
    public final PosSet inRange()
    {
        PosSet r = new PosSet();
        PosSet nr = new PosSet();

        // Calcul des position dans les cercles
        for (Position p : this.getPositions())
        {
            // Position accessibles
            r.addAll(p.getInRange(this.m_maxRange, Distance.EUCLIDEAN));
            // Positions interdites
            nr.addAll(p.getInRange(this.m_minRange, Distance.EUCLIDEAN));
        }
        // On enleve des positions accessibles les positions interdites
        r.removeAll(nr);
        // Le bateau lui meme lui est interdit.
        r.removeAll(this.getPositions());

        return r;
    }

    /**
     * Définit comment le bateau peut voir
     *
     * @return l'ensemble des positions visibles selon sa position courante
     */
    public final PosSet inView()
    {
        PosSet r = new PosSet();

        // Calcul des position dans les cercles
        for (Position p : this.getPositions())
            // Position visibles
            r.addAll(p.getInRange(this.m_maxRange + VIEW_MORE, Distance.EUCLIDEAN));

        return r;
    }

    /**
     * Retourne l'état du bateau du bateau
     *
     * @return vrai si le bateau est encore a flot.
     */
    public final boolean isAlive()
    {
        boolean a = true;
        for (Boolean b : this.m_destroyed)
            a &= b;

        return !a && this.m_countDown > 0;
    }

    /**
     * Retourne l'état du bateau à une position donnée. La position doit appartenir au bateau.
     *
     * @trows IllegalArgumentException Si la position n'est pas au bateau.
     * @return le destroyed
     */
    public boolean isDestroyed(Position p_p)
    {
        for (int i = 0; i < this.m_p.length; i++)
            if (this.m_p[i].equals(p_p))
                return this.m_destroyed[i];

        throw new IllegalArgumentException("Le bateau n'est pas à cette position.");
    }

    /**
     * Calcule les positions futures possibles pour un bateau en fonction de la direction souhaitée (avancer, reculer ou
     * tourner) selon la direction d'origine du bateau.
     *
     * @param p_d
     *            la direction du déplacement souhaitée, soit on tourne (si la direction est perpendiculaire à la
     *            direction d'origine), soit on se déplace d'une case dans la direction souhaitée (avancer, reculer).
     * @return vrai si le bateau peut effectuer le deplacement demandé, faux sinon.
     */
    protected final boolean move(Direction p_d)
    {
        if (this.isAlive() && this.m_countDown >= FINAL_COUNTDOWN && p_d != null)
        {
            Position[] newp = new Position[this.m_p.length];
            newp[0] = this.m_p[0];

            boolean notRotate = this.m_d.equals(p_d) || this.m_d.equals(p_d.inverse());
            // Calculate
            if (notRotate)
                // move in one direction
                for (int i = 0; i < this.m_p.length; i++)
                    newp[i] = this.m_p[i].relativePos(p_d);
            else
                for (int i = 1; i < this.m_p.length; i++) // Rotate of quarter
                    newp[i] = newp[i - 1].relativePos(p_d);

            // Test and Move
            if (this.m_o.areValidAndFree(new PosSet(Arrays.asList(newp)), this))
            {
                this.m_p = newp;
                if (!notRotate)
                    this.m_d = p_d;

                return true;
            }
            return false;
        }
        return false;
    }

    /**
     * Définit où le bateau touche par rapport à une position donnée.
     *
     * @return l'ensemble des positions touchée par son missile. Par défaut retourne la position donnée.
     */
    public PosSet nextBomb(Position p_p)
    {
        PosSet b = new PosSet();

        if (p_p == null)
            return b;

        b.add(p_p);
        return b;
    }

    /**
     * Définit où le bateau souhaite aller. La direction peut être null si le bateau choisit de ne pas bouger.
     *
     * @return la direction choisit par le bateau.
     */
    protected Direction nextMove()
    {
        return this.m_boss.chooseMove(this, this.m_o.getVision(this));
    }

    /**
     * Définit où le bateau souhaite tirer. La position peut être une des siennes si le bateau choisit de ne pas tirer.
     *
     * @return la position choisit par le bateau parmis ses positions de tirs possibles
     */
    protected Position nextShoot()
    {
        return this.m_boss.chooseShoot(this, this.m_o.getVision(this));
    }

    /**
     * Pour intialiser la Strategy de chaque bateau
     *
     * @param p_iStrategy
     */
    protected void setStrategy(IStrategy p_iStrategy)
    {
        if (p_iStrategy == null)
            throw new NullPointerException("La stratégie du bateau ne peut être nulle !");
        this.m_boss = p_iStrategy;
    }

    /**
     * Prévient le bateau qu'il vient de se faire tirer dessus.
     */
    // La position devait faire partie des positions du bateau.
    protected final void shootIt(Position p_p)
    {
        for (int i = 0; i < this.m_p.length; i++)
            if (p_p.equals(this.m_p[i]) && !this.m_destroyed[i])
            {
                this.m_destroyed[i] = true;

                if (this.m_countDown > FINAL_COUNTDOWN)
                    this.m_countDown--;

                return;
            }

        // throw new IllegalArgumentException("La position " + p_p + " n'appartient pas au bateau " + this);
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return this.getImage();
        // return this.getClass().getSimpleName() + " [C=" + this.m_c + ", P=" + Arrays.toString(this.m_p) + ", V="
        // + Arrays.toString(this.m_destroyed) + "]";
    }

}
