package test.com;
public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] evenNumbers = new int[array.length];
        int[] oddNumbers = new int[array.length];

        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers[evenCount] = num;
                evenCount++;
            } else {
                oddNumbers[oddCount] = num;
                oddCount++;
            }
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
