package io.github.unlp_oo.archetype;

public class Papel extends Opcion{

	public Papel() {
		this.name = "Papel";
	}
	public boolean ganador(Opcion unaOpcion) {
		return unaOpcion instanceof Piedra;
	}
	public boolean perdedor(Opcion unaOpcion) {
		return unaOpcion instanceof Tijera;
	}
}
