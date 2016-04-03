package com.fchavez.jashinhurst.hw5.one;

/**
 * <p> A Class that holds information for a binary search tree.</p>
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw5 #1
 * @bugs none
 */
public class BinarySearchTree<E extends Comparable<E>> implements BinarySearchInterface<E>{
	private Node<E> root;
	/**
	 * A private class within the search tree
	 * that holds node information
	 */
	private class Node<T>{
		public T value;
		public Node<T> left;
		public Node<T> right;
		
		public Node(T x){
			this.value = x;
		}
	}
	private Node<E> add(E x, Node<E> root){
			Node<E> temp = root;
			int compare;
			if(root == null){
				return new Node<E>(x);
			}
			while(temp != null){
				compare = x.compareTo(temp.value);
				if(compare<0){
					if(temp.left == null){
						temp.left = new Node<E>(x);
						return root;
					}else{
						temp = temp.left;
					}
				}else if(compare>0){
					if(temp.right == null){
						temp.right = new Node<E>(x);
						return root;
					}else{
						temp = temp.right;
					}
				}else if(compare==0){
					return root;
				}
			}
			return root;
		}
	/**
	 * makes the tree empty
	 */
	@Override public void makeEmpty() {
		this.root = empty(this.root);
	}
	/**
	 * empties a tree
	 * @param n is the node to empty
	 */
	private Node<E> empty(Node<E> n) {
		if(n != null){
			empty(n.left);
			empty(n.right);
			n = null;
		}
		return n;
	}
	/**
	 * tests a program 
	 */
	@Override public boolean isEmpty() {
		return root==null;
	}
	/**
	 * searches a tree to find an element x
	 * @param x is the element to find
	 */
	@Override public boolean find(E x) {
		Node<E> temp = this.root;
		int compare;
		while(temp != null){
			compare = x.compareTo(temp.value);
			if(compare == 0)return true;
			if(compare <0)temp = temp.left;
			if(compare >0)temp = temp.right;
		}
		return false;
	}
	/**
	 * returns the minimum value of the tree
	 */
	@Override public E findMin() {
		Node<E> temp = root;
		while(temp.left !=null){
			temp = temp.left;
		}
		return temp.value;
	}
	/**
	 * returns the max value of the tree
	 */
	@Override public E findMax() {
		Node<E> temp = root;
		while(temp.right !=null){
			temp = temp.right;
		}
		return temp.value;
	}
	/**
	 * Adds the value given to the binary tree
	 * @param x the element to add
	 */
	@Override public void add(E x) {
		this.root = add(x, this.root);
	}
	/**
	 * removes a value from the tree
	 * @param x the value to delete
	 */
	@Override public void delete(E x) {
		Node<E> temp = this.root;
		Node<E> temp2;
		int compare;
		while(temp != null){
			compare = x.compareTo(temp.value);
			if(compare == 0){
				temp2 = temp.left;
				if(temp2 !=null){
					while(temp2.right!=null){
						temp2 = temp2.right;
					}
					temp.value = temp2.value;
					temp2 = null;
				}
				return;
			}
			if(compare <0)temp = temp.left;
			if(compare >0)temp = temp.right;
		}
	}
	/**
	 * prints the tree according to a traversal
	 * @param t the traversal type to print
	 */
	@Override public void print(Traversal t) {
		
		switch(t.ordinal()){
		case 0:
			printPreOrder(this.root);
			break;
		case 1:
			printInOrder(this.root);
			break;
		case 2:
			printPostOrder(this.root);
			break;
		}
	}
	/**
	 * prints the information in the tree in pre-order format
	 * @param node the node to print
	 */
	private void printPreOrder(Node<E> node) {
		if(node == null)return;
		System.out.println(node.value.toString());
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	/**
	 * prints the information in the tree in in-order format
	 * @param node the node to print
	 */
	private void printInOrder(Node<E> node) {
		if(node == null)return;
		printInOrder(node.left);
		System.out.println(node.value.toString());
		printInOrder(node.right);
	}
	/**
	 * prints the information in the tree in post-order format
	 * @param node the node to print
	 */
	private void printPostOrder(Node<E> node) {
		if(node == null)return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.value.toString());	
	}
}
