package com.interf.coloing;

public class Student implements Cloneable {
		
	String id;
	String name;
	int roll;
	String clas;
	
	public Student(String id, String name, int roll, String clas) {
		this.id=id;
		this.name=name;
		this.roll=roll;
		this.clas=clas;
		
		}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
	public void getStudnet() {
		System.out.println("Student Details...");
		System.out.println("-------------------------------------------");
		System.out.println("Student Id : "+id);
		System.out.println("Studnet Name : "+name);
		System.out.println("Student Roll Naumber : "+roll);
		System.out.println("Student Class Name : "+clas);
	}
}
