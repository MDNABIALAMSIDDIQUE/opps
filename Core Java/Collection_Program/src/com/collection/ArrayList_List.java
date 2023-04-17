package com.collection;

import java.util.ArrayList;

public class ArrayList_List {
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		list.add(45);
		list.add(25);
		list.addAll(list);
		list.add(null);
		list.add(null);
		list.add(45);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		//   list.hashCode();
		//  System.out.println(list);
	}

}
