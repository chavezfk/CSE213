package com.fchavez.jashinhurst.hw4.two;

import java.net.URL;
import java.util.GregorianCalendar;

public class WebReference extends Sources {
	int yearOfPublication;
	GregorianCalendar retrievalDate;
	URL url;
	
	public WebReference() {
		
	}
	
	public void printReference() {
		for (int i = 0; i < author.size(); i++) {
			if (author.get(i).middleName == null) {
				System.out.print(author.get(i).getLastName() + ", " + this.author.get(i).getFirstName());
			}
			System.out.print(this.author.get(i).getLastName() + ", " + this.author.get(i).getFirstName() + " " + this.author.get(i).getMiddleName());
			if (i != author.size() - 1) {
				System.out.print(" and ");
			}
		}
		System.out.print(". " + this.title + ". (" + this.yearOfPublication + "). Retrieved " + this.retrievalDate + " from " + url  + "\n");
	}
	
	
}
