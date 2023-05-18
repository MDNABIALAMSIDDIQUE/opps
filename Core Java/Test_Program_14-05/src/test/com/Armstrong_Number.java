package test.com;

public class Armstrong_Number {
	
	public static void main(String[] args) {
		int no=154;
		int t1=no;
		int leng=0;
		while (t1!=0) {
			leng=leng+1;
			t1=t1/10;
		}
		int t2=no;
		int arm=0;
		while (t2 !=0) {
			int mul=1;
		int	rem=t2%10;
			for (int i = 0; i <=leng; i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t1/10;
			
		}
		if (arm==no) {
			System.out.println(no+"  this number is Armstrong Number");
		} else {
			System.out.println(no+"  this number is Not Armstrong Number");
		}
	}

}
