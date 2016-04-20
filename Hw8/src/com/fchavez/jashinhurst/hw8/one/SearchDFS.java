package com.fchavez.jashinhurst.hw8.one;

import java.util.ArrayList;

public class SearchDFS {
	static ArrayList<String> Q = new ArrayList<String>();
	public static void DFS(Graph G) {
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
	}
	
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
