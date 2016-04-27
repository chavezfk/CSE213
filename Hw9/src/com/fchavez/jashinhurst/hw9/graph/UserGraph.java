package com.fchavez.jashinhurst.hw9.graph;

import org.jgrapht.*;
import org.jgrapht.graph.SimpleGraph;
import org.jgraph.graph.DefaultEdge;

public class UserGraph {
	public static UndirectedGraph<String, DefaultEdge> createGraph() {
        UndirectedGraph<String, DefaultEdge> graph =
            new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);

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

        return graph;
    }
}
