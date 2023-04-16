package com.annotastion.sbeans;

import org.springframework.stereotype.Component;

@Component("Die")
public class DieseEngin implements IEngineAllType {
	
		 public DieseEngin() {
				System.out.println("========================================");
			System.out.println(" this DieseEngin 0 pra Cons.. ");
		}
	@Override
	public void start() {
		System.out.println("========================================");
		System.out.println("DieseEngin.start by By ");

	}

	@Override
	public void stop() {
		System.out.println("========================================");
		System.out.println("DieseEngin.stop tack Care ....");

	}

}
