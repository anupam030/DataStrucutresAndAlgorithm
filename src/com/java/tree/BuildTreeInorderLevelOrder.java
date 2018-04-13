package com.java.tree;

public class BuildTreeInorderLevelOrder {
	
	static int levelindex=0;

	public static void main(String args[]) {
		int[] levelorder= {1,2,3,4,5,6};
		int[] inorder = {4, 2, 5, 1, 6, 3 };
		Node root = buildTree(inorder,levelorder,0,inorder.length-1);
		PreorderTraversal btl = new PreorderTraversal();
		btl.preOrder(root);
	}
	
	
	public static Node buildTree(int[] inorder,int[] levelorder,int inStart,int inEnd){
		
		if(inStart>inEnd)
			return null;
		
		boolean found = false;
		Node startNode = null;
		int inindex=0;
		
		if (inStart == inEnd)
            return new Node(inorder[inStart]);
		
		for(int i=0;i<levelorder.length-1;i++) {
			int data=levelorder[i];
			for (int j= inStart;j<inEnd;j++) {
				if(data == inorder[j]) {
					found = true;
					inindex=j;
					startNode= new Node(data);
					break;
				}
			}
			if (found)
				break;			 
		}

		startNode.leftchild = buildTree(inorder,levelorder,inStart,inindex);
		startNode.rightchild = buildTree(inorder,levelorder,inindex+1,inEnd);
		
		return startNode;
		
	}
}
