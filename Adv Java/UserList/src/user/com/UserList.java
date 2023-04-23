package user.com;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UserList {
	public static void main(String[] args) {
		
		try {
			System.out.println("************************");
			System.out.println("Input User Date...");
			System.out.println("************************");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the  User Name..");
			String uname=scanner.nextLine();
			
			System.out.println("Enter the Password....");
			String password=scanner.nextLine();
			
			System.out.println("Enter the First Name ....");
			String FirstName=scanner.nextLine();
			
			System.out.println("Enter the Last Name ...");
			String lastname=scanner.nextLine();
			
			System.out.println("Enter the Email ID ....");
			String email=scanner.nextLine();
			
			System.out.println("Enter the Phone Number Max number 12 digit");
			double phone=scanner.nextDouble();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","NABIALAM","zohan");
			
			Statement statement= con.createStatement();
			int k=statement.executeUpdate
				("insert into userlist values ('"+uname+"','"+password+"','"+FirstName+"','"+lastname+"','"+email+"',"+phone+")");
			if (k>0) {
				System.out.println("=======================================");
				System.out.println(" New User Register Successful...");
				System.out.println("========================================");
			}
			scanner.close();
			
		} catch
		(Exception e) {
			e.printStackTrace();
			System.out.println("Check the User Name  &  Password .....");
		}
	}

}
