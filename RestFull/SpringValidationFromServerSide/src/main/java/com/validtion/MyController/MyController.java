package com.validtion.MyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.validtion.entity.LoginData;

import jakarta.validation.Valid;

@Controller
public class MyController {
	
	
	
	@RequestMapping("/sinup")
	public String openFrom(Model model) {
		model.addAttribute("logindata",new LoginData());
		
		return"form";
	}
	
	@PostMapping("/process")
	public String processform(@Valid @ModelAttribute("loginData")LoginData loginData,BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result);
			return "form";
		}
		
		System.out.println(loginData);
		return "success";
	}
}
