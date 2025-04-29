package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;

public interface State {
	public abstract State start(ToDoItem name);
	public abstract State togglePause(ToDoItem name);
	public abstract State finish(ToDoItem name);
	public abstract Duration workedTime(ToDoItem name);
	public abstract boolean notFinished();
}
