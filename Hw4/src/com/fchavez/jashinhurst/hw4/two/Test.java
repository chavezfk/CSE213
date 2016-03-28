package com.fchavez.jashinhurst.hw4.two;

import java.util.GregorianCalendar;

public class Test {

	public static void main(String args[]) {	
		/*String TestStringTwo = "Joshua Ashinhurst and J T Ashinhurst";
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
		System.out.println(testWebReference.toString());*/
		
		Newspaper newspaper1 = new Newspaper("Edward White", 3, 23, 1999, "Chatting a singer up the pop charts", "Wall Street Journal");
		newspaper1.printReference();
		System.out.print(newspaper1.toString());
		
		BookChapter bookChapter1 = new BookChapter("Hunter S. Thompson", 1976, "Richard Nixon and how the Washington Redskins lost the Vietnam War", "New Journalism Anthology", "Tom Wolfe", "Random House", "New York", "NY", 17, 52);
		bookChapter1.printReference();
		System.out.println(bookChapter1.toString());
		BookChapter bookChapter2  = new BookChapter("Robert Greiner", 1999, "Explanation-based learning", "The Encyclopedia of Cognitive Science", "Robert Wison and Frank Keil", "MIT Press", "Cambridge", "MA", 301, 303);
		bookChapter2.printReference();
		System.out.println(bookChapter2.toString());
		BookChapter bookChapter3 = new BookChapter("Mark Twain", 1881, "A Connecticut Yankee in Transcendental Land", "Fear of the Opulent Eyeball and Other Meditations Along the Reflecting Pond", "Mark Twain, Henry David Thoreau, and Ralph Waldo Emerson", "Random House", "New York", "NY", 117, 132);   
		bookChapter3.printReference();
		System.out.println(bookChapter3.toString());
		
		Book book1 = new Book("Morgan Ginsberg", 1987, "Readings in Nonmonotonic Reasoning", "Morgan Kaufmann", "Los Altos", "CA", 454);
		book1.printReference();
		System.out.println(book1.toString());
		Book book2 = new Book("Mark Twain and Henry David Thoreau", 1880, "The Book That Never Was", "Random House", "New York", "NY", 608);
		book2.printReference();
		System.out.println(book2.toString());
		Book book3 = new Book("Mark Twain, Henry David Thoreau, and Ralph Waldo Emerson", 1881, "Fear of the Opulent Eyeball and Other Meditations Along the Reflecting Pond", "Random House", "New York", "NY", 1573); 
		book3.printReference();
		System.out.println(book3.toString());
		//don't name this class URL -- Java already uses that name
		WebReference web1 = new WebReference("Pete Sinah", 2004, "A Memory-Efficient Doubly Linked List", 2, 14, 2013, "http://www.linuxjournal.com/article/6828?page=0,0");
		web1.printReference();
		System.out.println(web1.toString());
		WebReference web2 = new WebReference("Android", 2012, 2, 14, 2012, "http://www.android.com");
		web2.printReference();
		System.out.println(web2.toString());
		JournalArticle journal = new JournalArticle("Adam M. Abdelbar and Sam Morris Hedetniemi", 1998, "Approximating MAPs for belief networks in NP-hard and other theorems", "Artificial Intelligence", 102, 21, 38);
		journal.printReference();
		System.out.println(journal.toString());
	}
	
	
}
