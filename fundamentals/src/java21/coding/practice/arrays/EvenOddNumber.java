package java21.coding.practice.arrays;

public class EvenOddNumber {

    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 12, 67, 34, 90, 11};

        System.out.println("Even Numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Odd Numbers:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
