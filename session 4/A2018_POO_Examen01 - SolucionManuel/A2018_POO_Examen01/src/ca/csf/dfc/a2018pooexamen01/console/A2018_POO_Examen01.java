package ca.csf.dfc.a2018pooexamen01.console;
import java.awt.List;

import ca.csf.dfc.a2018pooexamen01.donneestest.DonneesTestsMediathequeRepository;
import ca.csf.dfc.a2018pooexamen01.mediatheque.*;
import ca.csf.dfc.a2018pooexamen01.mediatheque.IMedia;
import ca.csf.dfc.a2018pooexamen01.mediatheque.Livre;
import ca.csf.dfc.a2018pooexamen01.mediatheque.MediathequeRepository;



/**
 * @author ManueLMaldonado
 *
 */
public class A2018_POO_Examen01 {
	static public void main(String[] args) {
		
		IMedia l1 = new Livre(555,"Poo Java");
		IMedia l2 = new LivrePoche(556,"C# .net");
		IMedia l3 = new LivreBroche(557,"Phyton pour les nulls");
		IMedia n1 = new Numerique(771,"SOLID");
		IMedia n2 = new NumeriqueUSB(772,"Java");
		IMedia n3 = new CompactDisk(773,"MVC");
		
		n3.Emprunter();
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n3.toString());
		
		
		MediathequeRepository mediathequeRepository = new DonneesTestsMediathequeRepository();
		
		System.out.println(mediathequeRepository.getMediaById(7).getTitre());
		System.out.println();
		
		mediathequeRepository.getMedia().stream().map(m -> m.getTitre()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Example de recherche par Titre fourmi:");
		
		mediathequeRepository.trouverMediaParExpression("fourmi").stream().map(m -> m.getTitre()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Example de recherche par Titre fourmi et type livrebroche :");
		java.util.List<IMedia> tmp = mediathequeRepository.trouverMediaParExpressionEtType("fourmi", TypeMedia.LivreBroche);
		
		for(IMedia media: tmp){
			System.out.println(media.getTitre() +"	 Type: "+ media.getType());
		}
		System.out.println();
		
		System.out.println("Example de recherche par Titre fourmi et type livrebroche :");
		java.util.List<IMedia> tmp2 = mediathequeRepository.trouverMediaParExpressionEtType("dieux", TypeMedia.LivreBroche);
		
		for(IMedia media: tmp2){
			System.out.println(media.getTitre() +"	 Type: "+ media.getType());
		}
		System.out.println();
		
		System.out.println("Example de recherche par Titre fourmi et type livrebroche avec lambda:");
		mediathequeRepository.trouverMediaParExpressionEtType("dieux", TypeMedia.LivreBroche)
								.stream().map(n -> n.getTitre() +", Type: "+ n.getType())
								.forEach(System.out::println);
		
		
		
		//Mediatheque mediatheque = new Mediatheque(mediathequeRepository);
		
		// Votre code ici
		/*System.out.println();		System.out.println();		System.out.println();
		mediatheque.emprunter(1);
		mediatheque.afficherMediaCorrespondantALaRecherche("fourmi", null);
		System.out.println();		System.out.println();		System.out.println();
		mediatheque.rendre(1);
		mediatheque.afficherMediaCorrespondantALaRecherche("fourmi", "");
		System.out.println();		System.out.println();		System.out.println();*/

		
	}
}
