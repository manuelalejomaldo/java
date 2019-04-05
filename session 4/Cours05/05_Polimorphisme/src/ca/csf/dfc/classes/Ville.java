package ca.csf.dfc.classes;

public class Ville {
	
	//Variables publiques qui comptent les instances
	public static int nbreInstances = 0;
	
	//Variable privée qui comptera aussi les instances
	protected static int nbreInstancesBis = 0;
	
	
	//Stocke le nom de notre ville
	protected String nomVille;
	//Stocke le nom du pays de notre ville
	protected String nomPays;
	//Stocke le nombre d'habitants de notre ville
	protected int nbreHabitants;
	protected char categorie;
	
	//Constructeur par défaut
	public Ville(){
		//On incrémente nos variables à chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;		
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();		
	} 
	
	//Constructor d'initialisation
	public Ville(String pNom, int pNbre, String pPays)
	{
		//On incrémente nos variables à chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;		
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategorie();
	}
	
	
	//Retourne le nom de la ville
	public String getNom() {
		return nomVille;
	} 
	
	//Retourne le nom du pays
	public String getNomPays()
	{
		return nomPays;
	} 
	
	// Retourne le nombre d'habitants
	public int getNombreHabitants()
	{
		return nbreHabitants;
	} 
	
	//************* MUTATEURS *************
	//Définit le nom de la ville
	public void setNom(String pNom)
	{
	nomVille = pNom;
	}
	
	//Définit le nom du pays
	public void setNomPays(String pPays)
	{
	nomPays = pPays;
	}	
	
	//Définit le nombre d'habitants
	public void setNombreHabitants(int nbre)
	{
	nbreHabitants = nbre;
	}	
	
	//Retourne la catégorie de la ville
	public char getCategorie()
	{
		return categorie;
	}
	
	
	public static int getNombreInstancesBis()
	{
		return nbreInstancesBis;
	}
	
	//Définit la catégorie de la ville
	private void setCategorie() {
		int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants >=bornesSuperieures[i])
			i++;
		this.categorie = categories[i];
	} 
	
	//Retourne la description de la ville
	public String decrisToi(){
		return "\t"+this.nomVille+" est une ville de "+this.nomPays
				+ ",elle comporte : "+this.nbreHabitants
				+" habitant(s) => elle est donc de catégorie : "+this.categorie;
	} 
	//Retourne une chaîne de caractères selon le résultat de la	comparaison
	public String comparer(Ville v1){
		String str = new String();
		if (v1.getNombreHabitants() > this.nbreHabitants)
		str = v1.getNom()+" est une ville plus peuplée que"+this.nomVille;
		else
		str = this.nomVille+" est une ville plus peuplée que"+v1.getNom();
		return str;
	}
	
	
	
	
	
	public String toString(){
		return "\t"+this.nomVille+" est une ville de "+this.nomPays
				+",elle comporte : " + this.nbreHabitants
				+" => elle est donc de catégorie: "+this.categorie;
	}
	
}
