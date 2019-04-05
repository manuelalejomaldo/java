package ca.csf.dfc.a2018pooexamen01.mediatheque;

public interface Media {
	public int getIdentifiant();
	public String getTitre();
	public String getType();
	public boolean estEmprunte();
	public void emprunter();
	public void rendre();
}
