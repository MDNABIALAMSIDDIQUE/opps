package com.collection;

import java.util.ArrayList;

public class SetAdd_Method {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		ArrayList arrayList= new ArrayList();
	
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		System.out.println(arrayList);
		arrayList.add(1, "NABI");
		System.out.println(arrayList);
		arrayList.add(1, "NABI");
		System.out.println(arrayList);
		try {
			arrayList.add(9, "NAB");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(arrayList);
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.indexOf("NABI"));
		
		
		
		
	}

}
