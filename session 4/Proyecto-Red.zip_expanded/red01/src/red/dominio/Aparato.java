package red.dominio;

public class Aparato {
	
	private boolean encendido;

	public boolean getEncendido() {
		return encendido;
	}

	public void apagar() {
		encendido = false;
	}
	
	public void encender() {
		encendido = true;
	}
	

}
