package com.java.tree;

import java.util.HashSet;
import java.util.LinkedList;

public class TopViewofBinaryTree {

	public void TopView(Node root) {

		LinkedList<QItem> queue = new LinkedList<QItem>();

		HashSet<Integer> horizontalset = new HashSet<Integer>();

		if (root != null) {
			queue.add(new QItem(root, 0));
		}

		while (!queue.isEmpty()) {
			QItem qitem = queue.remove();
			Node node = qitem.node;
			int hd = qitem.hd;

			if (!horizontalset.contains(hd)) {
				horizontalset.add(hd);
				System.out.print(node.data + " ");
			}

			if (node.leftchild != null) {
				queue.add(new QItem(node.leftchild, hd - 1));
			}

			if (node.rightchild != null) {
				queue.add(new QItem(node.rightchild, hd + 1));
			}
		}
	}

}

class QItem {
	Node node;
	int hd;

	QItem(Node node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}
