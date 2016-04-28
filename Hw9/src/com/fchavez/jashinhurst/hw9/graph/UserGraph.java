package com.fchavez.jashinhurst.hw9.graph;
/**
 * class to create an undirected graph for use with testing of jgrapht methods
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * @bugs none
 * @todo none
 * @version 1.0
 */

import org.jgrapht.*;
import org.jgrapht.graph.SimpleGraph;
import org.jgraph.graph.DefaultEdge;

public class UserGraph {
	/**
	 * creates a replica of Graph 2 using an undirected graph
	 * @return made graph
	 */
	public static UndirectedGraph<String, DefaultEdge> createGraph() {
        UndirectedGraph<String, DefaultEdge> graph =
            new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);

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

        return graph;
    }
}
