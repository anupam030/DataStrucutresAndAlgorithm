package com.java.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {

	private LinkedList<Integer>[] adjacencylist;

	public void BFS(Graph graph, int s) {

		boolean visited[] = new boolean[graph.V];

		adjacencylist = graph.adjacencyList;

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(s);
		visited[s] = true;

		while (!queue.isEmpty()) {
			int v = queue.poll();
			System.out.print(v + " ");
			Iterator<Integer> iteraor = adjacencylist[v].iterator();
			while (iteraor.hasNext()) {
				int n = iteraor.next();
				if (!visited[n]) {
					visited[n] = true;
				    queue.add(n);
				}
			}

		}
	}

}
