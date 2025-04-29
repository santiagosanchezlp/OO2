package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decodificador {
	private List<Pelicula> peliculasOfrecidas;
	private CriterioStrategy criterio;
	private List<Pelicula> peliculasReproducidas;
	
	public Decodificador (List<Pelicula> pelisOfrecidas) {
		this.peliculasOfrecidas = pelisOfrecidas;
		this.peliculasReproducidas = new ArrayList<>();
	}
	
	public void reproducir (Pelicula unaPelicula) {
		this.peliculasReproducidas.add(unaPelicula);
	}
	
	public void setCriterio(CriterioStrategy unCriterio) {
		this.criterio = unCriterio;
	}
	
	public List<Pelicula> getPeliculasReproducidas() {
		return peliculasReproducidas;
	}
	
	public List<Pelicula> tresPeliculasSugeridas(){
		return this.criterio.tresPeliculasSugeridas(this);
	}

	public List<Pelicula> getPeliculasOfrecidas() {
		return peliculasOfrecidas;
	}
}

