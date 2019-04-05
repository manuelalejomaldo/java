package ca.csf.dfc.a2018pooexamen01.mediatheque;

import java.util.List;

public interface MediathequeRepository {
	public Media getMediaById(int p_Id);
	public List<Media> getMedia();
	public List<Media> trouverMediaParExpression(String p_TexteExpression);
}
