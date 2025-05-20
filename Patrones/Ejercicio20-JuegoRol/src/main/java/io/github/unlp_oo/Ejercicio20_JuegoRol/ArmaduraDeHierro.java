package io.github.unlp_oo.Ejercicio20_JuegoRol;

public class ArmaduraDeHierro implements Armadura{
	@Override
	public int recibirDañoDeEspada() {
		return 5;
	}

	@Override
	public int recibirDañoDeArco() {
		return 3;
	}

	@Override
	public int recibirDañoDeBaston() {
		return 1;
	}
}
