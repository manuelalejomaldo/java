package ca.csf.dfc.classes;

import java.text.DecimalFormat;

public class CompteInteret extends Compte {
	
	private static final float FRAIS = 0.25f;
	
	@Override
	public String toString() 
	{
		DecimalFormat format = new DecimalFormat("0.00");
		
		return "Interet solde         : " + format.format(this.m_Solde); 
	}
	
	@Override
	public void retirer(float p_argent) 
	{
		if (this.getSolde() < 0) {
			
			throw new IllegalArgumentException("Desolé ! Impossible faire un retrait. Le solde est negatif.");
			
		}else if (this.getSolde() > p_argent) {
			
			throw new IllegalArgumentException("Desolé ! Le solde est plus petit que le retrait.");
			
		}else {
			float solde = this.getSolde();
			
			this.m_Solde = solde - p_argent - FRAIS;
		}
	}
	
	@Override
	public void deposer(float p_argent) {
		
		this.m_Solde += p_argent;
	}
}
