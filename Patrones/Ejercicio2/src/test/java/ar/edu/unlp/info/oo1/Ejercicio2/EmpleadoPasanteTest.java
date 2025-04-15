package ar.edu.unlp.info.oo1.Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPasanteTest {
	
	EmpleadoPasante james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new EmpleadoPasante(2);
		guido = new EmpleadoPasante(0);
	}
	
    @Test
    public void testSueldo() {
        assertEquals(21200, james.sueldo());
        assertEquals(17400, guido.sueldo());
    }
}
