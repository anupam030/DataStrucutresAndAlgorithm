package com.java.tree;

import java.util.Stack;

public class BinaryTreeZigZagTraversal {

	public void printzigzagorderTraversal(Node root) {
		Stack<Node> currentlevel = new Stack<Node>();
		Stack<Node> nextlevel = new Stack<Node>();

		currentlevel.add(root);
		boolean lefttoright = true;

		while (!currentlevel.isEmpty()) {

			Node node = currentlevel.pop();

			System.out.print(node.data + " ");

			if (lefttoright) {
				if (node.leftchild != null)
					nextlevel.push(node.leftchild);

				if (node.rightchild != null)
					nextlevel.push(node.rightchild);

			} else {
				if (node.rightchild != null)
					nextlevel.push(node.rightchild);

				if (node.leftchild != null)
					nextlevel.push(node.leftchild);

			}

			if (currentlevel.isEmpty()) {
				lefttoright = !lefttoright;
				Stack<Node> temp = currentlevel;
				currentlevel = nextlevel;
				nextlevel = temp;

			}
		}
	}
}