package com.fchavez.jashinhurst.hw8.one;

import java.util.ArrayDeque;

public class Queue<E> {
	ArrayDeque<E> deque;
	public Queue(){
		this.deque = new ArrayDeque<E>();
	}
	public Queue(int size){
		this.deque = new ArrayDeque<E>(size);
	}
	
	public void enque(E element){
		this.deque.push(element);
	}
	public E deque(){
		return this.deque.poll();
	}
	public boolean isEmpty(){
		return this.deque.isEmpty();
	}
	public E peek(){
		return this.deque.peek();
	}
	public int size(){
		return this.deque.size();
	}
}
