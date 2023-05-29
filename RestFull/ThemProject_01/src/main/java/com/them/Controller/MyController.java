package com.them.Controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String about(Model model) {
		
		model.addAttribute("name","Md Nabi Alam");
		model.addAttribute("CurrentDate",new Date().toLocaleString());
		System.out.println("this is handel ... of About");
		return "about";
		
	}
	@GetMapping("/namesloop")
	public String iterateHandler(Model l) {
		
		List<String> name = List.of("Ankit","Laxmi","NABI ALAM","Zohan");
		l.addAttribute("names",name);
		return"iterate";
	}
	
	
	@GetMapping("/condition")
	public String ConditionHandler(Model condition) {
		System.out.println("i am condition Handeler");
		condition.addAttribute("isActive",false);
		condition.addAttribute("gender","M");
		
		List<Integer> list = List.of(20,33,36);
		condition.addAttribute("mylist",list);
		return "condition";
	}
	
	
	@GetMapping("/service")
	public String ServiceHandel(Model service) {
		service.addAttribute("title","i love biryani");
	
		System.out.println("I am Service");
		service.addAttribute("subtitle",LocalDateTime.now().toString());
		return "service";
	}
	
	
}
