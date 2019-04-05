package ca.csf.dfc.classes;

public class PersonneMineur extends Personne {
	
	/**
	 * Pour modifier le m_Age.
	 * @param p_m_Age the m_Age to set
	 */
	@Override
	public void setM_Age(int p_m_Age) 
	{
		Assertion.precondition(p_m_Age < 0 || p_m_Age > 17, "L'age d'un minueur doit être entre 0 et 17 !");
		
		if (p_m_Age < 0 || p_m_Age > 17) {
			throw new IllegalArgumentException("L'age d'un minueur doit être entre 0 et 17 !");
		}
		
		super.setM_Age(p_m_Age);
	}
	
}
