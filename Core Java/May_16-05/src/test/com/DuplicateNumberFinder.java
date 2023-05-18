package test.com;

import java.util.HashSet;

public class DuplicateNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 7, 8, 4, 9};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dupli = new HashSet<>();

        for (int number : numbers) {
            if (!set.add(number)) {
            	dupli.add(number);
            }
        }

        System.out.println("Duplicate numbers in the array: " + dupli);
    }
}

