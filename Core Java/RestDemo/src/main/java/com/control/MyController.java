package com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moddle.Student;
import com.repo.MyRepo;

@RestController
@RequestMapping("/")
public class MyController {
	   @Autowired
       private MyRepo repo;
	@PostMapping("/save")
	public void savedata(@RequestBody Student st) {
		Student st1=repo.save(st);
		System.out.println(st1);
		
		
	}
	@PostMapping("/see")
	public void seedata(@RequestBody Student st) {
		//Student st1=repo.save(st);
		System.out.println(st);
		
		
	}
}
