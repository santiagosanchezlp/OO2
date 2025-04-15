package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;
import java.time.LocalDate;

public class Paused implements State{
	
	public  void start(ToDoItem name) {}
	public  void togglePause(ToDoItem name) {
		name.setState(new InProgress());
	}
	public  void finish(ToDoItem name) {
		name.setState(new Finished());
		name.setFinish();
	}
	public  Duration workedTime(ToDoItem name) {
		return Duration.between(name.getStart(), LocalDate.now());
	}
	public  boolean notFinished() {
		return true;
	}
}
