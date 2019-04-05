/**
 * 
 */
package ca.csf.dfc.solid.donnees;

import java.util.ArrayList;
import java.util.List;

import ca.csf.dfc.solid.classes.Fournisseur;
import ca.csf.dfc.solid.interfaces.IFournisseurRepository;

/**
 * @author ManueLMaldonado
 *
 */
public class DonneesFournisseurRepository implements IFournisseurRepository{

	/**
	 * 
	 */
	private List<Fournisseur> m_Fournisseurs;
	
	
	
	/**
	 * @param m_Fournisseurs
	 */
	public DonneesFournisseurRepository() {
		
		Fournisseur f1 = new Fournisseur(1, "StockPC", "addres Quebec StockPC ");
		Fournisseur f2 = new Fournisseur(2, "Costco", "addres Quebec Costco ");
		Fournisseur f3 = new Fournisseur(3, "BestBuy", "addres Quebec BestBuy ");
		
		
		//Additionner fournisseur au Fournisseurs 
		
		this.m_Fournisseurs = new ArrayList<Fournisseur>();
		
		this.m_Fournisseurs.add(f1);
		this.m_Fournisseurs.add(f2);
		this.m_Fournisseurs.add(f3);
		
		
	}

	/* (non-Javadoc)
	 * @see ca.csf.dfc.solid.interfaces.IFournisseurRepository#getFournisseurs()
	 */
	@Override
	public List<Fournisseur> getFournisseurs() {
		
		return this.m_Fournisseurs;
	}
	
	/* (non-Javadoc)
	 * @see ca.csf.dfc.solid.interfaces.IFournisseurRepository#estFournisseur(ca.csf.dfc.solid.classes.Fournisseur)
	 */
	@Override
	public Boolean estFournisseur(Fournisseur p_Fournisseur) {
		
		return this.m_Fournisseurs.contains(p_Fournisseur);
	}

	/**
	 * @param p_Fournisseurs
	 */
	public void addFournisseur(Fournisseur p_Fournisseurs) {
		
		this.m_Fournisseurs.add(p_Fournisseurs);
	}
	
	



	
	
}
