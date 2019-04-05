package ca.csf.dfc.classes;

public class CompteGeneral2 {
	
	// Constantes publiques
	public final static int VALEUR_MIN = 0;	
	
	
    // Donnees membres
	private double m_solde;

	
    // Constructeurs : en premier, le constructeur par défaut
    
	public CompteGeneral2() 
	{
		this.m_solde = 0;
	}
	
	
	public CompteGeneral2(double p_solde)
	{
		this.deposer(p_solde);
	}
	
	
	
	
    // Set et Get dans le même ordre que les déclarations 
    
	/**
	*Retourne le solde
	 * @return the solde
	 */
	public double getSolde() 
	{
		return this.m_solde;
	}

	/**
	* Pour modifier le solde.
	 * @param p_solde Nouvelle valeur
	 */
	private void setSolde(double p_solde) 
	{		
		this.m_solde = p_solde;
	}
	
    // toString()
	
	@Override
	public String toString()
	{
		return "Le Solde est : " + this.getSolde() +"$ .";
	}
	
    // Autres méthodes publiques
	
	public void deposer(double p_deposer) {
		
		Assertion.precondition( p_deposer < VALEUR_MIN,
				"Le valeur à deposer doit être positive");
		
		this.setSolde(this.getSolde() + p_deposer);
	}
	
	public void retirer(double p_retirer) 
	{
		
		Assertion.precondition(p_retirer < VALEUR_MIN, 
				" Le valeur à retirer dot être positive");
		
		this.setSolde(this.getSolde() - p_retirer);
	}
	
    // Méthodes privées

}
