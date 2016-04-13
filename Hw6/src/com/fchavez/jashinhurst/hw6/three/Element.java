package com.fchavez.jashinhurst.hw6.three;

import java.io.Serializable;

/**
 * <p> A simple class that holds information about elements
 * of the periodic table. There are getter and setter methods
 * for each field. The information is collected in another 
 * class and stored using objects of this class type.</p>
 * @author Franz Chavez
 * @version hw6 #3
 * @bugs None
 * @Todo -
 */
public class Element implements Comparable<Element>, Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String symbol;
	private int orderNumber;
	private int R;
	private int C;
	private double atomicWeight;
	private double density;
	private double diameter;
	private double terrestrialAbundance;
	private double coefficentOfResistance;
	
	/**
	 * initialize with name
	 * @param name
	 */
	public Element(String name){
		this.name = name;
	}
	/**
	 * initialize with name and symbol
	 * @param name
	 * @param symbol
	 */
	public Element(String name, String symbol){
		this.name = name;
		this.symbol = symbol;
	}
	/**
	 * Initialize with name symbol and order
	 * @param name
	 * @param symbol
	 * @param order
	 */
	public Element(String name, String symbol, int order){
		this.name = name;
		this.symbol = symbol;
		this.orderNumber = order;
	}
	/**
	 * Initialize with all variables
	 * @param name the element name
	 * @param symbol the symbol of the element
	 * @param orderNumber the order number of the element
	 * @param r R
	 * @param c C
	 * @param atomicWeight atomic weight
	 * @param density density
	 * @param diameter diameter
	 * @param terrestrialAbundance terrestrial abundance
	 * @param coefficentOfResistance Coefficient of Resistance
	 */
	public Element(String name, String symbol,
			int orderNumber, int r, int c, double atomicWeight, double density,
			double diameter, double terrestrialAbundance, double coefficentOfResistance) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.orderNumber = orderNumber;
		R = r;
		C = c;
		this.atomicWeight = atomicWeight;
		this.density = density;
		this.diameter = diameter;
		this.terrestrialAbundance = terrestrialAbundance;
		this.coefficentOfResistance = coefficentOfResistance;
	}
	
	public String toString(){
		String ret = "Name:" + this.name +"\n";
		ret += "Symbol: " +this.symbol +"\n";
		ret += "Order Number: " +this.orderNumber +"\n";
		ret += "R: " +this.R +"\n";
		ret += "C: " +this.C +"\n";
		ret += "Atomic Weight: " +this.atomicWeight +"\n";
		ret += "Density: " +this.density +"\n";
		ret += "Diameter: " +this.diameter +"\n";
		ret += "Terrestrial Abundance: " +this.terrestrialAbundance +"\n";
		ret += "Coefficent of Resistance: " +this.coefficentOfResistance +"\n\n";
		return ret;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @return the r
	 */
	public int getR() {
		return R;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(int r) {
		R = r;
	}
	/**
	 * @return the c
	 */
	public int getC() {
		return C;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		C = c;
	}
	/**
	 * @return the atomicWeight
	 */
	public double getAtomicWeight() {
		return atomicWeight;
	}
	/**
	 * @param atomicWeight the atomicWeight to set
	 */
	public void setAtomicWeight(double atomicWeight) {
		this.atomicWeight = atomicWeight;
	}
	/**
	 * @return the density
	 */
	public double getDensity() {
		return density;
	}
	/**
	 * @param density the density to set
	 */
	public void setDensity(double density) {
		this.density = density;
	}
	/**
	 * @return the diameter
	 */
	public double getDiameter() {
		return diameter;
	}
	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	/**
	 * @return the terrestrialAbundance
	 */
	public double getTerrestrialAbundance() {
		return terrestrialAbundance;
	}
	/**
	 * @param terrestrialAbundance the terrestrialAbundance to set
	 */
	public void setTerrestrialAbundance(double terrestrialAbundance) {
		this.terrestrialAbundance = terrestrialAbundance;
	}
	/**
	 * @return the coefficentOfResistance
	 */
	public double getCoefficentOfResistance() {
		return coefficentOfResistance;
	}
	/**
	 * @param coefficentOfResistance the coefficentOfResistance to set
	 */
	public void setCoefficentOfResistance(double coefficentOfResistance) {
		this.coefficentOfResistance = coefficentOfResistance;
	}
	/**
	 * Compare method, this one compares the names
	 */
	@Override public int compareTo(Element o) {
		return this.name.compareTo(o.getName());
	}
	/**
	 * Compare method, this one compares the Terrestrial Abundance
	 */
	/*@Override public int compareTo(Element o) {
		Double n = (Double) this.terrestrialAbundance;
		Double n2 = (Double) o.getTerrestrialAbundance();
		return n.compareTo(n2);
	}*/
}
