package com.fchavez.jashinhurst.hw4.two;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Newspaper extends Sources{
	GregorianCalendar date;
	String Newspaper;
	
	/**
	 * default constructor for class
	 */
	public Newspaper() {
		
	}
	
	/**
	 * constructor with all fields specified
	 * @param authorString
	 * @param Title
	 * @param datePublished
	 */
	public Newspaper(String authorString, int day, int month, int year, String title, String Newspaper){
		this.author = parseString(authorString);
		this.title = title;
		this.date = new GregorianCalendar(year, month, day);
		this.Newspaper = Newspaper;
	}
	
	public void printReference() {
		Date retrievalDate1 = date.getTime();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MMMM dd, yyyy");
		for (int i = 0; i < author.size(); i++) {
			if (author.get(i).middleName == null) {
				System.out.print(author.get(i).getLastName() + ", " + this.author.get(i).getFirstName().charAt(0));
			} else {
				System.out.print(this.author.get(i).getLastName() + ", " + this.author.get(i).getFirstName().charAt(0) + ". " + this.author.get(i).getMiddleName().charAt(0));
			}
			if (author.size() == 2 && i == 0) {
				System.out.print(". and ");
			} else if (i != author.size() - 1 && i != author.size() - 2 && author.size() != 2) {
				System.out.print("., ");
			} else if (i == author.size() - 2 && author.size() != 2) {
				System.out.print("., and ");
			}
		}
		System.out.print(". " + dateFormatter.format(retrievalDate1) + ". " + this.title + ". " + this.Newspaper + "\n");
	}
	
	/**
	 * prints info about object in string
	 */
	@Override
	public String toString() {
		String out = "Superclass: " + getClass().getSuperclass() + " \n";
		out += this.getClass() + " Object {\n";
		out += "  author: " + this.author + "\n";
		out += "  title: " + this.title + " \n";
		out += "  date: " + this.date + "\n";
		out += "  Newspaper " + this.Newspaper + "\n";
		out += "}\n";
		return out;
	}
}
