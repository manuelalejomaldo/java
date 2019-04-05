package ca.csf.dfc.classes;

public class TrainGrandeVitesse extends VehiculeFerroviaire{

	/**
     * Valeur minimale de la vitesse pour train GrandeVitesse.
     */

    public final static int VITESSE_MAX = 350;
    
    /**
     * Valeur minimale de la vitesse pour WIFI du train GrandeVitesse.
     */

    public final static int VITESSE_WIFI = 200;

	
    /**
     * Donnee membre indiquant wifi.
     */
    private boolean m_wifi;
    
    
    
	/**
     * Constructeur par defaut.
     */
    public TrainGrandeVitesse()
    {
    	this.setWifi(false);
    }

    /**
     * Constructeur qui initialise du train avec modele et reference
     * 
     * @param p_Modele
     *            , p_Modele, p_Ref
     */
    public TrainGrandeVitesse(int p_Modele, int p_reference)
    {
    	super(p_Modele,p_reference, VITESSE_MAX);
    	this.setWifi(false);
    }
    
    /**
     * @return  vrai wifi
     */
    private boolean getWifi()
    {
        return this.m_wifi;
    }

    /**
     * set wifi
     * 
     * @param 
     *            
     */
    private void setWifi(boolean p_wifi)
    {
        this.m_wifi = p_wifi;
    }

    /**
     * Methode pour connecter
     */
    public void connecterWifi()
    {
    	Assertion.precondition( this.getVitesse() < VITESSE_WIFI ,
				"pour connecter au WIFI le train doit être la vitesse de 200 km/h");
				
		Assertion.precondition( this.getWifi() == true  ,
				"pour connecter au WIFI, il faut être deconecté");
		
    	this.setWifi(true);
        
    }

    /**
     * Methode pour deconnecter wifi
     */
    public void deconnecterWifi()
    {
    	Assertion.precondition( this.getWifi() == false  ,
				"pour connecter au WIFI, il faut être deconecté");
    	
    	this.setWifi(false);
       
    }
    
    /**
     * Methode subcharge
     */
    @Override
    public String toString()
    {
        return ("Vehicule Ferroviaire type Train GrandeVitesse Modele: " + this.getModele() + " , " + "Reference: " + this.getRef() + " , " + "Vitesse Maximale: "
                + this.getVitesseMax());
    }

}
