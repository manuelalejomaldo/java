/**
 * 
 */
package ca.csf.dfc.exerciceramasse01.vehicule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pierre-François Léon
 *
 */
public abstract class Vehicule {
	private String m_Marque;
	private String m_Modele;
	private int m_VitesseMax;
	private int m_Vitesse;
	final private int m_PasAcceleration = 10;

	public static final String ACCELERER = "accelerer";
	public static final String RALENTIR = "ralentir";

	protected Vehicule(String p_Marque, String p_Modele, int p_VitesseMax) {
		this(p_Marque, p_Modele, p_VitesseMax, 0);
	}

	protected Vehicule(String p_Marque, String p_Modele, int p_VitesseMax, int p_VitesseActuelle) {
		this.m_Marque = p_Marque;
		this.m_Modele = p_Modele;
		this.m_Vitesse = p_VitesseActuelle;

		this.m_VitesseMax = p_VitesseMax;
	}

	protected boolean peutAccelerer() {
		return this.m_Vitesse + this.m_PasAcceleration <= this.m_VitesseMax;
	}

	protected boolean peutRalentir() {
		return this.m_Vitesse - this.m_PasAcceleration >= 0;
	}

	public boolean peut(String p_Action) {
		switch (p_Action) {
		case "accelerer":
			return peutAccelerer();

		case "ralentir":
			return peutRalentir();
		}

		return false;
	}

	public void executerAction(String p_Action) throws IllegalVehiculeActionException {
		switch (p_Action) {
		case "accelerer":
			this.accelerer();
			break;

		case "ralentir":
			this.ralentir();
			break;
		default:
			throw new IllegalArgumentException("p_Action");
		}
	}

	public final void accelerer() throws IllegalAccelerationException {
		if (!peutAccelerer()) {
			throw new IllegalAccelerationException();
		}

		this.m_Vitesse += this.m_PasAcceleration;
	}

	public final void ralentir() throws IllegalRalentirException {
		if (!peutRalentir()) {
			throw new IllegalRalentirException();
		}

		this.m_Vitesse -= this.m_PasAcceleration;
	}

	public abstract String getTypeVehicule();

	/**
	 * Retourne la marque
	 * 
	 * @return la marque
	 */
	public String getMarque() {
		return this.m_Marque;
	}

	/**
	 * Retourne le modele
	 * 
	 * @return le modele
	 */
	public String getModele() {
		return this.m_Modele;
	}

	/**
	 * Retourne la vitesseMax
	 * 
	 * @return la vitesseMax
	 */
	public int getVitesseMax() {
		return this.m_VitesseMax;
	}

	/**
	 * Retourne la vitesse
	 * 
	 * @return la vitesse
	 */
	public int getVitesse() {
		return this.m_Vitesse;
	}

	public List<String> getActionsPossibles() {
		List<String> listeActionsPossibles = new ArrayList<String>();

		if (this.peutAccelerer()) {
			listeActionsPossibles.add(ACCELERER);
		}

		if (this.peutRalentir()) {
			listeActionsPossibles.add(RALENTIR);
		}

		return listeActionsPossibles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTypeVehicule() + "(Marque: " + this.getMarque() + ", Modele:" + this.getModele() + ", Vitesse:"
				+ this.getVitesse() + ")";
	}

}
