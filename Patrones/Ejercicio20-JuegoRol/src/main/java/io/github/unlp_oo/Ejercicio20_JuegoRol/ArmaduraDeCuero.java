package io.github.unlp_oo.Ejercicio20_JuegoRol;

public class ArmaduraDeCuero implements Armadura{
	@Override
	public int recibirDañoDeEspada() {
		return 8;
	}

	@Override
	public int recibirDañoDeArco() {
		return 5;
	}

	@Override
	public int recibirDañoDeBaston() {
		return 2;
	}
}
