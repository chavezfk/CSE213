package com.fchavez.jashinhurst.hw9.six;
import java.util.ArrayList;

import org.jgraph.graph.DefaultEdge;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.SimpleGraph;

/**
 * <p> Creates a chess board graph of the possible locations
 * that a knight can travel from any given square on the board.</p>
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw9 #6
 *
 */
public class Board {
	private int sideLength;
	private UndirectedGraph<Integer, DefaultEdge> graph;
	
	public Board(){
		this.sideLength = 8;
		makeGraph();
	}
	public Board(int size){
		this.sideLength = size;
		makeGraph();
	}
	/**
	 * creates the graph of the knight at every location
	 * @return the graph that was created
	 */
	private void makeGraph() {
		Integer e;
		ArrayList<Integer> positions;
		initGraph();
		for(int i = 0; i < this.sideLength; i++){
			for(int j = 0; j < this.sideLength; j++){
				e = convertPositionToNodeID(i,j);
				positions = getLegalMoves(i,j);
				for(Integer p : positions){
					this.graph.addEdge(e, p);
				}
			}
		}
	}
	/**
	 * creates a graph with n number vertex
	 * @return the created graph
	 */
	private void initGraph() {
		this.graph = new SimpleGraph<Integer, DefaultEdge>(DefaultEdge.class);;
		for(int i = 0; i < this.sideLength*this.sideLength; i++){
			this.graph.addVertex(i);
		}
	}
	/**
	 * gets the locations that the knight can move from the current coordinates
	 * @param i the row coordinate
	 * @param j the column coordinate
	 * @return an array list of objects that you can reach
	 */
	private ArrayList<Integer> getLegalMoves(int i, int j) {
		int offsets[][] = {{-1,-2},{-1,2},{-2,-1},{-2,1},{1,-2},{1,2},{2,-1},{2,1}};
		ArrayList<Integer> moves= new ArrayList<Integer>();
		for(int off[] : offsets){
			if(i+off[0] < this.sideLength && i+off[0] > 0){
				if(j+off[1] < this.sideLength && j+off[1] > 0){
					moves.add(convertPositionToNodeID(i+off[0], j+off[1]));
				}
			}
		}
		return moves;
	}
	/**
	 * returns the ID of the position indicated
	 * @param i the row location
	 * @param j the column location
	 * @return the Integer object of the location
	 */
	private Integer convertPositionToNodeID(int i, int j) {
		return i*this.sideLength + j;
	}
	/**
	 * @return the sideLength
	 */
	public int getSideLength() {
		return sideLength;
	}
	/**
	 * @return the graph
	 */
	public UndirectedGraph<Integer, DefaultEdge> getGraph() {
		return graph;
	}
}
