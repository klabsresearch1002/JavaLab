package com.klab.datastructure.binaryTree;

public class Node<E> {
	
	E data;
	Node<E> left;
	Node<E> right;
	
	public Node(E data){
		this.data = data;
		this.left = null;
		this.right = null;
		
	}

}
