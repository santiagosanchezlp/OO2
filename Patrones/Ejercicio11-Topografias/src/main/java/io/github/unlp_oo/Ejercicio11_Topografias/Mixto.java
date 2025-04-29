package io.github.unlp_oo.Ejercicio11_Topografias;

import java.util.*;

public class Mixto extends Topografia{
	private List<Topografia> topografia;
	
	public Mixto(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.topografia = new ArrayList<>();
		this.topografia.add(t1);
		this.topografia.add(t2);
		this.topografia.add(t3);
		this.topografia.add(t4);
	}
	@Override
	public Topografia getCuadranteUno() {
		return this.topografia.get(0);
	}
	@Override
	public Topografia getCuadranteDos() {
		return this.topografia.get(1);
	}
	@Override
	public Topografia getCuadranteTres() {
		return this.topografia.get(2);
	}
	@Override
	public Topografia getCuadranteCuatro() {
		return this.topografia.get(3);
	}
	
	public double proporcionDeAgua() {
		return this.topografia.stream()
				.mapToDouble(t->t.proporcionDeAgua())
				.average().orElse(0);
	}
	@Override
	public boolean equals (Topografia unaTopografia) {
		return unaTopografia.getClass() == this.getClass()
				&& unaTopografia.getCuadranteUno().equals(this.getCuadranteUno())
				&& unaTopografia.getCuadranteDos().equals(this.getCuadranteDos())
				&& unaTopografia.getCuadranteTres().equals(this.getCuadranteTres())
				&& unaTopografia.getCuadranteCuatro().equals(this.getCuadranteCuatro());
	}
}