//package com;
//
//public class DemoPrintMiddleLinkedList {
//	Node1 head;
//
//	public static void main(String[] args) {
//		DemoPrintMiddleLinkedList list = new DemoPrintMiddleLinkedList();
//		for(int i=5; i>0; --i) {
//		list.push(i);
//		list.printList();
//		list.printMiddle();
//		}
//	}
//
//	private void printMiddle() {
//		Node1 slowPointer = head;
//		Node1 fastPointer = head;
//		while(fastPointer!=null && fastPointer.nextNode!=null) {
//			fastPointer= fastPointer.nextNode.nextNode;
//			slowPointer = slowPointer.nextNode;
//		}
//		System.out.println("The middle of linked list is "+slowPointer.data);
//	}
//
//	private void printList() {
//		Node1 tnode = head;
//		while(tnode!=null) {
//			System.out.print(tnode.data +"->");
//			tnode=tnode.nextNode;
//		}
//		System.out.println("NULL");
//	}
//
//	private void push(int new_data) {
//		Node1 new_node = new Node1(new_data);
//		new_node.nextNode = head;
//		head=new_node;
//	}
//
//
//}
