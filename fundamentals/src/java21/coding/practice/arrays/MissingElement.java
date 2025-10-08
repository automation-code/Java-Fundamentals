package java21.coding.practice.arrays;

public class MissingElement {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6};
        int length = array.length;
        int sum = 0, range = 0;

        for (int i = 0; i < length - 1; i++) {
            sum = sum + array[i];
        }

        range = (length * (length + 1) / 2);
        int missingElement = range - sum;
        System.out.println("Missing element in the array: " + missingElement);
    }
}
