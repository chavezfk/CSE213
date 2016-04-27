package com.fchavez.jashinhurst.hw9.two;

import org.jgraph.graph.DefaultEdge;
import org.jgrapht.alg.KruskalMinimumSpanningTree;
import org.jgrapht.graph.SimpleWeightedGraph;

public class Problem2 {
	public static void main (String[] args){
		SimpleWeightedGraph<String, DefaultEdge> graph = createGraph();
		KruskalMinimumSpanningTree( MST = new Kruskal
		
		
		
	}
	
	public static SimpleWeightedGraph<String, DefaultEdge> createGraph() {
        SimpleWeightedGraph<String, DefaultEdge> graph =
            new SimpleWeightedGraph<String, DefaultEdge>(DefaultEdge.class);

        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        String f = "f";
        String g = "g";
        String h = "h";
        String i = "i";
        String j = "j";
        String k = "k";
        String l = "l";

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
        
        graph.setEdgeWeight(graph.addEdge(a, b), 3);
        graph.setEdgeWeight(graph.addEdge(a, b), 3);
        graph.setEdgeWeight(graph.addEdge(a, c), 5);
        graph.setEdgeWeight(graph.addEdge(a, d), 4);
        graph.setEdgeWeight(graph.addEdge(b, e), 3);
        graph.setEdgeWeight(graph.addEdge(b, f), 6);
        graph.setEdgeWeight(graph.addEdge(c, d), 2);
        graph.setEdgeWeight(graph.addEdge(c, g), 4);
        graph.setEdgeWeight(graph.addEdge(d, h), 5);
        graph.setEdgeWeight(graph.addEdge(d, e), 1);
        graph.setEdgeWeight(graph.addEdge(e, i), 4);
        graph.setEdgeWeight(graph.addEdge(e, f), 2);
        graph.setEdgeWeight(graph.addEdge(f, j), 5);
        graph.setEdgeWeight(graph.addEdge(g, k), 6);
        graph.setEdgeWeight(graph.addEdge(g, h), 3);
        graph.setEdgeWeight(graph.addEdge(h, i), 6);
        graph.setEdgeWeight(graph.addEdge(h, k), 7);
        graph.setEdgeWeight(graph.addEdge(i, l), 5);
        graph.setEdgeWeight(graph.addEdge(i, j), 3);
        graph.setEdgeWeight(graph.addEdge(j, l), 9);
        graph.setEdgeWeight(graph.addEdge(k, l), 8);

        return graph;
	}
}
