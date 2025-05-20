package io.github.unlp_oo.Ejercicio20_JuegoRol;

public class ArmaBastón implements Arma{
	@Override
	public int calcularDaño(Armadura armadura) {
		return armadura.recibirDañoDeBaston();
	}
}
