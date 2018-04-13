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
		
		Node startNode = null;

		if(inStart>inEnd)
			return startNode;
		
		int rootvalue=levelorder[0];
		startNode = new Node(rootvalue);
		
		if (inStart == inEnd) {
			return startNode;
		}
 
		int inindex = findrootindex(inorder, rootvalue, inStart, inEnd);
       
		int[] leftlevelorder =newlevelorder(inorder,levelorder,inStart, inindex-1);
	    int[] rightlevelorder = newlevelorder(inorder,levelorder,inindex+1, inEnd);

		startNode.leftchild = buildTree(inorder,leftlevelorder,inStart,inindex-1);
		startNode.rightchild = buildTree(inorder,rightlevelorder,inindex+1,inEnd);
		
		return startNode;
		
	}
	
	
	 /* UTILITY FUNCTIONS */
    
    private static int[] newlevelorder(int[] inorder, int[] levelorder, int inStart, int inEnd) {

    	int [] newlevelorder = new int[inEnd-inStart+1];
    	int x=0;
    	for (int i=0;i<levelorder.length;i++) {
             if(findrootindex(inorder, levelorder[i],inStart, inEnd) !=-1) {
            	 newlevelorder[x]=levelorder[i];
            	 x++;
             }
    	}
    		
		return newlevelorder;
	}


	/* Function to find index of value in arr[start...end]
     The function assumes that value is present in in[] */
	private static int findrootindex(int[] inorder, int data,int inStrt,int inEnd) {
		int x =-1;
        for (int i = inStrt; i <= inEnd; i++) 
        {
            if (inorder[i] == data)
                 x=i;
        }
        return x;
	}
}
