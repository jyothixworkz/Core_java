package com.xworkz.collectionmethods;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		 Stack<Object> stack = new Stack<>();
		 
		 
		 stack.push("manoj");
		 Object pop = stack.pop();
		 System.out.println(pop);
		 stack.push("sjgas");
		 Object peek = stack.peek();
		 System.out.println(peek);
		 boolean empty = stack.empty();
		 System.out.println(empty);
		 int search = stack.search("sjgas");
		 System.out.println(search);
		 stack.push("qlkegy");
		 stack.push("jwdqwfqwt");
		 Object pop2 = stack.pop();
		 System.out.println(pop2);
		 boolean empty2 = stack.empty();
		 System.out.println(empty2);
		 System.out.println(stack);
		 
		 
	}

}
