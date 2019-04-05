package ca.csf.dfc.reservation;

public class Projecteur extends RessourceMaterielle {
	public Projecteur(int p_identifiant) {
		super(p_identifiant);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Projecteur identifie ;" + this.getIdentifiant();
	}
	
}
