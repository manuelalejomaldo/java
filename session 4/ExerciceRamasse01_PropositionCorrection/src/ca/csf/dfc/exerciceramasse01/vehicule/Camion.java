package ca.csf.dfc.exerciceramasse01.vehicule;

import java.util.List;

public class Camion extends Vehicule {
	private boolean m_PresenceRemorque = false;

	public static final String ATTACHER_REMORQUE = "attacherRemorque";
	public static final String DETACHER_REMORQUE = "detacherRemorque";

	public Camion(String p_Marque, String p_Modele) {
		super(p_Marque, p_Modele, 80);

	}

	public boolean peutAttacherRemorque() {
		return !this.m_PresenceRemorque;
	}

	public boolean peutDetacherRemorque() {
		return this.m_PresenceRemorque;
	}

	public void attacherRemorque() throws IllegalAttacherRemorqueException {
		if (!peutAttacherRemorque()) {
			throw new IllegalAttacherRemorqueException();
		}

		this.m_PresenceRemorque = true;
	}

	public boolean getPresenceRemorque() {
		return this.m_PresenceRemorque;
	}

	public void detacherRemorque() throws IllegalDetacherRemorqueException {
		if (!peutDetacherRemorque()) {
			throw new IllegalDetacherRemorqueException();
		}

		this.m_PresenceRemorque = false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.csf.dfc.exerciceramasse01.vehicule.Vehicule#Peut(java.lang.String)
	 */
	@Override
	public boolean peut(String p_Action) {
		switch (p_Action) {
		case "attacherRemorque":
			return peutAttacherRemorque();
		case "detacherRemorque":
			return peutDetacherRemorque();
		}

		return super.peut(p_Action);
	}

	@Override
	public void executerAction(String p_Action) throws IllegalVehiculeActionException {
		switch (p_Action) {
		case "attacherRemorque":
			this.attacherRemorque();
			break;

		case "detacherRemorque":
			this.detacherRemorque();
			break;

		default:
			super.executerAction(p_Action);
		}

	}

	@Override
	public String getTypeVehicule() {
		return "Camion";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.csf.dfc.exerciceramasse01.vehicule.Vehicule#getActionsPossibles()
	 */
	@Override
	public List<String> getActionsPossibles() {
		List<String> listeActionsPossibles = super.getActionsPossibles();

		if (this.peutAttacherRemorque()) {
			listeActionsPossibles.add(ATTACHER_REMORQUE);
		}

		if (this.peutDetacherRemorque()) {
			listeActionsPossibles.add(DETACHER_REMORQUE);
		}

		return listeActionsPossibles;
	}

}
