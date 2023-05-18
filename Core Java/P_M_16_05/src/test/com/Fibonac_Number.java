package test.com;

public class Fibonac_Number {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=10;
		for (int j = 0; j <count; j++) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
