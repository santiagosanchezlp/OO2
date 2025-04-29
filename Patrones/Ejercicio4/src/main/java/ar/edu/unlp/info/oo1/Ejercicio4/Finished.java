package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;
import java.time.LocalDate;

public class Finished implements State{
	
	public  State start(ToDoItem name) {
		return this;
	}
	public  State togglePause(ToDoItem name) {
		throw new RuntimeException("ERROR: you can't pause (or unpause) in finished state");
	}
	public State finish(ToDoItem name) {
		return this;
	}
	public  Duration workedTime(ToDoItem name) {
		return Duration.between(name.getStart(), LocalDate.now());
	}
	public  boolean notFinished() {
		return true;
	}
}