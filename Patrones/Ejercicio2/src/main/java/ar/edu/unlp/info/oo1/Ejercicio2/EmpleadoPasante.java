package ar.edu.unlp.info.oo1.Ejercicio2;


public class EmpleadoPasante extends Empleado {
	private int cantExamenes;
	
	public EmpleadoPasante(int exam) {
		this.cantExamenes = exam;
	}
	
	protected  double sueldoBasico() {
		return 20000;
	}
	protected double sueldoAdicional() {
		return this.cantExamenes * 2000;
	}
}
