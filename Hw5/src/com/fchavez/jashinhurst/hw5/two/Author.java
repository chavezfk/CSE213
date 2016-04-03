package com.fchavez.jashinhurst.hw5.two;

/**
 * contains the information for a class containing first, middle, and last names
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @version 1.0
 *
 */
public class Author {
	String firstName;
	String middleName;
	String lastName;
	
	/**
	 * default constructor
	 */
	public Author() {
	
	}
	
	/**
	 * sets names up for class
	 * @param first
	 * @param middle
	 * @param last
	 */
	public Author(String first, String middle, String last) {
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
	}
	
	/**
	 * sets names in case that there are only two names
	 * @param first
	 * @param last
	 */
	public void setTwoNames(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	/**
	 * sets names in case that there is middle name
	 * @param first
	 * @param middle
	 * @param last
	 */
	public void setThreeNames(String first, String middle, String last) {
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
	}
	
	/**
	 * returns string containing first name
	 * @return first name
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * returns string containing middle name
	 * @return middle name
	 */
	public String getMiddleName() {
		return this.middleName;
	}
	
	/**
	 * returns string containing last name
	 * @return last name
	 */
	public String getLastName() {
		return this.lastName;
	}
	
}
