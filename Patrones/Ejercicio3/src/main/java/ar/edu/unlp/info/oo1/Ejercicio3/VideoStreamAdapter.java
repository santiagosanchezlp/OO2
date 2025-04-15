package ar.edu.unlp.info.oo1.Ejercicio3;

public class VideoStreamAdapter extends Media {
	private VideoStream adaptado;
	
	public void play() {
		adaptado.reproduce();
	}
}
