package io.github.unlp_oo.Ejercicio20_JuegoRol;

public abstract class Constructor {
	protected Personaje personaje;
	
	public void reset() {
		this.personaje = new Personaje();
	}
	public void agregarNombre(String nombre) {
		this.personaje.setNombre(nombre);
	}
	public abstract void agregarArmadura();
	public abstract void agregarArma();
	public abstract void agregarHabilidades();
}
