package com.count;

import java.util.Scanner;

public class UserCharCount {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Input...");
		String string=scanner.nextLine();
		
		for (int i = 0; i < 256; i++) {
			
			int count=0;
			
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(j)==(char)i) {
					count++;
				}
			}
			if (count>0) {
				System.out.println("Count Char   : "+count+" "+(char)i);
				scanner.close();
			}
		}
	}

}
