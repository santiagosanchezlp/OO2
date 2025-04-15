package ar.edu.unlp.info.oo1.Ejercicio2;

public class EmpleadoTemporario extends Empleado{
	private int horasTrabajadas;
	private int cantHijos;
	private boolean casado;
	
	public EmpleadoTemporario(int horasTrabajadas, int cantHijos) {
		this.horasTrabajadas = horasTrabajadas;
		this.cantHijos = cantHijos;
		this.casado = false;
	}
	
	public void setCasado(){
		this.casado = true;
	}
	
	protected  double sueldoBasico() {
		return 20000 
				+ this.horasTrabajadas * 300;
	}
	protected double sueldoAdicional() {
		return this.cantHijos * 2000
				+ (this.casado ? 5000 : 0);
	}
}
