package io.github.unlp_oo.Ejercicio19_EstacionMeteorologica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class DecoratorTest {
	
	HomeWeatherStation weatherChannel;
	DecoratorCelsius dC;
	DecoratorMinMax dMM;
	DecoratorPromedio dP1, dP2;
	
	@BeforeEach
	void setUp() throws Exception {
		weatherChannel = new HomeWeatherStation();
		dC = new DecoratorCelsius(weatherChannel);
	}
	
    @Test
    public void testAdapter() {
        assertEquals("Temperatura F: 86.0Presión atmosf: 1008.0Radiación solar: 200.0", weatherChannel.displayData());
        assertEquals("Temperatura C: 30.0Presión atmosf: 1008.0Radiación solar: 200.0", dC.displayData());
    }
    @Test
    public void testPromedio() {
    	dP1 = new DecoratorPromedio(weatherChannel);
    	dP2 = new DecoratorPromedio(dC);
        assertEquals("Temperatura F: 86.0Presión atmosf: 1008.0Radiación solar: 200.0Promedio: 86.0", dP1.displayData());
        assertEquals("Temperatura C: 30.0Presión atmosf: 1008.0Radiación solar: 200.0Promedio: 30.0", dP2.displayData());
    }
    @Test
    public void testMinMax() {
    	dMM = new DecoratorMinMax(dC);
        assertEquals("Temperatura C: 30.0Presión atmosf: 1008.0Radiación solar: 200.0Minimo: 27.0Maximo: 32.0", dMM.displayData());
    }
    @Test
    public void testPromMinMax() {
    	dP1 = new DecoratorPromedio(dC);
    	dMM = new DecoratorMinMax(dP1);
        assertEquals("Temperatura C: 30.0Presión atmosf: 1008.0Radiación solar: 200.0Promedio: 30.0Minimo: 27.0Maximo: 32.0", dMM.displayData());
    }
    public void testMinMaxProm() {
    	dMM = new DecoratorMinMax(dC);
    	dP1 = new DecoratorPromedio(dMM);
        assertEquals("Temperatura C: 30Presión atmosf.: 1008Radiación solar: 200Minimo: 27Maximo: 32Promedio: 30", dP1.displayData());
    }
}
