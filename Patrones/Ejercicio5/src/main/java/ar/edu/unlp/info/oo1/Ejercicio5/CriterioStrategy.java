package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.List;
import java.util.stream.Collectors;

public abstract class CriterioStrategy {
	public List<Pelicula> tresPeliculasSugeridas (Decodificador deco){
		List<Pelicula> sugerenciasTotal = this.peliculasSugeridas(deco);
		sugerenciasTotal.removeAll(deco.getPeliculasReproducidas());
		return sugerenciasTotal.stream()
				.limit(3)
				.collect(Collectors.toList());
	}
	protected abstract List<Pelicula> peliculasSugeridas (Decodificador deco);
}
