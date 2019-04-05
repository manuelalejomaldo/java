package ca.csf.dfc.poo.battleship;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import ca.csf.dfc.poo.battleship.tools.Direction;
import ca.csf.dfc.poo.battleship.tools.FinDePartie;
import ca.csf.dfc.poo.battleship.tools.IllegalMoveException;
import ca.csf.dfc.poo.battleship.tools.PosSet;
import ca.csf.dfc.poo.battleship.tools.Position;
import ca.csf.dfc.poo.bots.IStrategy;

/**
 * Classe de jeu
 *
 * @author Camille Besse
 */
public class Warfare
{
    public final static Random R = new Random();

    /**
     * Le plateau de jeu
     */
    private Ocean m_o;

    /**
     * Bateaux des équipes
     */
    private HashMap<Couleur, HashSet<Ship>> m_s = new HashMap<>();

    /**
     * Nombre de tours de jeu
     */
    private int m_tour = 0;

    /**
     * Constructeur
     *
     * @param p_xml
     *            Le fichier XML à charger
     * @throws XMLStreamException
     * @throws SAXException
     * @throws IOException
     * @throws ParserConfigurationException
     */
    public Warfare(String p_xml) throws XMLStreamException, SAXException, IOException, ParserConfigurationException
    {
        this.m_o = new Ocean(p_xml);

        for (Couleur c : Couleur.values())
        {
            HashSet<Ship> s = this.m_o.getShips(c);
            if (!s.isEmpty())
                this.m_s.put(c, s);
        }
    }

    // TODO REMOVE !
    public void addObserver(PropertyChangeListener p_board)
    {
        this.m_o.addObserver(p_board);
        //m_o.notifyObservers();
    }

    /**
     * Vérifie que la partie est finie.
     */
    private void checkFinDePartie()
    {
        Couleur winner = null;
        for (Couleur c : Couleur.values())
        {
            HashSet<Ship> s = this.m_o.getShips(c);
            if (s.isEmpty())
                this.m_s.remove(c);
            else
                winner = c;
        }

        if (this.m_s.isEmpty())
            throw new FinDePartie("Égalité !");
        else if (this.m_s.size() == 1)
            throw new FinDePartie("Les " + winner + " ont gagné !");
    }

    /**
     * Retourne le tour.
     *
     * @return le tour
     */
    public int getTours()
    {
        return this.m_tour;
    }

    /**
     * Fais un tour de jeu en faisant jouer chacun des pièces dans un ordre aléatoire.
     * 
     * @throws InterruptedException
     */
    public void oneStep() throws InterruptedException
    {
        this.m_tour++;

        ArrayList<Ship> l = new ArrayList<>();

        for (Couleur c : Couleur.values())
            l.addAll(this.m_o.getShips(c));

        ArrayList<Ship> deads = new ArrayList<>();

        Collections.shuffle(l);

        for (Ship b : l)
        {
            this.checkFinDePartie();

            // D'abord on décide ou on tire :
            Position shoot = b.decideNextShoot();
            // Ensuite on décide ou on bouge :
            Direction move = b.decideNextMove();

            // Special Shoots
            if (b.inRange().contains(shoot)) // Valid range
            {
                PosSet shootin = b.nextBomb(shoot);
                for (Position p : shootin)
                {
                    Ship bs = this.m_o.getShip(p);
                    if (bs != null && bs.getCouleur() != b.getCouleur())
                        bs.shootIt(p);
                }
            }

            // On déplace le bateau si les conditions le permettent : personne d'autre sur les cases ou il veut aller.
            try
            {
                this.m_o.move(b, move);
            }
            catch (IllegalMoveException e)
            {
                // TODO Destroy boat ?
            }

            if (!b.isAlive())
            {
                this.m_o.removeShip(b);
                if (b.getCouleur() == Couleur.BLEU)
                    deads.add(b);
            }

            Thread.sleep(333);
            this.m_o.notifyObservers();
        }

        // remove dead ships from teams
        for (Couleur c : Couleur.values())
        {
            HashSet<Ship> s = this.m_o.getShips(c);
            s.removeAll(deads);
        }
    }

    /**
     * Pour définir les comportements des bateaux.
     *
     * @param p_m
     *            Association (Couleur, Comportement)
     */
    public void setBehaviors(HashMap<Couleur, IStrategy> p_m)
    {
        for (Couleur c : Couleur.values())
            if (this.m_s.get(c) != null)
                for (Ship s : this.m_s.get(c))
                    s.setStrategy(p_m.get(c));
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        StringBuilder b = new StringBuilder("Tour #" + this.m_tour);
        for (Couleur c : Couleur.values())
        {
            HashSet<Ship> s = this.m_o.getShips(c);
            b.append(" " + c.toString().charAt(0) + ":" + s.size());
        }
        b.append("\n" + this.m_o);
        return b.toString();
    }

}
