package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.List;

public abstract class Criterio {
	protected List<Pelicula> peliculasOfrecidas;
	
	public Criterio (List<Pelicula> oferta) {
		this.peliculasOfrecidas = oferta;
	}
	
	public abstract List<Pelicula> sugerencia(Decodificador deco);
}
