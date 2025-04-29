package io.github.unlp_oo.Ejercicio6;

public interface State {
	public abstract String obtenerInformacion(Excursion excursion);
	public abstract boolean completo();
	public abstract State verificarEstado(Excursion excursion);
}
