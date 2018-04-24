package com.java.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphDFS {

	private LinkedList<Integer>[] adjacencylist;
	
	public void printDFS(Graph graph){
		
		adjacencylist = graph.adjacencyList;
		
		boolean visited[] = new boolean[graph.V];
		
		DFS(2,visited);
	}
	
	
	public void DFS(int v ,boolean[] visited) {
		
		Iterator<Integer> iterator = adjacencylist[v].iterator();
		visited[v] = true;
		System.out.print(v+ " ");

		while(iterator.hasNext()) {
			int n = iterator.next();
			if(!visited[n]) {
				DFS(n,visited);
			}
		}
		
		
	}
}
