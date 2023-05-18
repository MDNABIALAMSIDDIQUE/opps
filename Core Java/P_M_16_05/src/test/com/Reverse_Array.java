package test.com;

public class Reverse_Array {
		public static void main(String[] args) {
			int ar[]= {2,3,5,6,8,7,5,9,0,4,33};
			
			for (int i = 0; i < ar.length/2; i++) {
				int temp=ar[i];
				ar[i]=ar[ar.length-1-i];
				ar[ar.length-1-i]=temp;
				
			}
			System.out.println(" Reverse Array");
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i]+" ");
			}
		}
}
