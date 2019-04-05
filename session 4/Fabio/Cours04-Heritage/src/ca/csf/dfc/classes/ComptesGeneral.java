package ca.csf.dfc.classes;

public class ComptesGeneral {
	
	protected double m_Solde;
	
	public ComptesGeneral() 
	{
		this.m_Solde = 0;
	}

	/**
	 * Return le solde.
	 * @return the solde
	 */
	public double getSolde() {
		return this.m_Solde;
	}
	
	/**
	 * Méthode pour déposer argente du compte.
	 * @param p_argent
	 * @return
	 */
	public double deposer(double p_argent) {
		
		return this.m_Solde += p_argent;
	}
	
	/**
	 * Méthode pour retirer argent du compte.
	 * @param p_argent
	 * @return
	 */
	public double retirer(double p_argent) 
	{
		return this.m_Solde -= p_argent; 
	}
	
	public String toString() 
	{
		return "Le solde compte general est : " + this.getSolde() + " $";
	}
	
}
