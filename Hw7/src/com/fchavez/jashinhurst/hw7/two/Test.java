package com.fchavez.jashinhurst.hw7.two;

import java.util.*;

/**
 * Uses a randomly generated stack and creates a minimum stack as well as a maximum stack
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @bugs none
 * @todo none
 * @version 1.0
 *
 */
public class Test {
	
	static Stack<Double> stack = new Stack<Double>();
	static Stack<Double> max = new Stack<Double>();
	static Stack<Double> min = new Stack<Double>();
	static Stack<Double> temp_min = new Stack<Double>();
	static Stack<Double> temp_max = new Stack<Double>();
	
	public static void main(String args[]) {
		Random r = new Random();
		double tmp;
		for (int i = 0; i < 100; i++) {
			tmp = 1000 * r.nextDouble();
			//System.out.println(tmp);
			stack.push(tmp);
			temp_min.push(tmp);
			temp_max.push(tmp);
		}

		for (int i = 100; i != 0; i--) {
			pushMin(temp_min.size());
		}
		for (int i = 100; i != 0; i--) {
			pushMax(temp_max.size());
		}
		System.out.println("Min value: " + min.peek());
		System.out.println("Max value: " + max.peek());
		System.out.println("Min Stack");
		for (int i = 0; i < 100; i++) {
			tmp = min.pop().doubleValue();
			System.out.println(i + ": " + tmp);
		}
		System.out.println("Max Stack");
		for (int i = 0; i < 100; i++) {
			tmp = max.pop().doubleValue();
			System.out.println(i + ": " + tmp);
		}
		System.out.println("Original Stack");
		for (int i = 0; i < 100; i++) {
			tmp = stack.pop().doubleValue();
			System.out.println(i + ": " + tmp);
		}
	
	}
	
	/**
	 * pushes maximum value onto stack, creating a stack with the minimum value on top
	 * @param size size of stack to be explored
	 */
	public static void pushMin(int size) {
		Stack<Double> temp_stack = new Stack<Double>();
		min.push(temp_min.pop());
		for (int i = 0; i < size-1; i++) {
			if (min.peek().doubleValue() < temp_min.peek().doubleValue()) {
				temp_stack.push(min.pop());;
				min.push(temp_min.pop());
			} else {
				temp_stack.push(temp_min.pop());
			}
		}
		
		size = temp_stack.size();
		for (int i = 0; i < size; i++) {
			temp_min.push(temp_stack.pop());
		}
	}
	
	/**
	 * pushes minimum value on stack, creating a stack with the maximum value on top
	 * @param size size of stack to be explored
	 */
	public static void pushMax(int size) {
		Stack<Double> temp_stack = new Stack<Double>();
		max.push(temp_max.pop());
		for (int i = 0; i < size-1; i++) {
			if (max.peek().doubleValue() > temp_max.peek().doubleValue()) {
				temp_stack.push(max.pop());;
				max.push(temp_max.pop());
			} else {
				temp_stack.push(temp_max.pop());
			}
		}
		
		size = temp_stack.size();
		for (int i = 0; i < size; i++) {
			temp_max.push(temp_stack.pop());
		}
	}
}
