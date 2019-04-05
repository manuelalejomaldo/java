/**
 * package Ocean
 */
package ca.csf.dfc.poo.battleship;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import ca.csf.dfc.poo.battleship.ships.Shipyard;
import ca.csf.dfc.poo.battleship.tools.Direction;
import ca.csf.dfc.poo.battleship.tools.IllegalMoveException;
import ca.csf.dfc.poo.battleship.tools.LimMap;
import ca.csf.dfc.poo.battleship.tools.LimPosition;
import ca.csf.dfc.poo.battleship.tools.PosSet;
import ca.csf.dfc.poo.battleship.tools.Position;
import ca.csf.dfc.poo.battleship.tools.PropertyObservable;

/**
 * Classe représentant un plateau
 *
 * @author Camille Besse
 */
public class Ocean extends PropertyObservable<Ocean> implements Iterable<LimPosition>
{
    /**
     * Constantes pour la lecture du fichier XML
     */
    private final static String ELM_BATTLE = "battleship";
    private final static String ELM_GRILLE = "grille";
    private final static String ATTR_HEIGHT = "hauteur";
    private final static String ELM_EQUIPE = "equipe";
    private final static String ELM_BATEAU = "bateau";
    private final static String ATTR_TYPE = "type";
    private final static String ATTR_X = "x";
    private final static String ATTR_Y = "y";
    private final static String ATTR_DIR = "dir";

    /**
     * Ocean de Jeu
     */
    private LimMap<Ship> m_Map;

    /**
     * La hauteur du plateau
     */
    public final int H;

    /**
     * Constructeur de copie.
     *
     * @param p_ocean
     */
    private Ocean(Ocean p_ocean)
    {
        this.H = p_ocean.H;
        this.m_Map = new LimMap<>(this.H, 2 * this.H);
        for (Entry<LimPosition, Ship> e : p_ocean.m_Map.entrySet())
            this.m_Map.put(e.getKey(), e.getValue().clone());
    }

    /**
     * Constructeur d'initialisation. Initialise un objet Ocean
     *
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     * @throws XMLStreamException
     */
    public Ocean(String p_xml) throws XMLStreamException, SAXException, IOException, ParserConfigurationException
    {
        this.H = this.initXML(p_xml);
        this.notifyObservers();
    }

    /**
     * Ajoute un bateau à l'océan après retrait ou en début de partie.
     *
     * @param p_b
     *            Ship à ajouter
     * @param p_height
     *            la hauteur de l'océan (pourrait ne pas être initialisé si on est dans le ctor)
     */
    private void addShip(Ship p_b, int p_height)
    {
        for (Position pp : p_b.getPositions())
        {
            LimPosition p = new LimPosition(pp, p_height, 2 * p_height);
            if (this.m_Map.get(p) != null)
                throw new IllegalMoveException(
                        "A ship (" + p_b + ") tried to run over another ship (" + this.m_Map.get(p) + ")  on : " + p);
            this.m_Map.put(p, p_b);
        }
    }

    /**
     * Retourne vrai si l'ensemble des positions p_Pos ne contient que des positions valides pour le plateau (comprise
     * dans les bornes du plateau)
     *
     * @param p_Pos
     *            un ensemble de positions données
     * @return vrai ou faux
     */
    public boolean areValid(PosSet p_Pos)
    {
        boolean b = true;
        for (Position p : p_Pos)
            b &= LimPosition.inLimits(p, this.H, 2 * this.H);

        return b;
    }

