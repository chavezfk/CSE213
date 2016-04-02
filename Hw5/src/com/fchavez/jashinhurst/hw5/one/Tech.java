/**
 * 
 */
package com.fchavez.jashinhurst.hw5.one;

/**
 * <p>Class that holds an Id and a string of the Id of the language
 * along with the name of the language</p>
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw#5 1
 * @bugs none
 */
public class Tech implements Comparable<Tech>{
	private int Id;
	private String name;
	/**
	 * initializes the object
	 * @param i the id value
	 * @param string the string to be stored
	 */
	public Tech(int i, String string) {
		this.Id = i;
		this.name = string;
	}

	/**
	 * compares the ID
	 */
	@Override public int compareTo(Tech o) {
		if(this.Id > o.getId())return 1;
		if(this.Id < o.getId())return -1;
		if(this.Id == o.getId())return 0;
		return 0;
	}
	
	/**
	 * compares the String
	 */
	/*@Override public int compareTo(Tech o) {
		return this.name.compareToIgnoreCase(o.getName());
	}*/
	/**
	 * creates a human readable string of the object
	 */
	public String toString(){
		return "\tID: " + this.Id + "\n\tName: " + this.name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
