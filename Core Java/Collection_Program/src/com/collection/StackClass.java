package com.collection;

import java.util.Stack;

public class StackClass {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		System.out.println("StackClass. Program.....");
		
		Stack stack= new Stack();
		stack.push("AA");
		
		stack.push("BB");
		stack.push("CC");
		stack.push("DD");
		stack.push("EE");
		stack.push("NN");
		System.out.println(stack);
		System.out.println("==============================");
		System.out.println(stack.pop());
		System.out.println("==================================");
		System.out.println(stack.peek());
		System.out.println("======================================");
		System.out.println(stack);
		System.out.println("===========================================");
		System.out.println(stack.search("DD"));
		
		
		
	}

}
