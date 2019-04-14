package red.dominio;

import java.util.List;

public abstract class SistemaSeguridad {
	
	protected Red red;
	private Alarma alarma;
	
	public SistemaSeguridad (Red red, Alarma alarma) {
		this.red = red;
		this.alarma = alarma;
	}

	public boolean actua() {
		System.out.println("empezando actuacion sistema seguridad");
		
		for (Aparato aparato: getAparatos()) {
			if (red.esEstable()) {
				System.out.println("equilibrio alcanzado : salimos");
				break;
			}
			aparato.solicitudApagado();
		}
		
		boolean esEstable = red.esEstable();
		
		if (!esEstable) {
			alarma.activa();
		}
		return esEstable;
	}
	
	protected abstract List<Aparato> getAparatos();
}
