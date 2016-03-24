package com.fchavez.jashinhurst.hw4.two;

import java.util.ArrayList;

/**
 * the main class for all of the references has a method for parsing strings of authors
 * to place in the author class for easy printing and access
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 *
 * @bugs none
 * @todo none
 */
abstract public class Sources {
	ArrayList<Author> author = new ArrayList<Author>();
	String title;
	
	/**
	 * parses formatted string to split several authors as well as first, middle, and last
	 * names
	 * @param authorString
	 * @return author class with names defined
	 */
	public static ArrayList<Author> parseString(String authorString) {
		ArrayList <Author> authorList = new ArrayList<Author>();
		
		String[] s = authorString.split(", ");
		String[] t;
		if (s.length == 1) {
			s = authorString.split(" and ");
			for (int i = 0; i < s.length; i++) {
				Author author = new Author();
				t = s[i].split(" ");
				if (t.length == 2) {
					author.setTwoNames(t[0], t[1]);
				} else {
					author.setThreeNames(t[0], t[1], t[2]);
				}
				authorList.add(i, author);
			}
		} else {
			for (int i = 0; i < s.length; i++) {
				Author author = new Author();
				t = s[i].split(" ");
				if (t.length == 2) {
					author.setTwoNames(t[0], t[1]);
				} else {
					author.setThreeNames(t[0], t[1], t[2]);
				}
				authorList.add(author);
			}
		}
		
		return authorList;
	}
}
