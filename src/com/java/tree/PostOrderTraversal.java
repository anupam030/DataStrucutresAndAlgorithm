package com.java.tree;

import java.util.Stack;

//L R N
public class PostOrderTraversal {

	public void postOrder(Node root) {

		Stack<Node> stack = new Stack<Node>();

		Node current = root;
		Node prev = null;

		if (current != null) {
			stack.push(current);
		}

		while (!stack.isEmpty()) {
			current = stack.peek();

			// first case find the leftmost leaf node
			if (prev == null || prev.leftchild == current || prev.rightchild == current) {

				if (current.leftchild != null)
					stack.push(current.leftchild);
				else if (current.rightchild != null)
					stack.push(current.rightchild);
				else {
					stack.pop();
					System.out.print(current.data + " ");
				}
			} // when traversing up from left node to Parent node
			else if (current.leftchild == prev) {
				if (current.rightchild != null)
					stack.push(current.rightchild);
				else {
					stack.pop();
					System.out.print(current.data + " ");
				}
			} // when traversing up from right node to parent node
			else if (current.rightchild == prev) {
				stack.pop();
				System.out.print(current.data + " ");
			}
			prev = current;
		}
	}

}
