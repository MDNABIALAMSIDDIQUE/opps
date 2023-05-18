package com;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;



public class Emp {
	
	int id;
	String name;
	

	public static void main(String[] args) {
		String s="abcadabc";
		List<String>  li=Arrays.asList(s.split(""));
		System.out.println(li);
	
	boolean s1=li.stream().filter(x->x.equals("c")).noneMatch(x->x.contains(x));
		System.err.println(s1);
	}

}
