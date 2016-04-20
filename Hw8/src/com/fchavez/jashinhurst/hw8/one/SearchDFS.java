package com.fchavez.jashinhurst.hw8.one;

public class SearchDFS {
	public static void DFS(Graph G) {
		for (Vertex v : G.getVertices()) {
			v.color = Color.WHITE;
			v.p = null;
		}
		
		for (Vertex v: G.getVertices()) {
			if (v.color == Color.WHITE) {
				dfsVisit(G, v);
			}
		}
	}
	
	public static void dfsVisit(Graph G, Vertex v) {
		v.color = Color.GRAY;
		for (Vertex u: G.adjacentTo(v)) {
			if (u.color == Color.WHITE) {
				u.p = v;
				dfsVisit(G,u);
			}
		}
		v.color = Color.BLACK;
		System.out.println("Visited " + v.getName());
	}
	
	
}
