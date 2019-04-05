package ca.csf.dfc.classes;

public abstract class Animal {
	
	private int m_IdAnimal;
	
	public Animal() 
	{
		this.m_IdAnimal = 0;
	}

	/**
	 * Return l'idAnimaux.
	 * @return the idAnimaux
	 */
	public int getIdAnimaux() 
	{
		return this.m_IdAnimal;
	}

	/**
	 * Pour modifier l'idAnimaux.
	 * @param p_idAnimaux the idAnimaux to set
	 */
	public void setIdAnimaux(int p_idAnimal) 
	{
		this.m_IdAnimal = p_idAnimal;
	}
	
	/**
	 * Pour afficher les animaux
	 * 
	 */
	public String toString() 
	{
		return "Le animal " + "#" + m_IdAnimal + "."; 
	}
	
	public abstract void respirer();
	public abstract void deplacer();
	
}
