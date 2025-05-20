package io.github.unlp_oo.Ejercicio18_FileManager;

public class DecoratorFechaCreacion extends Decorator{
	public DecoratorFechaCreacion(FileComponent unFile) {
		super(unFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint()
				+ " - " + this.getFechaCreacion()
				+ " - " + this.getExtension();
	}
}
