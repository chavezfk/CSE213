package com.fchavez.jashinhurst.hw5.two;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Test class for sorting of books by author, year, title, publisher, and location
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @todo none
 * @version 1.0
 */
public class BookTest {
	public static void main(String args[]) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("Walter Isaacson", 2011, "Steve Jobs", "Simon & Schuster", "New York", "NY"));
		bookList.add(new Book("Brian Kernighan and Dennis Ritchie", 1988, "The C Programming Language", "Prentice Hall", "New York", "NY"));
		bookList.add(new Book("Bjarne Stroustrup", 2013, "The C++ Programming Language", "Addison-Wesley", "Philadelphia", "PA"));
		bookList.add(new Book("Michael Garey and D S Johnson", 1979, "Computers and Intractability: A Guide to the Theory of NP-Completeness", "W. H. Freeman", "Boston", "MA"));
		bookList.add(new Book("George Boole", 1854, "An Investigation of the Laws of Thought: On Which Are Founded the Mathematical Theories of Logic and Probabilities", "Cambridge University Press", "Cambridge", "England"));
		
       System.out.println("Unsorted Books");
       for (int i = 0; i < bookList.size(); i++) {
          bookList.get(i).printReference();
       }
       
       System.out.println("\nSorted By Author");
       AuthorCompare authorCompare = new AuthorCompare();
       Collections.sort(bookList, authorCompare);
       for (int i = 0; i < bookList.size(); i++) {
          bookList.get(i).printReference();
       }

       System.out.println("\nSorted By Year");
       YearCompare yearCompare = new YearCompare();
       Collections.sort(bookList, yearCompare);
       for (int i = 0; i < bookList.size(); i++) {
          bookList.get(i).printReference();
       }
         
       System.out.println("\nSorted By Title ");
       TitleCompare titleCompare = new TitleCompare();
       Collections.sort(bookList, titleCompare);
       for (int i = 0; i < bookList.size(); i++) {
          bookList.get(i).printReference();
       }
       
       System.out.println("\nSorted By Publisher");
       PublisherCompare publisherCompare = new PublisherCompare();
       Collections.sort(bookList, publisherCompare);
       for (int i = 0; i < bookList.size(); i++) {
          bookList.get(i).printReference();
       }
       
       System.out.println("\nSorted By Location");
       LocationCompare locationCompare = new LocationCompare();
       Collections.sort(bookList, locationCompare);
       for (int i = 0; i < bookList.size(); i++) {
          bookList.get(i).printReference();
       }
		
	}
}
