package ca.csf.dfc.reservation;

public class Laboratoire extends Ressource {
	private String m_nomLaboratoire;
	
	public Laboratoire(int p_identifiant, String p_nomLaboratoire) {
		super(p_identifiant);
		
		this.m_nomLaboratoire = p_nomLaboratoire;
	}
}
