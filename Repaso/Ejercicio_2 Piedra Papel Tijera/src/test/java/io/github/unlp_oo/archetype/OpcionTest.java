package io.github.unlp_oo.archetype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class OpcionTest {
	
	Opcion piedra, papel, tijera;
	
	@BeforeEach
	void setUp() throws Exception {
		tijera = new Tijera();
		papel = new Papel();
		piedra = new Piedra();
	}
	
    @Test
    public void testGanador() {
        assertEquals("Ganaste", piedra.resultado(tijera));
        assertEquals("Ganaste", tijera.resultado(papel));
        assertEquals("Ganaste", papel.resultado(piedra));
        assertEquals("Perdiste", piedra.resultado(papel));
        assertEquals("Perdiste", tijera.resultado(piedra));
        assertEquals("Perdiste", papel.resultado(tijera));
        assertEquals("Empate", piedra.resultado(piedra));
        assertEquals("Empate", tijera.resultado(tijera));
        assertEquals("Empate", papel.resultado(papel));
    }
}
