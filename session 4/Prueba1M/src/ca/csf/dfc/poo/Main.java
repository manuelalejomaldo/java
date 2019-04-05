package ca.csf.dfc.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

import javax.swing.ImageIcon;

import ca.csf.dfc.poo.msg.BureauDePoste;
import ca.csf.dfc.poo.pers.Personne;

/**
 * Programme principal <br>
 * ############# CE FICHIER DOIT ETRE REMIS EN L'Ãƒâ€°TAT ############# <br>
 * Si vous le modifiez vous devez le remettre dans l'ÃƒÂ©tat dans lequel vous l'avez trouvÃƒÂ© avant la remise !
 *
 * @author C. Besse
 */
public class Main
{

    public static final String[] NAMES = { "Merle Lew ", "Abraham Mcwhirt ", "Lester Leonard ", "Rolland Dominguez ",
            "Darron Mena ", "Rory Bogdan ", "Kieth Elledge ", "Doug Canton ", "Lyman Waddy ", "Ali Earnshaw ",
            "Cortez Mcfarlain ", "Irwin Mcmunn ", "Long Rosales ", "Jules Mcaleer ", "Armando Demott ",
            "Jared Staats ", "Horace Lockamy ", "Rufus Pieper ", "Eldon Toscano ", "Jacinto Bunkley ", "Ross Witt ",
            "Agustin Hysell ", "Lou Strand ", "Santos Layman ", "Shannon Merideth ", "Ulysses Candy ", "Louie Spence ",
            "Taylor Haider ", "Leandro Rana ", "Korey Rhinehart ", "Gregorio Trahan ", "Son Sabin ", "Leland Putz ",
            "Brock Bleau ", "Joey Arant ", "Lon Bourgoin ", "Francis Pompei ", "Antoine Prindle ", "Antone Sowards ",
            "Vince Neumeister ", "Gavin Hanby ", "Errol Stallworth ", "Cristobal Valvo ", "Chester Mennenga ",
            "Armand Slaton ", "Fritz Czajkowski ", "Adalberto Pinckney ", "Mel Vandemark ", "Reinaldo Daum ",
            "Tory Canavan " };
	
	// Le rÃƒÂ©pertoire "res" fourni dans l'archive doit ÃƒÂªtre mis A CÃƒâ€�TÃƒâ€° de "src"
    public static final ImageIcon[] POSTCARD = { new ImageIcon("res/p0.png"), new ImageIcon("res/p1.jpg"),
        new ImageIcon("res/p2.jpg"), new ImageIcon("res/p3.png"), new ImageIcon("res/p4.png"),
        new ImageIcon("res/p5.jpg") };

    public static void main(String[] args)
    {
        Random rand = new Random(0);
        ArrayList<Personne> pop = new ArrayList<Personne>();
        BureauDePoste bp = new BureauDePoste();

        int i = 0;
        for (String name : NAMES)
        {
            String[] n = name.split(" ");
            Personne p = new Personne(n[0], n[1], "#10" + (i++) + ", Rue de l'imaginaire, QuÃƒÂ©bec");
            pop.add(p);
        }

        // CrÃƒÂ©ation des messages envoyÃƒÂ©s avec selection alÃƒÂ©atoire des personnes;
        for (int m = 0; m < 1000; m++)
        {
            Collections.shuffle(pop);
            Object o = null;
            switch (rand.nextInt(4))
            {
                case 0:
                    o = new String("Un beau message d'amour");
                    break; // Une lettre
                case 1:
                    o = new String("Un message ultra important ... peut-ÃƒÂªtre.");
                    break; // Une autre lettre
                case 2:
                    o = POSTCARD[rand.nextInt(POSTCARD.length)];
                    break; // Une carte postale
                default:
                    o = new Object(); // Un colis quelconque.
            }

            bp.send(pop.get(0), pop.get(1), o, (o instanceof String ? rand.nextBoolean() : false));
        }

        // Chaque personne rÃƒÂ©cupÃƒÂ¨re ses messages :
        for (Personne p : pop)
        {
            Collection<?> c = bp.getMessages(p, true);
            System.out.println(c);
        }

        // Affichage de tous les envois et rÃƒÂ©cupÃƒÂ©ration des messages
        System.out.println(bp);
        
        /*IMessage message=null;
		
		if((p_contenu instanceof String) && (express=true))
		{
			
			message=new XpressAR(new Date(),p_persEnvoyeur,p_persDestinataire,Priorite.VeryHigh,(String)p_contenu);
			m_AccuseReception=true;
		}
		else if((p_contenu instanceof String) && (express=false))
		{
			message  =new Lettre (new Date(),p_persEnvoyeur,p_persDestinataire,Priorite.Default,(String)p_contenu);
			m_AccuseReception=true;
		}else if(p_contenu instanceof ImageIcon)
		{
			message=new CartePostale(new Date(),p_persEnvoyeur,p_persDestinataire,Priorite.Default,(ImageIcon)p_contenu);

		}else
		{
			message = new Colis(new Date(),p_persEnvoyeur,p_persDestinataire,Priorite.Default,(Object)p_contenu);
		}*/
        
        
    }
}
