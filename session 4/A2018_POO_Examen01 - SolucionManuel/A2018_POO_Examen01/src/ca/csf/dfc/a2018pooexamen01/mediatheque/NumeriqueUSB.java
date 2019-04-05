/**
 * 
 */
package ca.csf.dfc.a2018pooexamen01.mediatheque;

/**
 * @author ManueLMaldonado
 *
 */
public class NumeriqueUSB extends Numerique{
	public NumeriqueUSB(int p_Id, String p_Titre) {
		super(p_Id, p_Titre);
	}
	
	public TypeMedia getType() {
		return TypeMedia.NumeriqueUSB;
	}
}
