package com.java.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListCrud {
	
	
	public Node createLinkedListFromArray(int [] arr) {
		Queue<Node> queue = new LinkedList<Node>();
 		Node root = new Node(arr[0]);
 		queue.add(root);
		Arrays.stream(arr).forEach(i->{
				Node prev = queue.poll();
				Node next = new Node(i);
				prev.next = next;
				queue.add(next);
		});		
		return root;
		
	}
	
	
	public void printLinkedList(Node root) {
		while(root!= null) {
			System.out.print(root.data+" ");
			root=root.next;
		}
	}

}
