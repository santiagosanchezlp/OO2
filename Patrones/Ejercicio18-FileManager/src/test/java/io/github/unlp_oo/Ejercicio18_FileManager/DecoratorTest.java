package io.github.unlp_oo.Ejercicio18_FileManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class DecoratorTest {
	
	FileOO2 file;
	DecoratorExtension decoradorExtension;
	DecoratorFechaCreacion decoradorFecha;
	DecoratorTamaño decoradorTamaño;
	
	@BeforeEach
	void setUp() throws Exception {
		file = new FileOO2 ("archivOO", ".info", 123, LocalDate.of(2000, 1, 1), LocalDate.of(2024, 10, 10), "Administrador");
	}
	
    @Test
    public void testDecoratorExtension() {
    	decoradorExtension = new DecoratorExtension(file);
    	assertEquals("archivOO - .info", decoradorExtension.prettyPrint());
    }
    
    @Test
    public void testDecoratorFechaCreacion() {
    	decoradorFecha = new DecoratorFechaCreacion(file);
    	assertEquals("archivOO - 2000-01-01 - .info", decoradorFecha.prettyPrint());
    }
    
    @Test
    public void testDecoratorTamaño() {
    	decoradorTamaño = new DecoratorTamaño(file);
    	assertEquals("archivOO - 123 - Administrador - .info", decoradorTamaño.prettyPrint());
    }
}
