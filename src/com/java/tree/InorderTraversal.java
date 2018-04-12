package com.java.tree;

import java.util.Stack;

public class InorderTraversal {

	public void inorder(Node node) {
		Stack<Node> stack = new Stack<Node>();

		while (node != null) {
			stack.push(node);
			node = node.leftchild;
		}

		while (!stack.isEmpty()) {
			Node temp = stack.pop();

			System.out.print(temp.data + " ");

			node = temp.rightchild;

			while (node != null) {
				stack.push(node);
				node = node.leftchild;
			}
		}
	}

}
