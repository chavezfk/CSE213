package com.fchavez.jashinhurst.hw9.two;
/**
 * Finds the MST of a graph implements the jgrapht methods to created weighted graph and implement Kruskal's algorithm
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * @version 1.0
 * @bugs none
 * @todo none
 */

import org.jgrapht.alg.KruskalMinimumSpanningTree;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;
import com.fchavez.jashinhurst.hw9.graph.*;

public class Problem2 {
	public static void main (String[] args){
		SimpleWeightedGraph<String, DefaultWeightedEdge> graph = UserWeightedGraph.createGraph();
		KruskalMinimumSpanningTree<String, DefaultWeightedEdge> t = new KruskalMinimumSpanningTree<String, DefaultWeightedEdge>(graph);
		System.out.println(t.getMinimumSpanningTreeEdgeSet().toString());
		System.out.println("The total cost of the tree is " + t.getMinimumSpanningTreeTotalWeight());
		//System.out.println(graph.toString());
		//System.out.println(t.toString());
	}
}
