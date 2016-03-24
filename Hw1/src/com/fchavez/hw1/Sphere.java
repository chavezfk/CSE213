package com.fchavez.hw1;
/**
 * Sphere class
 * 
 * <p>This class holds information about a sphere in 3D space.
 * The information held is the coordinates and the radius. The
 * functions that can be called are distance from origin, surface
 * area, and volume.
 * 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw 1, #1
 * @bugs None
 */
public class Sphere {
	private double x;
	private double y;
	private double z;
	private double radius;
	/**
	 * Initialize with default values
	 * @param none
	 * @return none
	 */
	public Sphere (){
		this.radius=1;
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	/**
	 * Initialize with default position but defined radius
	 * @param radius, of sphere
	 * @return none
	 */
	public Sphere(double radius){
		this.radius = radius;
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	/**
	 * Initialize with default radius, defined position
	 * @param x, coordinate in x direction
	 * @param y, coordinate in y direction
	 * @param z, coordinate in z direction
	 * @return none
	 */
	public Sphere(double x, double y, double z){
		this.x=x;
		this.y=y;
		this.z=z;
		this.radius=1;
	}
	
	/**
	 * Initialize with defined position and radius
	 * @param x, coordinate in x direction
	 * @param y, coordinate in y direction
	 * @param z, coordinate in z direction
	 * @param raidus, of sphere
	 * @return none
	 */
	public Sphere(double x, double y, double z, double radius){
		this.x = x;
		this.y = y;
		this.z = z;
		this.radius = radius;
	}
	/**
	 * Calculates volume of sphere
	 * @param none
	 * @return volume of sphere
	 */
	public double volume(){
		return Math.pow(this.radius, 3)*4*Math.PI/3;
	}
	/**
	 * Calculate volume of sphere
	 * @param none
	 * @return surface area
	 */
	public double surfaceArea(){
		return Math.pow(this.radius,2)*4*Math.PI;
	}
	/**
	 * Calculate distance from origin
	 * @param none
	 * @return distance from origin
	 */
	public double distanceFromOrigin(){
		return Math.sqrt(x*x + y*y + z*z);
	}
}
