package ca.csf.dfc.a2018pooexamen01.donneestest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import ca.csf.dfc.a2018pooexamen01.mediatheque.LivreBroche;
import ca.csf.dfc.a2018pooexamen01.mediatheque.Media;
import ca.csf.dfc.a2018pooexamen01.mediatheque.MediathequeRepository;

public class DonneesTestsMediathequeRepository implements MediathequeRepository {
	private List<Media> m_ListeMedia;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ca.csf.dfc.a2018pooexamen01.mediatheque.MediathequeRepository#getMediaById(
	 * int)
	 */
	@Override
	public Media getMediaById(int p_Id) {
		Optional<Media> resultat = m_ListeMedia.stream().filter(m -> m.getIdentifiant() == p_Id)
				.collect(Collectors.reducing((a, b) -> null));

		if (resultat.isPresent()) {
			return resultat.get();
		}

		return null;
	}

	@Override
	public List<Media> getMedia() {
		return m_ListeMedia;
	}

	@Override
	public List<Media> trouverMediaParExpression(String p_TexteExpression) {
		String texteExpression = p_TexteExpression.toLowerCase();
		
		return m_ListeMedia
				.stream()
				.filter(m -> m.getTitre().toLowerCase().contains(texteExpression))
				.collect(Collectors.toList());
	}

	public DonneesTestsMediathequeRepository() {
		this.m_ListeMedia = Arrays.asList(
				new LivreBroche(1, "Les Fourmis"), new LivreBroche(2, "Le Jour des fourmis"),
				new LivreBroche(3, "La Révolution des fourmis"), new LivreBroche(4, "Les Thanatonautes"),
				new LivreBroche(5, "L'Empire des anges"), new LivreBroche(6, "Nous les dieux"),
				new LivreBroche(7, "Le Souffle des dieux"), new LivreBroche(8, "Le Mystère des dieux"),
				new LivreBroche(9, "Le Père de nos pères"), new LivreBroche(10, "L'Ultime Secret"),
				new LivreBroche(11, "Le Rire du cyclope"), new LivreBroche(12, "Troisième Humanité"),
				new LivreBroche(13, "Les Micro-Humains"), new LivreBroche(14, "La Voix de la Terre"),
				new LivreBroche(15, "Le Papillon des étoiles"), new LivreBroche(16, "Le Miroir de Cassandre"),
				new LivreBroche(17, "Le Sixième Sommeil"), new LivreBroche(18, "Demain les chats"),
				new LivreBroche(19, "Depuis l'au-delà"), new LivreBroche(20, "La Boîte de Pandore")
		// ,
//				new CompactDisk(21, "Angels Fall First"),
//				new CompactDisk(22, "Oceanborn"),
//				new CompactDisk(23, "Wishmaster"),
//				new CompactDisk(24, "Century Child"),
//				new CompactDisk(25, "Once"),
//				new CompactDisk(26, "Dark Passion Play"),
//				new CompactDisk(27, "Herzeleid"),
//				new CompactDisk(28, "Sehnsucht"),
//				new CompactDisk(29, "Mutter"),
//				new CompactDisk(30, "Reise, Reise"),
//				new CompactDisk(31, "Rosenrot"),
//				new CompactDisk(32, "Liebe ist für alle da")
		);
	}
}
