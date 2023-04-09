package com.hashcode;

public class MainClassHashCode extends ClassDemo{
	public static void main(String[] args) {
		
		ClassDemo classDemo = new ClassDemo();
		int hashcode=classDemo.hashCode();
		 
		System.out.println("Hash Code  : "+hashcode);
		String re=classDemo.toString();
		System.out.println("String referance  : "+re);
		 
	}
}
