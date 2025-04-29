package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends CriterioStrategy{

	public List<Pelicula> peliculasSugeridas(Decodificador deco){
			return deco.getPeliculasOfrecidas().stream()
					.sorted((pe1, pe2) -> 
						Integer.compare(pe2.getAnoEstreno(), pe1.getAnoEstreno()))
					.collect(Collectors.toList());

	}
}
