package com.jashinhurst.fchavez.hw2.two;

/**
 * Stores temperature values for Windspeed and WindChill calculations
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @version 1.0
 * @bugs none
 *
 */
public class Temperature {
	private double kelvin;
	private double fahrenheit;
	private double celsius;
	enum Type {FAHRENHEIT, CELSIUS, KELVIN};
	public Type type;
	/**
	 * setter for temperature test for type 
	 * @param value
	 * @param t
	 * @return none
	 */
	public Temperature(double value, Type t) {
		switch(t) {
		case FAHRENHEIT:
			fahrenheitInstance(value);
			break;
		case CELSIUS:
			celsiusInstance(value);
			break;
		case KELVIN:
			kelvinInstance(value);
			break;
		}
	}
	
	/**
	 * case that temperature is in F
	 * @param value
	 */
	private void fahrenheitInstance(double value) {
		this.fahrenheit = value;
		this.kelvin = (value - 32) * (5/9) + 273.15;
		this.celsius = (value - 32) * (5/9);
	}
	
	/**
	 * case that temperature is in C
	 * @param value
	 */
	private void celsiusInstance(double value) {
		this.celsius = value;
		this.kelvin = value + 273.15;
		this.fahrenheit = (value * (9/5)) + 32;
	}
	
	/**
	 * case that temperature is in K
	 * @param value
	 */
	private void kelvinInstance(double value) {
		this.kelvin = value;
		this.fahrenheit = (value - 273.15) * (9/5) + 32;
		this.celsius = value - 273.17;
	}
	
	/**
	 * gets fahrenheit value
	 * @return value
	 */
	public double getFahrenheit() {
		return this.fahrenheit;
	}
	
	/**
	 * gets celsius value
	 * @return value
	 */
	public double getCelsius() {
		return this.celsius;
	}
	
	/**
	 * get kelvin value
	 * @return value
	 */
	public double getKelvin() {
		return this.kelvin;
	}
	
	/**
	 * prints object and values set for object
	 * @param none
	 * @return none
	 */
	@Override public String toString() {
		String out;
		out = this.getClass() + " Object {\n";
		out += "  Fahrenheit: " + this.fahrenheit + " degrees\n";
		out += "  Celsius: " + this.celsius + " degrees\n";
		out += "  Kelvin: " + this.kelvin + " degrees\n";
		out += "}\n";
		return out;
	}
}
