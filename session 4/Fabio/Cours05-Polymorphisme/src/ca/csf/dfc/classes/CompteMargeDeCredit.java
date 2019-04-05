package ca.csf.dfc.classes;

import java.text.DecimalFormat;

public class CompteMargeDeCredit extends Compte {
	
	private static final float FRAIS = 0.25f;
	private static final float INTERET = 0.05f;
	private int compteur = 0;
	
	@Override
	public String toString() 
	{
		DecimalFormat format = new DecimalFormat("0.00");
		
		return "Marge de crédit solde : " + format.format(this.m_Solde); 
	}
	
	@Override
	public void retirer(float p_argent) 
	{
		float solde = this.getSolde();
		
		solde = solde - p_argent - FRAIS;
		
		if (solde < 0) {
			
			if (solde < 0) {
				compteur++;
			}
			
			if (compteur >= 10) {
				solde = solde - (solde * INTERET);
			}
		}
		
		this.m_Solde = solde;
	}
	
	@Override
	public void deposer(float p_argent) {
		
		this.m_Solde += p_argent;
	}
	
}
