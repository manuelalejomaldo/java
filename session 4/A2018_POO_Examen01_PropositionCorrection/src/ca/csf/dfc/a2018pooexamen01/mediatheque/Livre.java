package ca.csf.dfc.a2018pooexamen01.mediatheque;

public class Livre implements Media {
	private int m_Id;
	private String m_Titre;
	private boolean m_EstEmprunte;
	
	public Livre(int p_Id, String p_Titre) {
		this.m_Id = p_Id;
		this.m_Titre = p_Titre;
		this.m_EstEmprunte = false;
	}
	
	@Override
	public boolean estEmprunte( ) {
		return this.m_EstEmprunte;
	}
	
	@Override
	public void emprunter() {
		if (this.estEmprunte()) {
			throw new IllegalArgumentException();
		}
		this.m_EstEmprunte = true;
	}

	@Override
	public void rendre() {
		if (!this.estEmprunte()) {
			throw new IllegalArgumentException();
		}
		this.m_EstEmprunte = false;
	}
	
	@Override
	public int getIdentifiant() {
		return this.m_Id;
	}

	@Override
	public String getTitre() {
		return this.m_Titre;
	}

	@Override
	public String getType() {
		return "LivreBroche";
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() 
				+ "(id: " + this.getIdentifiant()
				+ ", Titre: " + this.getTitre()
				+ ", EstEmprunte: " + this.estEmprunte()
				+ ")";
	}
}
