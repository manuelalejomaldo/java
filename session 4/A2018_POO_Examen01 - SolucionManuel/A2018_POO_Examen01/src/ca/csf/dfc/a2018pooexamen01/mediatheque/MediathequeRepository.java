package ca.csf.dfc.a2018pooexamen01.mediatheque;
import java.util.List;
/**
 * @author ManueLMaldonado
 *
 */
public interface MediathequeRepository {
	public IMedia getMediaById(int p_Id);
	public List<IMedia> getMedia();
	public List<IMedia> trouverMediaParExpression(String p_TexteExpression);
	public List<IMedia> trouverMediaParExpressionEtType(String p_TexteExpression, TypeMedia p_TypeMedia);
}
