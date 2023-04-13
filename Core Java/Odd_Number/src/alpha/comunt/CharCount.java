package alpha.comunt;

import java.util.Scanner;

public class CharCount {
		public static void main(String[] args) {
			System.out.println("Enter the String ...");
			Scanner scanner= new Scanner(System.in);
			String sc = scanner.nextLine();
			
			for (int i = 0; i < 256; i++) {
				int count =0;
				for (int j = 0; j < sc.length(); j++) {
					if (sc.charAt(j)==(char)i) {
						count++;
						
					}
				}
				if (count>0) {
					System.out.println("Count : "+ count +(char)i);
				}
				scanner.close();
			}
			
		}
}
