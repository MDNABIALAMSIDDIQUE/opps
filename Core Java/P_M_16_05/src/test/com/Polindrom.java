package test.com;

public class Polindrom {
	public static void main(String[] args) {
		int r,temp,sum=0;
		int n=454;
		temp=n;
		while (n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (temp==sum) {
			System.out.println("this number is Pl :  "+temp);
		} else {
			System.out.println("this number is Not pl :   "+temp);
		}
	}
}
