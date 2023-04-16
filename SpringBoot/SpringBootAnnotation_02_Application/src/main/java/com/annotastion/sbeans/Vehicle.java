package com.annotastion.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	@Qualifier("cng")
	private IEngineAllType engine;
	
	public Vehicle() {
		System.out.println("I am Cont of Vehicle.Vehicle()");
	}
	
	public void safar(String startingplace,String lastplace ) {
		engine.start();
		System.out.println("========================================");
		System.out.println("Safar is Start at ::"+startingplace);
		System.out.println("========================================");
		System.out.println("Safar is starting On");
		System.out.println("========================================");
		engine.stop();
		System.out.println("========================================");
		System.out.println("My Safar is Stop By By "+lastplace);
	}

}
