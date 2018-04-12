package com.java.tree;

public class MirrorTree {
	
	
	public Node MirrorTree(Node root) {
		
		if(root==null) 
			return null;
		
		Node temp = null;
		
		temp = root.leftchild;
		root.leftchild= root.rightchild;
		root.rightchild= temp;

		
		MirrorTree(root.rightchild);
		MirrorTree(root.leftchild);
		return root;		
	}

}
