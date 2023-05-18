package inter.com;


	
	import java.util.Scanner;

	public class ArmstrongNumber {
	    public static void main(String[] args) {
	        int number, originalNumber, remainder, result = 0, n = 0;
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        number = input.nextInt();
	        
	        originalNumber = number;
	        
	        // count the number of digits
	        while (originalNumber != 0) {
	            originalNumber /= 10;
	            ++n;
	        }
	        
	        
	        originalNumber = number; 
	        // calculate the sum of the nth power of each digit
	        while (originalNumber != 0) {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, n);
	            originalNumber /= 10;
	        }
	        
	        if (result == number) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}



