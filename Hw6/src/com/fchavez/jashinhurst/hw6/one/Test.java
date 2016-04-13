package com.fchavez.jashinhurst.hw6.one;

import java.io.*;
import java.util.ArrayList;
/**
 * finds various statistics for a dictionary file provided, prints data such as long words
 * shorts words, average length, etc. 
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @todo none
 * @version 1.0
 */
public class Test {
	public static void main(String args[]) {
		char AlphabetArray[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
		FileReader fr = null;
		FileWriter fos = null;
		PrintWriter pw = null;
		File in = new File("web2");
		File short_words = new File("short.txt");
		File long_words = new File("long.txt");
		File same = new File("same.txt");
		File stats = new File("statistics.txt");
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> temp = null;
		String write = null;
		
		try {
			fr = new FileReader(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader bufRead = new BufferedReader(fr);
		
		
		try {
			while(true) {
				if(!bufRead.ready()) {
					break;
				}
				words.add(bufRead.readLine());
			}
			
			fos = new FileWriter(short_words);
			pw = new PrintWriter(fos);
			temp = WordStatistics.listShortWords(words);
			for (int i = 0; i < temp.size(); i++) {
				pw.println(temp.get(i));
			}
			fos.close();
			fos = new FileWriter(long_words);
			pw = new PrintWriter(fos);
			temp = WordStatistics.listLongWords(words);
			for (int i = 0; i < temp.size(); i++) {
				pw.println(temp.get(i));
			}
			fos.close();
			fos = new FileWriter(same);
			pw = new PrintWriter(fos);
			temp = WordStatistics.startEndSameChar(words);
			for (int i = 0; i < temp.size(); i++) {
				pw.println(temp.get(i));
			}
			fos.close();
			
			fos = new FileWriter(stats);
			pw = new PrintWriter(fos);
			
			write = "Dictionary Word Statistics\n\n";
			write += "Average Length of a Word: " + WordStatistics.averageWordSize(words) + "\n\n";
			write += "Frequency of Letters\n";
			ArrayList<Double> let_freq = WordStatistics.charFrequency(words);
			for (int i = 0; i < 26; i++) {
				write += "\t" + AlphabetArray[i] + ": " + let_freq.get(i) + "\n";
			}
			write += "\nFrequency of Proper Names/Nouns: " + WordStatistics.properFrequency(words) + "%\n\n";
			write += "Words Beginning with Letter\n";
			ArrayList<Integer> beg_let_freq = WordStatistics.charStartWith(words);
			for (int i = 0; i < 26; i++) {
				write += "\t" + AlphabetArray[i] + ": " + beg_let_freq.get(i) + "\n";
			}
			pw.print(write);
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			pw.close();
		}
	}
}
