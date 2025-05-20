package io.github.unlp_oo.Ejercicio19_EstacionMeteorologica;

import java.util.Arrays;
import java.util.List;

public class HomeWeatherStation implements WeatherData{
	
	public double getTemperatura() {
		return 86;
	}

	
	public double getPresion() {
		return 1008;
	}

	public double getRadiacionSolar() {
		return 200;
	}

	public List<Double> getTemperaturas(){
		return Arrays.asList(80.6, 86.0, 87.8, 89.6);
	}

	public String displayData(){
	return "Temperatura F: " + this.getTemperatura() +
	   	  "Presión atmosf: " + this.getPresion() +
	   	  "Radiación solar: " + this.getRadiacionSolar();
	}

}
