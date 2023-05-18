package test.com;

public class Polindrom_Number {
	public static void main(String[] args) {
		int r,sum=0,temp;
		int n=453;
		temp=n;
		while (n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (temp==sum) {
			System.out.println(temp+"  this Number is Polindrom");
		}else {
			System.out.println(temp+"  this Number is Not Polindrom");
		}
	}
}
