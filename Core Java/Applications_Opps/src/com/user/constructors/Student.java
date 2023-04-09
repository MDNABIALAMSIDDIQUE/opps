package com.user.constructors;

public class Student {
	int id;
	String sname;
	String clss;
	String address;
	
	public Student() {
		id=1521;
		sname="Zohan";
		clss="LKG";
		address="Gaya";
	}
	public void studentdata() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+sname);
		System.out.println("Class : "+clss);
		System.out.println("Address : "+address);
	}
}
