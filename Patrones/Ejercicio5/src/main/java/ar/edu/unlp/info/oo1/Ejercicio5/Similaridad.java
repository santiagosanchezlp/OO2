package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends CriterioStrategy{

	public List<Pelicula> peliculasSugeridas(Decodificador deco){
		return deco.getPeliculasReproducidas().stream()
				.flatMap(p -> p.getPeliculasSimilares().stream())
				.sorted((pe1, pe2) -> 
					Integer.compare(pe2.getAnoEstreno(), pe1.getAnoEstreno()))
				.collect(Collectors.toCollection(ArrayList::new));
	}
}