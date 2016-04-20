package com.fchavez.jashinhurst.hw8.one;

import java.util.ArrayDeque;
/**
 * <p>A simple queue system that allows the user to push and pull
 * information from a stack so that they can queue up elements that they wish
 * to track in a stack form. 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw5 #1a
 * @param <E> is the type of queue you wish to have
 */
public class Queue<E> {
	ArrayDeque<E> deque;
	/**
	 * initialize as empty
	 */
	public Queue(){
		this.deque = new ArrayDeque<E>();
	}
	/**
	 * Initialize with a given size
	 * @param size number of initial elements
	 */
	public Queue(int size){
		this.deque = new ArrayDeque<E>(size);
	}
	/**
	 * add an element to the queue at the end
	 * @param element element to add
	 */
	public void enque(E element){
		this.deque.addLast(element);
	}
	/**
	 * pop an element from the queue and return it
	 * @return the popped element from the stack
	 */
	public E deque(){
		return this.deque.pop();
	}
	/**
	 * check to see if the queue is empty
	 * @return true or false based on emptiness
	 */
	public boolean isEmpty(){
		return this.deque.isEmpty();
	}
	/**
	 * get the top of the queue without removing 
	 * @return the top element of the queue
	 */
	public E peek(){
		return this.deque.peek();
	}
	/**
	 * return the number of items in the queue
	 * @return size of the queue aka the number of elements in the stack
	 */
	public int size(){
		return this.deque.size();
	}
}
