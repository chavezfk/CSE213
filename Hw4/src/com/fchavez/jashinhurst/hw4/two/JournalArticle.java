package com.fchavez.jashinhurst.hw4.two;

/**
 * contains info for a journal article reference as well as methods for printing
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 *
 *
 * @bugs none
 * @version 1.0
 */
public class JournalArticle extends Sources {
	int year;
	String journalName;
	int volume;
	int beginPage;
	int endPage;
	
	/**
	 * default constructor for class
	 */
	 public JournalArticle() {
		this.year = 0;
		this.volume = 0;
		this.beginPage = 0;
		this.endPage = 0;
	}
	 
	/**
	 * constructor with all fields
	 * @param authorString string containing author
	 * @param year year published
	 * @param title of journal article
	 * @param journalName of journal
	 * @param volume of journal
	 * @param beginPage beginning page of reference
	 * @param endPage ending page of reference
	 */
	public JournalArticle(String authorString, int year, String title, String journalName, int volume, int beginPage, int endPage) {
		this.author = parseString(authorString);
		this.year = year;
		this.title = title;
		this.journalName = journalName;
		this.volume = volume;
		this.beginPage = beginPage;
		this.endPage = endPage;
	}
	
	/**
	 * prints reference in specific format for journal article
	 */
	public void printReference() {
		for (int i = 0; i < author.size(); i++) {
			if (author.get(i).middleName == null) {
				System.out.print(author.get(i).getLastName().toUpperCase() + ", " + this.author.get(i).getFirstName().toUpperCase().charAt(0));
			} else {
				System.out.print(this.author.get(i).getLastName().toUpperCase() + ", " + this.author.get(i).getFirstName().toUpperCase().charAt(0) + ". " + this.author.get(i).getMiddleName().toUpperCase().charAt(0));
			}
			if (author.size() == 2 && i == 0) {
				System.out.print(". and ");
			} else if (i != author.size() - 1 && i != author.size() - 2 && author.size() != 2) {
				System.out.print("., ");
			} else if (i == author.size() - 2 && author.size() != 2) {
				System.out.print("., and ");
			}
		}
		System.out.print(". " + this.year + ". " + this.title + ". " + this.journalName + ", vol. " + this.volume + ". pp. " + this.beginPage + "-" + this.endPage + "\n");
	}
	
	/**
	 * prints object info in string
	 */
	@Override
	public String toString() {
		String out = "Superclass: " + getClass().getSuperclass() + " \n";
		out += this.getClass() + " Object {\n";
		out += "  author: " + this.author + "\n";
		out += "  year: " + this.year + "\n";
		out += "  title: " + this.title + "\n";
		out += "  journalName: " + this.journalName + "\n";
		out += "  volume: " + this.volume + "\n";
		out += "  beginPage " + this.beginPage + "\n";
		out += "  endPage " + this.endPage + "\n";
		out += "}\n";
		return out;
	}
}
