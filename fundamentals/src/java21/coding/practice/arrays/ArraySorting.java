package java21.coding.practice.arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 12, 67, 34, 90, 11};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] >= numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
    }
}
