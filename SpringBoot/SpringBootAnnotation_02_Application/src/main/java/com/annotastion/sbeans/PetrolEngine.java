package com.annotastion.sbeans;

import org.springframework.stereotype.Component;

@Component("pet")
public class PetrolEngine implements IEngineAllType {
	
	public PetrolEngine() {
		System.out.println("========================================");
		System.out.println("I am PetrolEngine ... is Con.. ");
		System.out.println("========================================");
	}

	@Override
	public void start() {
		System.out.println("========================================");
		System.out.println("PetrolEngine is Start ... by by...");
		System.out.println("========================================");
	}

	@Override
	public void stop() {
		System.out.println("========================================");
		System.out.println("PetrolEngine is Stop .. your last  Stoped came .. tack care..");
		System.out.println("========================================");
	}

}
