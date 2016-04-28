package com.fchavez.jashinhurst.hw9.four;

/**
 * implements jgrapht dijkstra's algorithm by calling algorithm, printing out paths and weights, as well as total cost
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * @bugs none
 * @todo none
 * @version hw9 #4
 */

import java.util.*;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import com.fchavez.jashinhurst.hw9.graph.UserWeightedGraph;

public class Problem4 {
	public static void main (String args[]) {
		ArrayList<List<DefaultWeightedEdge>> paths = new ArrayList<>();
		ArrayList<String> to = new ArrayList<>();
		SimpleWeightedGraph<String, DefaultWeightedEdge> graph = UserWeightedGraph.createGraph();
		double totalCost;
		for (String S : graph.vertexSet()) {
			if (S.equals("A")) {
				continue;
			}
			paths.add(DijkstraShortestPath.findPathBetween(graph, "A", S));
			to.add(S);
		}
		for (int i = 0; i < paths.size(); i++) {
			System.out.println("The shortest path from A to " + to.get(i) + " is:");
			totalCost = 0;
			for (DefaultWeightedEdge e : paths.get(i)) {
				totalCost += graph.getEdgeWeight(e);
				System.out.println(e.toString() + " weight: " + graph.getEdgeWeight(e));
			}
			System.out.println("at a cost of " + totalCost + "\n");
		}
	}
}
