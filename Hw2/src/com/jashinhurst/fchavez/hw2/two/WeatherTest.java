package com.jashinhurst.fchavez.hw2.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherTest {

	Temperature T = new Temperature(32, Temperature.Type.FAHRENHEIT);
	WindSpeed W = new WindSpeed(10);
	WindChill WC = new WindChill();
	
	@Test
	public void testTemperature() {
		assertEquals(0.0, (int) T.getCelsius(), 1);
		assertEquals(273.15, (int) T.getKelvin(), 1);
	}
	
	@Test
	public void testWindSpeed() {
		W.toMetersPerSecond();
		assertEquals(4.4704, W.getWindSpeed(), .01);
	}

	@Test
	public void testWindChill() {
		assertEquals(23.7, WC.calculateWindChillIndex(T, W), 0.1);
		assertEquals(1040.2, WC.calculateWindChillWatt(T, W), 0.1);
	}

}
