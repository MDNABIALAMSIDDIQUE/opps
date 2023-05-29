package com.validtion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validtion.modal.LoginData;

@Controller
public class MyController {
	
	@GetMapping("/form")
	public String openForm(Model model) {
		System.out.println("Wel Come to Home Page");
		model.addAttribute("loginData",new LoginData());
		return "form";
	}
	
	@PostMapping("/process")
	public String processform(@ModelAttribute("loginData")LoginData loginData) {
		System.out.println(loginData);
		return "success	";
	}
	
	
}
