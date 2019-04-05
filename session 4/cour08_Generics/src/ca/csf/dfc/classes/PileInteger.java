package ca.csf.dfc.classes;

public class PileInteger {

	/**
	 * 
	 */
	private int m_taille;
		
	/**
	 * 
	 */
	private  int[] m_tableau;
	
	/**
	 * 
	 */
	private int m_nbElements = 0;
	
	/**
	 * @param p_taille
	 */
	public PileInteger(int p_taille) 
	{
		
		this.m_taille = p_taille;
		
		this.m_tableau = new int[p_taille];
	}
	
	/**
	 * @return
	 */
	public boolean EstVide() {
		return (m_nbElements <= 0);
	} 
	
	/**
	 * @return
	 */
	public boolean EstPleine() {
		return (m_nbElements >= m_taille);
	} 
	
	/**
	 * @return
	 */
	public int Dessus() {
		
		if (EstVide()) throw new Error("Pile Vide");
		
		return m_tableau[m_nbElements-1];
	}
		
	
	/**
	 * @param p_element
	 */
	public void Empiler(int p_element) {
		
		if (EstPleine()) throw new Error("Pile Pleine");
		m_tableau[m_nbElements++] = p_element;
			
	}
	
	/**
	 * @return
	 */
	public int Depiler() {
		
		if (EstVide()) throw new Error("Pile Vide");
		
		return m_tableau[--m_nbElements];				
	}
	
	@Override
    public String  toString()
    {
		StringBuilder strBuilder = new StringBuilder();
	    strBuilder.append("Pile avec les éléments suivants:\n");
	    
	    for (int i=0; i < m_nbElements; i++) {
	        strBuilder.append(m_tableau[i] + "\n");
	    }

	    return strBuilder.toString();		
    }

}
