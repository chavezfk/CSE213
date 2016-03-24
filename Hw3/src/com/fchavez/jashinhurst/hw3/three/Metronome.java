package com.fchavez.jashinhurst.hw3.three;
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
public class Metronome extends MIDI{
	double time[] = {4, 2, 1, 0.5, 0.25};
	private double bpm;
	
	/**
	 * initialize with default of 60 bpm
	 */
	public Metronome(){
		this.bpm = 60;
	}
	/**
	 * initalize at a bpm
	 * @param bpm beats per minute to be initial
	 */
	public Metronome(double bpm){
		this.bpm = bpm;
	}
	/**
	 * calculates the duration of a note
	 * @param note the note to be calculated
	 * @return the duration in seconds of the note
	 */
	public double duration(MIDI note){
		Length l = note.getLength();
		double t = time[l.ordinal()];
		return t * bpm / 60;
	}
	/**
	 * gets bpm
	 * @return the bpm
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
}
