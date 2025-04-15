package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;

public interface State {
	public abstract void start(ToDoItem name);
	public abstract void togglePause(ToDoItem name);
	public abstract void finish(ToDoItem name);
	public abstract Duration workedTime(ToDoItem name);
	public abstract boolean notFinished();
}
