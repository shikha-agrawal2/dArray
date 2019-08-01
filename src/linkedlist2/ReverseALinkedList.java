//package com;
//
//public class ReverseALinkedList {
//	static Node1 head;
//
//	public static void main(String[] args) {
//		ReverseALinkedList list = new ReverseALinkedList();
//		head = new Node1(85);
//		head.nextNode = new Node1(15);
//		head.nextNode.nextNode = new Node1(4);
//		head.nextNode.nextNode.nextNode = new Node1(20);
//		System.out.println("Given linked list");
//		list.printList(head);
//		//head = list.reverse(head);
//
//		list.reverseUsingRecursion(head, null);
//		System.out.println("Reversed Linked list");
//		list.printList(head);
//	}
//
//	private Node1 reverseUsingRecursion(Node1 curr, Node1 prev) {
//		// TODO Auto-generated method stub
//		if(curr.nextNode==null) {
//			head=curr;
//			curr.nextNode=prev;
//			return null;
//		}
//
//		Node1 next1=curr.nextNode;
//		curr.nextNode=prev;
//		reverseUsingRecursion(next1, curr);
//		return head;
//	}
//
//	private Node1 reverse(Node1 node) {
//		Node1 prev = null;
//		Node1 current = node;
//		Node1 next = null;
//		// TODO Auto-generated method stub
//			while(current!=null) {
//				next=current.nextNode;
//				current.nextNode=prev;
//				prev= current;
//				current=next;
//			}
//			node = prev;
//			return node;
//	}
//
//	private void printList(Node1 node) {
//		// TODO Auto-generated method stub
//		while(node!=null) {
//			System.out.println(node.data+" ");
//			node= node.nextNode;
//		}
//	}
//
//}
