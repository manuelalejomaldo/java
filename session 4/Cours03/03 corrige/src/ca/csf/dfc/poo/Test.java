/**
 * 
 */
package ca.csf.dfc.poo;

/**
 * Classe de Test
 * 
 * @author Kam
 */
public class Test
{

    /**
     * Test de static private
     */
    private final static int PFS = 0;

    /**
     * Test de static public
     */
    public final static int PUFS = 1;

    /**
     * Une string
     */
    private String m_Tata;

    /**
     * un entier
     */
    private int m_iTi;

    /**
     * Constructeur
     * 
     * @param p_tata
     * @param p_iTi
     */
    public Test(String p_tata, int p_iTi)
    {
        this.m_Tata = p_tata;
        this.m_iTi = p_iTi;
    }

    /**
     * Constructeur
     */
    public Test()
    {
        this("", PUFS);
    }

    /**
     * Constructeur
     * 
     * @param p_iTi
     */
    public Test(int p_iTi)
    {
        this("", p_iTi);
    }

    /**
     * Constructeur
     * 
     * @param p_tata
     */
    public Test(String p_tata)
    {
        this(p_tata, PFS);
    }

    /**
     * Retourne le tata.
     * 
     * @return le tata
     */
    public String getTata()
    {
        return this.m_Tata;
    }

    /**
     * Pour modifier le tata.
     * 
     * @param p_tata
     *            Nouvelle valeur.
     */
    public void setTata(String p_tata)
    {
        this.m_Tata = p_tata;
    }

    /**
     * Retourne le iTi.
     * 
     * @return le iTi
     */
    public int getiTi()
    {
        return this.m_iTi;
    }

    /**
     * Pour modifier le iTi.
     * 
     * @param p_iTi
     *            Nouvelle valeur.
     */
    public void setiTi(int p_iTi)
    {
        this.m_iTi = p_iTi;
    }

}
