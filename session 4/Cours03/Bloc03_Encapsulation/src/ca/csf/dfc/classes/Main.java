package ca.csf.dfc.classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DureeDeTemps duree = new DureeDeTemps(5,25,45);
		System.out.println(duree.toString());
		DureeDeTemps duree2 = new DureeDeTemps();
		System.out.println(duree2.toString());
		DureeDeTemps duree3 = new DureeDeTemps(59);
		System.out.println(duree3.toString());
		DureeDeTemps duree4 = new DureeDeTemps(121);
		System.out.println(duree4.toString());
		DureeDeTemps duree5 = new DureeDeTemps(36105);
		System.out.println(duree5.toString());
		DureeDeTemps duree6 = new DureeDeTemps(13659);
		System.out.println(duree6.toString());
		System.out.println(duree3.additionDureeDeTemps(duree4).toString());
		DureeDeTemps duree7 = new DureeDeTemps(57,59);
		System.out.println(duree7.additionDureeDeTemps(duree4).toString());
		//DureeDeTemps duree2 = new DureeDeTemps(45);
		//DureeDeTemps duree3 = new DureeDeTemps(120);
		//DureeDeTemps duree4 = new DureeDeTemps(52545);
		
		
		
	}

}
