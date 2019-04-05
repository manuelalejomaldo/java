package ca.csf.dfc.main.console;

public class Telephone {
	
	private String m_Numero;
	private String m_Modele;
	
	public Telephone() 
	{
		this.m_Numero = "";
		this.m_Modele = "";
	}
	
	/*Modele*/
	public String getModele()
	{
		return this.m_Modele;
	}
	
	public void setModele(String p_Modele) {
		
		this.m_Modele = p_Modele;
	}
	
	//Numéro
	public String getNumero() 
	{
		return this.m_Numero;
	}
	
	public void setNumero(String p_Numero) {
		
		this.m_Numero = p_Numero;
	}
	
	public String toString() 
	{
		return this.m_Modele + ", " +  this.m_Numero;
	}
	
}
