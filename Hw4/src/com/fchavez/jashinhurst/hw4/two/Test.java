package com.fchavez.jashinhurst.hw4.two;

public class Test {

	public static void main(String args[]) {	
		String TestStringTwo = "Joshua Ashinhurst and J T Ashinhurst";
		String TestStringThree= "Joshua T Ashinhurst, J T Ashinhurst, J Todd Ashinhurst";
		Book testBook = new Book(TestStringTwo, 2000, "title", "publisher", "publicationCity", "publicationState", 5000);
		testBook.printReference();
	}
	
	
}
