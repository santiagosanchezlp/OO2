package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;
import java.time.LocalDate;

public class Paused implements State{
	
	public  State start(ToDoItem name) {
		return this;
	}
	public  State togglePause(ToDoItem name) {
		return new InProgress();
	}
	public  State finish(ToDoItem name) {
		return new Finished();
	}
	public  Duration workedTime(ToDoItem name) {
		return Duration.between(name.getStart(), LocalDate.now());
	}
	public  boolean notFinished() {
		return true;
	}
}
