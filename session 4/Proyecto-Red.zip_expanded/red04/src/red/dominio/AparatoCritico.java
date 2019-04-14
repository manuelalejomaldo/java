package red.dominio;

public class AparatoCritico extends Aparato {

	public AparatoCritico(String nombre, int consumo) {
		super(nombre, consumo);
	}

	@Override
	public void solicitudApagado() {
		System.out.println("ignoramos peticion de apagado" + this.toString());
		// ignoramos peticion
	}
	
	

}
