package ds.com;

import java.util.Scanner;

public class Delet_Element_in_Array {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int n =scanner.nextInt();
		System.out.println("Your Array Size  "+n);
		
		int a[] = new int[n];
		int b[] = new int[n-1];
		
		for (int i = 0; i < n; i++) {
			a[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the index for Deleted in Array");
		int d=scanner.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (i<d) {
				b[i]=a[i];
			}
			else if (i==d) {
				continue;
			}
			else {
				b[i-1]=a[i];
			}
		}
		System.out.println("====== this time Array === :");
		for (int i = 0; i < n-1; i++) {
			System.out.println(b[i]);
		}
		scanner.close();
	}

}
