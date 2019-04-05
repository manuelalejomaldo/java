/**
 * 
 */
package ca.cdf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */
public class Personne {

	/**
	 * Constant pour le nom ar default
	 */
	public final static  String NOM_PAR_DEFAULT = "";
	
	/**
	 * Constante pour l'age minimale
	 */
	public final static  int AGE_MIN = 0;
	
	/**
	 * Le nom de la personne.
	 */
	private String m_Nom = "";
	
	
	/**
	 * L'âge de la personne.
	 */
	private int m_Age = 0;
	
	/**
	 *Constructor par default 
	 */
	public Personne() {
		
		this(NOM_PAR_DEFAULT,AGE_MIN);
	}
	
	/**
	 * Constructor par initialisation 
	 * Creation d'une persone à partir du nom,
	 * @param p_nom
	 */
	public Personne(String p_nom) {
	
		this(p_nom,AGE_MIN);
	}
	
	/**
	 * @param p_age
	 */
	public Personne(int p_age) {
	
		this(NOM_PAR_DEFAULT,p_age);
	}
	
	/**
	 * @param p_nom
	 * @param p_age
	 */
	public Personne(String p_nom, int p_age) {
		this.setNom(p_nom); 
		this.setAge(p_age);
	}

	/**
	 * @return the m_Nom
	 */
	public String getNom() {
		return m_Nom;
	}

	/**
	 * @param m_Nom the m_Nom to set
	 */
	public void setNom(String p_nom) {
		if(p_nom == null) {
			throw new IllegalArgumentException("Le nom est nul");
		}
		this.m_Nom = p_nom;
	}

	/**
	 * @return the m_Age
	 */
	public int getAge() {
		return m_Age;
	}

	/**
	 * @param m_Age the m_Age to set
	 */
	public void setAge(int p_age) {
		if(p_age < AGE_MIN ) {
			throw new IllegalArgumentException("L'âge fourni " + p_age + "est < " + AGE_MIN);
		}
		this.m_Age = p_age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [m_Nom=" + m_Nom + ", m_Age=" + m_Age + "]";
	}
	
	
}
