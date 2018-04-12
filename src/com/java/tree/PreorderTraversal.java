package com.java.tree;

import java.util.Stack;

public class PreorderTraversal {
	
	
	public void preOrder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		if(root!=null) {
			stack.push(root);
		}
		
		while(!stack.isEmpty()) {
			
			Node temp = stack.pop();
			
			System.out.print(temp.data+" ");
			
			if(temp.rightchild!= null) 
				stack.add(temp.rightchild);
			if(temp.leftchild!= null)
				stack.add(temp.leftchild);
			
		}
	}

}
