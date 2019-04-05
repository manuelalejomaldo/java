package ca.csf.dfc.classes;

import java.text.DecimalFormat;

public class CompteCheque extends Compte{
	
	@Override
	public String toString() {
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		return "Cheque Solde          : " + format.format(this.m_Solde);
	}
	
	@Override
	public void retirer(float p_argent) {
		
		this.m_Solde -= p_argent;
	}

	@Override
	public void deposer(float p_argent) {
		
		this.m_Solde += p_argent;
	}	
}
