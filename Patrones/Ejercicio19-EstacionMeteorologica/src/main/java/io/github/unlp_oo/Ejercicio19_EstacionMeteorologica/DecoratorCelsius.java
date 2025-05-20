package io.github.unlp_oo.Ejercicio19_EstacionMeteorologica;

import java.util.List;

public class DecoratorCelsius extends Decorator{

	public DecoratorCelsius(WeatherData unaEstacion) {
		super(unaEstacion);
		// TODO Auto-generated constructor stub
	}

	private double FarenheitToCelsius() {
		return ((this.estacionMeteorologica.getTemperatura()
				-32)
				/ 1.8);
	}
	
	@Override
	public List<Double> getTemperaturas(){
		return (List<Double>) this.estacionMeteorologica.getTemperaturas().stream()
				.map(temp -> ((temp - 32)/1.8));
	}
	
	@Override
	public String displayData() {
		return "Temperatura C: " + this.FarenheitToCelsius() +
			   	  "Presión atmosf: " + this.getPresion() +
			   	  "Radiación solar: " + this.getRadiacionSolar();
	}
	
}
