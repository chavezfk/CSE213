package com.fchavez.jashinhurst.hw8.one;

public class SearchBFS {
	public static void BFS(Graph G, Vertex s){
				for (Vertex v : G.getVertices()) {
					if(v==s){
					;
					}else{
						v.color = Color.WHITE;
						v.d = -1;
						v.p = null;
					}
				}
				s.color = Color.GRAY;
				s.d = 0;
				s.p = null;
				
				Queue Q = new Queue(G.numVertices());
					
	}
}
