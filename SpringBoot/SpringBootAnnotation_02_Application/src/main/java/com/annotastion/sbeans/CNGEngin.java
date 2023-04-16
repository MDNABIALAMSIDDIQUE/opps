package com.annotastion.sbeans;

import org.springframework.stereotype.Component;

@Component("cng")
public class CNGEngin  implements IEngineAllType{
	
	public CNGEngin() {
		System.out.println("========================================");
		System.out.println("CNGEngin.CNGEngin 0 pram Constracter");
	}

	@Override
	public void start() {
		System.out.println("========================================");
		System.out.println("CNGEngin.start by by...");
		
	}

	@Override
	public void stop() {
		System.out.println("========================================");
		System.out.println("CNGEngin.stop take care");	
		System.out.println("========================================");
	}

}
