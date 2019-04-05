package ca.csf.dfc.classes;

public class AnimalPoisson extends Animal {
	
	@Override
	public void respirer() {
		System.out.println("Le poisson " + "#" + this.getIdAnimaux() + " respire."); 
	}

	@Override
	public void deplacer() {
		System.out.println("Le poisson " + "#" + this.getIdAnimaux() + " marche.");
	}
}
