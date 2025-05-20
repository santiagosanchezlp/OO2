package io.github.unlp_oo.Ejercicio19_EstacionMeteorologica;

public class DecoratorMinMax extends Decorator{

	public DecoratorMinMax(WeatherData unaEstacion) {
		super(unaEstacion);
		// TODO Auto-generated constructor stub
	}

	private double tempMin() {
		return this.getTemperaturas().stream()
                .max((t1, t2) -> Double.compare(t1, t2))
                .orElse(0.0);
	}
	
	private double tempMax() {
		return this.getTemperaturas().stream()
                .max((t1, t2) -> Double.compare(t1, t2))
                .orElse(0.0);
	}
	
	@Override
	public String displayData() {
		return this.estacionMeteorologica.displayData()
				+ "Minimo: " + this.tempMin()
				+ "Maximo: " + this.tempMax();
	}
}
