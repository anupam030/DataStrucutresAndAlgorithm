package com.java.tree;

/*This mehtod is extension of preorder traversal.Preorder is NLR.This approach works only for Complete Binary Trees.
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as 
 * far left as possible 
 */
public class ConnectNodeatSameLevelMethod2 {
	
	public void ConnectNode(NodeConnect node,NodeConnect nextlevelleftMostNode) {
		
		//nextlevelleftMostNode will be the nextlevelleftMostNode for the current level
		//Base case 
		if(node == null) {
			return;
		}

        // set the next pointer for node's left child 
		if (node.leftChild != null) 
			node.leftChild.nextPointer=node.rightChild;
		// set the next pointer for node's right child
		if (node.nextPointer!=null) {
			/*while setting the next pointer for node's right child if parent next pointer is not null it means level is not changing ,at that moment set the
			next pointer for node's right child as parent nextPointer leftchild.*/
			if (node.rightChild != null) 
			    node.rightChild.nextPointer= node.nextPointer.leftChild;
		} else {
			/*while setting the next pointer for node's right child if parent next pointer will be null it means level is changing ,at that moment set the
			parent next as the leftmost node of the current level.*/
			node.nextPointer = nextlevelleftMostNode;
		}
		
		//set nextRight for other child in preorder fashion
		ConnectNode(node.leftChild,nextlevelleftMostNode.leftChild);
		ConnectNode(node.rightChild,nextlevelleftMostNode.leftChild);
	}
	
	
	public void connect(NodeConnect root) {
		//In case of parent
		root.nextPointer = null;		
		ConnectNode(root,root.leftChild);
	}
}
