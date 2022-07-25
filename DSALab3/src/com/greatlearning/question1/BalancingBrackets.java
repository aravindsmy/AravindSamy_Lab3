/**
 * 
 */
package com.greatlearning.question1;

import java.util.Stack;

/**
 * @author Aravindsamy
 *
 */
public class BalancingBrackets {

	// function to check if brackets are balanced

	boolean checkBalanced(String inp) {
		// stack check balance
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < inp.length(); i++) // loop thru each character
		{
			char c = inp.charAt(i);

			if (c == '(' || c == '[' || c == '{') {
				// push the element into stack
				stack.push(c);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char ch;

			switch (c) {

			case ')':
				ch = stack.pop();
				if (ch == '{' || ch == '[')
					return false;
				break;

			case '}':
				ch = stack.pop();
				if (ch == '(' || ch == '[')
					return false;
				break;

			case ']':
				ch = stack.pop();
				if (ch == '(' || ch == '{')
					return false;
				break;

			}
		}
		// return empty stack
		return (stack.isEmpty());
	}

}
