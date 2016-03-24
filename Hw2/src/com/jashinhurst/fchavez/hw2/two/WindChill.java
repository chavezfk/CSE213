package com.jashinhurst.fchavez.hw2.two;

/**
 * contains methods with formulae for various units of windchill
 * 
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @version 1.0
 * @bugs none
 */
public class WindChill {
	/**
	 * finds wind chill using default units
	 * @param T
	 * @param W
	 * @return
	 */
	public double calculateWindChillIndex(Temperature T, WindSpeed W) {
		return 35.74 + (0.6215 * T.getFahrenheit()) - (35.75 * Math.pow(W.getWindSpeed(),0.16)) + (0.4275 * T.getFahrenheit() * Math.pow(W.getWindSpeed(),0.16));
	}
	
	/**
	 * finds wind chill using watts per meter squared units
	 * @param T
	 * @param W
	 * @return
	 */
	public double calculateWindChillWatt(Temperature T, WindSpeed W) {
		W.toMetersPerSecond();
		return (12.1452 + 11.6222 * Math.sqrt(W.getWindSpeed()) - 1.16222 * W.getWindSpeed()) * (33 - T.getCelsius());
	}
}
