package exampleArchitecte;

import java.util.ArrayList;

public class GrosProject {

	private String m_NomProject;
	
	private Client m_client;
	
	private ArrayList<Architecte> m_Architects;
	
	public GrosProject(String p_NomProject, Client p_client) {
		
		this.m_NomProject = p_NomProject;
		this.m_client = p_client;
		this.m_Architects = new ArrayList<Architecte>();
	}

	/**
	 * @return the m_NomProject
	 */
	public String getM_NomProject() {
		return m_NomProject;
	}

	/**
	 * @return the m_client
	 */
	public Client getM_client() {
		return m_client;
	}

	/**
	 * @return the m_Architects
	 */
	public ArrayList<Architecte> getM_Architects() {
		return m_Architects;
	}
	
	public void addArchitecte(Architecte p_architecte) {
		this.m_Architects.add(p_architecte);
	}
}
