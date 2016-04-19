package com.fchavez.jashinhurst.hw7.four;

import java.util.Scanner;

/**
 * implementation of the Dijkstra's shunting yard algorithm, uses two stacks to
 * convert infix mathematical notation to postfix
 * 
 * @author Joshua Ashinhurst
 * @author Franz Chavez
 * 
 * @version 1.0
 * @bugs none
 * @todo only works with single digit values, implement multiple digit version
 *
 */

public class ShuntingYard {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Stack<Character> output = new Stack<Character>();
		Stack<Character> operator = new Stack<Character>();
		String parse;
		System.out.print("Enter infix expression: ");
		parse = in.nextLine();
		for (int i = 0; i < parse.length(); i++) {
			char c = parse.charAt(i);
			switch (c) {
			case ' ':
				break;
			case '+':
			case '-':
				if (!operator.isEmpty()) {
					while (operator.peek() == '+' || operator.peek() == '-') {
						output.push(operator.pop());
					}
				}
				operator.push(c);
				break;
			case '(':
				operator.push(c);
				break;
			case '/':
			case '*':
			case '%':
				while (!operator.isEmpty()) {
					if (operator.peek().charValue() == '/' || operator.peek().charValue() == '*' || operator.peek().charValue() == '^' || operator.peek().charValue() == '%') {
						output.push(operator.pop());
					}
				}
				operator.push(c);
				break;
			case ')':
				while (operator.peek() != '(') {
					output.push(operator.pop());
				}
				operator.pop();
				break;
			case '^':
				operator.push(c);
			default:
				output.push(c);
				break;
			}
		}
		while (!operator.isEmpty()) {
			output.push(operator.pop());
		}
		while (!output.isEmpty()) {
			operator.push(output.pop());
		}
		while (!operator.isEmpty()) {
			System.out.print(operator.pop() + " ");
		}
		in.close();
	}
}
