package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.*;
import java.util.stream.Collectors;

public class Pelicula {
	private String titulo;
	private int anoEstreno;
	private List<Pelicula> pelisSimilares;
	private double puntaje;
	
	public Pelicula(String unTitulo, int unAno, double unPuntaje) {
		this.titulo = unTitulo;
		this.anoEstreno = unAno;
		this.puntaje = unPuntaje;
		this.pelisSimilares = new ArrayList<Pelicula>();
	}
	
	public void similar(Pelicula unaPelicula) {
		if (! this.pelisSimilares.contains(unaPelicula)) {
			this.pelisSimilares.add(unaPelicula);
			unaPelicula.similar(this);
		}
		;
	}
	
	public List<Pelicula> getPeliculasSimilares(){
		return this.pelisSimilares.stream().
				sorted((pe1, pe2) -> 
						Integer.compare(pe2.getAnoEstreno(), pe1.getAnoEstreno()))
					.collect(Collectors.toList());
	}
	
	public int getAnoEstreno() {
		return anoEstreno;
	}

	public double getPuntaje() {
		return this.puntaje;
	}

	public String getTitulo() {
		return titulo;
	}
	
}
