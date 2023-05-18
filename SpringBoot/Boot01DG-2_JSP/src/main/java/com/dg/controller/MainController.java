package com.dg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
		@RequestMapping("/home")
		public String home() {
			System.out.println(" This is Home Page");
			return "home";
			
		}
		
		@RequestMapping("/about")
		public String about() {
			System.out.println("this is about page");
			return "about";
			
		}
		
		@RequestMapping("/regstion")
		public String studentReg() {
			System.out.println("Student Regstion From");
			return "studentReg";
			
		}
 
}
