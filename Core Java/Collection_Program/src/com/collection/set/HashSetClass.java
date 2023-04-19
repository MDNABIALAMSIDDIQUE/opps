package com.collection.set;

import java.util.HashSet;

public class HashSetClass {
	public static void main(String[] args) {
		
		System.out.println("HashSetClass.....");
		HashSet<String> hashSet= new HashSet<>();
		
		System.out.println(hashSet);
		hashSet.add("NABI");
		hashSet.add("ALAM");
		hashSet.add("Fatima");
		hashSet.add("Zohan");
		hashSet.add("Zurda");
		hashSet.add("1");
		
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add("NABI");
		System.out.println(hashSet);
		System.out.println(hashSet.hashCode());
		hashSet.size();
		System.out.println(hashSet);
	}

}
