package com.collection;

public class Vector {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		System.out.println("Vector.Program....");
		
		java.util.Vector vector= new java.util.Vector();
		vector.addElement("NABI");
		vector.addElement("Zohan");
		vector.addElement(5);
		vector.addElement(45.2);
		vector.addElement("ALAM");
		vector.addElement("Fatima");
		System.out.println(vector);
		vector.addElement("NABI");
		vector.addElement(null);
		vector.addElement(null);
		vector.addElement(null);
		System.out.println(vector);
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		System.out.println(vector.elementAt(3));
		System.out.println(vector.remove(2));
		vector.removeAllElements();
		System.out.println(vector);
		

		
		
		
		
		}

}
