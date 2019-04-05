package ca.csf.dfc.classes;

public class VehiculeFerroviaire {

	/**
     * Valeur minimale de la vitesse.
     */

    public final  int VITESSE_MIN = 0;

    /**
     * Valeur initiale du modele
     */
    public final static int MODELE_PAR_DEFAULT = 0;

    /**
     * Valeur initiale du reference
     */
    public final static  int REF_PAR_DEFAUT = 0;

    
    
	/**
     * Donnee membre indiquant le modele.
     */
    private int m_modele;

    /**
     * Donnee membre indiquant la reference
     */
    private int m_reference;

    /**
     * Donnee membre indiquant la vitesse du train
     */
    private int m_vitesse;

    /**
     * Donne pour la vitesse Maximal
     */
    private int m_vitesseMax;
    
    /**
     * Constructeur par defaut.
     */
    public VehiculeFerroviaire()
    {
        this.m_modele = MODELE_PAR_DEFAULT;
        this.m_reference = REF_PAR_DEFAUT;
        this.m_vitesse = VITESSE_MIN;
        this.m_vitesseMax = VITESSE_MIN;
    }

    /**
     * Constructeur qui initialise du train avec modele et reference
     * 
     * @param p_Modele
     *            , p_Modele, p_Ref
     */
    public VehiculeFerroviaire(int p_Modele, int p_Reference, int p_VitesseMax)
    {
        this.setModele(p_Modele);
        this.setRef(p_Reference);
        this.setVitesseMax(p_VitesseMax);
    }

    /**
     * Retourne le modele
     */
    public int getModele()
    {
        return m_modele;
    }
    
    /**
     * Pour modifier le  modele
     * 
     * @param p_Modele
     *            la nouvelle valeur.
     */
    public void setModele(int p_modele)
    {
    	Assertion.precondition( p_modele < 0 ,
				"Le valeur à deposer doit être positive");
    	
    	this.m_modele = p_modele;
    }

    
    /**
     * Retourne le reference
     */
    public int getRef()
    {
        return m_reference;
    }
    
    /**
     * Pour modifier le modele
     * 
     * @param p_Modele
     *            la nouvelle valeur.
     */
    public void setRef(int p_Reference)
    {
    	Assertion.precondition( p_Reference < 0 ,
				"Le valeur à deposer doit être positive");
    	
    	this.m_reference = p_Reference;
    }

    /**
     * Retourne le vitesse
     */
    public int getVitesse()
    {
        return m_vitesse;
    }
    
    /**
     * Pour modifier le modele
     * 
     * @param p_Modele
     *            la nouvelle valeur.
     */
    protected void setVitesse(int p_Vitesse)
    {
    	Assertion.precondition( p_Vitesse < 0 ,
				"Le valeur à deposer doit être positive");
    	
    	this.m_vitesse = p_Vitesse;
    }
    
    
    /**
     * Retourne le vitesseMax
     */
    public int getVitesseMax()
    {
        return m_vitesseMax;
    }
    
    /**
     * Pour modifier le modele
     * 
     * @param p_Modele
     *            la nouvelle valeur.
     */
    protected void setVitesseMax(int p_VitesseMax)
    {
    	Assertion.precondition( p_VitesseMax < 0 ,
				"Le valeur à deposer doit être positive");
    	
    	this.m_vitesseMax = p_VitesseMax;
    }
    
    /**
     * Methode Augmente la vitesse 
     * 
     */
    protected void accelerer() {
    	
    	Assertion.precondition( ((this.getVitesse() + 10) < getVitesseMax()) ,
				"valeur maximal, on ne peut accelerer plus");
    	
    	
       this.setVitesse(this.getVitesse() + 10);
	
    }
    
    /**
     * Methode Ralentir : Diminuer la vitesse
     * 
     */
    protected void ralentir() {
    	
    	Assertion.precondition( ((this.getVitesse() + 10) < this.VITESSE_MIN) ,
				"valeur maximal, on ne peut accelerer plus");    	
    	
       this.setVitesse(this.getVitesse() - 10);
    }
    
    
    /**
     * Methode subcharge
     */
    @Override
    public String toString()
    {
        return ("Vehicule Ferroviaire Modele: " + this.m_modele + " , " + "Reference: " + this.m_reference + " , " + "Vitesse Maximale: "
                + this.m_vitesseMax);
    }

    
}
