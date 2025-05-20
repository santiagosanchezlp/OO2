package io.github.unlp_oo.Ejercicio18_FileManager;

import java.time.LocalDate;

public abstract class Decorator implements FileComponent{
	protected FileComponent file;

	public Decorator (FileComponent unFile) {
		this.file = unFile;
	}
	
	@Override
	public int getTamaño() {
		return file.getTamaño();
	}

	@Override
	public String getExtension() {
		return file.getExtension();
	}

	@Override
	public LocalDate getFechaCreacion() {
		return file.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		return file.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return file.getPermisos();
	}
}
