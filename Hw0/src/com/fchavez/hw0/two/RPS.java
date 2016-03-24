package com.fchavez.hw0.two;

import java.util.Scanner;

/**
 * A simple to win Rock Paper Scissors game.
 * 
 * <p>This program plays rock paper scissors with the user.
 * It takes input through the command line of any valid spelling
 * of the options and always plays rock in return. 
 * 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw 0, #2
 * @bugs None
 */
public class RPS {

	public static void main(String[] args){
		String choice;
		String message = "Hello and welcome to the Rock, Paper, Scissors game!\n";
		message += "Please enter a choice, you may choose Rock, Paper, or Scissors.\n\n";
		message += "Your choice: ";
		Scanner in = new Scanner(System.in);
		System.out.print(message);
		switch(choice = in.nextLine().toLowerCase()){
			case "rock":
				System.out.println("I play Rock!\nLooks like it is a tie!");
				break;
			case "scissors":
				System.out.println("I play Rock!\nRock smashes Scissors, I win!");
				break;
			case "paper":
				System.out.println("I play Rock!\nPaper covers Rock, You win!");
				break;
			default:
				System.out.println("Im sorry but " + choice + " is not an option");
				in.close();
				System.exit(1);
		};
		System.out.println("Thanks for playing!");
		in.close();
	}
}
