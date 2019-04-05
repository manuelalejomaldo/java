package ca.csf.dfc.classes;

public class DureeDeTemps {
	// Constantes publiques

	private final static int VALEUR_MIN = 0;	
	private final static int VALEUR_MAX = 59;	
	private final static int MINUTES_PAR_HEURE = 60;
	
    // Constantes privées

	
	
	
    // Données membres

	private int m_nbHeures;
	private int m_nbMinutes;
	private int m_nbSecondes;
	
	
	
	
    // Constructeurs : en premier, le constructeur par défaut
    
	/**
	* Constructeur par défaut. 
	*/
	public DureeDeTemps() 
	{
		
		this.setNbHeures(VALEUR_MIN); 
		this.setNbMinutes(VALEUR_MIN);
		this.setNbSecondes(VALEUR_MIN);
	}
	
	/*
	 *Constructor à partir du nombre de secondes 
	 */
	public DureeDeTemps(int p_nbSecondes)
	{				
		Assertion.precondition(p_nbSecondes < VALEUR_MIN, 
				"Les seconds sont negatifs");
		
		//int secondesAux = p_nbSecondes%MINUTES_PAR_HEURE;
		int minutesAux = VALEUR_MIN;
		int heuresAux = VALEUR_MIN;
		
		if(p_nbSecondes > VALEUR_MAX) 
		{
			minutesAux = (p_nbSecondes/MINUTES_PAR_HEURE)%MINUTES_PAR_HEURE;
			
			if(p_nbSecondes >= MINUTES_PAR_HEURE*MINUTES_PAR_HEURE)
			{
				heuresAux = (p_nbSecondes/(MINUTES_PAR_HEURE*MINUTES_PAR_HEURE));		
			}
		}
		
		this.setNbHeures(heuresAux); 
		this.setNbMinutes(minutesAux);
		this.setNbSecondes(p_nbSecondes%MINUTES_PAR_HEURE);
	}
	
	
	
	/*
	 *Constructor à partir du nombre de minutes et secondes 
	 */
	public DureeDeTemps(int p_nbMinutes, int p_nbSecondes)
	{				
		
		//corregirme minutos no tiene restricciones, solo positivo
		
		int heuresAux = VALEUR_MIN;
		int minutesAux = p_nbMinutes;
		
		if( p_nbMinutes >= VALEUR_MAX) 
		{
			heuresAux = p_nbMinutes/MINUTES_PAR_HEURE;
			minutesAux = p_nbMinutes%MINUTES_PAR_HEURE;
		} 
		
		this.setNbHeures(heuresAux); 
		this.setNbMinutes(minutesAux);
		this.setNbSecondes(p_nbSecondes);
	}
	
	/*
	 * Constructeur d'initialisation plus general
	 * @param p_nbHeures
	 * @param p_nbMinutes
	 * @param p_nbSecondes
	 */
	public DureeDeTemps(int p_nbHeures, 
						int p_nbMinutes,
						int p_nbSecondes) 
	{
		this.setNbHeures(p_nbHeures); 
		this.setNbMinutes(p_nbMinutes);
		this.setNbSecondes(p_nbSecondes);
	}

	
	
	
    // Set et Get dans le même ordre que les déclarations 
	
	/**
	*Retourne le nbHeures
	 * @return the nbHeures
	 */
	public int getNbHeures() {
		return this.m_nbHeures;
	}

	/**
	* Pour modifier le nbHeures.
	 * @param p_nbHeures Nouvelle valeur
	 */
	public void setNbHeures(int p_nbHeures) {
		
		Assertion.precondition(p_nbHeures < VALEUR_MIN, 
				"L'heure est negatifs");
		
		this.m_nbHeures = p_nbHeures;
	}

	/**
	*Retourne le nbMinutes
	 * @return the nbMinutes
	 */
	public int getNbMinutes() {
		return this.m_nbMinutes;
	}

	/**
	* Pour modifier le nbMinutes.
	 * @param p_nbMinutes Nouvelle valeur
	 */
	public void setNbMinutes(int p_nbMinutes) {
		
		Assertion.precondition(p_nbMinutes < VALEUR_MIN, 
				"Les minutes sont negatifs");
		
		Assertion.precondition(p_nbMinutes > VALEUR_MAX, 
				"Les minutes sont plus de 59");
		
		this.m_nbMinutes = p_nbMinutes;
	}

	/**
	*Retourne le nbSecondes
	 * @return the nbSecondes
	 */
	public int getNbSecondes() {
		return this.m_nbSecondes;
	}

	/**
	* Pour modifier le nbSecondes.
	 * @param p_nbSecondes Nouvelle valeur
	 */
	public void setNbSecondes(int p_nbSecondes) {
		
		Assertion.precondition(p_nbSecondes < VALEUR_MIN, 
				"Les seconds sont negatifs");
		
		Assertion.precondition(p_nbSecondes > VALEUR_MAX, 
				"Les secondes sont plus de 59");
		
		this.m_nbSecondes = p_nbSecondes;
	}
	
    
	
	
	
	
	
	// des données membres

	
	
	
    // toString()
    
	@Override
    public String toString()
    {
		return "« " + this.m_nbHeures + ":" + this.m_nbMinutes + ":" + this.m_nbSecondes + " »";
    }
	
	
	// Autres méthodes publiques

	public DureeDeTemps additionDureeDeTemps(DureeDeTemps p_duree2) 
	{
		int secondes= (this.m_nbSecondes + p_duree2.m_nbSecondes)%MINUTES_PAR_HEURE;
		
		int minutes = (((this.m_nbSecondes + p_duree2.m_nbSecondes)/MINUTES_PAR_HEURE) 
					+ (this.m_nbMinutes + p_duree2.m_nbMinutes)) 
					% MINUTES_PAR_HEURE;
		
		int heures = (((((this.m_nbSecondes + p_duree2.m_nbSecondes)/MINUTES_PAR_HEURE) 
					+ (this.m_nbMinutes + p_duree2.m_nbMinutes)) / MINUTES_PAR_HEURE)
					+(this.m_nbHeures+ p_duree2.m_nbHeures))
					%MINUTES_PAR_HEURE;
		
		DureeDeTemps DureeDeTempsAddition = new DureeDeTemps(heures,minutes,secondes);
		
		return DureeDeTempsAddition;
	}
	
	
    // Méthodes privées

	
	
	
}
