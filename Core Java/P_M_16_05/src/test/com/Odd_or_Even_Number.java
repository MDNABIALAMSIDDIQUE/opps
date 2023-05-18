package test.com;

public class Odd_or_Even_Number {
	public static void main(String[] args) {
		int arr[]= {2,44,3,5,23,444,33,5,9,0,5,7};
		int even[] = new int [arr.length];
		int odd []= new int [arr.length];
		int evenCount=0,oddCount=0;
		for (int i : arr) {
			if (i%2==0) {
				even[evenCount]=i;
				evenCount++;
			} else {
				odd[oddCount]=i;
				oddCount++;
			}
		}
			System.out.println("Even");
			for (int j = 0; j <evenCount; j++) {
				System.out.print(even[j]+" ");
			}
			System.out.println();
			
		System.out.println("Odd");
			for (int j = 0; j < oddCount; j++) {
				System.out.print( odd[j]+" ");
			}
		
	}
}
