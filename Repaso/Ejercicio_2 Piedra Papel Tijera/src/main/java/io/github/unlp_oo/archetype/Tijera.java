package io.github.unlp_oo.archetype;

public class Tijera extends Opcion{

	public Tijera() {
		this.name = "Tijera";
	}
	public boolean ganador(Opcion unaOpcion) {
		return unaOpcion instanceof Papel;
	}
	public boolean perdedor(Opcion unaOpcion) {
		return unaOpcion instanceof Piedra;
	}
}
