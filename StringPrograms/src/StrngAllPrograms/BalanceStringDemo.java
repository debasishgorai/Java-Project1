package StrngAllPrograms;

import java.util.Stack;

public class BalanceStringDemo {
	public static void main(String[]args){
		Stack<Character>stack=new Stack<Character>();
		stack.push('[');
		stack.push('{');
		stack.push('(');
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}
}
