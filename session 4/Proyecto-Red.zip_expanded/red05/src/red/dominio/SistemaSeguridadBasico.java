package red.dominio;

import java.util.ArrayList;
import java.util.List;

public class SistemaSeguridadBasico extends SistemaSeguridad {

	public SistemaSeguridadBasico(Red red, Alarma alarma) {
		super(red, alarma);
	}

	@Override
	protected List<Aparato> getAparatos() {
		return new ArrayList<>(red.getAparatos());
	}
	
	

}
