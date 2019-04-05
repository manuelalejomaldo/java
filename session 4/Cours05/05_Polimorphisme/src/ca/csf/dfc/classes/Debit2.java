package ca.csf.dfc.classes;

/**
 * @author ManueLMaldonado
 *
 */

public class Debit2 extends CompteGeneral2{
	
	// Données membres
	
	
	
	// Constructeurs : en premier, le constructeur par défaut
	
	public Debit2() 
	{
		super();
	}
	
	public Debit2(double p_solde) 
	{
		super(p_solde);
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
		
		Assertion.precondition(((super.getSolde() - (p_retirer + 0.25)) < 0 ),
			"Aucun solde négatif n’est permis");
		
		super.retirer(p_retirer + 0.25);
		
	}
}
