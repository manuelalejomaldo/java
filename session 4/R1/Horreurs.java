Faire des s += tata.toString() dans une boucle o� s est une String.
//Il est de loin pr�f�rable d'utiliser un StringBuilder car les String sont immuables en Java, donc c'est long des +=

Des setters public pour des donn�es membres qui n'ont pas � �tre modifi�s par l'externe (Ex : un identifiant dans une classe).



Des boucles pour parcourir des collections avec des indices manuels ().
//On des it�rateurs et des for each en Java, servez-vous en.




Des system.out.println() en dehors du main, dans les fonctions internes (e.g., add et find)
//si quelqu'un veut utilser votre structure dnas un GUI, il ne verra pas ces messages.



Des valeurs � s�mantique hardcod�es (e.g., 0 et 9999)
//Des constantes SVP


Des donn�es membres sans mots-cl�s d'acc�s
//Quel est la significatio de ne pas mettre de mot-cl� d'acc�s ?



Non respect des standards Java:
	Des noms de package en minuscules
	Des noms de classes commencent par une majuscule 
	Des noms des donn�es membres avec des underscores (m_) et param�tres avec p_
	Des projets sans aucun package, c'est mal !












try
{
	// ...
}
catch(Exception e)
{
	System.out.println(e.toString());
}

// Prob : Mettre d'autre chose dans le catch, ou bien laisser passer l'exception ...








































//validation du param�tre p
try
{
	if (p < 0 || p > 10000)
	{
		throw new Exception("range");
	}

	valide = true;
}
catch(Exception e)
{
	if (e.getMessage().equals("range"))
	{
		System.out.println("Le nombre a ajouter doit etre compris entre 0 et 10 000.");
	}
}
//PROB: on ne devrait jamais lever le type racine Exception... �a englobe trop de choses
//PROB: lever une exception et la catcher dans la m�me fonction est tout � fait inutile







//un main, je n'ai rien chang�, c'est le code original
public static void main(String[] args)
{
	// TODO Auto-generated method stub

}
//PROB: comment peut-on coder une application ayant quelques fonctionalit�s pendant 3 heures sans jamais la rouler pour tester


