package ca.csf.dfc.classes;

public abstract class Compte {
	
	protected float m_Solde;
	
	/**
	 * Constructeur de initialiation d'une compte
	 * Solde = 0
	 */
//	public Compte() {
//		this.m_Solde = 0;
//	}

	/**
	 * Return le solde.
	 * @return the solde
	 */
	public float getSolde() {
		
		return this.m_Solde;
	}
	
	@Override
	public String toString() {
		return "Compte solde : " + this.m_Solde;
	}
	
	public abstract void retirer(float m_argent);
	public abstract void deposer(float m_argent);		
}
