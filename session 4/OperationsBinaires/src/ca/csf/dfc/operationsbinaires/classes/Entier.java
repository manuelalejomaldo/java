package ca.csf.dfc.operationsbinaires.classes;
import ca.csf.dfc.operationsbinaires.interfaces.Expression;

/**
 * @author ManueLMaldonado
 *
 */
public class Entier implements Expression{
	
	/**
	 *donn�e membre 
	 */
	private int m_valeur;		
	
	/**
	 * constructor d'initialisation
	 * @param p_Int
	 */
	public Entier ( int p_Int) {
		this.m_valeur = p_Int;
	}	
	
	/**
	 * @return
	 */
	public int getM_valeur() {
		return m_valeur;
	}
	
	@Override
	public int Calculer() {
		// TODO Auto-generated method stub
		return this.getM_valeur();
	}
	
}
