package ca.csf.dfc.exerciceramasse01.vehicule;

import java.util.List;

public class Decapotable extends Vehicule {
	private boolean m_toitOuvert = false;
	private static final int VITESSE_MAX_FONCTIONNEMENT_TOIT = 10;

	public static final String FERMER_TOIT = "fermerToit";
	public static final String OUVRIR_TOIT = "ouvrirToit";

	public Decapotable(String p_Marque, String p_Modele) {
		super(p_Marque, p_Modele, 120);
	}

	public boolean peutOuvrirToit() {
		return !this.m_toitOuvert && this.getVitesse() <= VITESSE_MAX_FONCTIONNEMENT_TOIT;
	}

	public boolean peutFermerToit() {
		return this.m_toitOuvert && this.getVitesse() <= VITESSE_MAX_FONCTIONNEMENT_TOIT;
	}

	public void ouvrirToit() throws IllegalOuvrirToitException {
		if (!peutOuvrirToit()) {
			throw new IllegalOuvrirToitException();
		}

		this.m_toitOuvert = true;
	}

	public void fermerToit() throws IllegalFermerToitException {
		if (!peutFermerToit()) {
			throw new IllegalFermerToitException();
		}

		this.m_toitOuvert = false;
	}

	@Override
	public boolean peut(String p_Action) {
		switch (p_Action) {
		case "fermerToit":
			return peutFermerToit();
		case "ouvrirToit":
			return peutOuvrirToit();
		}
		return super.peut(p_Action);
	}

	@Override
	public void executerAction(String p_Action) throws IllegalVehiculeActionException {
		switch (p_Action) {
		case "fermerToit":
			this.fermerToit();
			break;

		case "ouvrirToit":
			this.ouvrirToit();
			break;
			
		default:
			super.executerAction(p_Action);
		}

	}

	@Override
	public String getTypeVehicule() {
		return "Decapotable";
	}

	@Override
	public List<String> getActionsPossibles() {
		List<String> listeActionsPossibles = super.getActionsPossibles();

		if (this.peutOuvrirToit()) {
			listeActionsPossibles.add(OUVRIR_TOIT);
		}

		if (this.peutFermerToit()) {
			listeActionsPossibles.add(FERMER_TOIT);
		}

		return listeActionsPossibles;
	}
}
