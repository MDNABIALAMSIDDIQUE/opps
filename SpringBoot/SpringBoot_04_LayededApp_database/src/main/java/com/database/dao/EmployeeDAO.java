package com.database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.database.modal.Employee;
@Repository("empDAO")
public class EmployeeDAO implements IEmployeeDAO {
	// from the get data in oracle Database 
	private static final String GetEmployeeData_in_datebase="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (?,?,?)ORDER  BY JOB" ;
	
	@Autowired
	private DataSource ds;
		
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Employee> getEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDAO.getEmployeeByDesg() ::: ds Class Name"+ds.getClass());
		List<Employee> list=null;
		try 
				(Connection  con= ds.getConnection();
				PreparedStatement ps= con.prepareStatement(GetEmployeeData_in_datebase)){
				ps.setString(1, desg1);
				ps.setString(2, desg2);
				ps.setString(3, desg3);
				
				// try block
				try (ResultSet rs=ps.executeQuery()){
					list= new ArrayList();
					while (rs.next()) {
						Employee emp= new Employee();
						emp.setEno(rs.getInt(1));
						emp.setEname(rs.getString(2));
						emp.setDesg(rs.getString(3));
						emp.setSalary(rs.getDouble(4));
						emp.setDeptno(rs.getInt(5));
						list.add(emp);
							}// whlise
				}  // 2nd try
				
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} // 1st try
		return list;
	}

}
