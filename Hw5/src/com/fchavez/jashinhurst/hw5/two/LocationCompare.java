package com.fchavez.jashinhurst.hw5.two;

import java.util.Comparator;
/**
 * class for comparing location
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @todo none
 * @version 1.0
 *
 */
public class LocationCompare implements Comparator<Book>{
	@Override
	public int compare(Book a, Book b) {
		return a.getPublicationCity().compareTo(b.getPublicationCity());
	}
}
