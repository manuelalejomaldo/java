/**
 * 
 */
package ca.csf.dfc.a2018pooexamen01.mediatheque;

/**
 * @author ManueLMaldonado
 *
 */
public class CompactDisk extends Numerique{
	
	public CompactDisk(int p_Id, String p_Titre) {
		super( p_Id, p_Titre);
	}
	
	@Override
	public TypeMedia getType() {
		return TypeMedia.CompactDisk;
	}
}
