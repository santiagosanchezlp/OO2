package io.github.unlp_oo.archetype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class UserTest {
	
	User james;
	String textoValido, textoVacio, textoLargo;
	Tweet tweetPrueba;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new User("James");
		textoValido = "Hola Mundo";
		textoVacio = "";
		textoLargo = "uno hasta doscientos cuarenta caracteres esta admitido pero si me paso de doscientos cuarenta deberia haber un error que no me permita cargar ese tweet. Creo que ya llegue al limite pero para estar seguro voy a seguir escribiendo. Y por las dudas un poquito poquito mas. Ahora si";
		tweetPrueba = new normalTweet (textoValido);
	}
	
    @Test
    public void testUser() {
        assertTrue(james.createTweet(textoValido));
        assertFalse(james.createTweet(textoVacio));
        assertFalse(james.createTweet(textoLargo));
        assertTrue(james.reTweet(tweetPrueba));
    }
}
