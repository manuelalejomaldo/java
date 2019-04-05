package ca.csf.dfc.classes;

import java.text.DecimalFormat;

public class CompteMargeDeCredit extends ComptesGeneral {
	
	private static final double FRAIS = 0.25;
	private static final double INTERET = 0.05;
	private int compteur = 0;
	
	@Override
	public double retirer(double p_argent) 
	{
		
		double solde = this.getSolde();
		
		solde = solde - p_argent - FRAIS;
		
		if (solde < 0) {
			//anular o contador em caso tenha um deposito que deixe a conta com saldo positivo
			//ver como resolver isso!
			//verificar se o saldo é negativo pra poder incrementar o contador
			if (solde < 0) {
				compteur++;
			}
			
			if (compteur >= 10) {
				solde = solde - (solde * INTERET);
			}
		}
		
		this.m_Solde = solde;
		
		return this.m_Solde;
		
	}
		
	@Override
	public String toString() 
	{
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		return "Le solde actuel marge de crédit est : " + format.format(this.getSolde()) + 
				"\nCompteur : " + compteur + ".";
	}
	
}
