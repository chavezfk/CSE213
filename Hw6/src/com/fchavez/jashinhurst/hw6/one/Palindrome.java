package src.com.fchavez.jashinhurst.hw6.one;

import java.util.ArrayList;


/**
 * class for determining whether a word is a palindrome
 * 
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @todo none
 * @version 1.0
 */
public final class Palindrome {
	/**
	 * test for if word is palindrome
	 * @param word to be checked
	 * @return true or false 
	 */
	public static boolean isPalindrome(String word) {
		int i = 0;
		int j = word.length() - 1;
		while (i < j) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	/**
	 * takes list of words returns only palindromes
	 * @param words list of words
	 * @return list of palindrome words
	 */
	public static ArrayList<String> palindrome(ArrayList<String> words) {
		for (int i = 0; i < words.size(); i++) {
			if (!isPalindrome(words.get(i))) {
				words.remove(i);
			}
		}
		return words;
	}
}
