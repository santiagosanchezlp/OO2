package io.github.unlp_oo.Ejercicio19_EstacionMeteorologica;

public class DecoratorPromedio extends Decorator{

	public DecoratorPromedio(WeatherData unaEstacion) {
		super(unaEstacion);
		// TODO Auto-generated constructor stub
	}
	private double tempPromedio() {
		return this.getTemperaturas().stream()
				.mapToDouble(Number::doubleValue)
                .average()
                .getAsDouble();
	}
	@Override
	public String displayData() {
		return this.estacionMeteorologica.displayData()
				+ "Promedio: " + this.tempPromedio();
	}
	
}
