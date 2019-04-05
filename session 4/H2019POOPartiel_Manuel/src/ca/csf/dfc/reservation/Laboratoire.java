package ca.csf.dfc.reservation;

public class Laboratoire extends Ressource {
	private String m_nomLaboratoire;
	
	public Laboratoire(int p_identifiant, String p_nomLaboratoire) {
		super(p_identifiant);
		
		this.m_nomLaboratoire = p_nomLaboratoire;
	}

	/**
	 * @return the m_nomLaboratoire
	 */
	public String getNomLaboratoire() {
		return m_nomLaboratoire;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ressource Laboratoire " + m_nomLaboratoire + ", Identifiant: " + this.getIdentifiant();
	}
	
	
}
