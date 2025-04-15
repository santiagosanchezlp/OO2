package ar.edu.unlp.info.oo1.Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTemporarioTest {
	
	EmpleadoTemporario james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new EmpleadoTemporario(100,2);
		guido = new EmpleadoTemporario(0,0);
		james.setCasado();
	}
	
    @Test
    public void testSueldo() {
        assertEquals(52050, james.sueldo());
        assertEquals(17400, guido.sueldo());
    }
}
