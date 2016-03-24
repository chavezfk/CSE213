package com.fchavez.jasahinhurst.hw2.one;

import static org.junit.Assert.*;
import com.fchavez.jasahinhurst.hw2.one.Rectangle.Point;

import org.junit.Test;
/**
 * This class uses Junit testing to test the Rectangle and Point classes 
 * That are held within the Rectangle class.
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 */
public class RectangleTest {
	Rectangle r = new Rectangle(2,2,0,1);
	Rectangle r2 = new Rectangle (2,3,0,-1);
	
	/**
	 * test the rectangle class function values
	 */
	@Test
	public void testRectangle() {
		assertEquals(4, r.area(),0.1);
		assertEquals(8, r.perimeter(), 0.1);
		assertEquals(2*Math.sqrt(2), r.diagonalLength(), 0.5);
	}
	
	/**
	 * Test the point class function values
	 */
	@Test
	public void testPoint() {
		Rectangle r = new Rectangle(2,2,0,1);
		Rectangle r2 = new Rectangle (2,3,0,-1);
		assertEquals(1,r.distanceFromOrigin(),0.1);
		assertEquals(1,r.manhattanDistanceFromOrigin(),0.1);
		assertEquals(2,Point.euclideanDistance(r.p,r2.p),0.1);
		assertEquals(2,Point.manhattanDistance(r.p,r2.p),0.1);
	}
	
	/**
	 * Test the to string values.
	 */
	@Test
	public void testToString() {
		Rectangle r = new Rectangle(3,2,0,1);
		String info = "com.fchavez.jasahinhurst.hw2.one.Rectangle Object {\n";
		info += "Height: 2.0\n";
		info += "Width: 3.0\n";
		info += "Type: CARTESIAN\n";
		info += "X Coordinate: 0.0\n";
		info += "Y Coordinate: 1.0\n";
		info += "Theta: 1.5707963267948966 radians\n";
		info += "Radius: 1.0\n";
		info += "}\n";
		System.out.printf(r.toString());
		System.out.printf(info);
		/**
		 * I could not perform a Junit test on the string output. 
		 * I was unable to make the output look exactly like the 
		 * output of the class however, the numbers that are 
		 * printed out and the order in which they are printed exactly matches.
		 */
	}
}
