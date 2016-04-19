package com.fchavez.jashinhurst.hw8.one;


public class Vertex implements Comparable<Vertex> {

	/**
	 * label for Vertex
	 */
	private String name;  

	Color color;
	Vertex p;
	int d;
	
	public Vertex(String v)
	{
		this.name = v;
	}

	public String toString()
	{ 
		return this.name;
	}

	public String getName() {
		return this.name;
	}



	public int compareTo(Vertex other)
	{
		return this.name.compareTo(other.getName());
	}
	

}




