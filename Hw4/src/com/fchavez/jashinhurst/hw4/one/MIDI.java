package com.fchavez.jashinhurst.hw4.one;
/**
 * <p>This class holds information about a SPN note. It 
 * holds information such as the NoteValue and the MIDI number. 
 * The class will also handle the SPN form of the note and
 * differing octaves.
 * 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw1 #1
 * @bugs none
 */
public class MIDI {
	private NoteValue noteValue;
	private int midiNumber; //0 - 127
	/**
	 * Initializes as a C4 quarter note
	 */
	public MIDI(){
		this.midiNumber = 60;
		this.noteValue = NoteValue.QUARTER;
	}
	/**
	 * initializes with given note and NoteValue info
	 * @param note note to be initialized
	 * @param NoteValue noteValue of the note
	 */
	public MIDI(String note, NoteValue noteValue){
		if(note.matches("[A-G]{1}[#]?[-]?[0-9]{1}")){
			this.noteValue = noteValue;
			this.midiNumber = convNoteToMidi(note);
		}else{
			this.noteValue = NoteValue.QUARTER;
			this.midiNumber = 60;
		}
	}
	/**
	 * Initializes with given midinumber and NoteValue
	 * @param midiNumber number in MIDI form
	 * @param NoteValue noteValue of note
	 */
	public MIDI(int midiNumber, NoteValue noteValue){
		this.midiNumber = midiNumber;
		this.noteValue = noteValue;
	}
	/**
	 * Initializes using frequency and NoteValue
	 * @param frequency of the note
	 * @param NoteValue if the note
	 */
	public MIDI(double frequency, NoteValue noteValue){
		this.noteValue = noteValue;
		this.midiNumber = convFreqToMidi(frequency);
	}
	/**
	 * converts a frequency to a MIDI number
	 * @param frequency frequency to be converted
	 * @return MIDI integer value for that frequency
	 */
	private int convFreqToMidi(double frequency) {
		return (int) Math.round(12*(Math.log(frequency/440)/Math.log(2)) + 69);
	}
	/**
	 * converts a String note to MIDI information
	 * @param note  the note to be converted
	 * @return the MIDI number
	 */
	private int convNoteToMidi(String note) {
		String Notes[] = {"C", "C#", "D", "D#","E","F","F#","G","G#","A","A#","B"};
		String letter;
		String octave;
		int index = 0;
		if(note.contains("#")){
			letter = note.substring(0, 2);
			octave = note.substring(2);
		}else{
			letter = note.substring(0, 0);
			octave = note.substring(1);
		}
		for(int count = 0; count < Notes.length; count++){
			if(letter.equalsIgnoreCase(Notes[count])){
				index = count;
			}
		}
		return (Integer.valueOf(octave)+1)*12 + index;
	}
	/**
	 * converts a MIDI number to a string
	 * @param m the MIDI number to convert
	 * @return the string Note 
	 */
	private String convMidiToString(int m) {
		String Notes[] = {"C", "C#", "D", "D#","E","F","F#","G","G#","A","A#","B"};
		String note = Notes[m%12];
		int octave = this.getOctave();
		return note + octave;
	}
	/**
	 * calculates the frequency from MIDI number
	 * @return frequency
	 */
	public double getFrequency(){
		return 440.0 * Math.pow(2.0, (this.midiNumber-69)/12.0);
	}
	/**
	 * gets the NoteValue of the note
	 * @return the NoteValue
	 */
	public NoteValue getLength(){
		return this.noteValue;
	}
	/**
	 * gets MIDI number
	 * @return MIDI number
	 */
	public int getMidiNumber(){
		return this.midiNumber;
	}
	/**
	 * returns the note. Has to convert from MIDI number
	 * @return the note
	 */
	public String getNote(){
		return convMidiToString(this.midiNumber);
	}
	/**
	 * returns the octave. has to calculate from MIDI number
	 * @return octave of note
	 */
	public int getOctave(){
		return (int) Math.floor(this.midiNumber/12 - 1);
	}
	/**
	 * determines if the Note is sharp
	 * @return true if sharp, false if not
	 */
	public boolean isSharp(){
		String note = convMidiToString(this.midiNumber);
		if(note.contains("#"))return true;
		else return false;
	}
	/**
	 * sets the frequency and converts midinumber
	 * @param frequency is the frequency of the note
	 */
	public void setFrequency(double frequency){
		this.midiNumber = convFreqToMidi(frequency);
	}
	/**
	 * sets the NoteValue of the note
	 * @param NoteValue the NoteValue of the note
	 */
	public void setNoteValue(NoteValue noteValue){
		this.noteValue = noteValue;
	}
	/**
	 * sets the MIDI Number of this note
	 * @param midi the new MIDI Number
	 */
	public void setMidiNumber(int midi){
		this.midiNumber = midi;
	}
	/**
	 * sets the octave of the note
	 * @param octave the new octave
	 */
	public void setOctave(int octave){
		if(octave >= -1 && octave <= 9){
			int note = this.midiNumber % 12;
			if(octave == 9 && note >= 8)System.out.println("Not a possible octave for this note");
			else this.midiNumber = (octave+1)*12 + note;
		}else
			System.out.println("octave is wrong value. Must be between -1 and 9");
	}
	/**
	 * sets that a Note is sharp
	 */
	public void setSharp(){
		if(convMidiToString(midiNumber).contains("#")){
			System.out.println("Already Sharp");
		}
		else if(this.getNote() == "E") 
			System.out.println("there is no sharp for E");
		else if(this.getNote() == "B") 
			System.out.println("there is no sharp for B");
		else 
			this.setMidiNumber(this.getMidiNumber() + 1);
	}
	/**
	 * returns a readable statement about the class
	 * @return 
	 */
	public String toString(){
		String s;
		s = "Note: " + this.getNote() + "\n";
		s +="Frequency: " + this.getFrequency() + "\n"; 
		s +="MIDI Number: " + this.getMidiNumber() + "\n";
		return s;
	}
}
