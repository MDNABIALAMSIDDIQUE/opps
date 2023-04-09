package com.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

@RestController
@RequestMapping("/web")
public class MyController {
	
	@GetMapping("/save")
	public void save(@RequestBody Student st){
		
		System.out.println(st);
		
	}

}
