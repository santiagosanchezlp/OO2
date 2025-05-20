package io.github.unlp_oo.Ejercicio18_FileManager;

public class DecoratorTamaño extends Decorator{

	public DecoratorTamaño(FileComponent unFile) {
		super(unFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint()
				+ " - " + this.getTamaño()
				+ " - " + this.getPermisos()
				+ " - " + this.getExtension();
	}
}