    /**
     * Retourne vrai si l'ensemble des positions p_Pos ne contient que des positions valides et libres pour le plateau
     * (comprise dans les bornes du plateau et sans bateau sur aucune des position)
     *
     * @param p_Pos
     *            un ensemble de positions données
     * @return vrai ou faux
     */
    public boolean areValidAndFree(PosSet p_Pos, Ship p_b)
    {
        boolean b = this.areValid(p_Pos);
        if (b)
            for (Position p : p_Pos)
                b &= ((this.getShip(p) == null) || this.getShip(p).equals(p_b));

        return b;
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Object#clone()
     */
    @Override
    public Ocean clone()
    {
        return new Ocean(this);
    }

    /**
     * Renvoie le nombre de cases ennemies à la couleur dans l'Océan
     *
     * @param p_c
     *            La couleur alliée
     * @return Le nombre de positions ennemies dans l'Océan
     */
    public int ennemyCount(Couleur p_c)
    {
        return this.m_Map.entrySet().stream().filter(p -> !p.getValue().getCouleur().equals(p_c))
                .collect(Collectors.toList()).size();
    }

    /**
     * Fonction qui retourne la hauteur/largeur du plateau carré
     *
     * @return hauteur du plateau
     */
    public int getHeight()
    {
        return this.H;
    }

    /**
     * Retourne le bateau à une position donnée et null si en dehors des frontières.
     *
     * @param p_Pos
     *            Position de la case
     * @return Le bateau à cette position
     */
    public Ship getShip(Position p_Pos)
    {
        return this.m_Map.get(p_Pos);
    }

    /**
     * Parcours le plateau et renvoie l'ensemble des bateaux d'un joueur.
     *
     * @param p_c
     *            La couleur du joueur voulu
     * @return L'ensemble des bateaux du joueur sur le plateau
     */
    protected HashSet<Ship> getShips(Couleur p_c)
    {
        HashSet<Ship> s = new HashSet<>();

        for (Ship b : this.m_Map.values())
            if (b.m_c.equals(p_c))
                s.add(b);

        return s;
    }

    /**
     * @param p_ship
     * @return
     */
    protected Ocean getVision(Ship p_ship)
    {
        // ensemble des positions non visibles
        Set<LimPosition> nonVisible = new HashSet<>(this.m_Map.keySet());
        nonVisible.removeAll(p_ship.inView());

        // Copie de l'ocean
        Ocean vision = new Ocean(this);
        vision.m_Map.keySet().removeAll(nonVisible);

        // Océan tronqué
        return vision;
    }

    /**
     * Fonction qui retourne la hauteur/largeur du plateau carré
     *
     * @return hauteur du plateau
     */
    public int getWidth()
    {
        return this.H * 2;
    }

    /**
     * Initialise un océan à partir d'un fichier.
     *
     * @param p_xml
     *            Le chemin vers le fichier XML
     * @param p_map
     *            La référence vers la map de l'océan à initialiser
     * @return La hauteur max de l'océan initialisé.
     * @throws XMLStreamException
     * @throws SAXException
     * @throws IOException
     * @throws ParserConfigurationException
     */
    private int initXML(String p_xml) throws XMLStreamException, SAXException, IOException, ParserConfigurationException
    {
        // la hauteur de l'océan
        int h = 0;

        File fXmlFile = new File(p_xml);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);

        // doc.getDocumentElement().normalize();

        if (!doc.getDocumentElement().getNodeName().equals(ELM_BATTLE))
            throw new XMLStreamException("Mauvais élément principal : " + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getFirstChild().getChildNodes();

        // numero d'équipe.
        int noeq = 0;
        // Pour chaque Équipe (ou la grille)
        for (int eq = 0; eq < nList.getLength(); eq++)
        {
            Node nEquipe = nList.item(eq);

            if (!(nEquipe instanceof Element))
                continue;
            // Ca peut être un équipe mais aussi la grille...
            if (!nEquipe.getNodeName().equals(ELM_EQUIPE) && !nEquipe.getNodeName().equals(ELM_GRILLE))
                throw new XMLStreamException("Mauvais SOUS ELEMENT 1er niveau : " + nEquipe.getNodeName());

            if (nEquipe.getNodeName().equals(ELM_GRILLE))
            {    // C'pa une équipe finalement c'est la grille.
                h = Integer.parseInt(((Element) nEquipe).getAttribute(ATTR_HEIGHT));
                this.m_Map = new LimMap<>(h, 2 * h);
            }
            else if (nEquipe.getNodeName().equals(ELM_EQUIPE))
            {
                // Pour chaque bateau
                NodeList nListEq = nEquipe.getChildNodes();
                for (int sh = 0; sh < nListEq.getLength(); sh++)
                {
                    Node nShip = nListEq.item(sh);
                    if (!(nShip instanceof Element))
                        continue;

                    if (!nShip.getNodeName().equals(ELM_BATEAU))
                        throw new XMLStreamException("Mauvais SOUS ELEMENT 2e niveau : " + nShip.getNodeName());

                    // on parse
                    Element eShip = (Element) nShip;
                    int x = Integer.parseInt(eShip.getAttribute(ATTR_X));
                    int y = Integer.parseInt(eShip.getAttribute(ATTR_Y));
                    Direction d = Direction.valueOf(eShip.getAttribute(ATTR_DIR));
                    String type = eShip.getAttribute(ATTR_TYPE);

                    // on ajoute
                    this.addShip(Shipyard.gimmeAShip(this, type, Couleur.values()[noeq], new Position(x, y), d), h);
                }
                // on a fini cette équipe on passe à la suivante.
                noeq++;
            }
        }

        return h;
    }

    /**
     * Retourne vrai si un bateau à une position donnée et faux sinon.
     *
     * @param p_Pos
     *            Position de la case
     * @return Le bateau à cette position
     */
    public boolean isShip(Position p_Pos)
    {
        return this.m_Map.get(p_Pos) != null;
    }

    /**
     * Redéfinition.
     *
     * @see java.lang.Iterable#iterator()
     */
    @Override
    public Iterator<LimPosition> iterator()
    {
        return this.m_Map.keySet().iterator();
    }

    /**
     * Deplace la pièce à la position p_Pos à la position p_Pos2
     *
     * @param p_b
     *            le bateau à déplacer
     * @param p_d
     *            la direction de déplacement
     * @return vrai si le deplacement a ete fait, faux sinon
     */
    public boolean move(Ship p_b, Direction p_d)
    {
        PosSet oldp = p_b.getPositions();
        if (p_b.move(p_d) || p_d == null)
        {
            // On l'enleve de son ancienne place,
            this.m_Map.keySet().removeAll(oldp);
            // On le mets à la nouvelle
            this.addShip(p_b, this.H);
            // Si tout c'est bien passé :
            return true;
        }
        return false;
    }

    /**
     * Retire le bateau de la carte
     *
     * @param p_b
     *            Le bateau à retirer
     */
    protected void removeShip(Ship p_b)
    {
        this.m_Map.keySet().removeAll(p_b.getPositions());
    }

    /**
     * Retourne la couleur du bateau à une position donnée et null sinon.
     *
     * @param p_Pos
     *            Position de la case
     * @return La couleur du bateau à cette position
     */
    public Couleur shipColor(Position p_Pos)
    {
        if (this.isShip(p_Pos))
            return this.m_Map.get(p_Pos).getCouleur();
        else
            return null;
    }

    /**
     * Retourne la direction du bateau à une position donnée et null sinon.
     *
     * @param p_Pos
     *            Position de la case
     * @return La direction du bateau à cette position
     */
    public Direction shipDir(Position p_Pos)
    {
        if (this.isShip(p_Pos))
            return this.m_Map.get(p_Pos).getDir();
        else
            return null;
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
        StringBuilder s2 = new StringBuilder();
        s.append(String.format("%3s", "") + "+");
        s2.append(String.format("%3s", "") + "+");
        for (int i = 0; i < this.getWidth(); i++)
        {
            if (i < 10)
                s.append("-" + i + "-+");
            else
                s.append(i + "-+");
            s2.append("---+");
        }
        s.append("\n");
        s2.append("\n");

        String s3 = s2.toString();
        for (int ix = 0; ix < this.getHeight(); ix++)
        {
            s.append(String.format("%3s", ix) + "|");
            for (int iy = 0; iy < this.getWidth(); iy++)
            {
                Ship y = this.getShip(new Position(ix, iy));

                String ys = "";
                if (y != null)
                {
                    ys = y.getImage();
                    if (y.isDestroyed(new Position(ix, iy)))
                        ys = "/" + ys + "";
                }

                s.append(String.format("%2s", ys) + " |");
            }
            s.append("\n").append(s3);
        }

        return s.toString();
    }
}
