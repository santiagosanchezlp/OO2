package io.github.unlp_oo.Ejercicio6;

public class sinCupoMinimo implements State {
	public  String obtenerInformacion(Excursion excursion) {
		return "La excursion " + excursion.getNombre()
				+ " con costo " + excursion.getCosto()
				+ " que se realizara entre el " + excursion.getFechaInicio()
				+ " y finalizara el " + excursion.getFechaFin()
				+ " con punto de encuentro en " + excursion.getPuntoEncuentro()
				+ "no podra realizarse hasta incorporar a " + excursion.cupoPendienteMinimo() + " integrantes";
	}
	public boolean completo() {
		return false;
	}
	public State verificarEstado(Excursion excursion) {
		if (excursion.cupoPendienteMinimo() == 0)
			return new sinCupoMaximo();
		else
			return this;
	}
}
