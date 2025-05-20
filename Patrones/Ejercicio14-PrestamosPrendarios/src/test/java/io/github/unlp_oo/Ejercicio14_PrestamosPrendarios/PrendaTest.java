package io.github.unlp_oo.Ejercicio14_PrestamosPrendarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PrendaTest {
	
	Alquiler departamento38;
	Automovil gol;
	PrendaCombinada prenda;
	
	@BeforeEach
	void setUp() throws Exception {
		departamento38 = new Alquiler(430000, LocalDate.of(2024, 12, 1), LocalDate.of(2027, 11, 30));
		gol = new Automovil(LocalDate.of(2013, 10, 8), 120000, 10000000);
		prenda = new PrendaCombinada();
		prenda.addBien(departamento38);
		prenda.addBien(gol);
	}
	
    @Test
    public void testValor() {
        assertEquals(12900000, departamento38.valor());
        assertEquals(0, gol.valor());
        assertEquals(12900000, prenda.valor());
    }
    @Test
    public void testValorPrendario() {
        assertEquals(11610000, departamento38.valorPrendario());
        assertEquals(0, gol.valorPrendario());
        assertEquals(6450000, gol.valorPrendario());
    }
}
