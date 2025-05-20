package io.github.unlp_oo.Ejercicio14_PrestamosPrendarios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Bien{
	private double COEF_LIQUIDEZ = 0.9;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double costoMensual;
	
	public Alquiler (double unCosto, LocalDate fechaIni, LocalDate fechaFi) {
		this.fechaInicio = fechaIni;
		this.fechaFin = fechaFi;
		this.costoMensual = unCosto;
		this.coefLiquidez = COEF_LIQUIDEZ;
	}

	private int mesesRestantes () {
		return (int) ChronoUnit.MONTHS.between(LocalDate.now(), fechaFin);
	}
	
	@Override
	public double valor() {
		return this.mesesRestantes()
				*this.costoMensual;
	}
}
