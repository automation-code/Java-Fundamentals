package java21.coding.practice.arrays;

import java.util.Arrays;

public class LargeNumber {

    public static void main(String[] args) {
        int[] numbers = {34, 67, 23, 89, 2, 90, 123, 45};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number in the array is: " + largest);

        Arrays.sort(numbers);
        int secondLargest = numbers[numbers.length - 2];
        int thirdLargest = numbers[numbers.length - 3];
        System.out.println("The second largest number in the array is: " + secondLargest);
        System.out.println("The third largest number in the array is: " + thirdLargest);
    }
}
