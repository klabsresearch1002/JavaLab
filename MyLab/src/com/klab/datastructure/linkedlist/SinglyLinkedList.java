package com.klab.datastructure.linkedlist;

public class SinglyLinkedList<E> {
	Node<E> head;
	public void add(E element) {
		
		Node<E> newNode = new Node<>();
		newNode.item = element;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
		}else {
			Node<E> n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = newNode;
		}
		
		
	}
	
	public void printNodes() {
		Node<E> n = head;
		while(n.next != null) {
			System.out.println("Next Node"+ n.item);
			n = n.next;
		}
		
		System.out.println("tailNode"+n.item);
	}
		
		
}
