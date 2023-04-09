package com.user.constructors;

public class Moblie {
		
	int mobid;
	String mname;
	String mmodal;
	int mRs;
	
	public Moblie(int id, String name, String modal, int rs) {
		mobid=id;
		mname=name;
		mmodal=modal;
		mRs=rs;
	}
	public void mob() {
		System.out.println("-----------------------------------");
		System.out.println("Moblie Information.....");
		System.out.println("-----------------------------------");
		System.out.println("Moblie ID :"+mobid);
		System.out.println("Moble Name : "+mname);
		System.out.println("Moble Modal : "+mmodal);
		System.out.println("Total Amount :"+mRs);
		
	}
}
