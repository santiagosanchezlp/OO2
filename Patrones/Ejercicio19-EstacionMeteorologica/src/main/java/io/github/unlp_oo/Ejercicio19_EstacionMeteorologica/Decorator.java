package io.github.unlp_oo.Ejercicio19_EstacionMeteorologica;

import java.util.List;

public abstract class Decorator implements WeatherData{
	protected WeatherData estacionMeteorologica;
	
	public Decorator(WeatherData unaEstacion) {
		this.estacionMeteorologica = unaEstacion;
	}
	
	public double getTemperatura() {
		return this.estacionMeteorologica.getTemperatura();
	}

	public double getPresion() {
		return this.estacionMeteorologica.getPresion();
	}

	public double getRadiacionSolar() {
		return this.estacionMeteorologica.getRadiacionSolar();
	}

	public List<Double> getTemperaturas(){
		return this.estacionMeteorologica.getTemperaturas();
	}
}
