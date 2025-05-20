package io.github.unlp_oo.Ejercicio20_JuegoRol;

public class ArmaduraDeAcero implements Armadura{

	@Override
	public int recibirDañoDeEspada() {
		return 3;
	}

	@Override
	public int recibirDañoDeArco() {
		return 2;
	}

	@Override
	public int recibirDañoDeBaston() {
		return 1;
	}

}
