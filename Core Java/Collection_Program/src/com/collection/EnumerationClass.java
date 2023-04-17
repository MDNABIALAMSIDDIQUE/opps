package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationClass {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("EnumerationClass.main()");
		
		
		Vector vector = new Vector();
		vector.add("AAA");
		vector.add("BBB");
		vector.add("CCC");
		vector.add("DDD");
		vector.add("EEE");
		
		System.out.println(vector);
		 Enumeration enumeration=vector.elements();
		 while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
			
		}
		
	}

}
