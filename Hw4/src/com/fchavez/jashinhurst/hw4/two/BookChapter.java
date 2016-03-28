package com.fchavez.jashinhurst.hw4.two;

import java.util.ArrayList;
/**
 * class containing info for book chapter reference, contains all info in Book class
 * as well as some additional fields
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 *
 * @bugs none
 * @version 1.0
 */
public class BookChapter extends Book {
	ArrayList<Author> chapterAuthor = new ArrayList<Author>();
	String chapterTitle;
	int beginPage;
	int endPage;
	
	/**
	 * default constructor, sets to default values
	 */
	BookChapter() {
		this.year = 0;
		this.beginPage = 0;
		this.endPage = 0;
	}

	/**
	 * setter with all fields specified
	 * @param authorString
	 * @param year
	 * @param title
	 * @param publisher
	 * @param publicationCity
	 * @param publicationState
	 * @param numberOfPages
	 * @param chapterAuthorString
	 * @param chapterTitle
	 * @param beginPage
	 * @param endPage
	 */
	BookChapter(String authorString, int year, String title, String chapterTitle, String chapterAuthorString, String publisher, String publicationCity, String publicationState, int beginPage, int endPage) {
		this.author = parseString(authorString);
		this.year = year;
		this.title = title;
		this.publisher = publisher;
		this.publicationCity = publicationCity;
		this.publicationState = publicationState;
		this.chapterAuthor = parseString(chapterAuthorString);
		this.chapterTitle = chapterTitle;
		this.beginPage = beginPage;
		this.endPage = endPage;
	}
	
	/**
	 * prints the bibliography citation
	 */
	public void printReference() {
		for (int i = 0; i < chapterAuthor.size(); i++) {
			if (chapterAuthor.get(i).middleName == null) {
				System.out.print(chapterAuthor.get(i).getLastName().toUpperCase() + ", " + this.chapterAuthor.get(i).getFirstName().toUpperCase().charAt(0));
			} else {
				System.out.print(this.chapterAuthor.get(i).getLastName().toUpperCase() + ", " + this.chapterAuthor.get(i).getFirstName().toUpperCase().charAt(0) + ". " + this.chapterAuthor.get(i).getMiddleName().toUpperCase().charAt(0));
			}
			if (chapterAuthor.size() == 2 && i == 0) {
				System.out.print(". and ");
			} else if (i != chapterAuthor.size() - 1 && i != chapterAuthor.size() - 2 && chapterAuthor.size() != 2) {
				System.out.print("., ");
			} else if (i == chapterAuthor.size() - 2 && chapterAuthor.size() != 2) {
				System.out.print("., and ");
			}
		}
		System.out.print(". " + this.year + ". " + this.chapterTitle + ". In " + this.title + ", ");
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
		System.out.print(", " + this.publisher + ", " + this.publicationCity + ", " + this.publicationState + ". pp. " + this.beginPage + "-" + this.endPage + ".\n");
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
		out += "  chapterAuthor: " + this.chapterAuthor + " \n";
		out += "  chapterTitle: " + this.chapterTitle + "\n";
		out += "  beginPage: " + this.beginPage + "\n";
		out += "  endPage: " + this.endPage + "\n";
		out += "}\n";
		return out;
	}
}
