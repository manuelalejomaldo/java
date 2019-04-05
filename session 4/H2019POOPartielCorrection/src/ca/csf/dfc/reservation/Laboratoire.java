package ca.csf.dfc.reservation;

public class Laboratoire extends Piece {
	private String m_nomLaboratoire;
	
	public Laboratoire(int p_identifiant, String p_nomLaboratoire) {
		super(p_identifiant);
		
		this.m_nomLaboratoire = p_nomLaboratoire;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getClass().getSimpleName());
		sb.append("(identifiant: ");
		sb.append(this.getIdentifiant());
		sb.append(", nomLaboratoire: ");
		sb.append(this.m_nomLaboratoire);
		sb.append(")");
		
		return sb.toString();
	}
}
