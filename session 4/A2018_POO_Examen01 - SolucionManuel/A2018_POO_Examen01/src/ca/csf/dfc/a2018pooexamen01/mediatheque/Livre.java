/**
 * 
 */
package ca.csf.dfc.a2018pooexamen01.mediatheque;

/**
 * @author ManueLMaldonado
 *
 */
public class Livre implements IMedia{

	private int m_Id;
	private String m_Titre;
	private boolean m_EstEmprunte;
	
	

	/**
	 * @param m_Id
	 * @param m_Titre
	 * 
	 */
	public Livre(int p_id, String p_titre) {
		this.m_Id = p_id;
		this.m_Titre = p_titre;		
		this.m_EstEmprunte = false;
	}
		
	@Override
	public int getIdentifiant() {		
		return this.m_Id;
	}

	/**
	 * @return the m_EstEmprunte
	 */
	public boolean EstEmprunte() {
		return m_EstEmprunte;
	}

	@Override
	public String getTitre() {		
		return this.m_Titre;
	}

	@Override
	public TypeMedia getType() {		
		return TypeMedia.Livre;
	}


	@Override
	public void Emprunter() {		
		if (this.EstEmprunte()) {
			throw new IllegalArgumentException("Le livre est deja emprunté");
		}
		this.m_EstEmprunte = true;
	}

	@Override
	public void Rendre() {
		if (!this.EstEmprunte()) {
			throw new IllegalArgumentException("Le livre est deja retourné");
		}
		this.m_EstEmprunte = false;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livre [m_Id=" + m_Id + ", m_Titre=" + m_Titre + ", m_EstEmprunte=" + m_EstEmprunte + "]";
	}
	
	
	
}
