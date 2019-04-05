package ca.csf.dfc.main.console;

public class Utilisateur {
	
	private String m_Nom;
	private String m_Prenom;
	private int m_Age;	
	private Boolean  m_EstActif;
	private Telephone  m_Telephone;
	
	public Utilisateur() 
	{
		this.m_Nom = "";
		this.m_Prenom = "";
		this.m_Age = 0;
		this.m_EstActif = true;
		this.m_Telephone = null;
	}
	
	public String getNom() 
	{
		return this.m_Nom;
	}
	
	public void setNom (String p_Nom) 
	{
		this.m_Nom = p_Nom;
	}
	
	public String getPrénom() 
	{
		return this.m_Prenom;
	}
	
	public void setPrénom( String p_Prénom) 
	{
		this.m_Prenom = p_Prénom;
	}
	
	public int getAge() 
	{
		return  this.m_Age;
	}
	
	public void setAge(int p_age) 
	{
		this.m_Age = p_age;
	}
	
	public Boolean getEstActif() 
	{
		return  this.m_EstActif;
	}
	
	public void setEstActif(Boolean p_EstActif) 
	{
		this.m_EstActif = p_EstActif;
	}
	
	public Telephone getTelephone() 
	{
		return this.m_Telephone;
	}
	
	public void setTelephone(Telephone p_Telephone) 
	{
		this.m_Telephone = p_Telephone;
	}
	
	public String toString() 
	{
		return " Utilisateur nom: "+ this.m_Nom + 
				" Prénom: "+ this.m_Prenom + 
				" Âge: "+ this.m_Age +
				" tel: "+ this.m_Telephone + 
				" Actif: " + this.m_EstActif;
	}
	
	
}
