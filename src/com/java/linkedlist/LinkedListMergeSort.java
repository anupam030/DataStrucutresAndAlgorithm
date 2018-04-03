package com.java.linkedlist;

public class LinkedListMergeSort {

	public Node mergeSortLinkedList(Node h) {
		// Base case : if head is null
		if (h == null || h.next == null) {
			return h;
		}

		Node mid = getMiddle(h);

		Node aftermid = mid.next;
		mid.next = null;
		Node left = mergeSortLinkedList(h);
		Node right = mergeSortLinkedList(aftermid);

		return mergeLinkedList(left, right);
	}

	public Node getMiddle(Node h) {
		// Base case
		if (h == null)
			return h;
		Node fastptr = h.next;
		Node slowptr = h;

		// Move fastptr by two and slow ptr by one
		// Finally slowptr will point to middle node
		while (fastptr != null) {
			fastptr = fastptr.next;
			if (fastptr != null) {
				slowptr = slowptr.next;
				fastptr = fastptr.next;
			}
		}
		return slowptr;
	}

	public Node mergeLinkedList(Node l1, Node l2) {

		Node head = new Node(0);
		Node result = head;

		while (l1 != null && l2 != null) {
			if (l1 != null && l2 != null) {
				if (l1.data < l2.data) {
					result.next = l1;
					l1 = l1.next;
				} else {
					result.next = l2;
					l2 = l2.next;
				}

				result = result.next;
			}

			if (l1 != null) {
				result.next = l1;
			}
			if (l2 != null) {
				result.next = l2;
			}

		}
		return head.next;
	}

	/*
	 * public Node mergeLinkedList(Node l1, Node l2) {
	 * 
	 * Node result = null;
	 * 
	 * //base cases
	 * 
	 * if (l1==null){ return l2; } if (l2==null) { return l1; }
	 * if(l1.data<l2.data) { result = l1; result.next=mergeLinkedList(l1.next,
	 * l2); } else { result = l2; result.next=mergeLinkedList(l1, l2.next); }
	 * 
	 * return result; }
	 */
	public static void main(String args[]) {
		int arr[] = { 9, 8, 7, 4, 3, 1, 2, 6 };
		LinkedListCrud lc = new LinkedListCrud();
		Node root = lc.createLinkedListFromArray(arr);
		lc.printLinkedList(root);
		LinkedListMergeSort lm = new LinkedListMergeSort();
		System.out.println();
		Node node = lm.mergeSortLinkedList(root);
		lc.printLinkedList(node);
	}

}

class Node {
	int data;
	Node next;

	Node() {

	}

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}