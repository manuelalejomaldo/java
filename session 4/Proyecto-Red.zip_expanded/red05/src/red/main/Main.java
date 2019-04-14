package red.main;


import red.dominio.AlarmaSonora;
import red.dominio.Aparato;
import red.dominio.AparatoConsumoMinimoCritico;
import red.dominio.AparatoCritico;
import red.dominio.Red;
import red.dominio.SistemaSeguridad;
import red.dominio.SistemaSeguridadMenorPotenciaPrimero;

public class Main {

	public static void main(String[] args) {
		
		Aparato tele = new AparatoCritico("Tele", 35);
		Aparato radio = new AparatoConsumoMinimoCritico("Radio", 30, 3);
		
		tele.encender();
		radio.encender();
		
		Red miRed = new Red(40);
		miRed.addAparato(tele);
		miRed.addAparato(radio);
		
		
		SistemaSeguridad miSistemaSeguridad = new SistemaSeguridadMenorPotenciaPrimero(miRed, new AlarmaSonora());
		miSistemaSeguridad.actua();
		
		System.out.println("es la red estable? " + (miRed.esEstable()) );
		
		System.out.println("estado final de la red : " + miRed);
		
	}

}
