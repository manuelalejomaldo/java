package red.dominio;

public class Aparato {
	
	private boolean encendido;
	private final int consumo;
	
	public Aparato(int consumo) {
		this.consumo = consumo;
	}

	public boolean getEncendido() {
		return encendido;
	}

	public void apagar() {
		encendido = false;
	}
	
	public void encender() {
		encendido = true;
	}

	public int getConsumo() {
		return consumo;
	}	
	
	public int getConsumoActual() {
		if (encendido) {
			return consumo;
		}
		return 0;
	}

}
