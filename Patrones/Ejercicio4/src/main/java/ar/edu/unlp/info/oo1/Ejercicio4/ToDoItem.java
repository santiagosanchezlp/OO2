package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private List<String> comments;
	private State state;
	private LocalDate startDate;
	private LocalDate finishDate;
	
	public ToDoItem(String name) {
		this.name = name;
		this.comments = new ArrayList<String>();
		this.state = new Pending();
	}
	
	public void setState(State unState) {
		this.state = unState;
	}
	
	public State getState() {
		return this.state;
	}

	public String getName() {
		return this.name;
	}
	
	public void setStart() {
		this.startDate = LocalDate.now();
	}
	public LocalDate getStart() {
		return this.startDate;
	}
	
	public void setFinish() {
		this.finishDate = LocalDate.now();
	}
	
	public LocalDate getFinish () {
		return this.finishDate;
	}
	
	public  void start() {
		this.state.start(this);
	}
	public  void togglePause() {
		this.state.togglePause(this);
	}
	public  void finish() {
		this.state.finish(this);
	}
	public  Duration workedTime() {
		return this.state.workedTime(this);
	}
	public void addComment(String comment) {
		if (state.notFinished())
			comments.add(comment);
	}
	public List<String> getComments(){
		return this.comments;
	}
}
