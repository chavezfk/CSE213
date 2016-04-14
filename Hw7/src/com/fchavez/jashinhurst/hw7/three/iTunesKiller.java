package com.fchavez.jashinhurst.hw7.three;

import java.util.ArrayDeque;

public class iTunesKiller {
	private String artist;
	private String title;
	private static ArrayDeque<iTunesKiller> deque = new ArrayDeque<iTunesKiller>();
	private static ArrayDeque<iTunesKiller> history = new ArrayDeque<iTunesKiller>();
	private static ArrayDeque<iTunesKiller> skipped = new ArrayDeque<iTunesKiller>();
	
	/**
	 * initializes with a artist and title
	 * @param artist the artist of the song
	 * @param title the song title
	 */
	public iTunesKiller(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}
	/**
	 * adds a song to the deque
	 * @param artist song author
	 * @param title song title
	 */
	public static void addSong(String artist, String title){
		deque.add(new iTunesKiller(artist, title));
	}
	/**
	 * adds the top of the history stack to the deque
	 */
	public static void back(){
		deque.add(history.pop());
	}
	/**
	 * plays the song to standard out
	 */
	public static void play(){
		iTunesKiller temp = deque.pop();
		System.out.println(temp.toString());
		history.add(temp);
	}
	/**
	 * skips the song and adds it to the skipped list
	 */
	public static void skipSong(){
		skipped.add(deque.pop());
	}
	/**
	 * skips the song and adds it to the skipped list
	 */
	public static void undoSkippedSong(){
		deque.add(skipped.pop());
	}
	/**
	 * prints the history of your music
	 */
	public static void viewHistory(){
		for(iTunesKiller e : history){
			System.out.println(e.toString());
		}
	}
	/**
	 * prints the play list
	 */
	public static void viewPlayList(){
		for(iTunesKiller e : deque){
			System.out.println(e.toString());
		}
	}
	/**
	 * prints the skipped songs
	 */
	public static void viewSkipped(){
		for(iTunesKiller e : skipped){
			System.out.println(e.toString());
		}
	}
	/**
	 * converts object to a string 
	 */
	public String toString(){
		return this.artist + "\n\t" + this.title;
	}
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
}
