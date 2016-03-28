package com.fchavez.jashinhurst.hw4.two;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * object that contains information for a web reference and a print method to print
 * the reference
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 *
 * @bugs none
 * @version 1.0
 */
public class WebReference extends Sources {
	int yearOfPublication;
	GregorianCalendar retrievalDate;
	URL url;
	
	/**
	 * default constructor for class
	 */
	public WebReference() {
		this.yearOfPublication = 0;
		retrievalDate.set(0,0,0);
	}
	
	/**
	 * constructor of fields with author
	 * @param authorString
	 * @param yearOfPublication
	 * @param title
	 * @param month
	 * @param day
	 * @param year
	 * @param url
	 */
	public WebReference(String authorString, int yearOfPublication, String title, int month, int day, int year, String url){
		this.author = parseString(authorString);
		this.title = title;
		this.yearOfPublication = yearOfPublication;
		retrievalDate = new GregorianCalendar(year, month, day);
		try {
			this.url = new URL(url);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * constructor of fields without author
	 * @param title
	 * @param yearOfPublication
	 * @param month
	 * @param day
	 * @param year
	 * @param url
	 */
	public WebReference(String title, int yearOfPublication, int month, int day, int year, String url){
		this.author = null;
		this.title = title;
		this.yearOfPublication = yearOfPublication;
		retrievalDate = new GregorianCalendar(year, month, day);
		try {
			this.url = new URL(url);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * prints the bibliography of the object
	 */
	public void printReference() {
		Date retrievalDate1 = retrievalDate.getTime();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MMMM dd, yyyy");
		if (author != null) {
			for (int i = 0; i < author.size(); i++) {
				if (author.get(i).middleName == null) {
					System.out.print(author.get(i).getLastName() + ", " + this.author.get(i).getFirstName());
				} else {
					System.out.print(this.author.get(i).getLastName() + ", " + this.author.get(i).getFirstName() + ". " + this.author.get(i).getMiddleName());
				}
				if (i != author.size() - 1) {
					System.out.print(" and ");
				}
			}
			System.out.print(". ");
		}
		System.out.print(this.title + ". (" + this.yearOfPublication + "). Retrieved " + dateFormatter.format(retrievalDate1) + " from " + url  + "\n");
	}
	
	/**
	 * prints object info in string
	 */
	@Override
	public String toString() {
		String out = "Superclass: " + getClass().getSuperclass() + " \n";
		out += this.getClass() + " Object {\n";
		out += "  author: " + this.author + "\n";
		out += "  title: " + this.title + " \n";
		out += "  yearOfPublication: " + this.yearOfPublication + "\n";
		out += "  retrievalDate: " + this.retrievalDate + "\n";
		out += "}\n";
		return out;
	}
	
	
}
