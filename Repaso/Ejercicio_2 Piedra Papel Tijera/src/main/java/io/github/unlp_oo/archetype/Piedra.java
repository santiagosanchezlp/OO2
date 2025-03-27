package io.github.unlp_oo.archetype;

public class Piedra extends Opcion{
	
	public Piedra() {
		this.name = "Piedra";
	}
	public boolean ganador(Opcion unaOpcion) {
		return unaOpcion instanceof Tijera;
	}
	public boolean perdedor(Opcion unaOpcion) {
		return unaOpcion instanceof Papel;
	}
}
