package ca.csf.dfc.poo;
import java.util.ArrayList;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class Message<T> implements IMessage{

	/**
	 * membre date d'envoi
	 */
	private final Date m_dateenv;
	/**
	 *Membre personne origine de type personne 
	 */
	private final IPersonne m_persOrigine;
	/**
	 * /**
     *Membre personne destinataire de type personne 
	 */
	private final IPersonne m_persDestinataire;
	 /**
	  * membre priorite de type priorite
	  */
	private final Priorite m_priorite;
	/**
	 * membre contenu de type String
	 */	
	private final T m_contenu;
	
	/**
	 * Le constructeur d'initialisation
	 * @param p_dateenv
	 * @param p_persOrigine
	 * @param p_persDestinataire
	 * @param p_priorite
	 * @param p_contenu
	 */
	public Message(Date p_dateenv, IPersonne p_persOrigine, IPersonne p_persDestinataire, Priorite p_priorite,
			T p_contenu) {
		
		this.m_dateenv = p_dateenv;
		this.m_persOrigine = p_persOrigine;
		this.m_persDestinataire = p_persDestinataire;
		this.m_priorite = p_priorite;
		this.m_contenu =  p_contenu;
	}

	/**
	 * Retourne le dateenv.
	 * @return le dateenv
	 */
	public Date getDateenv() {
		return this.m_dateenv;
	}

	/**
	 * Retourne le persOrigine.
	 * @return le persOrigine
	 */
	public IPersonne getPersOrigine() {
		return this.m_persOrigine;
	}

	/**
	 * Retourne le persDestinataire.
	 * @return le persDestinataire
	 */
	public IPersonne getPersDestinataire() {
		return this.m_persDestinataire;
	}

	/**
	 * Retourne le priorite.
	 * @return le priorite
	 */
	public Priorite getPriorite() {
		return this.m_priorite;
	}

	/**
	 * Retourne le contenu.
	 * @return le contenu
	 */
	public T getContenu() {
		return this.m_contenu;
	}

	/**
	 * 
	 *  (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[" + this.StringDate() + "de [" + this.m_persOrigine
				+ "] à [" + this.m_persDestinataire + "]  contenant["
				+ this.m_contenu + "]";
	}
		
	
	/**
	 * Afficher	la date sous la forme ("YYYY/MM/DD")
	 * @return
	 */
	 protected String StringDate()
	 {
		SimpleDateFormat ft = new SimpleDateFormat("YYYY/MM/DD");
		return ft.format(m_dateenv);
			      
	 }

	
	
	
		

}
