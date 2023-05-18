package test.com;

public class Odd_and_Even_Number {
	
	public static void main(String[] args) {
		int [] array= {1,2,3,6,4,5,9,6,7,99,44,2};
		
		int [] oddNumber=new int[array.length];
		int [] evenNumber=new int [array.length];
		
			int oddCount=0;
			int eventCount=0;
			
			for (int num : array) {
				if (num%2 ==0) {
					evenNumber[eventCount]=num;
					eventCount++;
				} else {
					oddNumber[oddCount]=num;
					oddCount++;
				}
			}
			System.out.println("Even Number");
			for (int i = 0; i < eventCount; i++) {
				System.out.print(evenNumber[i]+" ");
			}
			System.out.println();
			System.out.println("Odd Number");
			for (int i = 0; i < oddCount; i++) {
				System.out.print(oddNumber[i]+" ");
			}
	}

}
