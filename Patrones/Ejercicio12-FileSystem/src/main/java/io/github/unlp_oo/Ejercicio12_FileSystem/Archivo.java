package io.github.unlp_oo.Ejercicio12_FileSystem;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends FileSystem{
	public Archivo(String nombre, LocalDate fecha, int unTamano) {
		super(nombre, fecha);
		this.tamano = unTamano;
	}
	private int tamano;
	
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	public Archivo archivoMasGrande() {
		return this;
	}
	public Archivo archivoMasNuevo() {
		return this;
	}
	public FileSystem buscar(String nombre) {
		if (nombre.equals(this.getName()))
			return this;
		else return null;
	}
	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		return null;
	}
	public  String listadoDeContenido() {
		return this.getName();
	}
}
