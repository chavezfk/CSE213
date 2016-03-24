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
}
