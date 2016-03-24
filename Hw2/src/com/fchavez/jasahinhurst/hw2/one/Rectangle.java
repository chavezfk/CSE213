package com.fchavez.jasahinhurst.hw2.one;
/**
 * <p>This class holds the information for the setting various parameters for a
 * rectangle such as height and width as well as the coordinates of the lower left 
 * hand corner and finds values such as area, perimeter, diagonal length, and 
 * the distance of the lower left hand corner to the origin
 * 
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * @version hw2 #1
 * @bugs none
 *
 */
public class Rectangle {
	public double width;
	public double height;
	public Point p;
	public enum Type{CARTESIAN, POLAR};
	/**
	 * sets all parameters to 1 default and at origin
	 * @param none
	 * @return none
	 */
	public Rectangle() {
		this.width = 1;
		this.height = 1;
		p = new Point(0,0,Type.CARTESIAN);
	}
	
	/**
	 * sets height and width to user defined, defaults to origin
	 * @param width
	 * @param height
	 * @return none
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		p = new Point(0,0,Type.CARTESIAN);
	}
	
	/**
	 * sets all parameters to user-defined values
	 * @param width
	 * @param height
	 * @param x
	 * @param y
	 * @return none
	 */
	public Rectangle(double width, double height, double x, double y) {
		this.width = width;
		this.height = height;
		p = new Point(x,y,Type.CARTESIAN);
	}
	
	/**
	 * finds area of rectangle
	 * @return area of rectangle
	 */
	public double area() {
		return this.width * this.height;
	}
	
	/**
	 * returns perimeter of rectangle
	 * @return perimeter of rectangle
	 */
	public double perimeter() {
		return 2*this.width + 2*this.height;
	}
	
	/**
	 * finds length of diagonal of rectangle
	 * @return length of diagonal of rectangle
	 */
	public double diagonalLength() {
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	}
	
	/**
	 * finds distance from origin to lower left hand corner of rectangle 
	 * @return distance from origin
	 */
	public double distanceFromOrigin() {
		Point q = new Point(0,0,p.type);
		return p.euclideanDistance(q);
	}
	/**
	 * returns Manhattan distance from origin
	 * @return distance from origin
	 */
	public double manhattanDistanceFromOrigin() {
		Point q = new Point(0,0,p.type);
		return p.manhattanDistance(q);
	}

	@Override
	public String toString(){
		String info;
		info = this.getClass().getName()+ " Object {\n";
		info += "Height: " + this.height + "\n";
		info += "Width: " + this.width + "\n";
		return info + p.toString() + "}\n";
	}
	/**
	 * 
	 * A private class within Rectangle
	 * Holds point information
	 *
	 */
	public static class Point{
		public double x;
		public double y;
		public double r;
		public double theta;
		Type type;
		
		private Point(double x, double y, Type type){
			switch(type){
			case CARTESIAN:
				cartesianInstance(x, y);
				break;
			case POLAR:
				polarInstance(x,y);
				break;
			}
			this.x = x;
			this.y = y;
			this.type = type;
		}
		/**
		 * Initializes as a polar instance
		 * @param r radius
		 * @param theta angle
		 */
		private void polarInstance(double r, double theta) {
			this.r = r;
			this.theta = theta;
			this.x = r*Math.cos(theta);
			this.y = r*Math.sin(theta);
		}
		/**
		 * Initializes as a Cartesian instance
		 * @param x x-coordinate
		 * @param y y-coordinate
		 */
		private void cartesianInstance(double x, double y) {
			this.x = x;
			this.y = y;
			this.r = Math.sqrt(x*x + y*y);
			this.theta = Math.atan(y/x);
			if(x < 0 && y < 0)this.theta += Math.PI;
			if(x <0 && y >0) this.theta += Math.PI;
		}
		/**
		 * Returns the Euclidean distance from the origin
		 * @param q
		 * @return distance from origin
		 */
		public double euclideanDistance(Point q){
			return Math.sqrt(Math.pow(this.x - q.x, 2) + Math.pow(this.y - q.y,2));
		}
		/**
		 * Returns Euclidean distance between two points
		 * @param p first point
		 * @param q second point
		 * @return distance from origin
		 */
		public static double euclideanDistance(Point p, Point q){
			return Math.sqrt(Math.pow(q.x-p.x, 2) + Math.pow(q.y-p.y,2));
		}
		/**
		 * Returns the Manhattan distance from the origin
		 * @param q
		 * @return distance from origin
		 */
		public double manhattanDistance(Point q){
			return Math.abs(this.x-q.x) + Math.abs(this.y-q.y);
		}
		/**
		 * Returns Manhattan distance between two points
		 * @param p first point
		 * @param q second point
		 * @return distance from origin
		 */
		public static double manhattanDistance(Point p, Point q){
			return Math.abs(q.x-p.x) + Math.abs(q.y-p.y);
		}
		
		@Override
		public String toString(){
			String info;
			info = "Type: " + this.type + "\n";
			info += "X Coordinate: " + this.x + "\n";
			info += "Y Coordinate: " + this.y + "\n";
			info += "Theta: " + this.theta + " radians\n";
			info += "Radius: " + this.r + "\n";
			return info;
		}
	}
}
