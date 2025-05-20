package io.github.unlp_oo.Ejercicio20_JuegoRol;

public class ConstructorMago extends Constructor{

	@Override
	public void agregarArmadura() {
		this.personaje.setArmadura(new ArmaduraDeCuero());
	}

	@Override
	public void agregarArma() {
		this.personaje.setArma(new ArmaBastón());
		
	}

	@Override
	public void agregarHabilidades() {
		this.personaje.addHabilidad("Magia");
		this.personaje.addHabilidad("Combate a distancia");
	}

}
