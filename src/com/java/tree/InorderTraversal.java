package com.java.tree;

import java.util.Stack;

//L N R

public class InorderTraversal {

	public void inorder(Node node) {
		Stack<Node> stack = new Stack<Node>();

		//find the leftmost leaf node
		while (node != null) {
			stack.push(node);
			node = node.leftchild;
		}

		while (!stack.isEmpty()) {
			Node temp = stack.pop();
            // print the node
			System.out.print(temp.data + " ");

			node = temp.rightchild;
            
			// if right child exist for the node find the leftmost node for it too
			while (node != null) {
				stack.push(node);
				node = node.leftchild;
			}
		}
	}

}
