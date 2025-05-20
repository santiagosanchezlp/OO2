package io.github.unlp_oo.Ejercicio18_FileManager;

import java.time.LocalDate;

public class FileOO2 implements FileComponent{
	private String nombre;
	private String extension;
	private int tamaño;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	public FileOO2 (String unNombre, String unaExtension, int unTamaño, LocalDate unaFechaC, LocalDate unaFechaM, String unPermiso) {
		this.nombre = unNombre;
		this.extension = unaExtension;
		this.tamaño = unTamaño;
		this.fechaCreacion = unaFechaC;
		this.fechaModificacion = unaFechaM;
		this.permisos = unPermiso;
	}
	
	@Override
	public String prettyPrint() {
		return this.nombre;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getPermisos() {
		return permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}

}
