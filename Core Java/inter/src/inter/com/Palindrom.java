package inter.com;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number check palindrome or Not");
		int number=scanner.nextInt();
		System.out.println(number);
		
		int r,sum=0,temp;
		temp=number;
		while (number>0) {
			r=number%10;
			sum=(sum*10)+r/10;
			number=number/10;
		}
		if (temp == sum) {
			System.out.println("this palindrome no ....");
			
		}else {
			System.out.println("this Not palindrome Number ....");
		}
		scanner.close();
	}

}
