package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;

public class Pending implements State{
	public  void toDoItem(ToDoItem name) {
		
	}
	public  void start(ToDoItem name) {
		name.setState(new InProgress());
		name.setStart();
	}
	public  void togglePause(ToDoItem name) {
		throw new RuntimeException("ERROR: you can't pause (or unpause) in pending state");
	}
	public  void finish(ToDoItem name) {}

	public  Duration workedTime(ToDoItem name) {
		throw new RuntimeException("ERROR: ToDoItem " + name.getName() +" didn't start");
	}
	public  boolean notFinished() {
		return true;
	}
}
