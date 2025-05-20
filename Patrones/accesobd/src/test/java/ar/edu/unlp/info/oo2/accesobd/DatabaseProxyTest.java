package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {
    private DatabaseRealAccess database;
    private DatabaseProxy databaseProxy;

    @BeforeEach
    void setUp() throws Exception {
    	this.database = new DatabaseRealAccess();
    	this.databaseProxy = new DatabaseProxy(this.database, "contrasena");

    }

    @Test
    void testContrasenaIncorrecta() {
    	Exception exception = assertThrows(IllegalArgumentException.class, () -> 
    		databaseProxy.getSearchResults("select * from comics where id=1"));
    	assertEquals("Debe iniciar sesion", exception.getMessage());
    	exception = assertThrows(IllegalArgumentException.class, () -> 
    		assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor"))));
    	assertEquals("Debe iniciar sesion", exception.getMessage());
    }
    
    @Test
    void testContrasenaCorrecta() {
    	databaseProxy.iniciarSesion("contrasena");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
   
}