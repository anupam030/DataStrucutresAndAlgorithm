package com.java.tree;

import com.java.tree.Node;

public class BuildTreeInorderPreorder {
	
	static int preindex=0;
	
	public static void main(String args[]) {
		
		int[] preorder={1, 2, 4, 5, 3, 6};
		int[] inorder = {4, 2, 5, 1, 6, 3 };

		Node root = buildTree(preorder,inorder,0,inorder.length-1);
		BinaryTreeLevelOrderTraversal btl = new BinaryTreeLevelOrderTraversal();
		btl.printLevelorderTraversal(root);
	}
	
	public static Node buildTree(int[] preorder,int[] inorder,int inStrt,int inEnd) {
		
		if (inStrt > inEnd) 
            return null;
		
		Node root = new Node(preorder[preindex++]);
		
        /* If this node has no children then return */
        if (inStrt == inEnd)
            return root;
		
		int inindex = findrootindex(inorder,root.data,inStrt,inEnd);

		root.leftchild = buildTree(preorder,inorder,inStrt,inindex-1);
	    root.rightchild = buildTree(preorder,inorder,inindex+1,inEnd);
		
		return root;
	}

	 /* UTILITY FUNCTIONS */
    
    /* Function to find index of value in arr[start...end]
     The function assumes that value is present in in[] */
	private static int findrootindex(int[] inorder, int data,int inStrt,int inEnd) {
		int i;
        for (i = inStrt; i <= inEnd; i++) 
        {
            if (inorder[i] == data)
                return i;
        }
        return i;
	}

}
