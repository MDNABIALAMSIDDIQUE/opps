package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) {
		System.out.println("======================");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NABIALAM","zohan");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from student");
			System.out.println(resultSet);
			
				
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
			  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
