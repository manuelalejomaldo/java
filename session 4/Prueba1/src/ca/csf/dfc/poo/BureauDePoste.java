package ca.csf.dfc.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;

public class BureauDePoste<T> {

	/**
	 * liste de message
	 */
	private ArrayList<Message> m_listmessage;
	
	/**
	 * permet de savoir si le message est envoyé avec accusé reception
	 */
	private boolean m_AccuseReception;

	/**
	 * liste
	 */
	private ArrayList<String> m_journal;
	/**
	 * L'envoi de message : ce service a besoin de deux personnes en paramètres (l'envoyeur et le
     * destinataire), du contenu du message et d'un booléen indiquant si le message doit être envoyé en
     * express avec Accusé de Réception (AR) ou pas.
	 * @param <T>
	 * @param p_persEnvoyeur
	 * @param p_persDestinataire
	 * @param p_message
	 * @param b
	 */
	 
	public void envoi(Personne p_persEnvoyeur,Personne  p_persDestinataire, T p_contenu,boolean express)
	{
		Message message=null;
		
		if((p_contenu instanceof String) && (express=true))
		{
			
			message=new XpressAR(new Date(),p_persEnvoyeur,p_persDestinataire,Priorite.VeryHigh,(String)p_contenu);
			m_AccuseReception=true;
		}
		else if((p_contenu instanceof String) && (express=false))
		{
			message  =new Lettre (new Date(),p_persEnvoyeur,p_persDestinataire,Priorite.Default,(String)p_contenu);
			m_AccuseReception=true;
		}else if(p_contenu instanceof ImageIcon)
		{
			message=new CartePostale(new Date(),p_persEnvoyeur,p_persDestinataire,Priorite.Default,(ImageIcon)p_contenu);

		}else
		{
			message = new Colis(new Date(),p_persEnvoyeur,p_persDestinataire,Priorite.Default,(Object)p_contenu);
		}
		
		this.m_listmessage.add(message);
		this.m_journal.add(message.toString()+"==>Message envoyé");
	}

	/**
	 * retourne la liste de message
	 * @param p_personne
	 * @param b
	 * @return
	 */
	//Ce service retourne la collection des messages qui vont etre stockés
	//p_personne a trouver sa collection des messages et ses messages seront stockés 
	// dans la liste
	//ces messages seront stockés selon la priorité
	
	public ArrayList <Message> getListemessage(Personne p_personne, boolean b)
	{
		
		ArrayList<Message>msg=new ArrayList<Message>();
		
		for(Message m : this.m_listmessage)
		{
			if(m.getPersDestinataire().getId()==p_personne.getId())
			{
				msg.add(m);
			}
				
		}
		 
		
	
		return msg;
	}

	
	/**
	 * Retourne le accuseReception.
	 * @return le accuseReception
	 */
	public boolean isAccuseReception() {
		return this.m_AccuseReception;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		for (String s : m_journal)
		{
		    sb.append(s);
		    sb.append("\t");
		}
		return sb.toString();
	}

	
	
	

	
	
	
	
}
