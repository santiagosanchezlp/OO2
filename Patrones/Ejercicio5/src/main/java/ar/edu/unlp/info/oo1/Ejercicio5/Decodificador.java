package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decodificador {
	private List<Pelicula> peliculasOfrecidas;
	private Criterio criterio;
	private List<Pelicula> peliculasReproducidas;
	
	public Decodificador (List<Pelicula> pelisOfrecidas) {
		this.peliculasOfrecidas = pelisOfrecidas;
		this.peliculasReproducidas = new ArrayList<>();
	}
	
	public void reproducir (Pelicula unaPelicula) {
		this.peliculasReproducidas.add(unaPelicula);
	}
	
	public void setCriterio(Criterio unCriterio) {
		this.criterio = unCriterio;
	}
	
	public List<Pelicula> getPeliculasReproducidas() {
		return peliculasReproducidas;
	}
	
	public List<Pelicula> sugerencia(){
		return this.criterio.sugerencia(this);
	}
	
	public static void main (String[] args) {
		Pelicula thor, capitanAmerica, ironMan, dunkirk, rocky, rambo;
		thor = new Pelicula("Thor", 2007, 7.9);
		capitanAmerica = new Pelicula("Capitan America", 2016, 7.8);
		ironMan = new Pelicula("Iron man", 2010, 7.9);
		dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
		rocky = new Pelicula("Rocky", 1976, 8.1);
		rambo = new Pelicula("Rambo", 1979, 7.8);
		
		thor.similar(capitanAmerica);
		thor.similar(ironMan);
		rocky.similar(rambo);
		
		List<Pelicula> peliculasOfrecidas = Arrays.asList(thor, capitanAmerica, ironMan, dunkirk, rocky, rambo);
		
		Novedad novedad = new Novedad(peliculasOfrecidas);
		Similaridad similaridad = new Similaridad(peliculasOfrecidas);
		Puntaje puntaje = new Puntaje(peliculasOfrecidas);
		
		Decodificador deco = new Decodificador (peliculasOfrecidas);
		deco.reproducir(thor);
		deco.reproducir(rocky);
		deco.setCriterio(novedad);
		for (Pelicula p:deco.sugerencia())
			System.out.print(p.getTitulo() + ", ");
		System.out.println();
		deco.setCriterio(similaridad);
		for (Pelicula p:deco.sugerencia())
			System.out.print(p.getTitulo() + ", ");
		System.out.println();
		deco.setCriterio(puntaje);
		for (Pelicula p:deco.sugerencia())
			System.out.print(p.getTitulo() + ", ");
	}
}

