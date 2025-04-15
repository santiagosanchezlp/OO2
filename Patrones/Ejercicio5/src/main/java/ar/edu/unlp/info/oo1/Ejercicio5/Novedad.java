package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends Criterio{
	public Novedad(List<Pelicula> oferta) {
		super(oferta);
		// TODO Auto-generated constructor stub
	}

	public List<Pelicula> sugerencia(Decodificador deco){
		List <Pelicula> sugerencias = new ArrayList<>();
			sugerencias = this.peliculasOfrecidas.stream()
					.sorted((pe1, pe2) -> 
						Integer.compare(pe2.getAnoEstreno(), pe1.getAnoEstreno()))
					.limit(3)
					.collect(Collectors.toList());
		return sugerencias;
	}
}
