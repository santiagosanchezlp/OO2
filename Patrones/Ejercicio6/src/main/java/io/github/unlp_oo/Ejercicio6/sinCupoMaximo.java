package io.github.unlp_oo.Ejercicio6;

public class sinCupoMaximo implements State {
	public  String obtenerInformacion(Excursion excursion) {
		return "La excursion " + excursion.getNombre()
				+ " con costo " + excursion.getCosto()
				+ " que se realizara entre el " + excursion.getFechaInicio()
				+ " y finalizara el " + excursion.getFechaFin()
				+ " con punto de encuentro en " + excursion.getPuntoEncuentro()
				+ excursion.getMailsInscriptos()
				+ "posee " + excursion.cupoPendienteMaximo() + " lugares disponibles";
	}
	public boolean completo() {
		return false;
	}
	public State verificarEstado(Excursion excursion) {
		if (excursion.cupoPendienteMaximo() == 0)
			return new Completa();
		else
			return this;
	}
}