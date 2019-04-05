package ca.csf.dfc.classes;
//import java.lang.Math.abs;

public class Credit2  extends CompteGeneral2{
	
	// Données membres
	private int m_operations;
	
	// Constructeurs : en premier, le constructeur par défaut
	
	public Credit2() 
	{
		super();
		m_operations = 0;
	}
		
	public Credit2(double p_solde) 
	{
		super(p_solde);		
		m_operations = 0;
	}
		
	// Set et Get dans le même ordre que les déclarations 
		
	
	
		
	// Autres méthodes publiques
	@Override
	public void deposer(double p_deposer) {
			
		Assertion.precondition( p_deposer < 0 ,
				"Le valeur à deposer doit être positive");
			
		super.retirer(0.25);	
		super.deposer(p_deposer);			
	}
		
		

	@Override
	public void retirer(double p_retirer) {
			
		Assertion.precondition( p_retirer < 0 ,
				"Le valeur à retirer doit être positive");
			
		if((m_operations == 10) && (super.getSolde() < 0)) 
		{
			retirer(Math.abs(super.getSolde() * 0.05));
			m_operations = 0;
		}	
		else if((m_operations < 10) && (super.getSolde() < 0)) 
		{
			super.retirer(p_retirer + 0.25);
			m_operations++;
		}
		else
		{
			super.retirer(p_retirer + 0.25);
		}	
	}

}
