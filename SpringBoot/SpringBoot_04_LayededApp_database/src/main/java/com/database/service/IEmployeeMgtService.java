package com.database.service;

import java.util.List;

import com.database.modal.Employee;

public interface IEmployeeMgtService {
	
	public List<Employee> fetchEmployeebyDesgs(String desg1,String desg2,String desg3)throws Exception;

}
