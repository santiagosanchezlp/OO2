package io.github.unlp_oo.Ejercicio13_SubteWay;

public class ConstructorClasico extends Constructor{

	@Override
	public void agregarPan() {
		this.sandwich.setPan(100);
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.setAderezo(20);
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.setPrincipal(300);
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.setAdicional(80);
	}
}
