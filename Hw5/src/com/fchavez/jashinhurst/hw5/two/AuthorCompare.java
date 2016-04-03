package com.fchavez.jashinhurst.hw5.two;

import java.util.Comparator;
/**
 * class for comparing author
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @todo none
 * @version 1.0
 *
 */
public class AuthorCompare implements Comparator<Book>{
	@Override
	public int compare(Book a, Book b) {
		return a.getAuthor().get(0).getLastName().compareTo(b.getAuthor().get(0).getLastName());
	}
}
