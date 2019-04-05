Faire des s += tata.toString() dans une boucle où s est une String.
//Il est de loin préférable d'utiliser un StringBuilder car les String sont immuables en Java, donc c'est long des +=

Des setters public pour des données membres qui n'ont pas à être modifiés par l'externe (Ex : un identifiant dans une classe).



Des boucles pour parcourir des collections avec des indices manuels ().
//On des itérateurs et des for each en Java, servez-vous en.




Des system.out.println() en dehors du main, dans les fonctions internes (e.g., add et find)
//si quelqu'un veut utilser votre structure dnas un GUI, il ne verra pas ces messages.



Des valeurs à sémantique hardcodées (e.g., 0 et 9999)
//Des constantes SVP


Des données membres sans mots-clés d'accès
//Quel est la significatio de ne pas mettre de mot-clé d'accès ?



Non respect des standards Java:
	Des noms de package en minuscules
	Des noms de classes commencent par une majuscule 
	Des noms des données membres avec des underscores (m_) et paramètres avec p_
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








































//validation du paramètre p
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
//PROB: on ne devrait jamais lever le type racine Exception... ça englobe trop de choses
//PROB: lever une exception et la catcher dans la même fonction est tout à fait inutile







//un main, je n'ai rien changé, c'est le code original
public static void main(String[] args)
{
	// TODO Auto-generated method stub

}
//PROB: comment peut-on coder une application ayant quelques fonctionalités pendant 3 heures sans jamais la rouler pour tester


