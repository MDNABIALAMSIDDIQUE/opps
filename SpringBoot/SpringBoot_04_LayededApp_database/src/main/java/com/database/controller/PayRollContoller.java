package com.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.database.modal.Employee;
import com.database.service.IEmployeeMgtService;

@Controller("payroll")
public class PayRollContoller {
		@Autowired
	private IEmployeeMgtService service;
		
		public List<Employee> showEmployee(String desg1,String desg2,String desg3) throws Exception{
			System.out.println("PayRollContoller.showEmployee()");
			List<Employee> list=service.fetchEmployeebyDesgs(desg1, desg2, desg3);
			return list;
			
		}
		
		
}
