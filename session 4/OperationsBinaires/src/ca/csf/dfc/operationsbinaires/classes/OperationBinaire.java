package ca.csf.dfc.operationsbinaires.classes;
import ca.csf.dfc.operationsbinaires.interfaces.Expression;

/**
 * @author ManueLMaldonado
 *
 */
public abstract class OperationBinaire implements Expression{
	
	/**
	 * 
	 */
	private Expression m_operation1;
	/**
	 * 
	 */
	private Expression m_operation2;
	
	
	
	/**
	 * Constructor d'initialisation
	 * @param p_expression1
	 * @param p_expression2
	 */
	public OperationBinaire( Expression p_expression1,  Expression p_expression2) {
		this.m_operation1 = p_expression1;
		this.m_operation2 = p_expression2;
	}

	
	/**
	 * @return
	 */
	public Expression getM_operation1() {
		return m_operation1;
	}

	/**
	 * @param m_operation1
	 */
	public void setM_operation1(Expression m_operation1) {
		this.m_operation1 = m_operation1;
	}

	/**
	 * @return
	 */
	public Expression getM_operation2() {
		return m_operation2;
	}

	/**
	 * @param m_operation2
	 */
	public void setM_operation2(Expression m_operation2) {
		this.m_operation2 = m_operation2;
	}
	
	
	
}
