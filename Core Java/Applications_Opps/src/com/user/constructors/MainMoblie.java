package com.user.constructors;

public class MainMoblie extends Moblie{

	public MainMoblie(int id, String name, String modal, int rs) {
		super(id, name, modal, rs);
		
	}

	public static void main(String[] args) {
		Moblie moblie= new Moblie(12,"Vivo", "V19",20000);
		moblie.mob();
		System.out.println(moblie);
		System.out.println();
		
		
		Moblie moblie1= new  Moblie(15, "Apple", "13pro", 60000);
		System.out.println(moblie1);
		moblie1.mob();
	}
	
	
}
