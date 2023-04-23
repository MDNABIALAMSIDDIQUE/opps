
package login.com;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class LoginFrom {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the User Name");
			String UNAME=scanner.nextLine();
			
			System.out.println("Enten the Password");
			String password=scanner.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","NABIALAM","zohan");
			PreparedStatement preparedStatement=con.prepareStatement
					("select * from Userlist where uname=? and password=?");
			preparedStatement.setString(1,UNAME);
			preparedStatement.setString(2, password);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				System.out.println("Login Successfull This User -->  "+resultSet.getString(1));
				System.out.println("=====================  User Data  ============");
				System.out.println("First Name   "+resultSet.getString(3));
				System.out.println("Last Name  "+resultSet.getString(4));
				System.out.println("Emil :  "+resultSet.getString(5));
				System.out.println("Phone Number :  "+resultSet.getLong(6));
				
			}
			scanner.close();
			
		}
		catch
	(Exception e) {
			System.out.println("Invaild UserName and Password....");
			e.printStackTrace();
		}
	}

}
