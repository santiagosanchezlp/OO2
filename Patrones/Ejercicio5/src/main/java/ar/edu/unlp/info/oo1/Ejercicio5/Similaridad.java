package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Criterio{
	public Similaridad(List<Pelicula> oferta) {
		super(oferta);
		// TODO Auto-generated constructor stub
	}

	public List<Pelicula> sugerencia(Decodificador deco){
		List <Pelicula> sugerencias = new ArrayList<Pelicula>();
		ArrayList <Pelicula> peliculasReproducidas = (ArrayList<Pelicula>) deco.getPeliculasReproducidas();
		int i = 0;
		while (sugerencias.size() < 3) {
			sugerencias.addAll(peliculasReproducidas.get(i).getPeliculasSimilares());
			i++;
		}
		return sugerencias.stream()
				.limit(3)
				.collect(Collectors.toList());
	}
}