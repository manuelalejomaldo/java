package ca.csf.dfc.classes;

public class AnimalMammifere extends Animal {
	
	@Override
	public void respirer() {
		System.out.println("Le mammifère " + "#" + this.getIdAnimaux() + " respire."); 
	}

	@Override
	public void deplacer() {
		System.out.println("Le mammifère " + "#" + this.getIdAnimaux() + " marche.");
	}

	
}
