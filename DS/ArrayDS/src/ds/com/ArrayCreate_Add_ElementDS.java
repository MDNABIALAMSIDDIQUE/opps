package ds.com;

import java.util.Scanner;

public class ArrayCreate_Add_ElementDS {
	public static void main(String[] args) {
	
		System.out.println("Enter the Array Size ....");
		Scanner scanner = new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		System.out.println("Your Array Size :  "+n);
		int a[]= new int[n];
		int b[] = new int [n+1];
		
		for (int i = 0; i < n; i++) {
			a[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the Added Index of Number :");
		int m =scanner.nextInt();
		
		System.out.println("Enter the New Element Number ");
		int newNumber=scanner.nextInt();
		
		for (int i = 0; i < n+1; i++) {
			if (i<m) {
				b[i]= a[i];
			}
			else if (i==m) {
				b[i]=newNumber;
			}else {
				b[i]=a[i-1];
			}
		}
		
		
		System.out.println("Your Element :");
		for (int i = 0; i < n+1; i++) {
			System.out.println(b[i]);
		}
		scanner.close();
	}

}
