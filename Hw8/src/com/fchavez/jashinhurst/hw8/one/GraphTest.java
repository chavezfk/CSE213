package com.fchavez.jashinhurst.hw8.one;

public class GraphTest {

	public static void main(String[] args) {

		Graph G = new Graph();
		G.addEdge("A", "B");
		G.addEdge("A", "C");
		G.addEdge("C", "D");
		G.addEdge("D", "E");
		G.addEdge("D", "G");
		G.addEdge("E", "G");
		G.addVertex("H");

		// print out graph
		System.out.println(G);

		//initialize colors
		for (Vertex v : G.getVertices()) {
			if(v.getName() == "A"){
				v.color = Color.GRAY;
				v.d = 0;
				v.p = null;
			}else{
				v.color = Color.WHITE;
				v.d = -1;
				v.p = null;
			}
		}
		
		
		
		SearchBFS.BFS(G,G.getVertex("A"));
		 
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
}
