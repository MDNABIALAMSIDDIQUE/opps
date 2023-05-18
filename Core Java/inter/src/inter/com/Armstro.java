package inter.com;

import java.util.Scanner;

public class Armstro {
	
	public static void main(String[] args) {
		int n,on,rem,res=0,n1=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the a Number ...");
		n=scanner.nextInt();
		on=n;
		while (on != 0) {
			on/=10;
			++n;
		}
		while (on!=0) {
			rem=on%10;
			res+=Math.pow(rem, n);
			on/=10;
			
		}
		if (res==n) {
			System.out.println("this number is Armstro"+n);
		}else {
			System.out.println("this number is Not Armstro Number"+n);
		}
	}

}
