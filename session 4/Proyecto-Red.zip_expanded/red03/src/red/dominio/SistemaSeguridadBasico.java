package red.dominio;

import java.util.ArrayList;
import java.util.List;

public class SistemaSeguridadBasico extends SistemaSeguridad {

	public SistemaSeguridadBasico(Red red) {
		super(red);
	}

	@Override
	protected List<Aparato> getAparatos() {
		return new ArrayList<>(red.getAparatos());
	}
	
	

}
