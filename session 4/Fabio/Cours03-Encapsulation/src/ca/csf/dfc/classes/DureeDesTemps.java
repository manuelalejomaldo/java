/**
 * 
 */
package ca.csf.dfc.classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author Fabio Fonseca
 *
 */
public class DureeDesTemps {
	
	/**
	 * Les nombres des secondes du temps
	 */
	private int m_Secondes;
	
	/**
	 * Les nombres des minutess du temps
	 */
	private int m_Minutes;
	
	/**
	 * Les nombres des heures du temps
	 */
	private int m_Heures;
		
	/**
	 * Sans aucune valeur
	 * Doit représenter une durée nulle
	 * Constructeur par défault.
	 */
	public DureeDesTemps() 
	{
		
	}
	
	/**
	 * * @param p_secondes
	 * 
	 * Á partir seulement du nombre de secondes
	 * Le nombre fourni doit être plus grand ou égal à zéro
	 * Constructeur par défault.
	 */
	public DureeDesTemps(int p_secondes) 
	{
		if (p_secondes > 0) {
			throw new IllegalArgumentException("Le seconde est invalid !");
		}
		
		this.m_Secondes = p_secondes;
	}
	
	/**
	 * @param p_secondes
	 * @param p_minutes
	 * 
	 * Á partir du nombre de minutes e de secondes
	 * Le nombre fourni doit être plus grand ou égal à zéro
	 * Constructeur par défault.
	 */
	public DureeDesTemps(int p_minutes, int p_secondes) 
	{
		if (p_secondes < 0 || p_secondes > 59) {
			throw new IllegalArgumentException("Le seconde est invalid !");
		
		}else if(p_minutes > 0) {
			throw new IllegalArgumentException("Le minute est invalid !");
		}
		
		this.m_Secondes = p_secondes;
	}
	
	/**
	 * @param p_secondes
	 * @param p_minutes
	 * @param p_heures
	 * 
	 * Á partir des trois parameters
	 */
	public DureeDesTemps(int p_heures, int p_minutes, int p_secondes) {
		
		if (p_secondes < 0 || p_secondes > 59) {
			throw new IllegalArgumentException("Le seconde est invalid !");
		
		}else if(p_minutes < 0 || p_minutes > 59) {
			throw new IllegalArgumentException("Le minute est invalid !");
		
		}else if(p_heures > 0) {
			throw new IllegalArgumentException("L'heure est invalid !");
		}
		
		this.m_Heures = p_heures;
		this.m_Minutes = p_minutes;
		this.m_Secondes = p_secondes;
	}

	/**
	 * Return le secondes.
	 * @return the secondes
	 */
	public int getSecondes() {
		return this.m_Secondes;
	}

	/**
	 * Pour modifier le secondes.
	 * @param p_secondes the secondes to set
	 */
	public void setSecondes(int p_secondes) {
		
		if (p_secondes < 0 || p_secondes > 59) {
			throw new IllegalArgumentException("Le seconde est invalid !");
		}
		
		this.m_Secondes = p_secondes;
	}

	/**
	 * Return le minutes.
	 * @return the minutes
	 */
	public int getMinutes() {
		return this.m_Minutes;
	}

	/**
	 * Pour modifier le minutes.
	 * @param p_minutes the minutes to set
	 */
	public void setMinutes(int p_minutes) {
		
		if (p_minutes < 0 || p_minutes > 59) {
			throw new IllegalArgumentException("Le minute est invalid !");
		}
		
		this.m_Minutes = p_minutes;
	}

	/**
	 * Return le heures.
	 * @return the heures
	 */
	public int getHeures() {
		return this.m_Heures;
	}

	/**
	 * Pour modifier le heures.
	 * @param p_heures the heures to set
	 */
	public void setHeures(int p_heures) {
		
		if (p_heures < 0) {
			throw new IllegalArgumentException("L'Heure invalid !");
		}
		
		this.m_Heures = p_heures;
	}
	
	/**
	 * Pour afficher la durée du temps
	 */
	public String toString() 
	{
		//ou SimpleDateFormat ????
		NumberFormat formatter = new DecimalFormat("00");
		
		String min = formatter.format(this.m_Minutes);
		String sec = formatter.format(this.m_Secondes);		
		
		return this.m_Heures + ":" + min + ":" + sec;
	}
	
	/**
	 * Ajouter deux durées
	 * L'addition doit créer une nouvelle durée, sans modifier les deux durées initiales
	 * Exemple, 4:43:18 + 0:33:17 doit donner 1:16:35
	 */
	public String AjouterHeure(DureeDesTemps p_d1, DureeDesTemps p_d2) {
		
		String p1 = p_d1.toString();
		String p2 = p_d2.toString();
		
		LocalTime primeiro = LocalTime.parse(p1);
		LocalTime segundo  = LocalTime.parse(p2);

		LocalTime total = primeiro.plusHours(segundo.getHour())
		                          .plusMinutes(segundo.getMinute())
								  .plusSeconds(segundo.getSecond());
		
		return total.toString(); 
		
	}
	
	
}
