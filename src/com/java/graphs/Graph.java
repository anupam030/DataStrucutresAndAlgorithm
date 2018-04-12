package com.java.graphs;

import java.util.LinkedList;

public class Graph {

	int V;

	LinkedList<Integer>[] adjacencyList;

	Graph(int V) {
		this.V = V;

		adjacencyList = new LinkedList[this.V];

		for (int i = 0; i < this.V; i++) {
			adjacencyList[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int src, int dest) {
		if (src >= V || dest >= V) 
			throw new RuntimeException(" source or desination is greater than vertices");
        adjacencyList[src].add(dest);
        adjacencyList[dest].add(src);
	}
	
	// A utility function to print the adjacency list 
    // representation of graph
    public void printGraph()
    {       
        for(int v = 0; v < this.V; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: adjacencyList[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
    }
      
}
