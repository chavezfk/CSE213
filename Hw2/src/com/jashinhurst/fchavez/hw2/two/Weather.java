package com.jashinhurst.fchavez.hw2.two;

import java.util.Scanner;

/**
 * uses all methods in other classes and prints calculation results as well as takes input
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 *
 * @bugs none
 * @version 1.0
 */
public class Weather {
	public static void main(String args[]) {
		double temp = 0;
		String units;
		double ws;
		double result1;
		double result2;
		
		Temperature T = new Temperature(temp, Temperature.Type.FAHRENHEIT);
		WindChill wc = new WindChill();
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter a temperature: ");
		temp = in.nextDouble();
		in.nextLine();
		
		System.out.print("enter temperature units: ");
		units = in.nextLine();
		
		switch(units) {
		case "F":
			T = new Temperature(temp, Temperature.Type.FAHRENHEIT);
			break;
		case "C":
			T = new Temperature(temp, Temperature.Type.CELSIUS);
			break;
		case "K":
			T = new Temperature(temp, Temperature.Type.KELVIN);
			break;
		default:
			System.out.println("Wrong Input\n");
			System.exit(-1);
			break;
		}
		
		System.out.println("enter wind speed: ");
		ws = in.nextDouble();
		in.nextLine();
		in.close();
		
		WindSpeed W = new WindSpeed(ws);
		if (temp > 50 || ws < 4) {
			result1 = 0;
			result2 = 0;
		} else {
			result1 = wc.calculateWindChillIndex(T, W); 
			result2 = wc.calculateWindChillWatt(T, W);
		}
		
		System.out.println("the current wind chill is " + result1);
		System.out.println("or in Watts per meter square the wind chill is " + result2);
		
	}
	
}
