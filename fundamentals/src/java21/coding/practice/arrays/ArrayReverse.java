package java21.coding.practice.arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Reversed Array:");
        for (int i=array.length -1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
