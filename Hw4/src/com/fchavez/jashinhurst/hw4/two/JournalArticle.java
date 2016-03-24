package com.fchavez.jashinhurst.hw4.two;

public class JournalArticle extends Sources {
	int year;
	String journalName;
	int volume;
	int beginPage;
	int endPage;
	
	 public JournalArticle() {
		this.year = 0;
		this.volume = 0;
		this.beginPage = 0;
		this.endPage = 0;
	}
	 
	public JournalArticle(String authorString, int year, String title, String journalName, int volume, int beginPage, int endPage) {
		this.author = parseString(authorString);
		this.year = year;
		this.title = title;
		this.journalName = journalName;
		this.volume = volume;
		this.beginPage = beginPage;
		this.endPage = endPage;
	}
	
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
}
