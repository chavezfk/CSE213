package com.fchavez.jashinhurst.hw3.three;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fchavez.jashinhurst.hw3.three.MIDI.Length;

public class TestClass {
	/**
	 * Test the MIDI Class
	 */
			/**
			 * test if the IsSharp() function works
			 */
			@Test public void testIsSharp() {
				MIDI note = new MIDI("C#4", Length.EIGHT);
				assertTrue(note.isSharp());
			}
			/**
			 * test if the setSharp() function works
			 */
			@Test public void testSetSharp() {
				MIDI note = new MIDI("C4", Length.EIGHT);
				assertFalse(note.isSharp());
				note.setSharp();
				assertTrue(note.isSharp());
			}
			/**
			 * test get note return value
			 */
			@Test public void testGetNote(){
				MIDI note = new MIDI("C#4", Length.EIGHT);
				assertTrue(note.getNote().equalsIgnoreCase("C#4"));
			}
			/**
			 * test get octave return value
			 */
			@Test public void testGetOctave(){
				MIDI note = new MIDI("C#4", Length.EIGHT);
				assertEquals(4, note.getOctave(), 1);
			}
			/**
			 * test get octave set value
			 */
			@Test public void testSetOctave(){
				MIDI note = new MIDI("C#4", Length.EIGHT);
				note.setOctave(-1);
				assertEquals(-1, note.getOctave(), 1);
			}
			/**
			 * test frequency get values
			 */
			@Test public void testGetFrequency(){
				MIDI note = new MIDI("A4", Length.EIGHT);
				assertEquals(440, note.getFrequency(), 1);
			}
			/**
			 * test frequency set values
			 */
			@Test public void testSetFrequency(){
				MIDI note = new MIDI("C4", Length.EIGHT);
				note.setFrequency(440);
				assertEquals(440, note.getFrequency(), 1);
			}
			/**
			 * Test toString() return value
			 */
			@Test public void testToString(){
				MIDI note = new MIDI("C4", Length.EIGHT);
				String ans = "Note: C4\n";
				ans += "Frequency: 440.0\n";
				ans += "MIDI Number: 60\n";
				assertTrue(note.toString().equalsIgnoreCase(ans));
			}
	/**
	 * Test the Metronome Class
	 */
			/**
			 * Test duration return values
			 */
			@Test public void testMetronomeDuration(){
				Metronome met = new Metronome();
				assertEquals(1,met.duration(new MIDI("C4", Length.QUARTER)),1);
			}
			/**
			 * Test get BPM
			 */
			@Test public void testGetBPM(){
				Metronome met = new Metronome();
				assertEquals(60,met.getBPM(),1);
			}
			/**
			 * Test set BPM
			 */
			@Test public void testSetBPM(){
				Metronome met = new Metronome();
				met.setBPM(45);
				assertEquals(45,met.getBPM(),1);
			}
}
