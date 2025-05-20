package io.github.unlp_oo.Ejercicio18_FileManager;

import java.time.LocalDate;

public interface FileComponent {
	public String prettyPrint();
	public int getTamaño();
	public String getExtension();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
}
