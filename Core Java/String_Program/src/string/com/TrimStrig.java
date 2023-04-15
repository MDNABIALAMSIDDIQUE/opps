package string.com;

public class TrimStrig {
	public static void main(String[] args) {
		 String string = "    NABI     ALAM";
		 System.out.println(string.trim());
		 System.out.println(string.startsWith(" "));
		 System.out.println(string.endsWith("R"));
		 System.out.println("Char At  in 6th Postion  "+string.charAt(6));
		 System.out.println("Lenth method"+string.length());
		 System.out.println(string.replaceAll("ALAM", "MD"));
		 
	}

}
