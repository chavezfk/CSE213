package com.fchavez.jashinhurst.hw5.two;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * class containing info and print method for a Book reference
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @version 1.0
 */
public class Book implements Comparator<Book>{
	ArrayList<Author> author = new ArrayList<Author>();
	String title;
	int year;
	String publisher;
	String publicationCity;
	String publicationState;
	
	/**
	 * default constructor for class
	 */
	public Book() {
	}
	
	/**
	 * constructor with all fields specified
	 * @param authorString string containing author names
	 * @param year year of publishing
	 * @param title of book
	 * @param publisher of book
	 * @param publicationCity city of publishing
	 * @param publicationState State of publishing
	 */
	public Book(String authorString, int year, String title, String publisher, String publicationCity, String publicationState) {
		this.author = parseString(authorString);
		this.title = title;
		this.year = year;
		this.publisher = publisher;
		this.publicationCity = publicationCity;
		this.publicationState = publicationState;
	}
	
	/**
	 * prints reference in correct format
	 */
	public void printReference() {
		for (int i = 0; i < author.size(); i++) {
			if (author.get(i).middleName == null) {
				System.out.print(author.get(i).getLastName().toUpperCase() + ", " + this.author.get(i).getFirstName().toUpperCase().charAt(0));
			} else {
				System.out.print(this.author.get(i).getLastName().toUpperCase() + ", " + this.author.get(i).getFirstName().toUpperCase().charAt(0) + ". " + this.author.get(i).getMiddleName().toUpperCase().charAt(0));
			}
			if (author.size() == 2 && i == 0) {
				System.out.print(". and ");
			} else if (i != author.size() - 1 && i != author.size() - 2 && author.size() != 2) {
				System.out.print("., ");
			} else if (i == author.size() - 2 && author.size() != 2) {
				System.out.print("., and ");
			}
		}
		System.out.print(". " + this.year + ". " + this.title + ". " + this.publisher + ", " + this.publicationCity + ", " + this.publicationState + ". " + "\n");
	}
	
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
	
	/**
	 * prints object info in string
	 */
	@Override 
	public String toString() {
		String out = "Superclass: " + getClass().getSuperclass() + " \n";
		out += this.getClass() + " Object {\n";
		out += "  author: " + this.author + "\n";
		out += "  year: " + this.year + "\n";
		out += "  title: " + this.title + "\n";
		out += "  publisher " + this.publisher + "\n";
		out += "  publicationCity: " + this.publicationCity + "\n";
		out += "  publicationState: " + this.publicationState + "\n";
		out += "}\n";
		return out;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublicationCity() {
		return publicationCity;
	}

	public void setPublicationCity(String publicationCity) {
		this.publicationCity = publicationCity;
	}

	public String getPublicationState() {
		return publicationState;
	}

	public void setPublicationState(String publicationState) {
		this.publicationState = publicationState;
	}
	
	public ArrayList<Author> getAuthor() {
		return author;
	}

	public void setAuthor(ArrayList<Author> author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int compareAuthor(Book a, Book b) {
		return a.getAuthor().get(0).getLastName().compareTo(b.getAuthor().get(0).getLastName());
	}
	
	public int compareYear(Book a, Book b) {
		return a.getYear() - b.getYear();
	}
	
	public int compareTitle(Book a, Book b) {
		return a.getTitle().compareTo(b.getTitle());
	}
	
	public int comparePublisher(Book a, Book b) {
		return a.getPublisher().compareTo(b.getPublisher());
	}
	
	public int compareLocation(Book a, Book b) {
		return a.getPublicationCity().compareTo(b.getPublicationCity());
	}
	
	
}
