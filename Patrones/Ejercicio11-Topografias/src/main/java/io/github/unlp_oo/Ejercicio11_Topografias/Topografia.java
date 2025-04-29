package io.github.unlp_oo.Ejercicio11_Topografias;

public abstract class Topografia {
	public abstract double proporcionDeAgua();
	public boolean equals (Topografia unaTopografia) {
		return this.getClass() == unaTopografia.getClass();
	}
	public Topografia getCuadranteUno() {
		return this;
	}
	public Topografia getCuadranteDos() {
		return this;
	}
	public Topografia getCuadranteTres() {
		return this;
	}
	public Topografia getCuadranteCuatro() {
		return this;
	}
}
