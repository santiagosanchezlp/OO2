package io.github.unlp_oo.Ejercicio14_PrestamosPrendarios;

import java.util.ArrayList;
import java.util.List;

public class PrendaCombinada extends Bien{
	private List<Bien> bienes;
	private double COEF_LIQUIDEZ = 0.5;
	
	public PrendaCombinada() {
		this.bienes = new ArrayList<>();
		this.coefLiquidez = COEF_LIQUIDEZ;
	}
	
	public void addBien(Bien unBien) {
		bienes.add(unBien);
	}

	@Override
	public double valor() {
		return this.bienes.stream()
				.mapToDouble(b->b.valor())
				.sum();
	}
	
}
