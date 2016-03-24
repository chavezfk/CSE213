package com.fchavez.jashinhurst.hw4.two;

public class Author {
	String firstName;
	String middleName;
	String lastName;
	
	public Author() {
	
	}
	
	public Author(String first, String middle, String last) {
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
	}
	
	public void setTwoNames(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	public void setThreeNames(String first, String middle, String last) {
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
}
