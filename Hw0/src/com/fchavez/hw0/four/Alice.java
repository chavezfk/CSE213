package com.fchavez.hw0.four;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Prints Alice in alternating Cases.
 * 
 * <p>This program prints The story, Alice in Wonderland
 * with alternating Upper and lower cases per non-empty line.
 * 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw 0, #4
 * @bugs None
 */
public class Alice {
	public static void main(String[] args) throws FileNotFoundException{
		String infilename = "alice.txt";
		String outfilename = "alice_in_mixed_case.txt";
		String line;
		File InFile = new File(infilename);
		File OutFile = new File(outfilename);
		PrintWriter out = new PrintWriter(OutFile);
		Scanner in = new Scanner(InFile);
		boolean IsUpper = false;
		while(in.hasNextLine())
		{
			line = in.nextLine();
			if(line.equalsIgnoreCase("")){
				out.println(line);
			}
			else{
				if(IsUpper){
					out.println(line.toUpperCase());
					IsUpper = false;
				}
				else {
					out.println(line.toLowerCase());
					IsUpper = true;
				}
			}
		}
		System.out.println("done");
	in.close();
	out.close();
	}
}