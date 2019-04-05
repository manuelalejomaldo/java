/**
 * 
 */
package ca.csf.dfc.a2018pooexamen01.mediatheque;

/**
 * @author ManueLMaldonado
 *
 */
public class Numerique implements IMedia{

	private int m_Id;
	private String m_Titre;
	private boolean m_EstEmprunte;
	
	
	/**
	 * @param m_Id
	 * @param m_Titre
	 */
	public Numerique(int p_Id, String p_Titre) {
		this.m_Id = p_Id;
		this.m_Titre = p_Titre;
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
	public TypeMedia getType() {		
		return TypeMedia.Numerique;
	}

	@Override
	public boolean EstEmprunte() {		
		return this.m_EstEmprunte;
	}

	@Override
	public void Emprunter() {
		if (this.EstEmprunte()) {
			throw new IllegalArgumentException("Le volumen numerique est deja emprunté");
		}
		this.m_EstEmprunte = true;		
	}

	@Override
	public void Rendre() {
		if (!this.EstEmprunte()) {
			throw new IllegalArgumentException("Le volumen numerique est deja retourné");
		}
		this.m_EstEmprunte = false;		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Numerique [m_Id=" + m_Id + ", m_Titre=" + m_Titre + ", m_EstEmprunte=" + m_EstEmprunte + "]";
	}
	
	

}
