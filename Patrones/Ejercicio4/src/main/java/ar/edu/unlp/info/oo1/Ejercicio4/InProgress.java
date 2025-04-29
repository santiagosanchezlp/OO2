package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;

public class InProgress implements State{
	
	public  State start(ToDoItem name) {
		return this;
	}
	public  State togglePause(ToDoItem name) {
		return new Paused();
	}
	public  State finish(ToDoItem name) {
		return this;
	}
	public  Duration workedTime(ToDoItem name) {
		return Duration.between(name.getStart(), name.getFinish());
	}
	public  boolean notFinished() {
		return false;
	}
}
