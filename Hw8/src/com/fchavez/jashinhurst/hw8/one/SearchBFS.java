package com.fchavez.jashinhurst.hw8.one;

public class SearchBFS {
	public static Queue<Vertex> BFS(Graph G, Vertex s){
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
		
		Queue<Vertex> Q = new Queue<Vertex>(G.numVertices());
		Queue<Vertex> visited = new Queue<Vertex>(G.numVertices());
		Vertex u;
		Q.enque(s);
		while(!Q.isEmpty()){
			u = Q.deque();
			for(Vertex v : G.adjacentTo(u)){
				if( v.color == Color.WHITE){
					v.color = Color.GRAY;
					v.d = -1;
					v.p = u;
					Q.enque(v);
					visited.enque(v);
				}
				
			}
			u.color = Color.BLACK;
		}
		Queue<Vertex> rev = new Queue<Vertex>(visited.size());
		while(visited.size() > 0){
			rev.enque(visited.deque());
		}
		return rev;
	}
}
