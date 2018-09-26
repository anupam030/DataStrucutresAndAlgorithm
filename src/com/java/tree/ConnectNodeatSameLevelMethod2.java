package com.java.tree;

/*This mehtod is extension of preorder traversal.Preorder is NLR.This approach works only for Complete Binary Trees.
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as 
 * far left as possible 
 */
public class ConnectNodeatSameLevelMethod2 {

	private static NodeConnect convertFromNodetoNodeConnect(Node node) {
		NodeConnect nodeConnect = new NodeConnect();
		nodeConnect.data = node.data;
		if (node.leftchild != null)
			nodeConnect.leftChild = convertFromNodetoNodeConnect(node.leftchild);
		if (node.rightchild != null)
			nodeConnect.rightChild = convertFromNodetoNodeConnect(node.rightchild);

		return nodeConnect;
	}
	
	
	public void ConnectNode(NodeConnect node) {
		
		//Base case 
		if(node == null) {
			return;
		}

        // set the next pointer for root's left child 
		if (node.leftChild != null) 
			node.leftChild.nextPointer=node.rightChild;
		// set the next pointer for root's right child
		if (node.rightChild != null && node.nextPointer!=null) {
			node.rightChild.nextPointer= node.nextPointer.leftChild;
		}
		
		//set nextRight for other child in preorder fashion
		ConnectNode(node.leftChild);
		ConnectNode(node.rightChild);
	}
	
	
	public void connect(NodeConnect root) {
		//In case of parent
		root.nextPointer = null;
		
		
		ConnectNode(root);
	}
}
