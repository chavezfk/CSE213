package com.fchavez.jashinhurst.hw9.two;

import org.jgraph.graph.DefaultEdge;
import org.jgrapht.alg.KruskalMinimumSpanningTree;
import org.jgrapht.graph.SimpleWeightedGraph;

public class Problem2 {
	public static void main (String[] args){
		SimpleWeightedGraph<String, DefaultEdge> graph = createGraph();
		
		//System.out.println(graph.toString());
	}
	
	public static SimpleWeightedGraph<String, DefaultEdge> createGraph() {
        SimpleWeightedGraph<String, DefaultEdge> graph =
            new SimpleWeightedGraph<String, DefaultEdge>(DefaultEdge.class);

        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";
        String f = "F";
        String g = "G";
        String h = "H";
        String i = "I";
        String j = "J";
        String k = "K";
        String l = "L";

        // add the vertices
        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);
        graph.addVertex(g);
        graph.addVertex(h);
        graph.addVertex(i);
        graph.addVertex(j);
        graph.addVertex(k);
        graph.addVertex(l);
        
        // add edges to create a circuit
        graph.addEdge(a, b);
        graph.addEdge(a, c);
        graph.addEdge(a, d);
        graph.addEdge(b, e);
        graph.addEdge(b, f);
        graph.addEdge(c, d);
        graph.addEdge(c, g);
        graph.addEdge(d, h);
        graph.addEdge(d, e);
        graph.addEdge(e, i);
        graph.addEdge(e, f);
        graph.addEdge(f, j);
        graph.addEdge(g, k);
        graph.addEdge(g, h);
        graph.addEdge(h, i);
        graph.addEdge(h, k);
        graph.addEdge(i, l);
        graph.addEdge(i, j);
        graph.addEdge(j, l);
        graph.addEdge(k, l);
        
        graph.setEdgeWeight(graph.getEdge(a, b), 3);
        graph.setEdgeWeight(graph.getEdge(a, b), 3);
        graph.setEdgeWeight(graph.getEdge(a, c), 5);
        graph.setEdgeWeight(graph.getEdge(a, d), 4);
        graph.setEdgeWeight(graph.getEdge(b, e), 3);
        graph.setEdgeWeight(graph.getEdge(b, f), 6);
        graph.setEdgeWeight(graph.getEdge(c, d), 2);
        graph.setEdgeWeight(graph.getEdge(c, g), 4);
        graph.setEdgeWeight(graph.getEdge(d, h), 5);
        graph.setEdgeWeight(graph.getEdge(d, e), 1);
        graph.setEdgeWeight(graph.getEdge(e, i), 4);
        graph.setEdgeWeight(graph.getEdge(e, f), 2);
        graph.setEdgeWeight(graph.getEdge(f, j), 5);
        graph.setEdgeWeight(graph.getEdge(g, k), 6);
        graph.setEdgeWeight(graph.getEdge(g, h), 3);
        graph.setEdgeWeight(graph.getEdge(h, i), 6);
        graph.setEdgeWeight(graph.getEdge(h, k), 7);
        graph.setEdgeWeight(graph.getEdge(i, l), 5);
        graph.setEdgeWeight(graph.getEdge(i, j), 3);
        graph.setEdgeWeight(graph.getEdge(j, l), 9);
        graph.setEdgeWeight(graph.getEdge(k, l), 8);

        return graph;
	}
}
