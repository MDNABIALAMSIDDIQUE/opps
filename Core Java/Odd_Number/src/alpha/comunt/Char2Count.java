package alpha.comunt;

import java.util.Scanner;

public class Char2Count {
	
	public static void main(String[] args) {
		System.out.println("Enter the Any String...");
		Scanner scanner= new Scanner(System.in);
		String string= scanner.nextLine();
		
		
		for (int i = 0; i < 256; i++) {
			
			int count =0;
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(j)== (char)i) {
					count++;
				}
			}
			if (count>0) {
				System.out.println("Count : "+count+" :: "+(char)i);
			}
		}
	}

	
}
