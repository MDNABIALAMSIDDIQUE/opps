package test.com;

public class Armstrong_Number {
	
	public static void main(String[] args) {
		int n=154;
		int temp=n;
		int r,sum=0;
	while (n>0) {
		r=n%10;
		n=n/10;
		sum=sum+r*r*r;
	}
	if (temp==sum) {
		System.out.println("this number is Armstrong Number  :  "+temp);
	} else {
		System.out.println("this number is not Armstrong Number  :  "+temp);
	}
	}

}
