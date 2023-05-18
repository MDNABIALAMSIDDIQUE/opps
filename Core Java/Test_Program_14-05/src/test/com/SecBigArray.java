package test.com;

public class SecBigArray {
public static void main(String[] args) {
	int a[]= {600,8,5,4,1,5,7,10};
	int temp;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]<a[j]) {
				temp = a[i];
				a[i] =a[j];
				a[j] = temp;
			}
		}
		if (i==1) {
			break;
		}
	}
	System.out.println(" Sec "+a[1]);
}
}
