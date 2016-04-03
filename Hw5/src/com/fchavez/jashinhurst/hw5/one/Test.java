package com.fchavez.jashinhurst.hw5.one;

import java.util.Date;
import java.util.Random;

/**
 * <p> A test class for the BinarySearchTree class</p>
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw5 #1
 * @bugs none
 */
public class Test {
	public static void main(String[] args){
		BinarySearchTree<Integer> intTree = new BinarySearchTree<Integer>();
		BinarySearchTree<Tech> techTree = new BinarySearchTree<Tech>();
		for(int count = 1; count <=10; count++){
			intTree.add(count);
		}
		System.out.println("1-10: PREORDER");
		intTree.print(Traversal.PREORDER);
		System.out.println("1-10: INORDER");
		intTree.print(Traversal.INORDER);
		System.out.println("1-10: POSTORDER");
		intTree.print(Traversal.POSTORDER);
		intTree.makeEmpty();
		if(!intTree.isEmpty())System.out.println("The empty failed");
		
		Random r = new Random(new Date().getTime());
		for(int count = 0; count < 20; count++){
			intTree.add(r.nextInt(10));
		}
		System.out.println("Random 0-9: PREORDER");
		intTree.print(Traversal.PREORDER);
		System.out.println("Random 0-9: INORDER");
		intTree.print(Traversal.INORDER);
		System.out.println("Random 0-9: POSTORDER");
		intTree.print(Traversal.POSTORDER);
		intTree.makeEmpty();
		if(!intTree.isEmpty())System.out.println("The empty failed");
		
		techTree.add(new Tech(10, "Google"));
		techTree.add(new Tech(20, "Apple"));
		techTree.add(new Tech(5, "Amazon"));
		techTree.add(new Tech(30, "Twitter"));
		techTree.add(new Tech(1, "Facebook"));
		techTree.add(new Tech(25, "C"));
		techTree.add(new Tech(28, "C++"));
		techTree.add(new Tech(3, "Python"));
		techTree.add(new Tech(7, "Linux"));
		techTree.add(new Tech(15,"Unix" ));
		techTree.add(new Tech(22,"Java"));
		
		System.out.println("Tech: PREORDER");
		techTree.print(Traversal.PREORDER);
		System.out.println("Tech: INORDER");
		techTree.print(Traversal.INORDER);
		System.out.println("Tech: POSTORDER");
		techTree.print(Traversal.POSTORDER);
		techTree.makeEmpty();
		if(!intTree.isEmpty())System.out.println("The empty failed");
	}
}
