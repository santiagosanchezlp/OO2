package ar.edu.unlp.info.oo1.Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class StateTest {
	
	ToDoItem hacerTarea;
	
	@BeforeEach
	void setUp() throws Exception {
		hacerTarea = new ToDoItem("oocuparme de la tarea");
	}
	
    @Test
    public void testPending() {
        assertTrue(hacerTarea.getState() instanceof Pending);
        hacerTarea.addComment("1");
    	hacerTarea.start();
        assertEquals(LocalDate.now(), hacerTarea.getStart());
        assertTrue(hacerTarea.getState() instanceof InProgress);
        hacerTarea.addComment("2");
        hacerTarea.togglePause();
        assertTrue(hacerTarea.getState() instanceof Paused);
        hacerTarea.addComment("3");
        assertEquals(0,hacerTarea.workedTime());
        hacerTarea.finish();
        assertTrue(hacerTarea.getState() instanceof Finished);
        hacerTarea.addComment("4");
        assertEquals(0,hacerTarea.workedTime());
        assertEquals (3, hacerTarea.getComments().size());
    }
}
