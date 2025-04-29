package ar.edu.unlp.info.oo1.Ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class DecodificadorTest {
	
	Pelicula thor, capitanAmerica, ironMan, dunkirk, rocky, rambo;
	List<Pelicula> peliculasOfrecidas;
	Novedad novedad;
	Similaridad similaridad;
	Puntaje puntaje;
	Decodificador deco;
	
	@BeforeEach
	void setUp() throws Exception {
		
		thor = new Pelicula("Thor", 2007, 7.9);
		capitanAmerica = new Pelicula("Capitan America", 2016, 7.8);
		ironMan = new Pelicula("Iron man", 2010, 7.9);
		dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
		rocky = new Pelicula("Rocky", 1976, 8.1);
		rambo = new Pelicula("Rambo", 1979, 7.8);
		
		thor.similar(capitanAmerica);
		thor.similar(ironMan);
		rocky.similar(rambo);
		
		peliculasOfrecidas = Arrays.asList(thor, capitanAmerica, ironMan, dunkirk, rocky, rambo);

		deco = new Decodificador (peliculasOfrecidas);
		deco.reproducir(thor);
		deco.reproducir(rocky);
	}
	
    @Test
    public void testNovedad() {
		novedad = new Novedad();
		deco.setCriterio(novedad);
    	assertEquals("Dunkirk", deco.tresPeliculasSugeridas().get(0).getTitulo());
    	assertEquals("Capitan America", deco.tresPeliculasSugeridas().get(1).getTitulo());
    	assertEquals("Iron man", deco.tresPeliculasSugeridas().get(2).getTitulo());
    }
    public void testSimilaridad() {
		similaridad = new Similaridad();
		deco.setCriterio(similaridad);
    	assertEquals("Capitan America", deco.tresPeliculasSugeridas().get(0).getTitulo());
    	assertEquals("Iron man", deco.tresPeliculasSugeridas().get(1).getTitulo());
    	assertEquals("Rambo", deco.tresPeliculasSugeridas().get(2).getTitulo());
    }
    public void testPuntaje() {
    	puntaje = new Puntaje();
		deco.setCriterio(puntaje);
    	assertEquals("Dunkirk", deco.tresPeliculasSugeridas().get(0).getTitulo());
    	assertEquals("Iron man", deco.tresPeliculasSugeridas().get(1).getTitulo());
    	assertEquals("Capitan America", deco.tresPeliculasSugeridas().get(2).getTitulo());
    }
}
