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
	
	public State getState() {
		return this.state;
	}

	public String getName() {
		return this.name;
	}
	
	public LocalDate getStart() {
		return this.startDate;
	}
	
	public LocalDate getFinish () {
		return this.finishDate;
	}
	
	public  void start() {
		this.state = this.state.start(this);
		if (this.startDate == null)
			this.startDate = LocalDate.now();
	}
	public  void togglePause() {
		this.state = this.state.togglePause(this);
	}
	
	public  void finish() {
		this.state = this.state.finish(this);
		if (this.finishDate == null)
			this.finishDate = LocalDate.now();
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
