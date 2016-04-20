package com.fchavez.jashinhurst.hw8.one;

import java.util.ArrayList;
/**
 * Implements DFS traversal of Graph
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @todo none
 * @version 1.0
 * @bugs none
 *
 */
public class SearchDFS {
	static ArrayList<String> Q = new ArrayList<String>();
	/**
	 * Initializes and goes through start of Graph
	 * @param G graph to be traversed
	 * @return list of elements visited in order visited
	 */
	public static ArrayList<String> DFS(Graph G) {
		Q.clear();
		for (Vertex v : G.getVertices()) {
			v.color = Color.WHITE;
			v.p = null;
		}
		
		for (Vertex v: G.getVertices()) {
			if (v.color == Color.WHITE) {
				dfsVisit(G, v);
				Q.add(v.getName());
			}
		}
		
		return Q;
	}
	
	/**
	 * recursive call to go through all children of parent vertex
	 * @param G graph to be traversed
	 * @param v parent vertex
	 */
	public static void dfsVisit(Graph G, Vertex v) {
		v.color = Color.GRAY;
		for (Vertex u: G.adjacentTo(v)) {
			if (u.color == Color.WHITE) {
				u.p = v;
				dfsVisit(G,u);
				Q.add(u.getName());
			}
		}
		v.color = Color.BLACK;
		
	}
	
	
}
