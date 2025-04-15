package ar.edu.unlp.info.oo1.Ejercicio2;

public abstract class Empleado {
	public double sueldo() {
		return this.sueldoBasico()
				+ this.sueldoAdicional()
				- this.descuento();
	}
	protected abstract double sueldoBasico();
	protected abstract double sueldoAdicional();
	protected double descuento() {
		return this.sueldoBasico() * 0.13
				+ this.sueldoAdicional() * 0.05;
	}
}
