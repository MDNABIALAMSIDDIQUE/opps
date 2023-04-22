package com.database.modal;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.dao.IEmployeeDAO;
import com.database.service.IEmployeeMgtService;

@Service("empService")
public class EmployeeMgtService implements IEmployeeMgtService {
	@Autowired
	private IEmployeeDAO empDAO;
	
	@Override
	public List<Employee> fetchEmployeebyDesgs(String desg1, String desg2, String desg3) throws Exception {
	List<Employee> list=empDAO.getEmployeeByDesg(desg1, desg2, desg3);
		return list;
	}

}
