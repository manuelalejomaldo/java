package red.main;


import red.dominio.Aparato;
import red.dominio.Red;

public class Main {

	public static void main(String[] args) {
		
		Aparato tele = new Aparato(30);
		
		tele.encender();
		
		Red miRed = new Red(25);
		miRed.addAparato(tele);
		
		System.out.println("tele encendida?" + tele.getEncendido() + ", consumo : " + tele.getConsumo());
		System.out.println("mi red tiene " + miRed.size() + " aparatos");
		System.out.println("consumo actual red " + miRed.getConsumoActual());
		System.out.println("es la red estable? " + (miRed.esEstable()) );
	}

}
