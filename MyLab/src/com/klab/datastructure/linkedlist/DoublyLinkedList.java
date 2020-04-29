package com.klab.datastructure.linkedlist;

public class DoublyLinkedList<E> {
	Node<E> n;
	Node<E> last;
	Node<E> next;
	Node<E> first;
	int size = 0;
	
	public void add(E element) {
		Node<E> p = last;
		Node<E> newNode = new Node<>();
		newNode.prev = p;
		newNode.item = element;
		newNode.next = null;
		
		last = newNode;
		if(p == null) {
			first = newNode;
		}else {
			p.next = newNode;
		}
		size++;
		
		
	}
	
	
	public void printNodes() {
		Node<E> n = first;
		while(n != null) {
			System.out.println("Node"+ n.item);
			n = n.next;
		}
		
	}
	
	public int getSize() {
		return size;
	}
	
	public void addEndOfTheNode(E element) {
		Node<E> l = last;
		Node<E> newNode = new Node<>();
		newNode.prev = l;
		newNode.item = element;
		newNode.next = null;
		l.next = newNode;
		last = newNode;
		size++;
		
	}
	
	public void addBigginigOfTheNode(E element) {
		Node<E> f = first;
		Node<E> newNode = new Node<>();
		newNode.prev = n;
		newNode.item = element;
		newNode.next = f;
		
		f.prev = newNode;
		first = newNode;
		size++;
		
		
	}
	
	public void addElementSpecificPosition(int index,E element) {
		
		if(index == 0) {
			addBigginigOfTheNode(element);
			}
		
		if(index == size) {
			addEndOfTheNode(element);
		}else {
		if(index > 0 && index < size) {
			Node<E> nd = first;
			for(int i=0;i<index;i++) {
				nd = nd.next;
			}
			Node<E> prv = nd.prev;
			
			Node<E> newNode = new Node<>();
			newNode.prev = nd.prev;
			newNode.item = element;
			newNode.next = nd;
			prv.next = newNode;
			nd.prev = newNode;
			size++;		
		}
		}
		
	}

}
