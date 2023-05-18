package inter.com;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int limit = input.nextInt();
        
        System.out.print(n1 + " " + n2 + " "); // print first two terms
        
        while (n1 + n2 <= limit) {
            n3 = n1 + n2; // calculate the next term
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
