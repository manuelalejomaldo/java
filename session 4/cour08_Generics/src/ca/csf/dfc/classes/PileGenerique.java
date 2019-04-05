package ca.csf.dfc.classes;
import java.util.*;
//import ca.csf.*;

public class PileGenerique <TypeElement>{
	
	
	/**
	 * 
	 */
	private int m_taille;
		
	/**
	 * 
	 */
	private  Stack<TypeElement> m_tableau;
	
	/**
	 * 
	 */
	//private int m_nbElements = 0;
	
	/**
	 * @param p_taille
	 */
	public PileGenerique(int p_taille) 
	{
		
		this.m_taille = p_taille;
		
		this.m_tableau = new Stack<TypeElement>();
		
	}
	
	/**
	 * @return
	 */
	public boolean EstVide() {
		return (this.m_tableau.empty());
	} 
	
	/**
	 * @return
	 */
	public boolean EstPleine() {
		return (this.m_tableau.size()> m_taille);
	} 
	
	/**
	 * @return
	 */
	public TypeElement Dessus() {
		
		if (EstVide()) throw new Error("Pile Vide");
		
		return this.m_tableau.firstElement();
	}
		
	
	/**
	 * @param p_element
	 */
	public void Empiler(TypeElement p_element) {
		
		if (EstPleine()) throw new Error("Pile Pleine" + this.m_tableau.size());
		this.m_tableau.add(p_element); 
			
	}
	
	/**
	 * @return
	 */
	public TypeElement Depiler() {		
		
		if (EstVide()) throw new Error("Pile Vide");
		TypeElement lastelement = this.m_tableau.lastElement();
		this.m_tableau.removeElement(lastelement);
		
		return lastelement;		
	}
	
	@Override
    public String  toString()
    {
		StringBuilder strBuilder = new StringBuilder();
		
		
		strBuilder.append("\n Pile avec les éléments suivants:");
	    
	    
	    for ( TypeElement unElement : this.m_tableau) {
			System.out.print(unElement + " ");
		}
	    
	    return strBuilder.toString();		
    }
	
}


