package test.com;

public class Sec_Big_Number {
	public static void main(String[] args) {
		
		int a[]= {20,66,20,80,70,45,66,90,101,99};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i] <a[j]) {
			int	temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		if (i==1) {
			break;
		}
		}
		System.out.println("2nd Big  Number   "+a[1]);
	}
}
