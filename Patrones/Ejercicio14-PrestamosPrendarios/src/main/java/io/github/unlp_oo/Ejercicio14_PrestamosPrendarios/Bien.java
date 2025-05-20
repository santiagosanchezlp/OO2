package io.github.unlp_oo.Ejercicio14_PrestamosPrendarios;

public abstract class Bien {
	protected double coefLiquidez;
	
	public double getCoefLiquidez() {
		return coefLiquidez;
	}
	public void setCoefLiquidez(double coefLiquidez) {
		this.coefLiquidez = coefLiquidez;
	}
	public double valorPrendario() {
		return this.valor()
				* this.coefLiquidez;
	}
	public abstract double valor();
}
