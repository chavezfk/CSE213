package com.fchavez.jashinhurst.hw8.one;

import java.util.HashMap;
import java.util.TreeSet;

public class Graph {

	private HashMap<Vertex, TreeSet<Vertex>> adjList;
	private HashMap<String, Vertex> vertices;
	private static final TreeSet<Vertex> EMPTY_SET = new TreeSet<Vertex>();
	private int numVertices;
	private int numEdges;

	/**
	 * Construct empty Graph
	 */
	public Graph() {
		this.adjList = new HashMap<Vertex, TreeSet<Vertex>>();
		this.vertices = new HashMap<String, Vertex>();
		this.numVertices = 0;
		this.numEdges = 0;
	}

	/**
	 * Add a new vertex name with no neighbors (if vertex does not yet exist)
	 * 
	 * @param name vertex to be added
	 */
	public Vertex addVertex(String name) {
		Vertex v;
		v = vertices.get(name);
		if (v == null) {
			v = new Vertex(name);
			this.vertices.put(name, v);
			this.adjList.put(v, new TreeSet<Vertex>());
			this.numVertices += 1;
		}
		return v;
	}

	/**
	 * Returns the Vertex matching v
	 * @param name the name of a Vertex that may be in this Graph
	 * @return the Vertex or null if no such Vertex exists in this Graph 
	 * */
	public Vertex getVertex(String name) {
		return this.vertices.get(name);
	}

	/**
	 * Returns true iff v is in this Graph, false otherwise
	 * @param name the name of a Vertex that may be in the Graph
	 * @return true iff v is in this Graph
	 */
	public boolean hasVertex(String name) {
		return this.vertices.containsKey(name);
	}

	/**
	 * Is from-to, an edge in this Graph. The graph is 
	 * undirected so the order of from and to does not
	 * matter.
	 * @param from the name of the first Vertex
	 * @param to the name of the second Vertex
	 * @return true iff from-to exists in this Graph
	 */
	public boolean hasEdge(String from, String to) {

		if (!hasVertex(from) || !hasVertex(to))
			return false;
		return this.adjList.get(this.vertices.get(from)).contains(this.vertices.get(to));
	}

	/**
	 * Add to from's set of neighbors, and add from to to's
	 * set of neighbors. Does not add an edge if another edge
	 * already exists
	 * @param from the name of the first Vertex
	 * @param to the name of the second Vertex
	 */
	public void addEdge(String from, String to) {
		Vertex v, w;
		if (hasEdge(from, to))
			return;
		this.numEdges += 1;
		if ((v = getVertex(from)) == null)
			v = addVertex(from);
		if ((w = getVertex(to)) == null)
			w = addVertex(to);
		this.adjList.get(v).add(w);
		this.adjList.get(w).add(v);
	}

	/**
	 * Return an iterator over the neighbors of Vertex named v
	 * @param name the name of a Vertex
	 * @return an Iterator over Vertices that are adjacent
	 * to the Vertex named v, empty set if v is not in graph
	 */
	public Iterable<Vertex> adjacentTo(String name) {
		if (!hasVertex(name))
			return EMPTY_SET;
		return this.adjList.get(getVertex(name));
	}

	/**
	 * Return an iterator over the neighbors of Vertex v
	 * @param v the Vertex
	 * @return an Iterator over Vertices that are adjacent
	 * to the Vertex v, empty set if v is not in graph
	 */
	public Iterable<Vertex> adjacentTo(Vertex v) {
		if (!adjList.containsKey(v))
			return EMPTY_SET;
		return this.adjList.get(v);
	}

	/**
	 * Returns an Iterator over all Vertices in this Graph
	 * @return an Iterator over all Vertices in this Graph
	 */
	public Iterable<Vertex> getVertices() {
		return this.vertices.values();
	}

	public int numVertices()
	{
		return this.numVertices;
	}

	public int numEdges()
	{
		return this.numEdges;
	}


	/**
	 * Returns the adjacency-list representation of the graph
	 */
	public String toString() {
		String s = "";
		for (Vertex v : this.vertices.values()) {
			s += v + ": ";
			for (Vertex w : this.adjList.get(v)) {
				s += w + " ";
			}
			s += "\n";
		}
		return s;
	}






}

