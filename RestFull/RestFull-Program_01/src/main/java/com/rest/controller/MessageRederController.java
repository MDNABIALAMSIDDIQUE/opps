package com.rest.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/message")
public class MessageRederController {
	
	@GetMapping("/gen")
	public ResponseEntity<String> genMessage(){
	
		LocalDateTime localDateTime = LocalDateTime.now();
		int hour=localDateTime.getHour();
		String body=null;
		if (hour>12) 
			body="Good Moring";
		else
			body="Good Night";
		
		HttpStatus httpStatus=HttpStatus.OK;
		ResponseEntity<String> entity= new ResponseEntity<>(body,httpStatus);
		return entity;
		
	}
}
