package io.github.unlp_oo.Ejercicio11_Topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class TopografiaTest {
	
	Agua agua1, agua2;
	Tierra tierra1, tierra2;
	Pantano pantano1, pantano2;
	Mixto mixto1, mixto2;
	
	@BeforeEach
	void setUp() throws Exception {
		agua1 = new Agua();
		agua2 = new Agua();
		tierra1 = new Tierra();
		tierra2 = new Tierra();
		pantano1 = new Pantano();
		pantano2 = new Pantano();
		mixto1 = new Mixto(agua1, agua2, tierra2, pantano1);
		mixto2 = new Mixto(agua1, agua1, tierra1, pantano2);
	}
	
    @Test
    public void testAgua() {
        assertTrue(agua1.equals(agua2));
    }
    @Test
    public void testTierra() {
        assertTrue(tierra1.equals(tierra2));
    }
    @Test
    public void testPantano() {
        assertTrue(pantano1.equals(pantano2));
    }
    @Test
    public void testMixto() {
        assertTrue(mixto1.equals(mixto2));
    }
}
