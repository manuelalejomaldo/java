package ca.csf.dfc.classes;


public class TrainVoyageur extends VehiculeFerroviaire{
	

	/**
     * Valeur minimale de la vitesse pour train vayageur.
     */

    public final static int VITESSE_MAX = 130;
	
	
	/**
     * Constructeur par defaut.
     */
    public TrainVoyageur()
    {
        
    }

    /**
     * Constructeur qui initialise du train avec modele et reference
     * 
     * @param p_Modele
     *            , p_Modele, p_Ref
     */
    public TrainVoyageur(int p_Modele, int p_reference)
    {
        super(p_Modele,p_reference, VITESSE_MAX);    	
    }
    
    /**
     * Methode subcharge
     */
    @Override
    public String toString()
    {
        return ("Vehicule Ferroviaire type Train Voyageur Modele: " + this.getModele() + " , " + "Reference: " + this.getRef() + " , " + "Vitesse Maximale: "
                + this.getVitesseMax());
    }

}
