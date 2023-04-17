package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorIns {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList arrayList= new ArrayList();
		arrayList.add("AAA");
		arrayList.add("BBB");
		arrayList.add("CCC");
		arrayList.add("DDD");
		arrayList.add("EEE");
		
		System.out.println(arrayList);
		
		Iterator iterator= arrayList.iterator();
		while (iterator.hasNext()) {
			
			String string=(String)iterator.next();
			System.out.println(string);
			if (iterator.equals("CCC")) {
				iterator.remove();
			}
		}
		System.out.println(arrayList);
	}

}
