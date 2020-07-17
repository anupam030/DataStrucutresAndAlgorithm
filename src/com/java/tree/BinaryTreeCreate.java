package com.java.tree;

import java.util.LinkedList;
import java.util.Queue;


/*Creating a binary Tree fromman array
We took a queue .Root of the tree will be the first element of the array.Inserted the first element in the array.Now we will run a loop through
all the other element of array.We will also  travesrse through queue in the loop.
Inside the loop-
First we will peek the element from queue.If its left and right child are not in that case we will remnove the element.Otherwise we will add
it into the left or if that is also filled we will add it into the right.
We will add the lement in the queue as well.
We will do this traversalinside the loop for the queue till the time queue is not empty.*/

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