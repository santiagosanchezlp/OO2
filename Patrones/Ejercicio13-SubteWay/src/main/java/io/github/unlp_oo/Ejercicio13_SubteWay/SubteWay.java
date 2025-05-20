package io.github.unlp_oo.Ejercicio13_SubteWay;

public class SubteWay {
	private Constructor constructor;
	
	public SubteWay(Constructor constructor) {
		this.constructor = constructor;	
	}
	
	public Sandwich hacerSandwich() {
		this.constructor.reset();
		this.constructor.agregarPan();
		this.constructor.agregarAderezo();
		this.constructor.agregarPrincipal();
		this.constructor.agregarAdicional();
		return this.constructor.getSandwich();
	}
	
	public void setConstructor(Constructor unConstructor) {
		this.constructor = unConstructor;
	}
	
	public Constructor getConstructor() {
		return this.constructor;
	}
	
}
