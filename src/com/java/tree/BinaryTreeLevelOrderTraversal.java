package com.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public void printLevelorderTraversal(Node node) {
		
		Queue<Node> queue = new LinkedList<Node>();
 		queue.add(node);
 		queue.add(null);
 		
 		while(!queue.isEmpty()) {
 			Node tempNode = queue.poll();
 			if(tempNode != null) {
 	 			System.out.print(tempNode.data+ " ");
 	 			 
 	            /*Enqueue left child */
 	            if (tempNode.leftchild != null) {
 	                queue.add(tempNode.leftchild);
 	            }
 	 
 	            /*Enqueue right child */
 	            if (tempNode.rightchild != null) {
 	                queue.add(tempNode.rightchild);
 	            }
 			} else {
 				System.out.println();
 				if(!queue.isEmpty())
 				   queue.add(null);
 			}
 		}	
	}

}
