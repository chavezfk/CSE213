package com.fchavez.hw0.one;

/**
 * A simple FizzBuzz program.
 * 
 * <p>This program prints Fizz, Buzz, and FizzBuzz
 * for multiples of 3, 5, and both respectively.
 * 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw 0, #1
 * @bugs None
 */
public class FizzBuzz {
	public static void main( String[] args){
		for (int i = 1; i <= 100; i++){
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
