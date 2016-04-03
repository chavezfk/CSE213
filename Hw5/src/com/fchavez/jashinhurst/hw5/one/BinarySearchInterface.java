/**
 * 
 */
package com.fchavez.jashinhurst.hw5.one;

/**
 * <p> An interface for Binary search tree class</p>
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw5 #1
 * @bugs none
 */
public interface BinarySearchInterface<E> {
	public void makeEmpty();
	public boolean isEmpty();
	public boolean find(E x);
	public E findMin();
	public E findMax();
	public void add(E x);
	public void delete(E x);
	public void print(Traversal t);
}
