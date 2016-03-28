package com.fchavez.jashinhurst.hw4.two;

/**
 * class containing info and print method for a Book reference
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @version 1.0
 */
public class Book extends Sources{
	int year;
	String publisher;
	String publicationCity;
	String publicationState;
	int numberOfPages;
	
	/**
	 * default constructor for class
	 */
	public Book() {
		this.year = 0;
		this.numberOfPages = 0;
	}
	
	/**
	 * constructor with all fields specified
	 * @param authorString string containing author names
	 * @param year year of publishing
	 * @param title of book
	 * @param publisher of book
	 * @param publicationCity city of publishing
	 * @param publicationState State of publishing
	 * @param numberOfPages of book
	 */
	public Book(String authorString, int year, String title, String publisher, String publicationCity, String publicationState, int numberOfPages) {
		this.author = parseString(authorString);
		this.title = title;
		this.year = year;
		this.publisher = publisher;
		this.publicationCity = publicationCity;
		this.publicationState = publicationState;
		this.numberOfPages = numberOfPages;
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
		System.out.print(". " + this.year + ". " + this.title + ". " + this.publisher + ", " + this.publicationCity + ", " + this.publicationState + ". " + this.numberOfPages + " pp." +  "\n");
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
		out += "  numberOfPages: " + this.numberOfPages + "\n";
		out += "}\n";
		return out;
	}
}
