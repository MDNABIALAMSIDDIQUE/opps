package com.database.rest.processer;

import org.springframework.batch.item.ItemProcessor;

import com.database.rest.modal.Employee2;

public class EmployeeInfoitemProcessor implements ItemProcessor<Employee2, Employee2>{

	@Override
	public Employee2 process(Employee2 emp) throws Exception {
		if (emp.getSalary()>=100000) {
			emp.setGrossSalary(Math.round(emp.getSalary()+emp.getSalary()*0.4f));
			emp.setNetSalary(Math.round(emp.getGrossSalary()-emp.getGrossSalary()*0.2f));
			return emp;	
		}
		return null;
	}

}
