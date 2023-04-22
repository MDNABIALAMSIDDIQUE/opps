package com.database.dao;

import java.util.List;

import com.database.modal.Employee;

public interface IEmployeeDAO  {
	public List<Employee> getEmployeeByDesg(String desg1,String desg2,String desg3) throws Exception; 
	
}
