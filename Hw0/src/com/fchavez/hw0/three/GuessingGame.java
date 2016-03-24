package com.fchavez.hw0.three;

import java.util.Scanner;

/**
 * A game that can guess the number you are thinking of.
 * 
 * <p> This program guesses the number that you are thinking of
 * from a range of numbers that you give the program. 
 * 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw 0, #3
 * @bugs None
 */
public class GuessingGame {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to The Guessing Game");
		System.out.println("Please enter your lower bound");
		int low = in.nextInt();
		System.out.println("Plase enter your upper bound");
		int high = in.nextInt();
		
		if (low > high) {
			System.out.println("You are trying to trick me! Please try again.");
			in.close();
			return;
		}
		
		while (low != high) {
			int mid = low + (high - low) / 2;
			System.out.println("Is your number in the range: (enter corresponding number)");
			System.out.println("1. " + low + " to " + mid + "?");
			System.out.println("2. " + (mid + 1) + " to " + high + "?");
			int k = in.nextInt();
			switch(k) {
			case 1:
				high = mid;
				break;
			case 2:
				low = mid + 1;
				break;
			default:
				System.out.println("Something went wrong");
				continue;
			}
		}
		if (low == high) {
			System.out.println("I found your number! It is " + low);
		} else {
			System.out.println("Something went wrong");
			in.close();
			return;
		}
		
		in.close();
	}
}
