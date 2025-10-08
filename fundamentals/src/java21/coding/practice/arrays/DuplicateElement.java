package java21.coding.practice.arrays;

public class DuplicateElement {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 1};

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
