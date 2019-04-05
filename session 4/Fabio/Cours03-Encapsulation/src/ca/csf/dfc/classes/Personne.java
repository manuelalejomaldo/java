package ca.csf.dfc.classes;

/**
 * Classe représentant une personne, avec son nom et son âge. Nous n'acceptons
 * pas de nom à nul. Mettez une chaîne vide à la place. <quote> <code>
 * Personne p = new Perssone("Bob", 22);
 * </code> <quote>
 * 
 * @author Fabio Fonseca
 */

public class Personne {

	// Constantes publiques
	/**
	 * Nom par défault d'une personne.
	 */
	public final static String NOM_PAR_DEFAULT = "";
		
	/**
	 * Âge minimal d'une personne.
	 */
	public final static int AGE_MIN = 0;

	// Constantes privées

	// Données membres
	/**
	 * Le nom de la personne.
	 */
	private String m_Nom;

	/**
	 * L'âge de la personne.
	 */
	private int m_Age;

	// Constructeurs : en premier, le constructeur par défault

	/**
	 * Constructeur par défaut
	 */
	public Personne() {
		// this.m_Nom = "";
		// this.m_Age = 0;
		this(NOM_PAR_DEFAULT, AGE_MIN);
	}

	/**
	 * Création d'une personne à partir du nom, et avec un âge à zéro.
	 * 
	 * @param p_nom Le nom de la personne //Pq afastado da margem???
	 */
	public Personne(String p_nom) {
		this.m_Nom = p_nom;
		this.m_Age = 0;
	}

	/**
	 * Création d'une personne à partir de l'âge, ave un nom vide.
	 * 
	 * @param p_Age
	 */
	public Personne(int p_age) {
		this.m_Nom = "";
		this.m_Age = p_age;
	}

	/**
	 * Constructeur de initialisation
	 * 
	 * @param p_nom Le nom de la personne.
	 * @param p_age L'âge de la personne
	 */
	public Personne(String p_nom, int p_age) {
		if (p_nom == null) {
			throw new IllegalArgumentException("Nom null !");
		}

		if (p_age < 0) {
			throw new IllegalArgumentException("Âge négatif !");
		}

		this.m_Nom = p_nom;
		this.m_Age = p_age;
	}

	// Get et Set dans le même ordre que les déclarations
	// des données membres
	/**
	 * Return le nom.
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return this.m_Nom;
	}

	/**
	 * Pour modifier le nom.
	 * 
	 * @param p_nom the nom to set
	 */
	public void setNom(String p_nom) {
		this.m_Nom = p_nom;
	}

	/**
	 * Return le age.
	 * 
	 * @return the age
	 */
	public int getAge() {
		return this.m_Age;
	}

	/**
	 * Pour modifier le age.
	 * 
	 * @param p_age the age to set
	 */
	public void setAge(int p_age) {
		this.m_Age = p_age;
	}

	// toString()
	/**
	 * Pour afficher une personne
	 * 
	 * @return m_nom et m_age
	 */
	public String toString() {
		return "Nom : " + this.getNom() + ", Age : " + this.getAge();
	}

	// Autres méthodes publiques
	// Méthodes privées
}
