package ar.edu.unlp.info.oo1.Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPlantaTest {
	
	EmpleadoPlanta james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new EmpleadoPlanta(100,2);
		guido = new EmpleadoPlanta(0,0);
		james.setCasado();
		james.setFechaIngreso(20,3,2024);
	}
	
    @Test
    public void testSueldo() {
        assertEquals(53950, james.sueldo());
        assertEquals(43500, guido.sueldo());
    }
}
