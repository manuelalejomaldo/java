package red.dominio;

import java.util.HashSet;
import java.util.Set;

public class Red {
	
	private Set<Aparato> aparatos;
	private final int potenciaMaxima;
	
	public Red(int potenciaMaxima) {
		aparatos = new HashSet<>();
		this.potenciaMaxima = potenciaMaxima;
	}
	
	public void addAparato(Aparato aparato) {
		aparatos.add(aparato);
	}


	public int size() {
		return aparatos.size();
	}

	public int getConsumoActual() {
		int consumoActual = 0;
		
		for (Aparato aparato: aparatos) {
			consumoActual += aparato.getConsumoActual();
		}
		return consumoActual;
	}

	public boolean esEstable() {
		return getConsumoActual() <= potenciaMaxima;
	}
}
