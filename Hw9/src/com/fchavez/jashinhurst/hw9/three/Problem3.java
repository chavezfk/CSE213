package com.fchavez.jashinhurst.hw9.three;
/**
 * Finds the MST of a graph implements the jgrapht methods to created weighted graph and implement Prim's algorithm
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * @version 1.0
 * @bugs none
 * @todo none
 */

import org.jgrapht.alg.PrimMinimumSpanningTree;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;
import com.fchavez.jashinhurst.hw9.graph.*;

public class Problem3 {
	public static void main (String[] args){
		SimpleWeightedGraph<String, DefaultWeightedEdge> graph = UserWeightedGraph.createGraph();
		PrimMinimumSpanningTree<String, DefaultWeightedEdge> t = new PrimMinimumSpanningTree<String, DefaultWeightedEdge>(graph);
		System.out.println(t.getMinimumSpanningTreeEdgeSet().toString());
		System.out.println("The total cost of the tree is " + t.getMinimumSpanningTreeTotalWeight());
		//System.out.println(graph.toString());
		//System.out.println(t.toString());
	}
}
