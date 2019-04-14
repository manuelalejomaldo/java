package red.dominio;

public class AparatoConsumoMinimoCritico extends AparatoCritico {

	private final int consumoMinimo;
	private int consumoActual;
	
	public AparatoConsumoMinimoCritico(String nombre, int consumo, int consumoMinimo) {
		super(nombre, consumo);
		this.consumoMinimo = consumoMinimo;
	}

	@Override
	public void solicitudApagado() {
		if (getEncendido()) {
			consumoActual = consumoMinimo;
			System.out.println("pasamos a consumo minimo " + toString());
		}
	}

	@Override
	public String toString() {
		return super.toString() + "( consumo actual " + consumoActual + ")";
	}


	@Override
	public void apagar() {
		consumoActual = 0;
	}

	
	@Override
	public boolean getEncendido() {
		return consumoActual > 0;
	}

	@Override
	public void encender() {
		consumoActual = getConsumo();
	}

	@Override
	public int getConsumoActual() {
	    return consumoActual;
	}


}
