package ca.csf.dfc.a2018pooexamen01.mediatheque;

/**
 * @author ManueLMaldonado
 *
 */
public interface IMedia {
	public int getIdentifiant();
	public String getTitre();
	public TypeMedia getType();
	public boolean EstEmprunte();
	public void Emprunter();
	public void Rendre();
}
