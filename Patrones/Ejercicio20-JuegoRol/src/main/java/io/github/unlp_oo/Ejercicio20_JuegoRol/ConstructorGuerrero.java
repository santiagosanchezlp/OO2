package io.github.unlp_oo.Ejercicio20_JuegoRol;

public class ConstructorGuerrero extends Constructor{

	@Override
	public void agregarArmadura() {
		this.personaje.setArmadura(new ArmaduraDeAcero());
	}

	@Override
	public void agregarArma() {
		this.personaje.setArma(new ArmaEspada());
		
	}

	@Override
	public void agregarHabilidades() {
		this.personaje.addHabilidad("Cuerpo a Cuerpo");
		
	}

}
