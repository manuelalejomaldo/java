package ca.csf.dfc.reservation;

import java.time.LocalDate;

public class ResultatRessourceStatut {
	private Ressource m_ressource;
	private boolean m_disponible;
	private LocalDate m_date;
	
	public ResultatRessourceStatut(Ressource p_ressource, boolean p_disponible, LocalDate p_date) {
		this.m_ressource = p_ressource;
		this.m_disponible = p_disponible;
		this.m_date = p_date;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.m_ressource.toString());
		sb.append(this.m_disponible?" disponible ": " déjà réservée ");
		sb.append("pour le ");
		sb.append(this.m_date.toString());
		
		return sb.toString();
	}
	
}
