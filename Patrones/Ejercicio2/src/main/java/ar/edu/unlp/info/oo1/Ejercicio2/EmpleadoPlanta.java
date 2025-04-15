package ar.edu.unlp.info.oo1.Ejercicio2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmpleadoPlanta extends Empleado {
	private boolean casado;
	private int cantHijos;
	private LocalDate fechaIngreso;
	
	public EmpleadoPlanta (int horasTrabajadas, int cantHijos) {
		this.cantHijos = cantHijos;
		this.casado = false;
		this.fechaIngreso = LocalDate.now();
	}
	
	public void setCasado(){
		this.casado = true;
	}
	public void setFechaIngreso (int dia, int mes, int ano) {
		this.fechaIngreso = LocalDate.of(ano, mes, dia);
	}
	
	protected  double sueldoBasico() {
		return 50000;
	}	
	protected double sueldoAdicional() {
		return this.cantHijos * 2000
				+ (this.casado ? 5000 : 0)
				+ ChronoUnit.YEARS.between(this.fechaIngreso, LocalDate.now()) * 2000;
	}
}