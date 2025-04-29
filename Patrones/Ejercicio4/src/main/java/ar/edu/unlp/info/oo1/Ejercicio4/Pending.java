package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;

public class Pending implements State{
	public  void toDoItem(ToDoItem name) {
		
	}
	public  State start(ToDoItem name) {
		return new InProgress();
	}
	public  State togglePause(ToDoItem name) {
		throw new RuntimeException("ERROR: you can't pause (or unpause) in pending state");
	}
	public  State finish(ToDoItem name) {
		return new Finished();
	}

	public  Duration workedTime(ToDoItem name) {
		throw new RuntimeException("ERROR: ToDoItem " + name.getName() +" didn't start");
	}
	public  boolean notFinished() {
		return true;
	}
}
