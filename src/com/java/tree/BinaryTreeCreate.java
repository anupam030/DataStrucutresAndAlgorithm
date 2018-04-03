package com.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeCreate {
	
	public Node createBinaryTree(int[] arr) {
		
		Queue<Node> queue = new LinkedList<Node>();
 		Node root = new Node(arr[0]);
 		queue.add(root);
		
		for(int i=1;i<arr.length;i++) {
			Node addNode = new Node(arr[i]);
			
			while (!queue.isEmpty()){
				Node tempNode = queue.peek();
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



class Node {
	int data;
	Node leftchild;
	Node rightchild;
	
	
	Node(int data) {
		this.data=data;
		this.leftchild=null;
		this.rightchild=null;
	}
}