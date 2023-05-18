package inter.com;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Limit");
		int count = scanner.nextInt();
		int n1=0,n2=1,n3;
		//System.out.println(n1+" "+n2);
		for (int j = 2; j < count; j++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		
	}

}
