package ca.csf.dfc.classes;

public class CompteInteret extends ComptesGeneral{
	
	private static final double FRAIS = 0.25;
	
	@Override
	public double retirer(double p_argent) 
	{
		if (this.getSolde() < 0) {
			
			throw new IllegalArgumentException("Desolé ! Impossible faire un retrait. Le solde est negatif.");
			
		}else if (this.getSolde() > p_argent) {
			
			throw new IllegalArgumentException("Desolé ! Le solde est plus petit que le retrait.");
			
		}else {
			double solde = this.getSolde();
			
			this.m_Solde = solde - p_argent - FRAIS;
			
			return solde;
		}
		
	}
	
	@Override
	public String toString() 
	{
		return "Le solde actuel compte intérêt est : " + this.getSolde(); 
	}
}
