package com.college;

public class MainCollege extends College{
	public static void main(String[] args) {
		
		College college = new College();
		
		college.setCid("M1023");
		college.setName("SKY COllege");
		college.setDept("Computer Science");
		college.setLocation("Darbhanga");
		
		System.out.println("===========================");
		System.out.println("College Details");
		System.out.println("===========================");
		System.out.println("College Id : "+college.getCid());
		System.out.println("College Name : "+college.getName());
		System.out.println("College Depatment : "+college.getDept());
		System.out.println("College Location : "+college.getLocation());
		
	}
}
