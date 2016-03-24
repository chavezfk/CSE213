package com.fchavez.jashinhurst.hw4.two;

import java.util.ArrayList;

public class BookChapter extends Book {
	ArrayList<Author> chapterAuthor = new ArrayList<Author>();
	String chapterTitle;
	int beginPage;
	int endPage;
	
	BookChapter() {
		this.year = 0;
		this.beginPage = 0;
		this.endPage = 0;
	}

	BookChapter(String authorString, int year, String title, String publisher, String publicationCity, String publicationState, int numberOfPages, String chapterAuthorString, String chapterTitle, int beginPage, int endPage) {
		this.author = parseString(authorString);
		this.year = year;
		this.title = title;
		this.publisher = publisher;
		this.publicationCity = publicationCity;
		this.publicationState = publicationState;
		this.numberOfPages = numberOfPages;
		this.chapterAuthor = parseString(chapterAuthorString);
		this.chapterTitle = chapterTitle;
		this.beginPage = beginPage;
		this.endPage = endPage;
	}
	
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
}
