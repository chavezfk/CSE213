package com.fchavez.jashinhurst.hw4.two;

import java.util.GregorianCalendar;

public class Test {

	public static void main(String args[]) {	
		String TestStringTwo = "Joshua Ashinhurst and J T Ashinhurst";
		String TestStringThree= "Joshua T Ashinhurst, J T Ashinhurst, J Todd Ashinhurst";
		GregorianCalendar date =  new GregorianCalendar(2016, 3, 12);
		JournalArticle testJournalArticle = new JournalArticle(TestStringTwo, 2000, "title", "journalName", 1, 1, 2);
		Book testBook = new Book(TestStringTwo, 2000, "title", "publisher", "publicationCity", "publicationState", 5000);
		BookChapter testBookChapter = new BookChapter(TestStringTwo, 2000, "title", "publisher", "publicationCity", "publicationState", 5000, TestStringThree, "chapterTitle", 1, 2);
		Newspaper testNewspaper = new Newspaper(TestStringTwo, "title", date, "Newspaper");
		WebReference testWebReference = new WebReference(TestStringTwo, "title", 2000, date.getTime(), "http://www.google.com/");
		System.out.println("Journal Article");
		testJournalArticle.printReference();
		System.out.println(testJournalArticle.toString());
		System.out.println("\nBook");
		testBook.printReference();
		System.out.println(testBook.toString());
		System.out.println("\nBook Chapter");
		testBookChapter.printReference();
		System.out.println(testBookChapter.toString());
		System.out.println("\nNewspaper");
		testNewspaper.printReference();
		System.out.println(testNewspaper.toString());
		System.out.println("\nWeb Reference");
		testWebReference.printReference();
		System.out.println(testWebReference.toString());
	}
	
	
}
