package test.com;

import java.util.Scanner;

public class Armstrong_Progrsm {
	public static void main(String[] args) {
		System.out.println("Enter the Any Number");
		Scanner scanner= new Scanner(System.in);
		
		int n=scanner.nextInt();
		int temp=n;
		int r,sum=0;
		while (n>0) {
			r=n%10;
			n=n/10;
			sum=sum+ r*r*r;
		}
		if (temp==sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}

}
