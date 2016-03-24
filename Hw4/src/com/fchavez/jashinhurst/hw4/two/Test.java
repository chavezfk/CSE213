package com.fchavez.jashinhurst.hw4.two;

import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

	public static void main(String args[]) {	
		String TestStringTwo = "Joshua Ashinhurst and J T Ashinhurst";
		String TestStringThree= "Joshua T Ashinhurst, J T Ashinhurst, J Todd Ashinhurst";
		Book testBook = new Book(TestStringTwo, 2000, "title", "publisher", "publicationCity", "publicationState", 5000);
		GregorianCalendar date =  new GregorianCalendar(2016, 3, 12);
		Newspaper testNews = new Newspaper("The Daily CS Major", date);
		WebReference testWeb = new WebReference(2014, date.getTime(), "http://www.google.com/");
		testBook.printReference();
	}
	
	
}
