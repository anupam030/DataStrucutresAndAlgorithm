package com.java.tree;

import java.util.LinkedList;

//Level order traversal
public class SerializeDeserializeBinaryTree {

	// Encodes a tree to a single string.
	public String serialize(Node root) {
		StringBuilder sb = new StringBuilder();
		
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			if(temp!=null) {
				sb.append(String.valueOf(temp.data)+",");
				queue.add(temp.leftchild);
				queue.add(temp.rightchild);
			} else {
				sb.append("#,");
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	
}
