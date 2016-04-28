package com.fchavez.jashinhurst.hw9.five;

import org.jgraph.graph.DefaultEdge;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.alg.ChromaticNumber;
import org.jgrapht.util.FibonacciHeapNode;

import com.fchavez.jashinhurst.hw9.graph.UserGraph;;
/**
 * <p>Implements a chromatic number algorithm from jgrapht. the idea
 * of this algorithm is that a color is assigned to each vertex in such
 * a way that no two vertices of the same color share an edge</p>
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw9 #5
 */
public class Problem5 {
	public static void main(String[] args){
		UndirectedGraph<String, DefaultEdge> g = UserGraph.createGraph();
		System.out.println("Chromatic number:");
		System.out.println("Greedy number: " + ChromaticNumber.findGreedyChromaticNumber(g));
		System.out.println("Color groups: " + ChromaticNumber.findGreedyColoredGroups(g));
	}
}
