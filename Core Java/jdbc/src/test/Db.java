package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Connection connection=DriverManager.
				getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
		System.out.println(connection);

	}

}
