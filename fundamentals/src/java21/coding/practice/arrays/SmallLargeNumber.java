package java21.coding.practice.arrays;

public class SmallLargeNumber {

    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 12, 67, 34, 90, 11};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
