package com.jashinhurst.fchavez.hw2.two;

/**
 * class containing windspeed and conversion forula
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @version 1.0
 * @bugs none
 *
 */
public class WindSpeed {
	private double mph;
	
	/**
	 * setter for windspeed in mph
	 * @param value
	 */
	public WindSpeed(double value) {
		this.mph = value;
	}
	
	/**
	 * getter for wind speed
	 * @return wind speed
	 */
	public double getWindSpeed() {
		return this.mph;
	}
	
	/**
	 * converts mph to m/s
	 */
	public void toMetersPerSecond() {
		this.mph *= 0.44704;
	}
	
	/**
	 * prints object info into string
	 * @param none
	 */
	@Override public String toString() {
		String out;
		out = this.getClass() + " Object {\n";
		out += "  mph:" + this.mph + "mph\n";
		out += "}\n";
		return out;
	}
}
