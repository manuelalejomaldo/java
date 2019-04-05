package ca.csf.dfc.reservation;

public class SalleDeReunion extends Piece {
private String m_etage;
private int m_capacitePersonne;
	
	public SalleDeReunion(int p_identifiant, String p_etage, int p_capacitePersonne) {
		super(p_identifiant);
		
		this.m_etage = p_etage;
		this.m_capacitePersonne = p_capacitePersonne;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getClass().getSimpleName());
		sb.append("(identifiant: ");
		sb.append(this.getIdentifiant());
		sb.append(", etage: ");
		sb.append(this.m_etage);
		sb.append(", capacitePersonne: ");
		sb.append(this.m_capacitePersonne);
		sb.append(")");
		
		return sb.toString();
	}
}
