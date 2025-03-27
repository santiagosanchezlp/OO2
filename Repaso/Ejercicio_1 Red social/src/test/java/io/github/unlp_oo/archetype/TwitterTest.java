package io.github.unlp_oo.archetype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwitterTest {
	Twitter twitter;
	String nombre1, nombre2;
	
	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
		nombre1 = "Santi";
		nombre2 = "Juan";
		twitter.createUser(nombre1);

	}
	
    @Test
    public void testUser() {
        assertFalse(twitter.createUser(nombre1));
        assertTrue(twitter.createUser(nombre2));
    }
}
