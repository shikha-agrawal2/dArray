//package com;
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
///* Name of the class has to be "Main" only if the class is public. */
//class ReverseNode {
//	private static final int LIST_SIZE = 11, k = 4;
//
//	public static void main(String[] args) throws Exception {
//		/* Creating object of class linkedList */
//		LinkedList list = new LinkedList();
//
//		/* inserting in list */
//		for (int index = 1; index <= LIST_SIZE; index++) {
//			int randomNumber = (int) ((Math.random()) * 100);
//			list.insert(randomNumber);
//		}
//
//		list.display();
//		list.reverseKNodes(k);
//		list.display();
//	}
//}
//
///* Class LinkedList */
//class LinkedList {
//	protected Node1 start;
//	protected Node1 end;
//	private int size;
//
//	/* Constructor */
//	public LinkedList() {
//		start = null;
//		end = null;
//		size = 0;
//	}
//
//	/* Function to check if list is empty */
//	public boolean isEmpty() {
//		return start == null;
//	}
//
//	/* Function to get size of list */
//	public int getSize() {
//		return size;
//	}
//
//	/* Function to insert an element at end */
//	public void insert(int val) {
//		Node1 nptr = new Node1(val, null);
//		size++;
//		if (start == null) {
//			start = nptr;
//			end = start;
//		} else {
//			end.setLink(nptr);
//			end = nptr;
//		}
//	}
//
//	/* Function to set start node and reverse */
//	public void reverseKNodes(int k) {
//		reverse(start, k);
//	}
//
//	/* Function to reverse */
//	private Node1 reverse(Node1 head,int k)
//    {
//    	Node1 current=head;
//    	Node1 next=null;
//    	Node1 prev=null;
//    	int count = 0;
//
//	    while (count < =k) {
//	       next  = current.getLink();
//	       current.setLink(prev);
//	       current = next;
//	       prev = current;
//	       count++;
//	    }
//
//	    if(next !=  null) {
//	    	head.setLink(reverse(prev, k));
//	    }
//
//	    return prev;
//    }
//
//	/* Function to display elements */
//	public void display() {
//		System.out.print("\nSingly Linked List = ");
//		if (size == 0) {
//			System.out.print("empty\n");
//			return;
//		}
//		if (start.getLink() == null) {
//			System.out.println(start.getData());
//			return;
//		}
//		Node1 ptr = start;
//		System.out.print(start.getData() + "->");
//		ptr = start.getLink();
//		while (ptr.getLink() != null) {
//			System.out.print(ptr.getData() + "->");
//			ptr = ptr.getLink();
//		}
//		System.out.print(ptr.getData() + "\n");
//	}
//}
//
///* class Node1 */
//class Node1 {
//	protected int data;
//	protected Node1 link;
//
//	/* Constructor */
//	public Node1() {
//		link = null;
//		data = 0;
//	}
//
//	/* Constructor */
//	public Node1(int d, Node1 n) {
//		data = d;
//		link = n;
//	}
//
//	/* Function to set link to next Node1 */
//	public void setLink(Node1 n) {
//		link = n;
//	}
//
//	/* Function to set data to current Node1 */
//	public void setData(int d) {
//		data = d;
//	}
//
//	/* Function to get link to next node */
//	public Node1 getLink() {
//		return link;
//	}
//
//	/* Function to get data from current Node1 */
//	public int getData() {
//		return data;
//	}
//}
