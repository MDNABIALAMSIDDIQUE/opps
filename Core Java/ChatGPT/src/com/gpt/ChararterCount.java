package com.gpt;

import java.util.Scanner;

public class ChararterCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string=scanner.nextLine();
		int count=0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) !=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
