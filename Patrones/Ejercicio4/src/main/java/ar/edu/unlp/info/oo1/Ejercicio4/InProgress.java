package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;

public class InProgress implements State{
	
	public  void start(ToDoItem name) {}
	public  void togglePause(ToDoItem name) {
		name.setState(new Paused());
	}
	public  void finish(ToDoItem name) {}
	public  Duration workedTime(ToDoItem name) {
		return Duration.between(name.getStart(), name.getFinish());
	}
	public  boolean notFinished() {
		return false;
	}
}
