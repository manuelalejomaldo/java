/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author Fabio Fonseca
 *
 */
public class Personne {
	
	private String m_Nom;
	private int m_Age;
	
	public Personne() 
	{
		this.m_Nom = "";
		this.m_Age = 0;
	}

	/**
	 * Return le m_Nom.
	 * @return the m_Nom
	 */
	public String getM_Nom() 
	{
		return this.m_Nom;
	}

	/**
	 * Pour modifier le m_Nom.
	 * @param p_m_Nom the m_Nom to set
	 */
	public void setM_Nom(String p_m_Nom) 
	{
		this.m_Nom = p_m_Nom;
	}

	/**
	 * Return le m_Age.
	 * @return the m_Age
	 */
	public int getM_Age() 
	{
		return this.m_Age;
	}

	/**
	 * Pour modifier le m_Age.
	 * @param p_m_Age the m_Age to set
	 */
	public void setM_Age(int p_m_Age) 
	{
		Assertion.precondition(p_m_Age < 0, "L'age d'une personne doit être plus grand ou égal a 0 !");
		
		if (p_m_Age < 0) {
			throw new IllegalArgumentException("L'age d'une personne doit être plus grand ou égal a 0 !");
		}
		
		this.m_Age = p_m_Age;
	}
	
	public String toString() 
	{
		return "Nom : " + this.m_Nom + ", " + "age : " + this.m_Age;
	}
}
