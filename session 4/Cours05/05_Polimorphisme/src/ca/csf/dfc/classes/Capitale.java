package ca.csf.dfc.classes;

public class Capitale extends Ville{
	
	private String monument;
	
	//Constructeur par d�faut
	public Capitale(){
		//Ce mot cl� appelle le constructeur de la classe m�re
		super();
		monument = "aucun";
	}
	
	//Constructeur d'initialisation de capitale
	public Capitale(String nom, int hab, String pays, String monument){
		super(nom, hab, pays);
		this.monument = monument;
	}
	
	
	public String getMonument() {
		return monument;
	}
	
	//D�finit le nom du monument
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	
	public String decrisToi(){
		
		String str = super.decrisToi() + "\n \t ==>>" + this.monument+
		" en est un monument";
		System.out.println("Invocation de super.decrisToi()");
		return str;
	}
	
	
	public String toString(){
		String str = super.toString() + "\n \t ==>>" + this.monument 
				+ "	en est un monument";
		return str;
	}
}
