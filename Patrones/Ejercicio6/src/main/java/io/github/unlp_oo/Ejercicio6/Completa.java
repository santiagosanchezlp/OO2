package io.github.unlp_oo.Ejercicio6;

public class Completa implements State {
	public  String obtenerInformacion(Excursion excursion) {
		return "La excursion " + excursion.getNombre()
				+ " con costo " + excursion.getCosto()
				+ " que se realizara entre el " + excursion.getFechaInicio()
				+ " y finalizara el " + excursion.getFechaFin()
				+ " con punto de encuentro en " + excursion.getPuntoEncuentro()
				+ " ha completado su cupo";
	}
	public boolean completo() {
		return true;
	}
	public State verificarEstado(Excursion excursion) {
			return this;
	}
}
