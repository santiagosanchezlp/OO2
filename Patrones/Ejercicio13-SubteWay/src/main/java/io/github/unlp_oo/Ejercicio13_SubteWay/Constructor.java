package io.github.unlp_oo.Ejercicio13_SubteWay;

public abstract class Constructor {
	protected Sandwich sandwich;
	
	public void reset() {
		this.sandwich = new Sandwich();
	}	
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}
	
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();
}
