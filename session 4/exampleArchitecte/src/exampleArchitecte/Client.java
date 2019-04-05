/**
 * 
 */
package exampleArchitecte;


import java.util.ArrayList;

/**
 * @author ManueLMaldonado
 *
 */
public class Client {
	
	private String m_nom;
	
	private ArrayList<GrosProject> m_GrossProjects;
	
	public Client(String p_Nom) {
		
		this.m_nom = p_Nom;
		this.m_GrossProjects = new ArrayList<GrosProject>();
	}
	
	
	public void addGrossProjects(GrosProject p_grosProject) {
		
		this.m_GrossProjects.add(p_grosProject);
	}
	
	public String getNom() {
		return this.m_nom;
	}
}
