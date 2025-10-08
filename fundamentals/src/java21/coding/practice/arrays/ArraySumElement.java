package java21.coding.practice.arrays;

public class ArraySumElement {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : array) {
            sum = sum + num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
