package com.java.tree;

/*We break the problem in 3 parts:
1. Print the left boundary in top-down manner.
2. Print all leaf nodes from left to right, which can again be sub-divided into two sub-parts:
…..2.1 Print all leaf nodes of left sub-tree from left to right.
…..2.2 Print all leaf nodes of right subtree from left to right.
3. Print the right boundary in bottom-up manner.*/

/*We need to take care of one thing that nodes are not printed again. e.g.
The left most node is also the leaf node of the tree.*/

public class BoundaryTraversalofBinaryTree {

	public void printLeftViewwithoutLeaf(Node root) {
		if (root != null) {
			if (root.leftchild != null) {
				// to ensure top down order, print the node
				// before calling itself for left subtree
				System.out.print(root.data + " ");
				printLeftViewwithoutLeaf(root.leftchild);
			} else if (root.rightchild != null) {
				System.out.print(root.data + " ");
				printRightViewwithoutLeaf(root.rightchild);
			}
			// do nothing if its a leaf node
			// this way we avoid duplicates
		}
	}

	public void printLeafNodes(Node root) {
		if (root == null)
			return;
		printLeafNodes(root.leftchild);
		if (root.leftchild == null && root.rightchild == null)
			System.out.print(root.data + " ");
		printLeafNodes(root.rightchild);
	}

	public void printRightViewwithoutLeaf(Node root) {
		if (root != null) {
			if (root.rightchild != null) {
				printRightViewwithoutLeaf(root.rightchild);
				System.out.print(root.data + " ");
			} else if (root.leftchild != null) {
				// to ensure bottom up order, print the node
				// after calling itself for left subtree
				printRightViewwithoutLeaf(root.leftchild);
				System.out.print(root.data + " ");
			}
			// do nothing if its a leaf node
			// this way we avoid duplicates
		}

	}

	public void printBoundaryTraversal(Node root) {

		if (root != null) {
			System.out.print(root.data + " ");
			printLeftViewwithoutLeaf(root.leftchild);
			printLeafNodes(root);
			printRightViewwithoutLeaf(root.rightchild);
		}
	}
}
