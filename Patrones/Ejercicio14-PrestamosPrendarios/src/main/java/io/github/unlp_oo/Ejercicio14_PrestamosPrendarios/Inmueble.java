package io.github.unlp_oo.Ejercicio14_PrestamosPrendarios;

public class Inmueble extends Bien{
	private double COEF_LIQUIDEZ = 0.2;
	private String direccion;
	private double superficie;
	private double costoM2;
	
	public Inmueble (String unaDire, double unaSuperficie, double unCosto) {
		this.direccion = unaDire;
		this.superficie = unaSuperficie;
		this.costoM2 = unCosto;
		this.coefLiquidez = COEF_LIQUIDEZ;
	}

	@Override
	public double valor() {
		return this.superficie
				* this.costoM2;
	}
	
	
}
