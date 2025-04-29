package io.github.unlp_oo.Ejercicio6;

import java.time.LocalDate;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private List<Usuario> integrantes;
	private List<Usuario> listaEspera;
	private State estado;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}
	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getCupoMinimo() {
		return cupoMinimo;
	}
	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}
	public int getCupoMaximo() {
		return cupoMaximo;
	}
	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}
	public State getEstado() {
		return estado;
	}
	public void setEstado(State estado) {
		this.estado = estado;
	}
	public int cupoPendienteMinimo() {
		return Math.max(this.cupoMinimo - this.integrantes.size(), 0);
	}
	public int cupoPendienteMaximo() {
		return this.cupoMaximo - this.integrantes.size();
	}
	public void inscribir (Usuario unUsuario) {
		if (this.estado.completo())
			this.listaEspera.add(unUsuario);
		else {
			this.integrantes.add(unUsuario);
			this.estado = this.estado.verificarEstado(this);
		}
	}
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion(this);
	}
	public String getMailsInscriptos() {
		return this.integrantes.stream()
				.map(inscripto -> inscripto.getEmail())
				.reduce("",(acumulator, element)-> acumulator +"\n" + element);
	}
}
