package com.fchavez.jashinhurst.hw9.one;
import org.jgraph.graph.DefaultEdge;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.traverse.BreadthFirstIterator;
import com.fchavez.jashinhurst.hw9.graph.*;
/**
 * <p> This problem involves using the BreadthFirstIterator
 * in org.jgrapht.traversal in order to search through graph 2
 * starting at Node I</p>
 * 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw9 #1
 * 
 */

public class Problem1 {
	public static void main (String[] args){
		String ret;
		UndirectedGraph<String, DefaultEdge> graph = UserGraph.createGraph();
		BreadthFirstIterator<String, DefaultEdge> itr = new BreadthFirstIterator<String,DefaultEdge>(graph,"I");
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
