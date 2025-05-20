package io.github.unlp_oo.Ejercicio20_JuegoRol;

public class ConstructorArquero extends Constructor{

	@Override
	public void agregarArmadura() {
		this.personaje.setArmadura(new ArmaduraDeCuero());
	}

	@Override
	public void agregarArma() {
		this.personaje.setArma(new ArmaArco());
		
	}

	@Override
	public void agregarHabilidades() {
		this.personaje.addHabilidad("Disparo de flechas");
	}

}