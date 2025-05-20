package io.github.unlp_oo.Ejercicio20_JuegoRol;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
	private String nombre;
	private Armadura armadura;
	private Arma arma;
	private List<String> habilidades;
	private int vida;
	
	public Personaje() {
		this.vida = 100;
		this.habilidades = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}
	public void addHabilidad(String habilidad) {
		this.habilidades.add(habilidad);
	}

	public int getVida() {
		return vida;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public void quitarVida(int unDaño) {
		this.vida -= unDaño;
	}
	
	public boolean vivo() {
		//me parece que no vale la pena crear un estado solo para esto
		return this.vida >0;
	}
	
	public void enfrentamiento(Personaje otroPersonaje) {
		if (this.vivo() && otroPersonaje.vivo()) {
			otroPersonaje.quitarVida(this.arma.calcularDaño(otroPersonaje.getArmadura()));
			this.quitarVida(otroPersonaje.getArma().calcularDaño(this.armadura));
		}
	}
}
