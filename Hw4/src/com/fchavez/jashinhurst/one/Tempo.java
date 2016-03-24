package com.fchavez.jashinhurst.one;

/**
 * <p>This class holds information about the beat speed. it
 * holds the beats per minute and will caclutate the time a
 * particular note lasts in seconds. 
 * 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw3 #3
 * @bugs none
 */
public class Tempo{
	private double bpm;
	private NoteValue noteValue;
	/**
	 * initialize with default of 60 bpm
	 */
	public Tempo(){
		this.bpm = 60;
		noteValue = NoteValue.QUARTER;
	}
	/**
	 * initalize at a bpm
	 * @param bpm beats per minute to be initial
	 */
	public Tempo(double bpm){
		this.bpm = bpm;
	}
	/**
	 * initializes with a bpm and note value
	 * @param bpm the beats per minute
	 * @param note the note value
	 */
	public Tempo(double bpm, NoteValue note){
		this.bpm = bpm;
		this.noteValue = note;
	}
	/**
	 * calculates the duration of a note
	 * @param noteValue the note Value to get the duration of
	 * @return the duration of noteValue in seconds
	 */
	public double getDuration(NoteValue noteValue){
		double time[] = {4, 2, 1, .5, .25};
		double t = time[noteValue.ordinal()];
		return t / bpm * 60;
	}
	/**
	 * gets beats per minute
	 * @return bpm the beats per minute
	 */
	public double getBPM(){
		return this.bpm;
	}
	/**
	 * sets BPM
	 * @param bpm the new bpm
	 */
	public void setBPM(double bpm){
		this.bpm = bpm;
	}
	/**
	 * gets note value
	 * @return note the note value
	 */
	public NoteValue getNoteValue(){
		return this.noteValue;
	}
	/**
	 * sets note value
	 * @param note the new note value
	 */
	public void setNoteValue(NoteValue note){
		this.noteValue = note;
	}
	/**
	 * converts the information to a string
	 * @return the string information
	 */
	public String toString(){
		String s = "BPM: " + this.bpm + "\n";
		s += "NoteValue: " + this.noteValue.toString() + "\n";
		return s;
	}
}
