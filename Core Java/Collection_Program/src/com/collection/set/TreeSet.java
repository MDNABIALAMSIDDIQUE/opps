package com.collection.set;

public class TreeSet {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("Tree Set");
		
		java.util.TreeSet treeSet = new java.util.TreeSet();
		treeSet.add("D");
		treeSet.add("Z");
		treeSet.add("P");
		treeSet.add("C");
		treeSet.add("A");
	//	treeSet.add(5);    java.lang.ClassCastException:
	
		
		System.out.println(treeSet);
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.lower("A"));
		System.out.println(treeSet.headSet("Z"));
		
		
	}

}
