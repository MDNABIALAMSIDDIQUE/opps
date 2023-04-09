package thiss.com;

public class UserMainCLass extends User {
	public static void main(String[] args) {
		
		User user= new User();
		user.setUser("nabi123Nabi");
		user.setPass("Nabi123");
		
		System.out.println("=======================================");
		System.out.println("User Login Details......");
		System.out.println("User's Name  :  "+user.getUser());
		System.out.println("Password     : "+user.getPass());
		System.out.println("=======================================");
		
	}
}
