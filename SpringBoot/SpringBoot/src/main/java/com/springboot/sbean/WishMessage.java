package com.springboot.sbean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishMessage {
	
	@Autowired
	private LocalDateTime local;
	
	public WishMessage() {
		System.out.println("=================================");
		System.out.println("I am WishMessage Contractor...");
		System.out.println("=================================");
	}
	
	public String showMessage() {
		System.out.println("I am ShowMessage Method..");
		int hour=local.getHour();
		if(hour>12)
			return"Good Morning";
		else if (hour>16) 
			return "Good After Noon";
		else if (hour>20)
			return "Good Eveing";
		else 
			return "Good Night";
		
		
	}

	

}
