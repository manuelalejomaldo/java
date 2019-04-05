package ca.csf.dfc.main.console;

public class Utilisateur {

	private String m_Nom;
	private String m_Prenom;
	private int m_Age;
	private boolean m_EstActif;
	private Telephone m_Telephone;

	// Constructeur par default
	public Utilisateur() {
		this.m_Nom = "";
		this.m_Prenom = "";
		this.m_Age = 0;
		this.m_EstActif = false;
		this.m_Telephone = null;
	}

	// Nom
	public String getNom() {
		return this.m_Nom;
	}

	public void setNom(String p_Nom) {
		this.m_Nom = p_Nom;
	}

	// Prenom
	public String getPrenom() {
		return this.m_Prenom;
	}

	public void setPrenom(String p_Prenom) {
		this.m_Prenom = p_Prenom;
	}

	// Age
	public int getAge() {
		return this.m_Age;
	}

	public void SetAge(int p_Age) {
		this.m_Age = p_Age;
	}

	// EstActif
	public boolean getEstActif() {
		return this.m_EstActif;
	}

	public void SetEstActif(boolean p_EstActif) {
		this.m_EstActif = p_EstActif;
	}

	// Telephone
	public Telephone getTelephone() {
		return this.m_Telephone;
	}

	public void setTelephone(Telephone p_Telephone) {
		this.m_Telephone = p_Telephone;
	}

	// toString
	public String toString() {
		
		String tel = "";
		
		if(this.m_Telephone != null) {
			tel = this.m_Telephone.toString();
		}else {
			tel = "aucun télephone";
		}

		return "INFORMATIONS PERSONNELLES\n\n" +  
		       "Nom Complet      : " + this.m_Prenom + " " + this.m_Nom + "\n" + 
		       "Age              : " + this.m_Age + "\n" + 
		       "Est actif        : " + this.m_EstActif + "\n" +
		       "Modéle/Téléphone : " + tel;
	}
}
