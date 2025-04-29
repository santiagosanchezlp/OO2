package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends CriterioStrategy{

	public List<Pelicula> peliculasSugeridas (Decodificador deco){
		return deco.getPeliculasOfrecidas().stream()
			.sorted((pe1, pe2) -> 
				Integer.compare(pe2.getAnoEstreno(), pe1.getAnoEstreno()))
			.sorted((pe1, pe2) -> 
				Double.valueOf(pe2.getPuntaje()).compareTo(Double.valueOf(pe1.getPuntaje())))
			.collect(Collectors.toList());
	}
}
