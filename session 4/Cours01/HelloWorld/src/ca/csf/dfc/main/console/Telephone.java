package ca.csf.dfc.main.console;

public class Telephone {

	private int m_Numero;
	private String m_Modele;
	
	public Telephone() 
	{
		this.m_Numero = 0;
		this.m_Modele = "";
	}
	
	public int getNuméro() 
	{
		return this.m_Numero;
	}
	
	public void setNuméro(int p_Numero)
	{
		this.m_Numero = p_Numero;
	}
	
	public String getModele()
	{
		return this.m_Modele;
	}
	
	public void setModele(String p_Modele) 
	{
		this.m_Modele = p_Modele;
	}
}
