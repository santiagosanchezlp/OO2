package io.github.unlp_oo.Ejercicio20_JuegoRol;

public class ArmaEspada implements Arma{
	@Override
	public int calcularDaño(Armadura armadura) {
		return armadura.recibirDañoDeEspada();
	}
}
