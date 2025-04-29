package io.github.unlp_oo.Ejercicio12_FileSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class FileSystemTest {
	
	Archivo a1, a2, a3, a4;
	Directorio d1, d2, d3, root;
	
	@BeforeEach
	void setUp() throws Exception {
		a1 = new Archivo("Archivo 1", LocalDate.of(1993,10,25), 25000);
		a2 = new Archivo("Archivo 2", LocalDate.of(1995,10,25), 30000);
		a3 = new Archivo("Archivo 3", LocalDate.of(1996,10,25), 32000);
		a4 = new Archivo("Archivo 4", LocalDate.of(1997,10,25), 20000);
		d1 = new Directorio("Directorio 1", LocalDate.of(2000,10,25));
		d2 = new Directorio("Directorio 2", LocalDate.of(2001,10,25));
		d3 = new Directorio("Directorio 3", LocalDate.of(2002,10,25));
		root = new Directorio("Root", LocalDate.of(1990,10,25));
	}
    @Test
    public void testFileSystemSinSubcarpetas() {
		root.addContenido(a1);
		root.addContenido(a2);
		root.addContenido(a3);
		root.addContenido(a4);
    	assertEquals(a3, root.archivoMasGrande());
        assertEquals(a4, root.archivoMasNuevo());
        assertEquals(a1, root.buscar("Archivo 1"));
    }
    @Test
    public void testFileSystemConSubcarpetas() {
    	d1.addContenido(a1);
		d2.addContenido(a2);
		d3.addContenido(a3);
		d3.addContenido(a4);
		d2.addContenido(d3);
		root.addContenido(d1);
		root.addContenido(d2);
    	assertEquals(a3, root.archivoMasGrande());
        assertEquals(a4, root.archivoMasNuevo());
        assertEquals(a1, root.buscar("Archivo 1"));
    }
}
