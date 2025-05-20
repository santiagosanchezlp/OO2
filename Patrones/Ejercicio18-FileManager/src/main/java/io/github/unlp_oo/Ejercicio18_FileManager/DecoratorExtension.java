package io.github.unlp_oo.Ejercicio18_FileManager;

public class DecoratorExtension extends Decorator{

	public DecoratorExtension(FileComponent unFile) {
		super(unFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint()
				+ " - " + this.getExtension();
	}


}
