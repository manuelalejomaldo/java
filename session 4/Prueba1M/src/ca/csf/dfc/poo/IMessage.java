/**
 * 
 */
package ca.csf.dfc.poo;

import java.util.Date;

/**
 * @author ManueLMaldonado
 *
 */
public interface IMessage {

	public Date getDateenv();
	public IPersonne getPersOrigine();
	public IPersonne getPersDestinataire();
	public Priorite getPriorite();
	public <T> T getContenu();
	
}
