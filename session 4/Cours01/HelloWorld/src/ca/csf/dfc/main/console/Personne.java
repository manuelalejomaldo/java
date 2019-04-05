package ca.csf.dfc.main.console;

public class Personne {
	
	
	// Constantes publiques
	/**
     * Âge minimal d'une personne.
     */
    public final static int AGE_MIN = 0;

    /**
     * Nom par défaut d'une personne.
     */
    public final static String NOM_PAR_DEFAUT = "";


    
    
    // Constantes privées

    
    
    
    // Données membres
	private String m_Nom;
	private int m_Age;
	
	
	
	
	
    // Constructeurs : en premier, le constructeur par défaut
	
	/**
	* Constructeur par défaut. 
	*/
	public Personne()
	{
		this(NOM_PAR_DEFAUT, AGE_MIN);
	}
	/** 
	 * Création d'une personne à partir du nom, et avec un âge à zéro.
	 */
	public Personne(String p_nom)
	{
		this(p_nom, AGE_MIN);
	}
	/**
	* Création d'une personne à partir de l'âge, avec un nom vide.
	*/
	public Personne(int p_Age)
	{
		this(NOM_PAR_DEFAUT, p_Age);
	}
	/*
	 *  * Constructeur d'initialisation
	 * @param p_nom
	 * @param p_age
	 */
	public Personne(String p_nom, int p_age)
	{
		this.setNom(p_nom);
		this.setAge(p_age);
	}
	
	
	
	
	
	// Set et Get dans le même ordre que les déclarations 
	
	/**
	*Retourne le nom
	 * @return the nom
	 */
	public String getNom() {
		return this.m_Nom;
	}
	/**
	* Pour modifier le nom.
	 * @param p_nom Nouvelle valeur
	 */
	public void setNom(String p_nom) {
		this.m_Nom = p_nom;
	}
	/**
	*Retourne le age
	 * @return the age
	 */
	public int getAge() {
		return this.m_Age;
	}
	/**
	* Pour modifier le age.
	 * @param p_age Nouvelle valeur
	 */
	public void setAge(int p_age) {
		
		if (p_age < AGE_MIN) {
	        throw new IllegalArgumentException("L'âge fourni " + p_age + " est < " + AGE_MIN);
	    }

		this.m_Age = p_age;
	}

    
	
    // des données membres

	
	
	
	
    // toString()
	
	
	
	
	
	
    // Autres méthodes publiques

	
	
	
	
	
    // Méthodes privées
	
	
	
	
	
	
}
