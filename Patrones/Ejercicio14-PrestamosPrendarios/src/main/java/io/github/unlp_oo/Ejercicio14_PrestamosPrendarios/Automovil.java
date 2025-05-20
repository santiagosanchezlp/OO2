package io.github.unlp_oo.Ejercicio14_PrestamosPrendarios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Automovil extends Bien{
	private double COEF_LIQUIDEZ = 0.7;
	private LocalDate modelo;
	private int kilometraje;
	private double precio;
	
	public Automovil (LocalDate unAno, int unKilometraje, double unValor) {
		this.precio = unValor;
		this.modelo = unAno;
		this.kilometraje = unKilometraje;
		this.coefLiquidez = COEF_LIQUIDEZ;
	}

	private int antiguedad() {
		return (int) ChronoUnit.YEARS.between(LocalDate.now(), this.modelo);
	}
	
	private double reduccionValor() {
		return Math.max(1, 0.1 * this.antiguedad());
	}
	
	@Override
	public double valor() {
		return this.precio
				* (1 - this.reduccionValor());
	}
}
