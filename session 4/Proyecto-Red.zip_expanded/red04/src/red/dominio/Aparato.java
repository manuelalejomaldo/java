package red.dominio;

public class Aparato {
	
	private boolean encendido;
	private final int consumo;
	private final String nombre;
	
	public Aparato(String nombre, int consumo) {
		this.consumo = consumo;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Aparato [nombre=" + nombre + ", consumo=" + consumo
				+ ", encendido=" + encendido + "]";
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

	public void solicitudApagado() {
		System.out.println("solicitud de apagado aceptada " + this.toString());
		apagar();
	}
	

}
