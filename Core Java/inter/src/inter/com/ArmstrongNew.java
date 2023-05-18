package inter.com;

import java.util.Scanner;

public class ArmstrongNew {
	
	public static void main(String[] args) {
		
		int number,on,rem,Res=0,n=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number ....");
		
		number = scanner.nextInt();	
		on=number;
		
		
		while (on != 0) {
			on/=10;
			++n;
		}
		
			on=number;
			while (on !=0) {
				rem=on%10;
				Res+=Math.pow(rem,n);
				on/=10;
				
				
			}if (Res==number) {
				System.out.println("This number is Armstrong "+number);
			}else {
				System.out.println("This Number is Not Armstrong "+number);
			}
			scanner.close();
		}
	}


