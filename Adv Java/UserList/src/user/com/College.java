package user.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class College {
	public static void main(String[] args) {
		
		try {
			System.out.println("========================================");
			System.out.println("New Student Regstion From university ..");
			System.out.println("========================================");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the Student ID");
			String StudentID= scanner.nextLine();
			
			System.out.println("Enter the  College Name");
			String Cname=scanner.nextLine();
			
			System.out.println("Enter the University Name");
			String uniName=scanner.nextLine();
			
			
			System.out.println("Enter the Student Name");
			String studentName=scanner.nextLine();
			
			System.out.println("Enter the Roll Name");
			String roll= scanner.nextLine();
			
			System.out.println("Enter the Course Name");
			String course=scanner.nextLine();
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection connection= DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","NABIALAM","zohan");
			
			PreparedStatement preparedStatement=connection.prepareStatement
				("insert into college values (?,?,?,?,?,?)");
			preparedStatement.setString(1, StudentID);
			preparedStatement.setString(2, Cname);
			preparedStatement.setString(3, uniName);
			preparedStatement.setString(4, studentName);
			preparedStatement.setString(5, roll);
			preparedStatement.setString(6, course);
			int date=preparedStatement.executeUpdate();
			if (date>0) {
				System.out.println("===================================================");
				System.out.println("Student Regstion Successfully of University...");
				System.out.println("===================================================");
			}
			scanner.close();
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("Check Roll Number and ID");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		}
		
	}

}
