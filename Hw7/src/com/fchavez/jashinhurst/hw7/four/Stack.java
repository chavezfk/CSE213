package com.fchavez.jashinhurst.hw7.four;

import java.util.*;
/**
 * implements ArrayDeque methods to create an interface for a stack
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 *
 * @param <T> type for values in stack
 * @version 1.0
 * @bugs none
 * @todo none
 */
public class Stack<T>{
	
	ArrayDeque<T> deque = new ArrayDeque<T>();
	/**
	 * default constructor
	 */
	public Stack(){
	}
	
	/**
	 * checks if stack is empty
	 * @return true if stack is empty
	 */
	public boolean isEmpty() {
		return this.deque.isEmpty();
	}
	
	/**
	 * looks at top element of stack
	 * @return value at top of stack
	 */
	public T peek() {
		return this.deque.peek();
	}
	
	/**
	 * pops top value off of stack
	 * @return value of top of stack
	 */
	public T pop() {
		return this.deque.pop();
	}
	
	/**
	 * pushes value onto top of stack
	 * @param e element to be pushed on
	 */
	public void push(T e) {
		this.deque.push(e);
	}
	
	/**
	 * checks number of elements in stack
	 * @return number of elements in stack
	 */
	public int size() {
		return this.deque.size();
	}
}