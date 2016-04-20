package com.fchavez.jashinhurst.hw8.one;
/**
 * <p>This class holds the Breadth first search pattern functions. 
 * The first set takes two parameters which are the graph and the
 * starting vertex. The second takes three parameters: the graph, 
 * the Starting vertex, and the Ending vertex.</p>
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw5 #1b
 */
public class SearchBFS {
	/**
	 * Do a Breadth First Search on the given graph starting at a given
	 * vertex
	 * @param G the graph to search
	 * @param s the starting vertex
	 * @return the queue of the order in which the verticies have been visited
	 */
	public static Queue<Vertex> BFS(Graph G, Vertex s){
		//initialize colors
		for (Vertex v : G.getVertices()) {
			if(v.getName() == s.getName()){
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
		visited.enque(s);
		while(!Q.isEmpty()){
			u = Q.deque();
			for(Vertex v : G.adjacentTo(u)){
				if( v.color == Color.WHITE){
					v.color = Color.GRAY;
					v.d = u.d + 1;
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
	/**
	 * Do a Breadth First Search on the given graph starting at a given
	 * vertex and ending at a given vertex
	 * @param G the graph to search
	 * @param s the starting vertex
	 * @param end the ending vertex
	 * @return the queue containing the order in which nodes were visited
	 */
	public static Queue<Vertex> BFS(Graph G, Vertex s, Vertex end){
		for (Vertex v : G.getVertices()) {
			if(v.getName() == s.getName()){
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
		visited.enque(s);
		while(!Q.isEmpty()){
			u = Q.deque();
			for(Vertex v : G.adjacentTo(u)){
				if( v.color == Color.WHITE){
					v.color = Color.GRAY;
					v.d = u.d + 1;
					v.p = u;
					Q.enque(v);
					visited.enque(v);
					
				}
			}
			u.color = Color.BLACK;
			if(u == end)break;
		}
		Queue<Vertex> rev = new Queue<Vertex>(visited.size());
		while(visited.size() > 0){
			rev.enque(visited.deque());
		}
		return rev;
		
	}
}
