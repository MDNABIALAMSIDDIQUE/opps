package com.interf.coloing;

public class MainCassStudent {
	public static void main(String[] args) {
		 
		Student student= new Student("Z102", "Zohan", 01, "LKG");
		System.out.println("===========================================");
		student.getStudnet();
		System.out.println(student);
		
		System.out.println("Before Colning........");
		try {
			Student student2=(Student)student.clone();
			System.out.println("After Colning ................");
			System.out.println();
			System.out.println(student2);
			System.out.println();
			student2.getStudnet();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
