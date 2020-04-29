package com.klab.datastructure.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> {
	
	Node<E> root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public void insertNode(E data) {
		
		Node<E> newNode = new Node<>(data);
		
		if(root == null) {
			root = newNode;
		}else {
			Queue<Node<E>> queue = new LinkedList<>();
			queue.add(root);
			
			while(true) {
				Node<E> node = queue.remove();
				
				if(node.left != null && node.right !=null) {
					queue.add(node.left);
					queue.add(node.right);
				}else {
					if(node.left == null) {
						node.left = newNode;
						queue.add(node.left);
					}else {
						node.right = newNode;
						queue.add(node.right);
					}
					break;
				}
			}
		}
		
		
		
	}
	
	public void inOrderTraversal(Node<E> node) {
		if(node == null) {
			System.out.println("tree is empty");
			return;
		}else {
			if(node.left!= null) 
				inOrderTraversal(node.left);
			System.out.println(node.data);
			if(node.right!= null) {
				inOrderTraversal(node.right);
			}
		}
		
	}
	
	
	
	
	

}
