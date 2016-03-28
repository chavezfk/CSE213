/**
 * 
 */
package com.fchavez.jashinhurst.hw5.one;

/**
 * @author 
 *
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
