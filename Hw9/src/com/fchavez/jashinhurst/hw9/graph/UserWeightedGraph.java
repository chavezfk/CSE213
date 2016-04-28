package com.fchavez.jashinhurst.hw9.graph;
/**
 * class to create an weighted graph for use with testing of jgrapht methods
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * @bugs none
 * @todo none
 * @version 1.0
 */
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

public class UserWeightedGraph {
	/**
	 * creates a replica of Graph 2 using an undirected graph
	 * @return made graph
	 */
	public static SimpleWeightedGraph<String, DefaultWeightedEdge> createGraph() {
        SimpleWeightedGraph<String, DefaultWeightedEdge> graph = new SimpleWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);

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
       DefaultWeightedEdge e1 = graph.addEdge(a, b);
       DefaultWeightedEdge e2 = graph.addEdge(a, c);
       DefaultWeightedEdge e3 = graph.addEdge(a, d);
       DefaultWeightedEdge e4 = graph.addEdge(b, e);
       DefaultWeightedEdge e5 = graph.addEdge(b, f);
       DefaultWeightedEdge e6 = graph.addEdge(c, d);
       DefaultWeightedEdge e7 = graph.addEdge(c, g);
       DefaultWeightedEdge e8 = graph.addEdge(d, h);
       DefaultWeightedEdge e9 = graph.addEdge(d, e);
       DefaultWeightedEdge e10 =graph.addEdge(e, i);
       DefaultWeightedEdge e11= graph.addEdge(e, f);
       DefaultWeightedEdge e12 = graph.addEdge(f, j);
       DefaultWeightedEdge e13 = graph.addEdge(g, k);
       DefaultWeightedEdge e14 = graph.addEdge(g, h);
       DefaultWeightedEdge e15 = graph.addEdge(h, i);
       DefaultWeightedEdge e16 = graph.addEdge(h, k);
       DefaultWeightedEdge e17 = graph.addEdge(i, l);
       DefaultWeightedEdge e18 = graph.addEdge(i, j);
       DefaultWeightedEdge e19 = graph.addEdge(j, l);
       DefaultWeightedEdge e20 = graph.addEdge(k, l);
        
        graph.setEdgeWeight(e1, 3);
        graph.setEdgeWeight(e2, 5);
        graph.setEdgeWeight(e3, 4);
        graph.setEdgeWeight(e4, 3);
        graph.setEdgeWeight(e5, 6);
        graph.setEdgeWeight(e6, 2);
        graph.setEdgeWeight(e7, 4);
        graph.setEdgeWeight(e8, 5);
        graph.setEdgeWeight(e9, 1);
        graph.setEdgeWeight(e10, 4);
        graph.setEdgeWeight(e11, 2);
        graph.setEdgeWeight(e12, 5);
        graph.setEdgeWeight(e13, 6);
        graph.setEdgeWeight(e14, 3);
        graph.setEdgeWeight(e15, 6);
        graph.setEdgeWeight(e16, 7);
        graph.setEdgeWeight(e17, 5);
        graph.setEdgeWeight(e18, 3);
        graph.setEdgeWeight(e19, 9);
        graph.setEdgeWeight(e20, 8);

        return graph;
	}
}
