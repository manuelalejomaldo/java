package ca.csf.dfc.reservation;

public class OrdinateurPortable extends RessourceMaterielle {
	private String m_systemeExploitation;

	public OrdinateurPortable(int p_identifiant, String p_systemeExploitation) {
		super(p_identifiant);

		this.m_systemeExploitation = p_systemeExploitation;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getClass().getSimpleName());
		sb.append("(identifiant: ");
		sb.append(this.getIdentifiant());
		sb.append(", systemExploitation: ");
		sb.append(this.m_systemeExploitation);
		sb.append(")");
		
		return sb.toString();
	}
}
