/**
 * 
 */
package ca.csf.dfc.a2018pooexamen01.mediatheque;

/**
 * @author ManueLMaldonado
 *
 */
public class LivrePoche extends Livre{
	
	/**
	 * @param p_Id
	 * @param p_Titre
	 */
	public LivrePoche (int p_Id, String p_Titre) {
		super(p_Id,p_Titre);
	}
	
	/* (non-Javadoc)
	 * @see ca.csf.dfc.a2018pooexamen01.mediatheque.Livre#getType()
	 */
	@Override
	public TypeMedia getType() {
		return TypeMedia.LivrePoche;
	}
	
}
