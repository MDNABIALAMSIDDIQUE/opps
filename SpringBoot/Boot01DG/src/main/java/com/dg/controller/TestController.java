package com.dg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
	
		@RequestMapping("/test")
		public String firstHander() {
			System.out.println("Hy Mr. MD NABI ALAM");
			return "test Complted..";
			
		}
}
