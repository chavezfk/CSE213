package com.fchavez.jashinhurst.hw9.six;

import org.jgraph.graph.DefaultEdge;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.traverse.DepthFirstIterator;
/**
 * <p> Implements the depth first traversal of a knight on a chess board
 * in such a way that the knight visits every square only once.</p>
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw9 #6
 */
public class Main {
	public static void main(String[] Args){
		Board b = new Board();
		Board b100 = new Board(100);
		Integer ret;
		UndirectedGraph<Integer, DefaultEdge> graph;
		DepthFirstIterator<Integer, DefaultEdge> itr;
		
		System.out.println("The 8X8 board");
		graph = b.getGraph();
		for(int i = 0; i < 64; i++){
			itr = new DepthFirstIterator<Integer, DefaultEdge>(graph, i);
			while(itr.hasNext()){
				ret = itr.next();
				if(itr.hasNext()){
					System.out.print(ret + " - ");
				}
				else{
					System.out.println(ret);
				}
			}
		}
		
		graph = b100.getGraph();
		itr = new DepthFirstIterator<Integer, DefaultEdge>(graph, 0);
		System.out.println("\nThe 100 X 100 board");
		while(itr.hasNext()){
			ret = itr.next();
			if(itr.hasNext()){
				System.out.print(ret + " - ");
			}
			else{
				System.out.println(ret);
			}
		}
	}
}
