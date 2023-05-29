package test.com;

public class Polin {
	
	public static void main(String[] args) {
		
		
		int r;
		int sum=0;
		int n=347;
		 int temp=n;
		 while (n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
	
		} 
		 if (temp==sum) {
			System.out.println(temp+"  plidm");
			
		}else {
			System.out.println(temp+" not plidm");
		}
	}

}
