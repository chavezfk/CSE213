package com.fchavez.jashinhurst.hw8.one;

import java.util.ArrayList;

/**
 * Test for the DFS and BFS traversals, tests using 4 different graphs
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @version 1.0
 * @todo none
 *
 */
public class GraphTest {
	
	public static void main(String[] args) {

		// print out graph
		Graph G = graph(1);
		Graph H = graph(2);
		Graph I = graph(3);
		Graph J = graph(4);
		System.out.println(G);
		System.out.println(H);
		System.out.println(I);
		System.out.println(J);
		
		//Sample Graph Tests
		System.out.println("Sample Graph");
		Queue<Vertex> ret;
		Vertex u;
		ret = SearchBFS.BFS(G,G.getVertex("A"));
		System.out.println("BFS");
		while(ret.deque.size()>0){
			u = ret.deque();
			System.out.print(u.getName());
			System.out.print(" (" + u.color.name().toLowerCase());
			System.out.println(", " + u.d + ", "+u.p+ ")");
		}
		
		ArrayList<String> Q = new ArrayList<String>();
		System.out.println("DFS");
		Q = SearchDFS.DFS(G);
		for (String s : Q) {
			System.out.print(s);
			System.out.print(" (" + G.getVertex(s).color.name().toLowerCase());
			System.out.println(", " + G.getVertex(s).p + ")");
		}
		
		//Graph 1 Tests
		System.out.println("Graph 1");
		ret = SearchBFS.BFS(H,H.getVertex("A"));
		System.out.println("BFS");
		while(ret.deque.size()>0){
			u = ret.deque();
			System.out.print(u.getName());
			System.out.print(" (" + u.color.name().toLowerCase());
			System.out.println(", " + u.d + ", "+u.p+ ")");
		}
		
		//Graph 2 Tests
		System.out.println("Graph 2");
		ArrayList<String> R = new ArrayList<String>();
		System.out.println("DFS");
		R = SearchDFS.DFS(I);
		for (String s : R) {
			System.out.print(s);
			System.out.print(" (" + I.getVertex(s).color.name().toLowerCase());
			System.out.println(", " + I.getVertex(s).p + ")");
		}
		
		//Graph 3 Tests
		//BFS at node D
		System.out.println("Graph 3");
		ret = SearchBFS.BFS(J,J.getVertex("D"));
		System.out.println("BFS");
		while(ret.deque.size()>0){
			u = ret.deque();
			System.out.print(u.getName());
			System.out.print(" (" + u.color.name().toLowerCase());
			System.out.println(", " + u.d + ", "+u.p+ ")");
		}
		//BFS start node C finish J
		ret = SearchBFS.BFS(J,J.getVertex("C"), J.getVertex("J"));
		System.out.println("BFS C - J");
		while(ret.deque.size()>0){
			u = ret.deque();
			System.out.print(u.getName());
			System.out.print(" (" + u.color.name().toLowerCase());
			System.out.println(", " + u.d + ", "+u.p+ ")");
		}
		//DFS
		ArrayList<String> S = new ArrayList<String>();
		System.out.println("DFS");
		S = SearchDFS.DFS(J);
		for (String s : S) {
			System.out.print(s);
			System.out.print(" (" + J.getVertex(s).color.name().toLowerCase());
			System.out.println(", " + J.getVertex(s).p + ")");
		}
		
		// print out graph again by iterating over vertices and edges
		//this is equivalent to System.out.println(G);
		for (Vertex v : G.getVertices()) {
			System.out.print(v + ": ");
			for (Vertex w : G.adjacentTo(v.getName())) {
				System.out.print(w + " ");
			}
			System.out.println();
		}
		

	}
	
	/**
	 * initializers of graphs
	 * @param i the graph sample to initialize
	 * @return new graph
	 */
	public static Graph graph(int i) {
		Graph G = new Graph();
		switch (i) {
		case 1:
			G.addEdge("A", "B");
			G.addEdge("A", "C");
			G.addEdge("C", "D");
			G.addEdge("D", "E");
			G.addEdge("D", "G");
			G.addEdge("E", "G");
			G.addVertex("H");
			break;
		case 2:
			G.addEdge("A", "B");
			G.addEdge("A", "E");
			G.addEdge("B", "C");
			G.addEdge("B", "F");
			G.addEdge("C", "D");
			G.addEdge("C", "G");
			G.addEdge("D", "H");
			G.addEdge("H", "G");
			G.addEdge("G", "F");
			G.addEdge("E", "F");	
			break;
		case 3:
			G.addEdge("A", "B");
			G.addEdge("A", "E");
			G.addEdge("B", "F");
			G.addEdge("B", "C");
			G.addEdge("C", "D");
			G.addEdge("C", "G");
			break;
		case 4:
			G.addEdge("A", "B");
			G.addEdge("A", "C");
			G.addEdge("A", "D");
			G.addEdge("B", "E");
			G.addEdge("B", "F");
			G.addEdge("C", "D");
			G.addEdge("C", "G");
			G.addEdge("D", "H");
			G.addEdge("D", "E");
			G.addEdge("D", "H");
			G.addEdge("E", "F");
			G.addEdge("E", "I");
			G.addEdge("F", "J");
			G.addEdge("G", "H");
			G.addEdge("G", "K");
			G.addEdge("H", "I");
			G.addEdge("H", "K");
			G.addEdge("I", "J");
			G.addEdge("I", "L");
			G.addEdge("J", "L");
			G.addEdge("K", "L");
			break;
		}
		return G;
	}
}
