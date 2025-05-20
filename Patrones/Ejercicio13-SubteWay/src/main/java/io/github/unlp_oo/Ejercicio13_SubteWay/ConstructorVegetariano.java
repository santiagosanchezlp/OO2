package io.github.unlp_oo.Ejercicio13_SubteWay;

public class ConstructorVegetariano extends Constructor{

	@Override
	public void agregarPan() {
		this.sandwich.setPan(120);
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.setAderezo(0);
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.setPrincipal(200);
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.setAdicional(100);
	}
}