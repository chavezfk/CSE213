package com.fchavez.jashinhurst.hw4.two;

public class Book extends Sources{
	int year;
	String publisher;
	String publicationCity;
	String publicationState;
	int numberOfPages;
	
	public Book() {
		this.year = 0;
		this.numberOfPages = 0;
	}
	
	public Book(String authorString, int year, String title, String publisher, String publicationCity, String publicationState, int numberOfPages) {
		this.author = parseString(authorString);
		this.title = title;
		this.year = year;
		this.publisher = publisher;
		this.publicationCity = publicationCity;
		this.publicationState = publicationState;
		this.numberOfPages = numberOfPages;
	}
	
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
		System.out.print(". " + this.year + ". " + this.title + ". " + this.publisher + ", " + this.publicationCity + ", " + this.publicationState + ", " + this.numberOfPages + " pp." +  "\n");
	}
}
