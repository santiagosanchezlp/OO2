package io.github.unlp_oo.Ejercicio12_FileSystem;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class Directorio extends FileSystem{
	private List<FileSystem> contenido;
	private int TAMANOFOLDER = 32768;
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
		this.contenido = new ArrayList<>();
	}
	// necesito restringir esta operacion
	protected void addContenido(FileSystem elemento) {
		this.contenido.add(elemento);
	}
	
	public int tamanoTotalOcupado() {
		return this.contenido.stream()
				.mapToInt(a -> a.tamanoTotalOcupado())
				.sum()
				+ TAMANOFOLDER;
	}
	public Archivo archivoMasGrande() {
		List <Archivo> listaArchivosGrandes = this.contenido.stream() 
		          .map(archivo -> archivo.archivoMasGrande())       
		          .collect(Collectors.toList());
		return listaArchivosGrandes.stream()
				.max((a1, a2) -> 
					Integer.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado()))
				.orElse(null);
	}
	public Archivo archivoMasNuevo() {
		List <Archivo> listaArchivosNuevos = this.contenido.stream() 
		          .map(archivo -> archivo.archivoMasNuevo())       
		          .collect(Collectors.toList());
		return listaArchivosNuevos.stream()
				.max((a1, a2) -> 
					(a1.getFechaCreacion().compareTo(a2.getFechaCreacion())))
				.orElse(null);
	}
	@Override
	public FileSystem buscar(String nombre) {
		if (this.getName().equals(nombre))
			return this;
		else
			return this.contenido.stream() 
		          .filter(a->a.buscar(nombre) != null)
				  .findFirst().orElse(null);
	}
	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		List <FileSystem> listaArchivosNombre = new ArrayList<>();
		if (this.getName().equals(nombre))
			listaArchivosNombre.add(this);
		listaArchivosNombre.addAll(this.contenido.stream() 
		          .filter(a->a.buscar(nombre) != null)
		          .collect(Collectors.toList()));
		return listaArchivosNombre;
	}
	public  String listadoDeContenido() {
		String rutasArchivos = "";
		for (FileSystem a:this.contenido)
			rutasArchivos = rutasArchivos + "\n" + a.listadoDeContenido();
		return this.getName() + rutasArchivos;
	}
}
