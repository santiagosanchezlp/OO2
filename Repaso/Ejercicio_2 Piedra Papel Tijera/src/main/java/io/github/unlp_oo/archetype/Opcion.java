package io.github.unlp_oo.archetype;

public abstract class Opcion {
	protected String name;
	
	public String getName() {
		return this.name;
	}
	public String resultado (Opcion unaOpcion) {
		if (ganador(unaOpcion))
			return "Ganaste";
		else if (perdedor(unaOpcion))
			return "Perdiste";
		else return "Empate";
	}
	protected abstract boolean ganador(Opcion unaOpcion);
	protected abstract boolean perdedor(Opcion unaOpcion);
	
}
