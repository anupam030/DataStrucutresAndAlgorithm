package com.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodeatSameLevel {

	public NodeConnect ConnectNode(NodeConnect root) {
		Queue<NodeConnect> queueConnect = new LinkedList<NodeConnect>();
		queueConnect.add(root);
		queueConnect.add(null);

		while (!queueConnect.isEmpty()) {
			NodeConnect tempNodeConnect = queueConnect.poll();
			if (tempNodeConnect != null) {
				System.out.print(tempNodeConnect.data + "->");

				/* Enqueue left child */
				if (tempNodeConnect.leftChild != null) {
					queueConnect.add(tempNodeConnect.leftChild);

				}

				/* Enqueue right child */
				if (tempNodeConnect.rightChild != null) {
					queueConnect.add(tempNodeConnect.rightChild);
				}
				tempNodeConnect.adjacentPointer = queueConnect.peek();
			} else {
				System.out.println();
				if (!queueConnect.isEmpty())
					queueConnect.add(null);
			}
		}
		return root;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		BinaryTreeCreate btc = new BinaryTreeCreate();
		Node node = btc.createBinaryTree(arr);
		BinaryTreeLevelOrderTraversal btl = new BinaryTreeLevelOrderTraversal();
		btl.printLevelorderTraversal(node);
		System.out.println("Top view will be");
		TopViewofBinaryTree tvb = new TopViewofBinaryTree();
		tvb.TopView(node);
		System.out.println();
		System.out.println("Bottom view will be");
		BottomViewofBinarytree bvb = new BottomViewofBinarytree();
		bvb.bottomView(node);
		System.out.println();
		System.out.println("Left view will be");
		LeftViewofBinarytree lvb = new LeftViewofBinarytree();
		lvb.LeftView(node, 1);
		System.out.println();
		System.out.println("Right view will be");
		RightViewofBinarytree rvb = new RightViewofBinarytree();
		rvb.RightView(node, 1);
		System.out.println();
		System.out.println("Boundary traversal will be");
		BoundaryTraversalofBinaryTree btb = new BoundaryTraversalofBinaryTree();
		btb.printBoundaryTraversal(node);
		System.out.println();
		System.out.println("Mirror tree will be");
		MirrorTree mt = new MirrorTree();
		mt.MirrorTree(node);
		btl.printLevelorderTraversal(node);
		ConnectNodeatSameLevel connectNodeatSameLevel = new ConnectNodeatSameLevel();
		NodeConnect root = convertFromNodetoNodeConnect(node);
		connectNodeatSameLevel.ConnectNode(root);
	}

	private static NodeConnect convertFromNodetoNodeConnect(Node node) {
		NodeConnect nodeConnect = new NodeConnect();
		nodeConnect.data = node.data;
		if (node.leftchild != null)
			nodeConnect.leftChild = convertFromNodetoNodeConnect(node.leftchild);
		if (node.rightchild != null)
			nodeConnect.rightChild = convertFromNodetoNodeConnect(node.rightchild);

		return nodeConnect;
	}

}

class NodeConnect {
	int data;
	NodeConnect leftChild;
	NodeConnect rightChild;
	NodeConnect adjacentPointer;

	NodeConnect(int data) {
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
		this.adjacentPointer = null;
	}

	NodeConnect() {
	}

	NodeConnect(Node node) {
		this.data = node.data;
		this.leftChild = null;
		this.rightChild = null;
		this.adjacentPointer = null;
	}
}