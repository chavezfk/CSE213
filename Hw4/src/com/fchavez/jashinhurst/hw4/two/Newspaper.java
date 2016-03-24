package com.fchavez.jashinhurst.hw4.two;

import java.util.GregorianCalendar;

public class Newspaper {
	GregorianCalendar date;
	String Newspaper;
	
	public Newspaper() {
		
	}
	public Newspaper(String Title, GregorianCalendar datePublished){
		this.date = new GregorianCalendar();
		this.date.setTime(datePublished.getTime());
		this.Newspaper = Title;
	}
}
