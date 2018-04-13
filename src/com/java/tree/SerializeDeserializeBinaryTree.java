package com.java.tree;

import java.util.LinkedList;
import java.util.Queue;

//Level order traversal
public class SerializeDeserializeBinaryTree {

	// Encodes a tree to a single string.
	public String serialize(Node root) {
		StringBuilder sb = new StringBuilder();

		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node temp = queue.poll();

			if (temp != null) {
				sb.append(String.valueOf(temp.data) + ",");
				queue.add(temp.leftchild);
				queue.add(temp.rightchild);
			} else {
				sb.append("#,");
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}

	public Node deserialize(String tree) {
		String arr[] = tree.split(",");

		Queue<Node> queue = new LinkedList<Node>();

		Node root = null;
		if (!arr[0].equals("#"))
			root = new Node(Integer.parseInt(arr[0]));
		if (root != null)
		queue.add(root);

		for (int i = 1; i < arr.length; i++) {
			Node addNode = null;
			if (!arr[i].equals("#"))
				addNode = new Node(Integer.parseInt(arr[i]));
			while (!queue.isEmpty()) {
				Node tempNode=queue.peek();
				if(tempNode.leftchild!=null && tempNode.rightchild!=null)
					queue.remove();
				else if (tempNode.leftchild==null) {
					tempNode.leftchild=addNode;
					queue.add(addNode);
					break;
				}
				else {
					tempNode.rightchild=addNode;
					queue.add(addNode);
					break;
				}	

			}
		}
           return root;
	}

}
