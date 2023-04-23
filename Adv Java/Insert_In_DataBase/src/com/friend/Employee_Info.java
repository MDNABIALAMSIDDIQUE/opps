package com.friend;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Employee_Info {
	public static void main(String[] args) {
		try {
			System.out.println("==================================");
			System.out.println(" plz input the Date of Employee...");
			System.out.println("==================================");
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the Employee ID");
			String eid=scanner.nextLine();
			
			System.out.println("Enter the Employee Number");
			String ename=scanner.nextLine();
			
			System.out.println("Enter the Employee Desg");
			String eDesg=scanner.nextLine();
			
			System.out.println("Ente the  Employee Basic Salay");
			int bsal=scanner.nextInt();
			
			
			double totsal=bsal+(0.93*bsal)+(0.63*bsal);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","NABIALAM","zohan");
			
			Statement statement= con.createStatement();
			int k= statement.executeUpdate
					("insert into Employee values ('"+eid+"','"+ename+"','"+eDesg+"','"+bsal+"','"+totsal+"')");
			
			if (k>0) {
				System.out.println("=================================");
				System.out.println("Your Date Save Successful");
				System.out.println("=================================");
			}
			scanner.close();
		}
		catch (Exception e) {
			System.out.println("plz correct input ID..");

		}
	}

}
