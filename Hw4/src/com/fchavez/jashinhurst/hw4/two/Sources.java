package com.fchavez.jashinhurst.hw4.two;

import java.util.ArrayList;

abstract public class Sources {
	ArrayList<Author> author = new ArrayList<Author>();
	String title;
	
	public static ArrayList<Author> parseString(String authorString) {
		ArrayList <Author> authorList = new ArrayList<Author>();
		
		String[] s = authorString.split(", ");
		String[] t;
		if (s.length == 1) {
			s = authorString.split(" and ");
			for (int i = 0; i < s.length; i++) {
				Author author = new Author();
				t = s[i].split(" ");
				if (t.length == 2) {
					author.setTwoNames(t[0], t[1]);
				} else {
					author.setThreeNames(t[0], t[1], t[2]);
				}
				authorList.add(i, author);
			}
		} else {
			for (int i = 0; i < s.length; i++) {
				Author author = new Author();
				t = s[i].split(" ");
				if (t.length == 2) {
					author.setTwoNames(t[0], t[1]);
				} else {
					author.setThreeNames(t[0], t[1], t[2]);
				}
				authorList.add(author);
			}
		}
		
		return authorList;
	}
}
