package com.java.tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class BottomViewofBinarytree {
	
	public void bottomView(Node root) {
		
		LinkedList<QItem> queue = new LinkedList<QItem>();
		

		// TreeMap which stores key value pair sorted on key value
        Map<Integer, Integer> horizontalmap = new TreeMap<>();
		
		if (root != null) {
			queue.add(new QItem(root, 0));
		}

		while (!queue.isEmpty()) {
			QItem qitem = queue.remove();
			Node node = qitem.node;
			int hd = qitem.hd;
			
			horizontalmap.put(hd,node.data);

			if (node.leftchild != null) {
				queue.add(new QItem(node.leftchild, hd - 1));
			}

			if (node.rightchild != null) {
				queue.add(new QItem(node.rightchild, hd + 1));
			}
		}
		
		horizontalmap.forEach((hd,data)->System.out.print(data+" "));
	}

}
