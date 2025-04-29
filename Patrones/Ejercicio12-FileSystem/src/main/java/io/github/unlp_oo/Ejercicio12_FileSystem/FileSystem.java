package io.github.unlp_oo.Ejercicio12_FileSystem;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystem {
	private String name;
	private LocalDate fechaCreacion;
	private Directorio parent;
	
	public FileSystem (String nombre, LocalDate fecha) {
		this.name = nombre;
		this.fechaCreacion = fecha;
	}
	
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getName() {
		if (this.parent != null)
			return this.parent.getName() + "/" + this.name;
		else return this.name;
	}
	public void setName(String nombre) {
		this.name = nombre;
	}
	public abstract String listadoDeContenido();
	public abstract FileSystem buscar (String nombre);
	public abstract List<FileSystem> buscarTodos (String nombre);
	
	public void moveTo(Directorio directorio) {
		this.parent = directorio;
		// aca podria ir un delete contenido
		directorio.addContenido(this);
	}
	
	public static void main (String[] args) {
		Archivo a1, a2, a3, a4;
		Directorio d1, d2, d3, root;
		
		a1 = new Archivo("Archivo 1", LocalDate.of(1993,10,25), 25000);
		a2 = new Archivo("Archivo 2", LocalDate.of(1995,10,25), 30000);
		a3 = new Archivo("Archivo 3", LocalDate.of(1996,10,25), 32000);
		a4 = new Archivo("Archivo 4", LocalDate.of(1997,10,25), 20000);
		d1 = new Directorio("Directorio 1", LocalDate.of(2000,10,25));
		d2 = new Directorio("Directorio 2", LocalDate.of(2001,10,25));
		d3 = new Directorio("Directorio 3", LocalDate.of(2002,10,25));
		root = new Directorio("Root", LocalDate.of(1990,10,25));
		
		a1.moveTo(d1);
		a2.moveTo(d2);
		a3.moveTo(d3);
		a4.moveTo(d3);
		d1.moveTo(root);
		d2.moveTo(root);
		d3.moveTo(d2);
		System.out.println(root.listadoDeContenido());
		System.out.println(d2.listadoDeContenido());
	}
}
