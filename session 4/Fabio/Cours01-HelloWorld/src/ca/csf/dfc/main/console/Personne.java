package ca.csf.dfc.main.console;

/**
 * Classe représentant une personne, avec son nom et son âge.
 * Nous n'acceptons pas de nom à nul. Mettez une chaîne vide à la place.
 * <quote> <code>
 * Personne p = new Perssone("Bob", 22);
 * </code> <quote>
 * 
 * @author Fabio Fonseca
 */
	
public class Personne {
	
	//Constantes publiques
	
	//Constantes privées
	
	/**
	 * Le nom de la personne.
	 */
	private String m_Nom;
	
	/**
	 * L'âge de la personne.
	 */
	private int m_Age;
	
	//Constructeurs : en premier, le constructeur par défault
	
	/**
	 * Constructeur par défaut
	 */
	public Personne() 
	{
		this.m_Nom = "";
		this.m_Age = 0;
	}
	
	/**
	 * Création d'une personne à partir du nom,
	 * et avec un âge à zéro.
	 * 
	 * @param p_nom
	 *             Le nom de la personne //Pq afastado da margem???
	 */
	public Personne(String p_nom) 
	{
		this.m_Nom = p_nom;
		this.m_Age = 0;
	}
	
	/**
	 * Création d'une personne à partir de l'âge, ave un nom vide.
	 * 
	 * @param p_Age
	 */
	public Personne(int p_Age) 
	{
		this.m_Nom = "";
		this.m_Age = p_Age;
	}
	
	/**
	 * Constructeur de initialisation
	 * 
	 * @param p_nom
	 * 				Le nom de la personne.
	 * @param p_age
	 * 				L'âge de la personne
	 */
	public Personne(String p_nom, int p_age) 
	{
		this.m_Nom = p_nom;
		this.m_Age = p_age;
	}
	
	//Get et Set dans le même ordre que les déclarations
	//des données membres
	/**
	 * Return le nom.
	 * @return the nom
	 */
	public String getNom() {
		return this.m_Nom;
	}

	/**
	 * Pour modifier le nom.
	 * @param p_nom the nom to set
	 */
	public void setNom(String p_nom) {
		this.m_Nom = p_nom;
	}

	/**
	 * Return le age.
	 * @return the age
	 */
	public int getAge() {
		return this.m_Age;
	}

	/**
	 * Pour modifier le age.
	 * @param p_age the age to set
	 */
	public void setAge(int p_age) {
		this.m_Age = p_age;
	}
	
	//toString()
	//Autres méthodes publiques
	//Méthodes privées
}
