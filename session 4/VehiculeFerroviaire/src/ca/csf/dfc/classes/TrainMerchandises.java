package ca.csf.dfc.classes;

public class TrainMerchandises extends VehiculeFerroviaire {

	/**
     * Valeur minimale de la vitesse pour train Merchandises.
     */

    public final static int VITESSE_MAX = 110;

	
    /**
     * Donnee membre indiquant l'existence d'une attache-remorque.
     */
    private boolean m_attRemorque;
    
    
	/**
     * Constructeur par defaut.
     */
    public TrainMerchandises()
    {
        this.setAttacheRemorque(false);
    }

    /**
     * Constructeur qui initialise du train avec modele et reference
     * 
     * @param p_Modele
     *            , p_Modele, p_Ref
     */
    public TrainMerchandises(int p_Modele, int p_reference)
    {
    	super(p_Modele,p_reference, VITESSE_MAX);   
    	this.setAttacheRemorque(false);
    }

    
    /**
     * @return  vrai remorquer
     */
    private boolean getAttRemorque()
    {
        return this.m_attRemorque;
    }

    /**
     * set remorquer
     * 
     * @param 
     *            
     */
    private void setAttacheRemorque(boolean p_attRemorque)
    {
        this.m_attRemorque = p_attRemorque;
    }

    /**
     * Methode pour attacher
     */
    public void att()
    {
    	Assertion.precondition( this.getVitesse() != 0 ,
				"pour attacher le train la vitesse doit être null");
				
		Assertion.precondition( this.getAttRemorque() == true  ,
				"pour attacher le train, il doit être detaché");
		
    	this.setAttacheRemorque(true);
        
    }

    /**
     * Methode pour detacher
     */
    public void detacher()
    {
    	Assertion.precondition( this.getVitesse() != 0 ,
				"pour detacher le train la vitesse doit être null");
    	
    	Assertion.precondition( this.getAttRemorque() == false  ,
				"pour attacher le train, il doit être attaché");
    	
    	this.setAttacheRemorque(false);
       
    }
    
    
    /**
     * Methode subcharge
     */
    @Override
    public String toString()
    {
        return ("Vehicule Ferroviaire type Train Merchandises Modele: " + this.getModele() + " , " + "Reference: " + this.getRef() + " , " + "Vitesse Maximale: "
                + this.getVitesseMax());
    }


}
