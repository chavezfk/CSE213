package com.fchavez.jashinhurst.hw6.one;

import java.util.*;

/**
 * class containing functions for finding various statistics for a list of words
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @todo none
 * @version 1.0
 *
 */
public final class WordStatistics {
	/**
	 * finds length of shortest word
	 * @param words
	 * @return length of shortest word
	 */
	public static int shortWordLength(ArrayList<String> words) {
		int min = words.get(0).length();
		for (int i = 1; i < words.size(); i++) {
			if (words.get(i).length() < min) {
				min = words.get(i).length();
			}
		}
		return min;
	}
	
	/**
	 * finds length of longest word
	 * @param words
	 * @return length of longest word
	 */
	public static int longWordLength(ArrayList<String> words) {
		int max = words.get(0).length();
		for (int i = 1; i < words.size(); i++) {
			if (words.get(i).length() > max) {
				max = words.get(i).length();
			}
		}
		return max;
	}
	
	/**
	 * returns array list of shortest words
	 * @param words
	 * @return array list of shortest words
	 */
	public static ArrayList<String> listShortWords(ArrayList<String> words) {
		ArrayList<String> shortWords = new ArrayList<String>();
		int size = shortWordLength(words);
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() == size) {
				shortWords.add(words.get(i));
			}
		}
		return shortWords;
	}
	
	/**
	 * returns array list of longest words
	 * @param words
	 * @return array list of longest words
	 */
	public static ArrayList<String> listLongWords(ArrayList<String> words) {
		ArrayList<String> longWords = new ArrayList<String>();
		int size = longWordLength(words);
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() == size) {
				longWords.add(words.get(i));
			}
		}
		return longWords;
	}
	
	/**
	 * finds average word length
	 * @param words
	 * @return average word length
	 */
	public static double averageWordSize(ArrayList<String> words) {
		int sum = 0;
		for (int i = 0; i < words.size(); i++) {
			sum+=words.get(i).length();
		}
		return sum/words.size();
	}
	
	/**
	 * finds total number of words in dictionary
	 * @param words
	 * @return number of words
	 */
	public static int totalNumberWords(ArrayList<String> words) {
		return words.size();
	}
	
	/**
	 * finds number of occurrences of char in all words
	 * @param words
	 * @param c
	 * @return occurrences of char in words
	 */
	public static ArrayList<Double> charFrequency(ArrayList<String> words) {
		char AlphabetArray[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		ArrayList<Character> flat_words = new ArrayList<Character>();
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.get(i).length(); j++) {
				flat_words.add(words.get(i).charAt(j));
			}
		}
		ArrayList<Double> freq = new ArrayList<Double>(26);
		for (int i = 0; i < 26; i++) {
			freq.add((double) (Collections.frequency(flat_words, AlphabetArray[i]))/words.size() * 100);
		}
		return freq;
	}
	
	/**
	 * finds number of proper nouns in dictionary
	 * @param words
	 * @return number of proper nouns in dictionary
	 */
	public static double properFrequency(ArrayList<String> words) {
		int count = 0;
		for (int i = 0; i < words.size(); i++) {
			if (Character.isUpperCase(words.get(i).charAt(0))) {
				count++;
			}
		}
		return (double) count/words.size() * 100;
	}
	
	/**
	 * finds number of words that start with char
	 * @param words
	 * @param c
	 * @return number of words that start with char
	 */
	public static ArrayList<Integer> charStartWith(ArrayList<String> words) {
		char AlphabetArray[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		ArrayList<Integer> freq = new ArrayList<Integer>(26);
		int count = 0;
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < words.size(); j++) {
				if (words.get(j).toLowerCase().charAt(0) == AlphabetArray[i]) {
					count++;
				}
			}
			freq.add(count);
			count = 0;
		}
		return freq;
	}
	
	/**
	 * finds words that start and end with same char
	 * @param words
	 * @return array list containing all words that start and end with same char
	 */
	public static ArrayList<String> startEndSameChar(ArrayList<String> words) {
		ArrayList<String> new_words = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).toLowerCase().charAt(0) == words.get(i).toLowerCase().charAt(words.get(i).length()-1)) {
				new_words.add(words.get(i));
			}
		}
		return new_words;
	}
}
