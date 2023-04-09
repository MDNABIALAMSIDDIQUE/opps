package com.employee;

public class Employee {
	
	String id="Nabi13Java";
	String name="MD NABI ALAM";
	float sal = 45255.2f;
	String address= "Darbhanga";
	String email="nabijava@gmail.com";
	String number="8885629436";
	
	
	public String toString() {
		
		System.out.println("Employee Details....   ");
		System.out.println("----------------------------");
		System.out.println("Employee  id  : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+sal);
		System.out.println("Employee Address : "+address);
		System.out.println("Employee Email : "+email);
		System.out.println("Employee Moblie No : "+number);
		
		return "";
		
	}
}
