package ca.csf.dfc.a2018pooexamen01.mediatheque;

public class LivreBroche implements Media {
	private int m_Id;
	private String m_Titre;
	
	public LivreBroche(int p_Id, String p_Titre) {
		this.m_Id = p_Id;
		this.m_Titre = p_Titre;
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
		// TODO Auto-generated method stub
		return super.toString();
	}
}
