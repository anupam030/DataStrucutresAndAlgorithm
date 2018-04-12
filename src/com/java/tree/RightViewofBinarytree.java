package com.java.tree;

public class RightViewofBinarytree {
	
	static int MAX_LEVEL =0;
	
	public void RightView(Node root,int level) {
		
		if(root== null)
			return;
		
		if(MAX_LEVEL<level) {
			System.out.print(root.data+" ");
			MAX_LEVEL=level;
		}

		    RightView(root.rightchild,level+1);
			RightView(root.leftchild,level+1);

		
	}

}
