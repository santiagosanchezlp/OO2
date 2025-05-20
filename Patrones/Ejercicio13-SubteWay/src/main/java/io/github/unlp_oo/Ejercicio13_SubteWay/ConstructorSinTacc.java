package io.github.unlp_oo.Ejercicio13_SubteWay;

public class ConstructorSinTacc extends Constructor{

	@Override
	public void agregarPan() {
		this.sandwich.setPan(150);
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.setAderezo(18);
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.setPrincipal(250);
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.setAdicional(200);
	}
}