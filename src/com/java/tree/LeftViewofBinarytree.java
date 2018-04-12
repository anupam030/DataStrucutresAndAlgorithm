package com.java.tree;

public class LeftViewofBinarytree {
	
	static int MAX_LEVEL =0;
	
	public void LeftView(Node root,int level) {
		
		if(root== null)
			return;
		
		if(MAX_LEVEL<level) {
			System.out.print(root.data+" ");
			MAX_LEVEL=level;
		}

			LeftView(root.leftchild,level+1);
			LeftView(root.rightchild,level+1);
		
	}

}
