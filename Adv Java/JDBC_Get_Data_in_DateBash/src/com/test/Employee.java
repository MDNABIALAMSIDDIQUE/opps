package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("===");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try {
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NABIALAM","zohan");
			System.out.println(con);
			Statement statement= con.createStatement();
			ResultSet resultSet= statement.executeQuery("select  * from emp");
			
			while (resultSet.next()) {
				
				System.out.print(resultSet.getString(1)+" ");
				
				System.out.println(resultSet.getString(2)+" ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
